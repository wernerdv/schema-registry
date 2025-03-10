/*
 * Copyright 2023 Confluent Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.confluent.kafka.serializers.wrapper;

import io.confluent.kafka.serializers.AbstractKafkaSchemaSerDe;
import java.util.Map;
import org.apache.kafka.common.header.Headers;
import org.apache.kafka.common.serialization.Deserializer;

public class WrapperKeyDeserializer<T> implements Deserializer<T> {

  private Deserializer<T> inner;

  /**
   * Constructor used by Kafka consumer.
   */
  public WrapperKeyDeserializer() {
  }

  @Override
  public void configure(Map<String, ?> configs, boolean isKey) {
    configure(new WrapperKeyDeserializerConfig(configs), isKey);
  }

  @SuppressWarnings("unchecked")
  protected void configure(WrapperKeyDeserializerConfig config, boolean isKey) {
    if (!isKey) {
      throw new IllegalArgumentException("WrapperKeyDeserializer is only for keys");
    }
    this.inner = config.getConfiguredInstance(
        WrapperKeyDeserializerConfig.WRAPPED_KEY_DESERIALIZER, Deserializer.class);
    this.inner.configure(config.originals(), isKey);
  }

  @Override
  public T deserialize(String topic, byte[] bytes) {
    return deserialize(topic, null, bytes);
  }

  @Override
  public T deserialize(String topic, Headers headers, byte[] bytes) {
    try {
      return inner.deserialize(topic, headers, bytes);
    } finally {
      AbstractKafkaSchemaSerDe.setKey(bytes);
    }
  }

  @Override
  public void close() {
    inner.close();
  }
}
