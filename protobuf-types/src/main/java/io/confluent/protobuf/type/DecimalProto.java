// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: decimal.proto

// Protobuf Java Version: 3.25.5
package io.confluent.protobuf.type;

public final class DecimalProto {
  private DecimalProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_confluent_type_Decimal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_confluent_type_Decimal_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rdecimal.proto\022\016confluent.type\":\n\007Decim" +
      "al\022\r\n\005value\030\001 \001(\014\022\021\n\tprecision\030\002 \001(\r\022\r\n\005" +
      "scale\030\003 \001(\005B,\n\032io.confluent.protobuf.typ" +
      "eB\014DecimalProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_confluent_type_Decimal_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_confluent_type_Decimal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_confluent_type_Decimal_descriptor,
        new java.lang.String[] { "Value", "Precision", "Scale", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
