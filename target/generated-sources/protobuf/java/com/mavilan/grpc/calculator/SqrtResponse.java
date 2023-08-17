// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: calculator.proto

package com.mavilan.grpc.calculator;

/**
 * Protobuf type {@code mavilan.myprotos.calculus.SqrtResponse}
 */
public final class SqrtResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:mavilan.myprotos.calculus.SqrtResponse)
    SqrtResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SqrtResponse.newBuilder() to construct.
  private SqrtResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SqrtResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SqrtResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SqrtResponse(
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
          case 9: {

            sqrt_ = input.readDouble();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.mavilan.grpc.calculator.CalculatorProtoClass.internal_static_mavilan_myprotos_calculus_SqrtResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.mavilan.grpc.calculator.CalculatorProtoClass.internal_static_mavilan_myprotos_calculus_SqrtResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.mavilan.grpc.calculator.SqrtResponse.class, com.mavilan.grpc.calculator.SqrtResponse.Builder.class);
  }

  public static final int SQRT_FIELD_NUMBER = 1;
  private double sqrt_;
  /**
   * <code>double sqrt = 1;</code>
   * @return The sqrt.
   */
  @java.lang.Override
  public double getSqrt() {
    return sqrt_;
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
    if (java.lang.Double.doubleToRawLongBits(sqrt_) != 0) {
      output.writeDouble(1, sqrt_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (java.lang.Double.doubleToRawLongBits(sqrt_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(1, sqrt_);
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
    if (!(obj instanceof com.mavilan.grpc.calculator.SqrtResponse)) {
      return super.equals(obj);
    }
    com.mavilan.grpc.calculator.SqrtResponse other = (com.mavilan.grpc.calculator.SqrtResponse) obj;

    if (java.lang.Double.doubleToLongBits(getSqrt())
        != java.lang.Double.doubleToLongBits(
            other.getSqrt())) return false;
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
    hash = (37 * hash) + SQRT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getSqrt()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.mavilan.grpc.calculator.SqrtResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.mavilan.grpc.calculator.SqrtResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.mavilan.grpc.calculator.SqrtResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.mavilan.grpc.calculator.SqrtResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.mavilan.grpc.calculator.SqrtResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.mavilan.grpc.calculator.SqrtResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.mavilan.grpc.calculator.SqrtResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.mavilan.grpc.calculator.SqrtResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.mavilan.grpc.calculator.SqrtResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.mavilan.grpc.calculator.SqrtResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.mavilan.grpc.calculator.SqrtResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.mavilan.grpc.calculator.SqrtResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.mavilan.grpc.calculator.SqrtResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code mavilan.myprotos.calculus.SqrtResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:mavilan.myprotos.calculus.SqrtResponse)
      com.mavilan.grpc.calculator.SqrtResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.mavilan.grpc.calculator.CalculatorProtoClass.internal_static_mavilan_myprotos_calculus_SqrtResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.mavilan.grpc.calculator.CalculatorProtoClass.internal_static_mavilan_myprotos_calculus_SqrtResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.mavilan.grpc.calculator.SqrtResponse.class, com.mavilan.grpc.calculator.SqrtResponse.Builder.class);
    }

    // Construct using com.mavilan.grpc.calculator.SqrtResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      sqrt_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.mavilan.grpc.calculator.CalculatorProtoClass.internal_static_mavilan_myprotos_calculus_SqrtResponse_descriptor;
    }

    @java.lang.Override
    public com.mavilan.grpc.calculator.SqrtResponse getDefaultInstanceForType() {
      return com.mavilan.grpc.calculator.SqrtResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.mavilan.grpc.calculator.SqrtResponse build() {
      com.mavilan.grpc.calculator.SqrtResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.mavilan.grpc.calculator.SqrtResponse buildPartial() {
      com.mavilan.grpc.calculator.SqrtResponse result = new com.mavilan.grpc.calculator.SqrtResponse(this);
      result.sqrt_ = sqrt_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.mavilan.grpc.calculator.SqrtResponse) {
        return mergeFrom((com.mavilan.grpc.calculator.SqrtResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.mavilan.grpc.calculator.SqrtResponse other) {
      if (other == com.mavilan.grpc.calculator.SqrtResponse.getDefaultInstance()) return this;
      if (other.getSqrt() != 0D) {
        setSqrt(other.getSqrt());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.mavilan.grpc.calculator.SqrtResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.mavilan.grpc.calculator.SqrtResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private double sqrt_ ;
    /**
     * <code>double sqrt = 1;</code>
     * @return The sqrt.
     */
    @java.lang.Override
    public double getSqrt() {
      return sqrt_;
    }
    /**
     * <code>double sqrt = 1;</code>
     * @param value The sqrt to set.
     * @return This builder for chaining.
     */
    public Builder setSqrt(double value) {
      
      sqrt_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double sqrt = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSqrt() {
      
      sqrt_ = 0D;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:mavilan.myprotos.calculus.SqrtResponse)
  }

  // @@protoc_insertion_point(class_scope:mavilan.myprotos.calculus.SqrtResponse)
  private static final com.mavilan.grpc.calculator.SqrtResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.mavilan.grpc.calculator.SqrtResponse();
  }

  public static com.mavilan.grpc.calculator.SqrtResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SqrtResponse>
      PARSER = new com.google.protobuf.AbstractParser<SqrtResponse>() {
    @java.lang.Override
    public SqrtResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SqrtResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SqrtResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SqrtResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.mavilan.grpc.calculator.SqrtResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

