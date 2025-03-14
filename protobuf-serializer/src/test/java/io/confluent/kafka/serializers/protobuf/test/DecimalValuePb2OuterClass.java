// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: DecimalValuePb2.proto
// Protobuf Java Version: 4.29.3

package io.confluent.kafka.serializers.protobuf.test;

public final class DecimalValuePb2OuterClass {
  private DecimalValuePb2OuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 3,
      /* suffix= */ "",
      DecimalValuePb2OuterClass.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DecimalValuePb2OrBuilder extends
      // @@protoc_insertion_point(interface_extends:DecimalValuePb2)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * The bytes value.
     * </pre>
     *
     * <code>optional .confluent.type.Decimal value = 1 [(.confluent.field_meta) = { ... }</code>
     * @return Whether the value field is set.
     */
    boolean hasValue();
    /**
     * <pre>
     * The bytes value.
     * </pre>
     *
     * <code>optional .confluent.type.Decimal value = 1 [(.confluent.field_meta) = { ... }</code>
     * @return The value.
     */
    io.confluent.protobuf.type.Decimal getValue();
    /**
     * <pre>
     * The bytes value.
     * </pre>
     *
     * <code>optional .confluent.type.Decimal value = 1 [(.confluent.field_meta) = { ... }</code>
     */
    io.confluent.protobuf.type.DecimalOrBuilder getValueOrBuilder();
  }
  /**
   * <pre>
   * Wrapper message for `Decimal`.
   * </pre>
   *
   * Protobuf type {@code DecimalValuePb2}
   */
  public static final class DecimalValuePb2 extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:DecimalValuePb2)
      DecimalValuePb2OrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 29,
        /* patch= */ 3,
        /* suffix= */ "",
        DecimalValuePb2.class.getName());
    }
    // Use DecimalValuePb2.newBuilder() to construct.
    private DecimalValuePb2(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private DecimalValuePb2() {
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.confluent.kafka.serializers.protobuf.test.DecimalValuePb2OuterClass.internal_static_DecimalValuePb2_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.confluent.kafka.serializers.protobuf.test.DecimalValuePb2OuterClass.internal_static_DecimalValuePb2_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.confluent.kafka.serializers.protobuf.test.DecimalValuePb2OuterClass.DecimalValuePb2.class, io.confluent.kafka.serializers.protobuf.test.DecimalValuePb2OuterClass.DecimalValuePb2.Builder.class);
    }

    private int bitField0_;
    public static final int VALUE_FIELD_NUMBER = 1;
    private io.confluent.protobuf.type.Decimal value_;
    /**
     * <pre>
     * The bytes value.
     * </pre>
     *
     * <code>optional .confluent.type.Decimal value = 1 [(.confluent.field_meta) = { ... }</code>
     * @return Whether the value field is set.
     */
    @java.lang.Override
    public boolean hasValue() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The bytes value.
     * </pre>
     *
     * <code>optional .confluent.type.Decimal value = 1 [(.confluent.field_meta) = { ... }</code>
     * @return The value.
     */
    @java.lang.Override
    public io.confluent.protobuf.type.Decimal getValue() {
      return value_ == null ? io.confluent.protobuf.type.Decimal.getDefaultInstance() : value_;
    }
    /**
     * <pre>
     * The bytes value.
     * </pre>
     *
     * <code>optional .confluent.type.Decimal value = 1 [(.confluent.field_meta) = { ... }</code>
     */
    @java.lang.Override
    public io.confluent.protobuf.type.DecimalOrBuilder getValueOrBuilder() {
      return value_ == null ? io.confluent.protobuf.type.Decimal.getDefaultInstance() : value_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeMessage(1, getValue());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getValue());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof io.confluent.kafka.serializers.protobuf.test.DecimalValuePb2OuterClass.DecimalValuePb2)) {
        return super.equals(obj);
      }
      io.confluent.kafka.serializers.protobuf.test.DecimalValuePb2OuterClass.DecimalValuePb2 other = (io.confluent.kafka.serializers.protobuf.test.DecimalValuePb2OuterClass.DecimalValuePb2) obj;

      if (hasValue() != other.hasValue()) return false;
      if (hasValue()) {
        if (!getValue()
            .equals(other.getValue())) return false;
      }
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasValue()) {
        hash = (37 * hash) + VALUE_FIELD_NUMBER;
        hash = (53 * hash) + getValue().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.confluent.kafka.serializers.protobuf.test.DecimalValuePb2OuterClass.DecimalValuePb2 parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.confluent.kafka.serializers.protobuf.test.DecimalValuePb2OuterClass.DecimalValuePb2 parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.confluent.kafka.serializers.protobuf.test.DecimalValuePb2OuterClass.DecimalValuePb2 parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.confluent.kafka.serializers.protobuf.test.DecimalValuePb2OuterClass.DecimalValuePb2 parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.confluent.kafka.serializers.protobuf.test.DecimalValuePb2OuterClass.DecimalValuePb2 parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.confluent.kafka.serializers.protobuf.test.DecimalValuePb2OuterClass.DecimalValuePb2 parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.confluent.kafka.serializers.protobuf.test.DecimalValuePb2OuterClass.DecimalValuePb2 parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static io.confluent.kafka.serializers.protobuf.test.DecimalValuePb2OuterClass.DecimalValuePb2 parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static io.confluent.kafka.serializers.protobuf.test.DecimalValuePb2OuterClass.DecimalValuePb2 parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static io.confluent.kafka.serializers.protobuf.test.DecimalValuePb2OuterClass.DecimalValuePb2 parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.confluent.kafka.serializers.protobuf.test.DecimalValuePb2OuterClass.DecimalValuePb2 parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static io.confluent.kafka.serializers.protobuf.test.DecimalValuePb2OuterClass.DecimalValuePb2 parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(io.confluent.kafka.serializers.protobuf.test.DecimalValuePb2OuterClass.DecimalValuePb2 prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * Wrapper message for `Decimal`.
     * </pre>
     *
     * Protobuf type {@code DecimalValuePb2}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DecimalValuePb2)
        io.confluent.kafka.serializers.protobuf.test.DecimalValuePb2OuterClass.DecimalValuePb2OrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.confluent.kafka.serializers.protobuf.test.DecimalValuePb2OuterClass.internal_static_DecimalValuePb2_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.confluent.kafka.serializers.protobuf.test.DecimalValuePb2OuterClass.internal_static_DecimalValuePb2_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.confluent.kafka.serializers.protobuf.test.DecimalValuePb2OuterClass.DecimalValuePb2.class, io.confluent.kafka.serializers.protobuf.test.DecimalValuePb2OuterClass.DecimalValuePb2.Builder.class);
      }

      // Construct using io.confluent.kafka.serializers.protobuf.test.DecimalValuePb2OuterClass.DecimalValuePb2.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage
                .alwaysUseFieldBuilders) {
          getValueFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        value_ = null;
        if (valueBuilder_ != null) {
          valueBuilder_.dispose();
          valueBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.confluent.kafka.serializers.protobuf.test.DecimalValuePb2OuterClass.internal_static_DecimalValuePb2_descriptor;
      }

      @java.lang.Override
      public io.confluent.kafka.serializers.protobuf.test.DecimalValuePb2OuterClass.DecimalValuePb2 getDefaultInstanceForType() {
        return io.confluent.kafka.serializers.protobuf.test.DecimalValuePb2OuterClass.DecimalValuePb2.getDefaultInstance();
      }

      @java.lang.Override
      public io.confluent.kafka.serializers.protobuf.test.DecimalValuePb2OuterClass.DecimalValuePb2 build() {
        io.confluent.kafka.serializers.protobuf.test.DecimalValuePb2OuterClass.DecimalValuePb2 result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.confluent.kafka.serializers.protobuf.test.DecimalValuePb2OuterClass.DecimalValuePb2 buildPartial() {
        io.confluent.kafka.serializers.protobuf.test.DecimalValuePb2OuterClass.DecimalValuePb2 result = new io.confluent.kafka.serializers.protobuf.test.DecimalValuePb2OuterClass.DecimalValuePb2(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(io.confluent.kafka.serializers.protobuf.test.DecimalValuePb2OuterClass.DecimalValuePb2 result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.value_ = valueBuilder_ == null
              ? value_
              : valueBuilder_.build();
          to_bitField0_ |= 0x00000001;
        }
        result.bitField0_ |= to_bitField0_;
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.confluent.kafka.serializers.protobuf.test.DecimalValuePb2OuterClass.DecimalValuePb2) {
          return mergeFrom((io.confluent.kafka.serializers.protobuf.test.DecimalValuePb2OuterClass.DecimalValuePb2)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.confluent.kafka.serializers.protobuf.test.DecimalValuePb2OuterClass.DecimalValuePb2 other) {
        if (other == io.confluent.kafka.serializers.protobuf.test.DecimalValuePb2OuterClass.DecimalValuePb2.getDefaultInstance()) return this;
        if (other.hasValue()) {
          mergeValue(other.getValue());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 10: {
                input.readMessage(
                    getValueFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private io.confluent.protobuf.type.Decimal value_;
      private com.google.protobuf.SingleFieldBuilder<
          io.confluent.protobuf.type.Decimal, io.confluent.protobuf.type.Decimal.Builder, io.confluent.protobuf.type.DecimalOrBuilder> valueBuilder_;
      /**
       * <pre>
       * The bytes value.
       * </pre>
       *
       * <code>optional .confluent.type.Decimal value = 1 [(.confluent.field_meta) = { ... }</code>
       * @return Whether the value field is set.
       */
      public boolean hasValue() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       * The bytes value.
       * </pre>
       *
       * <code>optional .confluent.type.Decimal value = 1 [(.confluent.field_meta) = { ... }</code>
       * @return The value.
       */
      public io.confluent.protobuf.type.Decimal getValue() {
        if (valueBuilder_ == null) {
          return value_ == null ? io.confluent.protobuf.type.Decimal.getDefaultInstance() : value_;
        } else {
          return valueBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * The bytes value.
       * </pre>
       *
       * <code>optional .confluent.type.Decimal value = 1 [(.confluent.field_meta) = { ... }</code>
       */
      public Builder setValue(io.confluent.protobuf.type.Decimal value) {
        if (valueBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          value_ = value;
        } else {
          valueBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * The bytes value.
       * </pre>
       *
       * <code>optional .confluent.type.Decimal value = 1 [(.confluent.field_meta) = { ... }</code>
       */
      public Builder setValue(
          io.confluent.protobuf.type.Decimal.Builder builderForValue) {
        if (valueBuilder_ == null) {
          value_ = builderForValue.build();
        } else {
          valueBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * The bytes value.
       * </pre>
       *
       * <code>optional .confluent.type.Decimal value = 1 [(.confluent.field_meta) = { ... }</code>
       */
      public Builder mergeValue(io.confluent.protobuf.type.Decimal value) {
        if (valueBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            value_ != null &&
            value_ != io.confluent.protobuf.type.Decimal.getDefaultInstance()) {
            getValueBuilder().mergeFrom(value);
          } else {
            value_ = value;
          }
        } else {
          valueBuilder_.mergeFrom(value);
        }
        if (value_ != null) {
          bitField0_ |= 0x00000001;
          onChanged();
        }
        return this;
      }
      /**
       * <pre>
       * The bytes value.
       * </pre>
       *
       * <code>optional .confluent.type.Decimal value = 1 [(.confluent.field_meta) = { ... }</code>
       */
      public Builder clearValue() {
        bitField0_ = (bitField0_ & ~0x00000001);
        value_ = null;
        if (valueBuilder_ != null) {
          valueBuilder_.dispose();
          valueBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <pre>
       * The bytes value.
       * </pre>
       *
       * <code>optional .confluent.type.Decimal value = 1 [(.confluent.field_meta) = { ... }</code>
       */
      public io.confluent.protobuf.type.Decimal.Builder getValueBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getValueFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * The bytes value.
       * </pre>
       *
       * <code>optional .confluent.type.Decimal value = 1 [(.confluent.field_meta) = { ... }</code>
       */
      public io.confluent.protobuf.type.DecimalOrBuilder getValueOrBuilder() {
        if (valueBuilder_ != null) {
          return valueBuilder_.getMessageOrBuilder();
        } else {
          return value_ == null ?
              io.confluent.protobuf.type.Decimal.getDefaultInstance() : value_;
        }
      }
      /**
       * <pre>
       * The bytes value.
       * </pre>
       *
       * <code>optional .confluent.type.Decimal value = 1 [(.confluent.field_meta) = { ... }</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          io.confluent.protobuf.type.Decimal, io.confluent.protobuf.type.Decimal.Builder, io.confluent.protobuf.type.DecimalOrBuilder> 
          getValueFieldBuilder() {
        if (valueBuilder_ == null) {
          valueBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              io.confluent.protobuf.type.Decimal, io.confluent.protobuf.type.Decimal.Builder, io.confluent.protobuf.type.DecimalOrBuilder>(
                  getValue(),
                  getParentForChildren(),
                  isClean());
          value_ = null;
        }
        return valueBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:DecimalValuePb2)
    }

    // @@protoc_insertion_point(class_scope:DecimalValuePb2)
    private static final io.confluent.kafka.serializers.protobuf.test.DecimalValuePb2OuterClass.DecimalValuePb2 DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.confluent.kafka.serializers.protobuf.test.DecimalValuePb2OuterClass.DecimalValuePb2();
    }

    public static io.confluent.kafka.serializers.protobuf.test.DecimalValuePb2OuterClass.DecimalValuePb2 getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DecimalValuePb2>
        PARSER = new com.google.protobuf.AbstractParser<DecimalValuePb2>() {
      @java.lang.Override
      public DecimalValuePb2 parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<DecimalValuePb2> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DecimalValuePb2> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.confluent.kafka.serializers.protobuf.test.DecimalValuePb2OuterClass.DecimalValuePb2 getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DecimalValuePb2_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_DecimalValuePb2_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025DecimalValuePb2.proto\032\024confluent/meta." +
      "proto\032\034confluent/type/decimal.proto\"h\n\017D" +
      "ecimalValuePb2\022G\n\005value\030\001 \001(\0132\027.confluen" +
      "t.type.DecimalB\037\202D\034\022\016\n\tprecision\022\0018\022\n\n\005s" +
      "cale\022\0013:\014\202D\t\n\007messageB.\n,io.confluent.ka" +
      "fka.serializers.protobuf.test"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.confluent.protobuf.MetaProto.getDescriptor(),
          io.confluent.protobuf.type.DecimalProto.getDescriptor(),
        });
    internal_static_DecimalValuePb2_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DecimalValuePb2_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_DecimalValuePb2_descriptor,
        new java.lang.String[] { "Value", });
    descriptor.resolveAllFeaturesImmutable();
    io.confluent.protobuf.MetaProto.getDescriptor();
    io.confluent.protobuf.type.DecimalProto.getDescriptor();
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(io.confluent.protobuf.MetaProto.fieldMeta);
    registry.add(io.confluent.protobuf.MetaProto.messageMeta);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
