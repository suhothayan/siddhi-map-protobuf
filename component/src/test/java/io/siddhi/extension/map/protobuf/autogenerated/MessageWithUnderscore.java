// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sample.proto

package io.siddhi.extension.map.protobuf.autogenerated;

/**
 * Protobuf type {@code MessageWithUnderscore}
 */
public  final class MessageWithUnderscore extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:MessageWithUnderscore)
    MessageWithUnderscoreOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MessageWithUnderscore.newBuilder() to construct.
  private MessageWithUnderscore(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MessageWithUnderscore() {
    stringValue_ = "";
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MessageWithUnderscore(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 10: {
            String s = input.readStringRequireUtf8();

            stringValue_ = s;
            break;
          }
          case 16: {

            intValue_ = input.readInt32();
            break;
          }
          case 25: {

            doubleValue_ = input.readDouble();
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
    return Sample.internal_static_MessageWithUnderscore_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return Sample.internal_static_MessageWithUnderscore_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            MessageWithUnderscore.class, Builder.class);
  }

  public static final int STRING_VALUE_FIELD_NUMBER = 1;
  private volatile Object stringValue_;
  /**
   * <code>string string_value = 1;</code>
   */
  public String getStringValue() {
    Object ref = stringValue_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      stringValue_ = s;
      return s;
    }
  }
  /**
   * <code>string string_value = 1;</code>
   */
  public com.google.protobuf.ByteString
      getStringValueBytes() {
    Object ref = stringValue_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      stringValue_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INT_VALUE_FIELD_NUMBER = 2;
  private int intValue_;
  /**
   * <code>int32 int_value = 2;</code>
   */
  public int getIntValue() {
    return intValue_;
  }

  public static final int DOUBLEVALUE__FIELD_NUMBER = 3;
  private double doubleValue_;
  /**
   * <code>double doubleValue_ = 3;</code>
   */
  public double getDoubleValue() {
    return doubleValue_;
  }

  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getStringValueBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, stringValue_);
    }
    if (intValue_ != 0) {
      output.writeInt32(2, intValue_);
    }
    if (doubleValue_ != 0D) {
      output.writeDouble(3, doubleValue_);
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getStringValueBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, stringValue_);
    }
    if (intValue_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, intValue_);
    }
    if (doubleValue_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, doubleValue_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof MessageWithUnderscore)) {
      return super.equals(obj);
    }
    MessageWithUnderscore other = (MessageWithUnderscore) obj;

    if (!getStringValue()
        .equals(other.getStringValue())) return false;
    if (getIntValue()
        != other.getIntValue()) return false;
    if (Double.doubleToLongBits(getDoubleValue())
        != Double.doubleToLongBits(
            other.getDoubleValue())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + STRING_VALUE_FIELD_NUMBER;
    hash = (53 * hash) + getStringValue().hashCode();
    hash = (37 * hash) + INT_VALUE_FIELD_NUMBER;
    hash = (53 * hash) + getIntValue();
    hash = (37 * hash) + DOUBLEVALUE__FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        Double.doubleToLongBits(getDoubleValue()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static MessageWithUnderscore parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static MessageWithUnderscore parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static MessageWithUnderscore parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static MessageWithUnderscore parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static MessageWithUnderscore parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static MessageWithUnderscore parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static MessageWithUnderscore parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static MessageWithUnderscore parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static MessageWithUnderscore parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static MessageWithUnderscore parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static MessageWithUnderscore parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static MessageWithUnderscore parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(MessageWithUnderscore prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code MessageWithUnderscore}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:MessageWithUnderscore)
      MessageWithUnderscoreOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Sample.internal_static_MessageWithUnderscore_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Sample.internal_static_MessageWithUnderscore_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              MessageWithUnderscore.class, Builder.class);
    }

    // Construct using io.siddhi.extension.map.protobuf.autogenerated.MessageWithUnderscore.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @Override
    public Builder clear() {
      super.clear();
      stringValue_ = "";

      intValue_ = 0;

      doubleValue_ = 0D;

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return Sample.internal_static_MessageWithUnderscore_descriptor;
    }

    @Override
    public MessageWithUnderscore getDefaultInstanceForType() {
      return MessageWithUnderscore.getDefaultInstance();
    }

    @Override
    public MessageWithUnderscore build() {
      MessageWithUnderscore result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public MessageWithUnderscore buildPartial() {
      MessageWithUnderscore result = new MessageWithUnderscore(this);
      result.stringValue_ = stringValue_;
      result.intValue_ = intValue_;
      result.doubleValue_ = doubleValue_;
      onBuilt();
      return result;
    }

    @Override
    public Builder clone() {
      return super.clone();
    }
    @Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.setField(field, value);
    }
    @Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.addRepeatedField(field, value);
    }
    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof MessageWithUnderscore) {
        return mergeFrom((MessageWithUnderscore)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(MessageWithUnderscore other) {
      if (other == MessageWithUnderscore.getDefaultInstance()) return this;
      if (!other.getStringValue().isEmpty()) {
        stringValue_ = other.stringValue_;
        onChanged();
      }
      if (other.getIntValue() != 0) {
        setIntValue(other.getIntValue());
      }
      if (other.getDoubleValue() != 0D) {
        setDoubleValue(other.getDoubleValue());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      MessageWithUnderscore parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (MessageWithUnderscore) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private Object stringValue_ = "";
    /**
     * <code>string string_value = 1;</code>
     */
    public String getStringValue() {
      Object ref = stringValue_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        stringValue_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string string_value = 1;</code>
     */
    public com.google.protobuf.ByteString
        getStringValueBytes() {
      Object ref = stringValue_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        stringValue_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string string_value = 1;</code>
     */
    public Builder setStringValue(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      stringValue_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string string_value = 1;</code>
     */
    public Builder clearStringValue() {
      
      stringValue_ = getDefaultInstance().getStringValue();
      onChanged();
      return this;
    }
    /**
     * <code>string string_value = 1;</code>
     */
    public Builder setStringValueBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      stringValue_ = value;
      onChanged();
      return this;
    }

    private int intValue_ ;
    /**
     * <code>int32 int_value = 2;</code>
     */
    public int getIntValue() {
      return intValue_;
    }
    /**
     * <code>int32 int_value = 2;</code>
     */
    public Builder setIntValue(int value) {
      
      intValue_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 int_value = 2;</code>
     */
    public Builder clearIntValue() {
      
      intValue_ = 0;
      onChanged();
      return this;
    }

    private double doubleValue_ ;
    /**
     * <code>double doubleValue_ = 3;</code>
     */
    public double getDoubleValue() {
      return doubleValue_;
    }
    /**
     * <code>double doubleValue_ = 3;</code>
     */
    public Builder setDoubleValue(double value) {
      
      doubleValue_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double doubleValue_ = 3;</code>
     */
    public Builder clearDoubleValue() {
      
      doubleValue_ = 0D;
      onChanged();
      return this;
    }
    @Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:MessageWithUnderscore)
  }

  // @@protoc_insertion_point(class_scope:MessageWithUnderscore)
  private static final MessageWithUnderscore DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new MessageWithUnderscore();
  }

  public static MessageWithUnderscore getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MessageWithUnderscore>
      PARSER = new com.google.protobuf.AbstractParser<MessageWithUnderscore>() {
    @Override
    public MessageWithUnderscore parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MessageWithUnderscore(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MessageWithUnderscore> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<MessageWithUnderscore> getParserForType() {
    return PARSER;
  }

  @Override
  public MessageWithUnderscore getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
