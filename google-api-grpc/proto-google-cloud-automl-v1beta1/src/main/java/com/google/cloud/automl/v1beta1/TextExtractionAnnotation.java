// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/automl/v1beta1/text_extraction.proto

package com.google.cloud.automl.v1beta1;

/**
 *
 *
 * <pre>
 * Annotation for identifying spans of text.
 * </pre>
 *
 * Protobuf type {@code google.cloud.automl.v1beta1.TextExtractionAnnotation}
 */
public final class TextExtractionAnnotation extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.automl.v1beta1.TextExtractionAnnotation)
    TextExtractionAnnotationOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use TextExtractionAnnotation.newBuilder() to construct.
  private TextExtractionAnnotation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private TextExtractionAnnotation() {}

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private TextExtractionAnnotation(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
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
          case 13:
            {
              score_ = input.readFloat();
              break;
            }
          case 26:
            {
              com.google.cloud.automl.v1beta1.TextSegment.Builder subBuilder = null;
              if (textSegment_ != null) {
                subBuilder = textSegment_.toBuilder();
              }
              textSegment_ =
                  input.readMessage(
                      com.google.cloud.automl.v1beta1.TextSegment.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(textSegment_);
                textSegment_ = subBuilder.buildPartial();
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
    return com.google.cloud.automl.v1beta1.TextExtraction
        .internal_static_google_cloud_automl_v1beta1_TextExtractionAnnotation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.automl.v1beta1.TextExtraction
        .internal_static_google_cloud_automl_v1beta1_TextExtractionAnnotation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.automl.v1beta1.TextExtractionAnnotation.class,
            com.google.cloud.automl.v1beta1.TextExtractionAnnotation.Builder.class);
  }

  public static final int SCORE_FIELD_NUMBER = 1;
  private float score_;
  /**
   *
   *
   * <pre>
   * Output only. A confidence estimate between 0.0 and 1.0. A higher value
   * means greater confidence in correctness of the annotation.
   * </pre>
   *
   * <code>float score = 1;</code>
   */
  public float getScore() {
    return score_;
  }

  public static final int TEXT_SEGMENT_FIELD_NUMBER = 3;
  private com.google.cloud.automl.v1beta1.TextSegment textSegment_;
  /**
   *
   *
   * <pre>
   * Required. The part of the original text to which this annotation pertains.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.TextSegment text_segment = 3;</code>
   */
  public boolean hasTextSegment() {
    return textSegment_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The part of the original text to which this annotation pertains.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.TextSegment text_segment = 3;</code>
   */
  public com.google.cloud.automl.v1beta1.TextSegment getTextSegment() {
    return textSegment_ == null
        ? com.google.cloud.automl.v1beta1.TextSegment.getDefaultInstance()
        : textSegment_;
  }
  /**
   *
   *
   * <pre>
   * Required. The part of the original text to which this annotation pertains.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.TextSegment text_segment = 3;</code>
   */
  public com.google.cloud.automl.v1beta1.TextSegmentOrBuilder getTextSegmentOrBuilder() {
    return getTextSegment();
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (score_ != 0F) {
      output.writeFloat(1, score_);
    }
    if (textSegment_ != null) {
      output.writeMessage(3, getTextSegment());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (score_ != 0F) {
      size += com.google.protobuf.CodedOutputStream.computeFloatSize(1, score_);
    }
    if (textSegment_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getTextSegment());
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
    if (!(obj instanceof com.google.cloud.automl.v1beta1.TextExtractionAnnotation)) {
      return super.equals(obj);
    }
    com.google.cloud.automl.v1beta1.TextExtractionAnnotation other =
        (com.google.cloud.automl.v1beta1.TextExtractionAnnotation) obj;

    if (java.lang.Float.floatToIntBits(getScore())
        != java.lang.Float.floatToIntBits(other.getScore())) return false;
    if (hasTextSegment() != other.hasTextSegment()) return false;
    if (hasTextSegment()) {
      if (!getTextSegment().equals(other.getTextSegment())) return false;
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
    hash = (37 * hash) + SCORE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(getScore());
    if (hasTextSegment()) {
      hash = (37 * hash) + TEXT_SEGMENT_FIELD_NUMBER;
      hash = (53 * hash) + getTextSegment().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.automl.v1beta1.TextExtractionAnnotation parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1beta1.TextExtractionAnnotation parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.TextExtractionAnnotation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1beta1.TextExtractionAnnotation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.TextExtractionAnnotation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1beta1.TextExtractionAnnotation parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.TextExtractionAnnotation parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1beta1.TextExtractionAnnotation parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.TextExtractionAnnotation parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1beta1.TextExtractionAnnotation parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.TextExtractionAnnotation parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1beta1.TextExtractionAnnotation parseFrom(
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

  public static Builder newBuilder(
      com.google.cloud.automl.v1beta1.TextExtractionAnnotation prototype) {
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
   * Annotation for identifying spans of text.
   * </pre>
   *
   * Protobuf type {@code google.cloud.automl.v1beta1.TextExtractionAnnotation}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.automl.v1beta1.TextExtractionAnnotation)
      com.google.cloud.automl.v1beta1.TextExtractionAnnotationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.automl.v1beta1.TextExtraction
          .internal_static_google_cloud_automl_v1beta1_TextExtractionAnnotation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.automl.v1beta1.TextExtraction
          .internal_static_google_cloud_automl_v1beta1_TextExtractionAnnotation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.automl.v1beta1.TextExtractionAnnotation.class,
              com.google.cloud.automl.v1beta1.TextExtractionAnnotation.Builder.class);
    }

    // Construct using com.google.cloud.automl.v1beta1.TextExtractionAnnotation.newBuilder()
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
      score_ = 0F;

      if (textSegmentBuilder_ == null) {
        textSegment_ = null;
      } else {
        textSegment_ = null;
        textSegmentBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.automl.v1beta1.TextExtraction
          .internal_static_google_cloud_automl_v1beta1_TextExtractionAnnotation_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.automl.v1beta1.TextExtractionAnnotation getDefaultInstanceForType() {
      return com.google.cloud.automl.v1beta1.TextExtractionAnnotation.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.automl.v1beta1.TextExtractionAnnotation build() {
      com.google.cloud.automl.v1beta1.TextExtractionAnnotation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.automl.v1beta1.TextExtractionAnnotation buildPartial() {
      com.google.cloud.automl.v1beta1.TextExtractionAnnotation result =
          new com.google.cloud.automl.v1beta1.TextExtractionAnnotation(this);
      result.score_ = score_;
      if (textSegmentBuilder_ == null) {
        result.textSegment_ = textSegment_;
      } else {
        result.textSegment_ = textSegmentBuilder_.build();
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
      if (other instanceof com.google.cloud.automl.v1beta1.TextExtractionAnnotation) {
        return mergeFrom((com.google.cloud.automl.v1beta1.TextExtractionAnnotation) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.automl.v1beta1.TextExtractionAnnotation other) {
      if (other == com.google.cloud.automl.v1beta1.TextExtractionAnnotation.getDefaultInstance())
        return this;
      if (other.getScore() != 0F) {
        setScore(other.getScore());
      }
      if (other.hasTextSegment()) {
        mergeTextSegment(other.getTextSegment());
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
      com.google.cloud.automl.v1beta1.TextExtractionAnnotation parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.automl.v1beta1.TextExtractionAnnotation) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private float score_;
    /**
     *
     *
     * <pre>
     * Output only. A confidence estimate between 0.0 and 1.0. A higher value
     * means greater confidence in correctness of the annotation.
     * </pre>
     *
     * <code>float score = 1;</code>
     */
    public float getScore() {
      return score_;
    }
    /**
     *
     *
     * <pre>
     * Output only. A confidence estimate between 0.0 and 1.0. A higher value
     * means greater confidence in correctness of the annotation.
     * </pre>
     *
     * <code>float score = 1;</code>
     */
    public Builder setScore(float value) {

      score_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. A confidence estimate between 0.0 and 1.0. A higher value
     * means greater confidence in correctness of the annotation.
     * </pre>
     *
     * <code>float score = 1;</code>
     */
    public Builder clearScore() {

      score_ = 0F;
      onChanged();
      return this;
    }

    private com.google.cloud.automl.v1beta1.TextSegment textSegment_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.automl.v1beta1.TextSegment,
            com.google.cloud.automl.v1beta1.TextSegment.Builder,
            com.google.cloud.automl.v1beta1.TextSegmentOrBuilder>
        textSegmentBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The part of the original text to which this annotation pertains.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.TextSegment text_segment = 3;</code>
     */
    public boolean hasTextSegment() {
      return textSegmentBuilder_ != null || textSegment_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The part of the original text to which this annotation pertains.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.TextSegment text_segment = 3;</code>
     */
    public com.google.cloud.automl.v1beta1.TextSegment getTextSegment() {
      if (textSegmentBuilder_ == null) {
        return textSegment_ == null
            ? com.google.cloud.automl.v1beta1.TextSegment.getDefaultInstance()
            : textSegment_;
      } else {
        return textSegmentBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The part of the original text to which this annotation pertains.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.TextSegment text_segment = 3;</code>
     */
    public Builder setTextSegment(com.google.cloud.automl.v1beta1.TextSegment value) {
      if (textSegmentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        textSegment_ = value;
        onChanged();
      } else {
        textSegmentBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The part of the original text to which this annotation pertains.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.TextSegment text_segment = 3;</code>
     */
    public Builder setTextSegment(
        com.google.cloud.automl.v1beta1.TextSegment.Builder builderForValue) {
      if (textSegmentBuilder_ == null) {
        textSegment_ = builderForValue.build();
        onChanged();
      } else {
        textSegmentBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The part of the original text to which this annotation pertains.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.TextSegment text_segment = 3;</code>
     */
    public Builder mergeTextSegment(com.google.cloud.automl.v1beta1.TextSegment value) {
      if (textSegmentBuilder_ == null) {
        if (textSegment_ != null) {
          textSegment_ =
              com.google.cloud.automl.v1beta1.TextSegment.newBuilder(textSegment_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          textSegment_ = value;
        }
        onChanged();
      } else {
        textSegmentBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The part of the original text to which this annotation pertains.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.TextSegment text_segment = 3;</code>
     */
    public Builder clearTextSegment() {
      if (textSegmentBuilder_ == null) {
        textSegment_ = null;
        onChanged();
      } else {
        textSegment_ = null;
        textSegmentBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The part of the original text to which this annotation pertains.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.TextSegment text_segment = 3;</code>
     */
    public com.google.cloud.automl.v1beta1.TextSegment.Builder getTextSegmentBuilder() {

      onChanged();
      return getTextSegmentFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The part of the original text to which this annotation pertains.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.TextSegment text_segment = 3;</code>
     */
    public com.google.cloud.automl.v1beta1.TextSegmentOrBuilder getTextSegmentOrBuilder() {
      if (textSegmentBuilder_ != null) {
        return textSegmentBuilder_.getMessageOrBuilder();
      } else {
        return textSegment_ == null
            ? com.google.cloud.automl.v1beta1.TextSegment.getDefaultInstance()
            : textSegment_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The part of the original text to which this annotation pertains.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.TextSegment text_segment = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.automl.v1beta1.TextSegment,
            com.google.cloud.automl.v1beta1.TextSegment.Builder,
            com.google.cloud.automl.v1beta1.TextSegmentOrBuilder>
        getTextSegmentFieldBuilder() {
      if (textSegmentBuilder_ == null) {
        textSegmentBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.automl.v1beta1.TextSegment,
                com.google.cloud.automl.v1beta1.TextSegment.Builder,
                com.google.cloud.automl.v1beta1.TextSegmentOrBuilder>(
                getTextSegment(), getParentForChildren(), isClean());
        textSegment_ = null;
      }
      return textSegmentBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.automl.v1beta1.TextExtractionAnnotation)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.automl.v1beta1.TextExtractionAnnotation)
  private static final com.google.cloud.automl.v1beta1.TextExtractionAnnotation DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.automl.v1beta1.TextExtractionAnnotation();
  }

  public static com.google.cloud.automl.v1beta1.TextExtractionAnnotation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TextExtractionAnnotation> PARSER =
      new com.google.protobuf.AbstractParser<TextExtractionAnnotation>() {
        @java.lang.Override
        public TextExtractionAnnotation parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new TextExtractionAnnotation(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<TextExtractionAnnotation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TextExtractionAnnotation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.automl.v1beta1.TextExtractionAnnotation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
