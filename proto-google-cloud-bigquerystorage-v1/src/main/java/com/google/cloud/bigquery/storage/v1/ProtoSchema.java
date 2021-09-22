/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/storage/v1/protobuf.proto

package com.google.cloud.bigquery.storage.v1;

/**
 *
 *
 * <pre>
 * ProtoSchema describes the schema of the serialized protocol buffer data rows.
 * </pre>
 *
 * Protobuf type {@code google.cloud.bigquery.storage.v1.ProtoSchema}
 */
public final class ProtoSchema extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.bigquery.storage.v1.ProtoSchema)
    ProtoSchemaOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ProtoSchema.newBuilder() to construct.
  private ProtoSchema(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ProtoSchema() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ProtoSchema();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ProtoSchema(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              com.google.protobuf.DescriptorProtos.DescriptorProto.Builder subBuilder = null;
              if (protoDescriptor_ != null) {
                subBuilder = protoDescriptor_.toBuilder();
              }
              protoDescriptor_ =
                  input.readMessage(
                      com.google.protobuf.DescriptorProtos.DescriptorProto.PARSER,
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(protoDescriptor_);
                protoDescriptor_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.bigquery.storage.v1.ProtoBufProto
        .internal_static_google_cloud_bigquery_storage_v1_ProtoSchema_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.bigquery.storage.v1.ProtoBufProto
        .internal_static_google_cloud_bigquery_storage_v1_ProtoSchema_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.bigquery.storage.v1.ProtoSchema.class,
            com.google.cloud.bigquery.storage.v1.ProtoSchema.Builder.class);
  }

  public static final int PROTO_DESCRIPTOR_FIELD_NUMBER = 1;
  private com.google.protobuf.DescriptorProtos.DescriptorProto protoDescriptor_;
  /**
   *
   *
   * <pre>
   * Descriptor for input message.  The provided descriptor must be self
   * contained, such that data rows sent can be fully decoded using only the
   * single descriptor.  For data rows that are compositions of multiple
   * independent messages, this means the descriptor may need to be transformed
   * to only use nested types:
   * https://developers.google.com/protocol-buffers/docs/proto#nested
   * For additional information for how proto types and values map onto BigQuery
   * see: https://cloud.google.com/bigquery/docs/write-api#data_type_conversions
   * </pre>
   *
   * <code>.google.protobuf.DescriptorProto proto_descriptor = 1;</code>
   *
   * @return Whether the protoDescriptor field is set.
   */
  @java.lang.Override
  public boolean hasProtoDescriptor() {
    return protoDescriptor_ != null;
  }
  /**
   *
   *
   * <pre>
   * Descriptor for input message.  The provided descriptor must be self
   * contained, such that data rows sent can be fully decoded using only the
   * single descriptor.  For data rows that are compositions of multiple
   * independent messages, this means the descriptor may need to be transformed
   * to only use nested types:
   * https://developers.google.com/protocol-buffers/docs/proto#nested
   * For additional information for how proto types and values map onto BigQuery
   * see: https://cloud.google.com/bigquery/docs/write-api#data_type_conversions
   * </pre>
   *
   * <code>.google.protobuf.DescriptorProto proto_descriptor = 1;</code>
   *
   * @return The protoDescriptor.
   */
  @java.lang.Override
  public com.google.protobuf.DescriptorProtos.DescriptorProto getProtoDescriptor() {
    return protoDescriptor_ == null
        ? com.google.protobuf.DescriptorProtos.DescriptorProto.getDefaultInstance()
        : protoDescriptor_;
  }
  /**
   *
   *
   * <pre>
   * Descriptor for input message.  The provided descriptor must be self
   * contained, such that data rows sent can be fully decoded using only the
   * single descriptor.  For data rows that are compositions of multiple
   * independent messages, this means the descriptor may need to be transformed
   * to only use nested types:
   * https://developers.google.com/protocol-buffers/docs/proto#nested
   * For additional information for how proto types and values map onto BigQuery
   * see: https://cloud.google.com/bigquery/docs/write-api#data_type_conversions
   * </pre>
   *
   * <code>.google.protobuf.DescriptorProto proto_descriptor = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
      getProtoDescriptorOrBuilder() {
    return getProtoDescriptor();
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    if (hasProtoDescriptor()) {
      if (!getProtoDescriptor().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
    }
    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (protoDescriptor_ != null) {
      output.writeMessage(1, getProtoDescriptor());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (protoDescriptor_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getProtoDescriptor());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.bigquery.storage.v1.ProtoSchema)) {
      return super.equals(obj);
    }
    com.google.cloud.bigquery.storage.v1.ProtoSchema other =
        (com.google.cloud.bigquery.storage.v1.ProtoSchema) obj;

    if (hasProtoDescriptor() != other.hasProtoDescriptor()) return false;
    if (hasProtoDescriptor()) {
      if (!getProtoDescriptor().equals(other.getProtoDescriptor())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasProtoDescriptor()) {
      hash = (37 * hash) + PROTO_DESCRIPTOR_FIELD_NUMBER;
      hash = (53 * hash) + getProtoDescriptor().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.bigquery.storage.v1.ProtoSchema parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.storage.v1.ProtoSchema parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.storage.v1.ProtoSchema parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.storage.v1.ProtoSchema parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.storage.v1.ProtoSchema parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.storage.v1.ProtoSchema parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.storage.v1.ProtoSchema parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.storage.v1.ProtoSchema parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.storage.v1.ProtoSchema parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.storage.v1.ProtoSchema parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.storage.v1.ProtoSchema parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.storage.v1.ProtoSchema parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.bigquery.storage.v1.ProtoSchema prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * ProtoSchema describes the schema of the serialized protocol buffer data rows.
   * </pre>
   *
   * Protobuf type {@code google.cloud.bigquery.storage.v1.ProtoSchema}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.bigquery.storage.v1.ProtoSchema)
      com.google.cloud.bigquery.storage.v1.ProtoSchemaOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.bigquery.storage.v1.ProtoBufProto
          .internal_static_google_cloud_bigquery_storage_v1_ProtoSchema_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.bigquery.storage.v1.ProtoBufProto
          .internal_static_google_cloud_bigquery_storage_v1_ProtoSchema_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.bigquery.storage.v1.ProtoSchema.class,
              com.google.cloud.bigquery.storage.v1.ProtoSchema.Builder.class);
    }

    // Construct using com.google.cloud.bigquery.storage.v1.ProtoSchema.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (protoDescriptorBuilder_ == null) {
        protoDescriptor_ = null;
      } else {
        protoDescriptor_ = null;
        protoDescriptorBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.bigquery.storage.v1.ProtoBufProto
          .internal_static_google_cloud_bigquery_storage_v1_ProtoSchema_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.storage.v1.ProtoSchema getDefaultInstanceForType() {
      return com.google.cloud.bigquery.storage.v1.ProtoSchema.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.bigquery.storage.v1.ProtoSchema build() {
      com.google.cloud.bigquery.storage.v1.ProtoSchema result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.storage.v1.ProtoSchema buildPartial() {
      com.google.cloud.bigquery.storage.v1.ProtoSchema result =
          new com.google.cloud.bigquery.storage.v1.ProtoSchema(this);
      if (protoDescriptorBuilder_ == null) {
        result.protoDescriptor_ = protoDescriptor_;
      } else {
        result.protoDescriptor_ = protoDescriptorBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.bigquery.storage.v1.ProtoSchema) {
        return mergeFrom((com.google.cloud.bigquery.storage.v1.ProtoSchema) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.bigquery.storage.v1.ProtoSchema other) {
      if (other == com.google.cloud.bigquery.storage.v1.ProtoSchema.getDefaultInstance())
        return this;
      if (other.hasProtoDescriptor()) {
        mergeProtoDescriptor(other.getProtoDescriptor());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      if (hasProtoDescriptor()) {
        if (!getProtoDescriptor().isInitialized()) {
          return false;
        }
      }
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.bigquery.storage.v1.ProtoSchema parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.bigquery.storage.v1.ProtoSchema) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.DescriptorProtos.DescriptorProto protoDescriptor_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.DescriptorProtos.DescriptorProto,
            com.google.protobuf.DescriptorProtos.DescriptorProto.Builder,
            com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder>
        protoDescriptorBuilder_;
    /**
     *
     *
     * <pre>
     * Descriptor for input message.  The provided descriptor must be self
     * contained, such that data rows sent can be fully decoded using only the
     * single descriptor.  For data rows that are compositions of multiple
     * independent messages, this means the descriptor may need to be transformed
     * to only use nested types:
     * https://developers.google.com/protocol-buffers/docs/proto#nested
     * For additional information for how proto types and values map onto BigQuery
     * see: https://cloud.google.com/bigquery/docs/write-api#data_type_conversions
     * </pre>
     *
     * <code>.google.protobuf.DescriptorProto proto_descriptor = 1;</code>
     *
     * @return Whether the protoDescriptor field is set.
     */
    public boolean hasProtoDescriptor() {
      return protoDescriptorBuilder_ != null || protoDescriptor_ != null;
    }
    /**
     *
     *
     * <pre>
     * Descriptor for input message.  The provided descriptor must be self
     * contained, such that data rows sent can be fully decoded using only the
     * single descriptor.  For data rows that are compositions of multiple
     * independent messages, this means the descriptor may need to be transformed
     * to only use nested types:
     * https://developers.google.com/protocol-buffers/docs/proto#nested
     * For additional information for how proto types and values map onto BigQuery
     * see: https://cloud.google.com/bigquery/docs/write-api#data_type_conversions
     * </pre>
     *
     * <code>.google.protobuf.DescriptorProto proto_descriptor = 1;</code>
     *
     * @return The protoDescriptor.
     */
    public com.google.protobuf.DescriptorProtos.DescriptorProto getProtoDescriptor() {
      if (protoDescriptorBuilder_ == null) {
        return protoDescriptor_ == null
            ? com.google.protobuf.DescriptorProtos.DescriptorProto.getDefaultInstance()
            : protoDescriptor_;
      } else {
        return protoDescriptorBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Descriptor for input message.  The provided descriptor must be self
     * contained, such that data rows sent can be fully decoded using only the
     * single descriptor.  For data rows that are compositions of multiple
     * independent messages, this means the descriptor may need to be transformed
     * to only use nested types:
     * https://developers.google.com/protocol-buffers/docs/proto#nested
     * For additional information for how proto types and values map onto BigQuery
     * see: https://cloud.google.com/bigquery/docs/write-api#data_type_conversions
     * </pre>
     *
     * <code>.google.protobuf.DescriptorProto proto_descriptor = 1;</code>
     */
    public Builder setProtoDescriptor(com.google.protobuf.DescriptorProtos.DescriptorProto value) {
      if (protoDescriptorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        protoDescriptor_ = value;
        onChanged();
      } else {
        protoDescriptorBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Descriptor for input message.  The provided descriptor must be self
     * contained, such that data rows sent can be fully decoded using only the
     * single descriptor.  For data rows that are compositions of multiple
     * independent messages, this means the descriptor may need to be transformed
     * to only use nested types:
     * https://developers.google.com/protocol-buffers/docs/proto#nested
     * For additional information for how proto types and values map onto BigQuery
     * see: https://cloud.google.com/bigquery/docs/write-api#data_type_conversions
     * </pre>
     *
     * <code>.google.protobuf.DescriptorProto proto_descriptor = 1;</code>
     */
    public Builder setProtoDescriptor(
        com.google.protobuf.DescriptorProtos.DescriptorProto.Builder builderForValue) {
      if (protoDescriptorBuilder_ == null) {
        protoDescriptor_ = builderForValue.build();
        onChanged();
      } else {
        protoDescriptorBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Descriptor for input message.  The provided descriptor must be self
     * contained, such that data rows sent can be fully decoded using only the
     * single descriptor.  For data rows that are compositions of multiple
     * independent messages, this means the descriptor may need to be transformed
     * to only use nested types:
     * https://developers.google.com/protocol-buffers/docs/proto#nested
     * For additional information for how proto types and values map onto BigQuery
     * see: https://cloud.google.com/bigquery/docs/write-api#data_type_conversions
     * </pre>
     *
     * <code>.google.protobuf.DescriptorProto proto_descriptor = 1;</code>
     */
    public Builder mergeProtoDescriptor(
        com.google.protobuf.DescriptorProtos.DescriptorProto value) {
      if (protoDescriptorBuilder_ == null) {
        if (protoDescriptor_ != null) {
          protoDescriptor_ =
              com.google.protobuf.DescriptorProtos.DescriptorProto.newBuilder(protoDescriptor_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          protoDescriptor_ = value;
        }
        onChanged();
      } else {
        protoDescriptorBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Descriptor for input message.  The provided descriptor must be self
     * contained, such that data rows sent can be fully decoded using only the
     * single descriptor.  For data rows that are compositions of multiple
     * independent messages, this means the descriptor may need to be transformed
     * to only use nested types:
     * https://developers.google.com/protocol-buffers/docs/proto#nested
     * For additional information for how proto types and values map onto BigQuery
     * see: https://cloud.google.com/bigquery/docs/write-api#data_type_conversions
     * </pre>
     *
     * <code>.google.protobuf.DescriptorProto proto_descriptor = 1;</code>
     */
    public Builder clearProtoDescriptor() {
      if (protoDescriptorBuilder_ == null) {
        protoDescriptor_ = null;
        onChanged();
      } else {
        protoDescriptor_ = null;
        protoDescriptorBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Descriptor for input message.  The provided descriptor must be self
     * contained, such that data rows sent can be fully decoded using only the
     * single descriptor.  For data rows that are compositions of multiple
     * independent messages, this means the descriptor may need to be transformed
     * to only use nested types:
     * https://developers.google.com/protocol-buffers/docs/proto#nested
     * For additional information for how proto types and values map onto BigQuery
     * see: https://cloud.google.com/bigquery/docs/write-api#data_type_conversions
     * </pre>
     *
     * <code>.google.protobuf.DescriptorProto proto_descriptor = 1;</code>
     */
    public com.google.protobuf.DescriptorProtos.DescriptorProto.Builder
        getProtoDescriptorBuilder() {

      onChanged();
      return getProtoDescriptorFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Descriptor for input message.  The provided descriptor must be self
     * contained, such that data rows sent can be fully decoded using only the
     * single descriptor.  For data rows that are compositions of multiple
     * independent messages, this means the descriptor may need to be transformed
     * to only use nested types:
     * https://developers.google.com/protocol-buffers/docs/proto#nested
     * For additional information for how proto types and values map onto BigQuery
     * see: https://cloud.google.com/bigquery/docs/write-api#data_type_conversions
     * </pre>
     *
     * <code>.google.protobuf.DescriptorProto proto_descriptor = 1;</code>
     */
    public com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        getProtoDescriptorOrBuilder() {
      if (protoDescriptorBuilder_ != null) {
        return protoDescriptorBuilder_.getMessageOrBuilder();
      } else {
        return protoDescriptor_ == null
            ? com.google.protobuf.DescriptorProtos.DescriptorProto.getDefaultInstance()
            : protoDescriptor_;
      }
    }
    /**
     *
     *
     * <pre>
     * Descriptor for input message.  The provided descriptor must be self
     * contained, such that data rows sent can be fully decoded using only the
     * single descriptor.  For data rows that are compositions of multiple
     * independent messages, this means the descriptor may need to be transformed
     * to only use nested types:
     * https://developers.google.com/protocol-buffers/docs/proto#nested
     * For additional information for how proto types and values map onto BigQuery
     * see: https://cloud.google.com/bigquery/docs/write-api#data_type_conversions
     * </pre>
     *
     * <code>.google.protobuf.DescriptorProto proto_descriptor = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.DescriptorProtos.DescriptorProto,
            com.google.protobuf.DescriptorProtos.DescriptorProto.Builder,
            com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder>
        getProtoDescriptorFieldBuilder() {
      if (protoDescriptorBuilder_ == null) {
        protoDescriptorBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.DescriptorProtos.DescriptorProto,
                com.google.protobuf.DescriptorProtos.DescriptorProto.Builder,
                com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder>(
                getProtoDescriptor(), getParentForChildren(), isClean());
        protoDescriptor_ = null;
      }
      return protoDescriptorBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.bigquery.storage.v1.ProtoSchema)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.bigquery.storage.v1.ProtoSchema)
  private static final com.google.cloud.bigquery.storage.v1.ProtoSchema DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.bigquery.storage.v1.ProtoSchema();
  }

  public static com.google.cloud.bigquery.storage.v1.ProtoSchema getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProtoSchema> PARSER =
      new com.google.protobuf.AbstractParser<ProtoSchema>() {
        @java.lang.Override
        public ProtoSchema parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ProtoSchema(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ProtoSchema> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProtoSchema> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.bigquery.storage.v1.ProtoSchema getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
