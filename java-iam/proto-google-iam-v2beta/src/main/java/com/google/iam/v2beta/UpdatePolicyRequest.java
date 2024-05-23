/*
 * Copyright 2024 Google LLC
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
// source: google/iam/v2beta/policy.proto

// Protobuf Java Version: 3.25.3
package com.google.iam.v2beta;

/**
 *
 *
 * <pre>
 * Request message for `UpdatePolicy`.
 * </pre>
 *
 * Protobuf type {@code google.iam.v2beta.UpdatePolicyRequest}
 */
public final class UpdatePolicyRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.iam.v2beta.UpdatePolicyRequest)
    UpdatePolicyRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdatePolicyRequest.newBuilder() to construct.
  private UpdatePolicyRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdatePolicyRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdatePolicyRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.iam.v2beta.PolicyProto
        .internal_static_google_iam_v2beta_UpdatePolicyRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.iam.v2beta.PolicyProto
        .internal_static_google_iam_v2beta_UpdatePolicyRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.iam.v2beta.UpdatePolicyRequest.class,
            com.google.iam.v2beta.UpdatePolicyRequest.Builder.class);
  }

  private int bitField0_;
  public static final int POLICY_FIELD_NUMBER = 1;
  private com.google.iam.v2beta.Policy policy_;
  /**
   *
   *
   * <pre>
   * Required. The policy to update.
   *
   * To prevent conflicting updates, the `etag` value must match the value that
   * is stored in IAM. If the `etag` values do not match, the request fails with
   * a `409` error code and `ABORTED` status.
   * </pre>
   *
   * <code>.google.iam.v2beta.Policy policy = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the policy field is set.
   */
  @java.lang.Override
  public boolean hasPolicy() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. The policy to update.
   *
   * To prevent conflicting updates, the `etag` value must match the value that
   * is stored in IAM. If the `etag` values do not match, the request fails with
   * a `409` error code and `ABORTED` status.
   * </pre>
   *
   * <code>.google.iam.v2beta.Policy policy = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The policy.
   */
  @java.lang.Override
  public com.google.iam.v2beta.Policy getPolicy() {
    return policy_ == null ? com.google.iam.v2beta.Policy.getDefaultInstance() : policy_;
  }
  /**
   *
   *
   * <pre>
   * Required. The policy to update.
   *
   * To prevent conflicting updates, the `etag` value must match the value that
   * is stored in IAM. If the `etag` values do not match, the request fails with
   * a `409` error code and `ABORTED` status.
   * </pre>
   *
   * <code>.google.iam.v2beta.Policy policy = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.iam.v2beta.PolicyOrBuilder getPolicyOrBuilder() {
    return policy_ == null ? com.google.iam.v2beta.Policy.getDefaultInstance() : policy_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getPolicy());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getPolicy());
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
    if (!(obj instanceof com.google.iam.v2beta.UpdatePolicyRequest)) {
      return super.equals(obj);
    }
    com.google.iam.v2beta.UpdatePolicyRequest other =
        (com.google.iam.v2beta.UpdatePolicyRequest) obj;

    if (hasPolicy() != other.hasPolicy()) return false;
    if (hasPolicy()) {
      if (!getPolicy().equals(other.getPolicy())) return false;
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
    if (hasPolicy()) {
      hash = (37 * hash) + POLICY_FIELD_NUMBER;
      hash = (53 * hash) + getPolicy().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.iam.v2beta.UpdatePolicyRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.iam.v2beta.UpdatePolicyRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.iam.v2beta.UpdatePolicyRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.iam.v2beta.UpdatePolicyRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.iam.v2beta.UpdatePolicyRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.iam.v2beta.UpdatePolicyRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.iam.v2beta.UpdatePolicyRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.iam.v2beta.UpdatePolicyRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.iam.v2beta.UpdatePolicyRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.iam.v2beta.UpdatePolicyRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.iam.v2beta.UpdatePolicyRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.iam.v2beta.UpdatePolicyRequest parseFrom(
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

  public static Builder newBuilder(com.google.iam.v2beta.UpdatePolicyRequest prototype) {
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
   * Request message for `UpdatePolicy`.
   * </pre>
   *
   * Protobuf type {@code google.iam.v2beta.UpdatePolicyRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.iam.v2beta.UpdatePolicyRequest)
      com.google.iam.v2beta.UpdatePolicyRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.iam.v2beta.PolicyProto
          .internal_static_google_iam_v2beta_UpdatePolicyRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.iam.v2beta.PolicyProto
          .internal_static_google_iam_v2beta_UpdatePolicyRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.iam.v2beta.UpdatePolicyRequest.class,
              com.google.iam.v2beta.UpdatePolicyRequest.Builder.class);
    }

    // Construct using com.google.iam.v2beta.UpdatePolicyRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getPolicyFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      policy_ = null;
      if (policyBuilder_ != null) {
        policyBuilder_.dispose();
        policyBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.iam.v2beta.PolicyProto
          .internal_static_google_iam_v2beta_UpdatePolicyRequest_descriptor;
    }

    @java.lang.Override
    public com.google.iam.v2beta.UpdatePolicyRequest getDefaultInstanceForType() {
      return com.google.iam.v2beta.UpdatePolicyRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.iam.v2beta.UpdatePolicyRequest build() {
      com.google.iam.v2beta.UpdatePolicyRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.iam.v2beta.UpdatePolicyRequest buildPartial() {
      com.google.iam.v2beta.UpdatePolicyRequest result =
          new com.google.iam.v2beta.UpdatePolicyRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.iam.v2beta.UpdatePolicyRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.policy_ = policyBuilder_ == null ? policy_ : policyBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.google.iam.v2beta.UpdatePolicyRequest) {
        return mergeFrom((com.google.iam.v2beta.UpdatePolicyRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.iam.v2beta.UpdatePolicyRequest other) {
      if (other == com.google.iam.v2beta.UpdatePolicyRequest.getDefaultInstance()) return this;
      if (other.hasPolicy()) {
        mergePolicy(other.getPolicy());
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
            case 10:
              {
                input.readMessage(getPolicyFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            default:
              {
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

    private com.google.iam.v2beta.Policy policy_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.iam.v2beta.Policy,
            com.google.iam.v2beta.Policy.Builder,
            com.google.iam.v2beta.PolicyOrBuilder>
        policyBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The policy to update.
     *
     * To prevent conflicting updates, the `etag` value must match the value that
     * is stored in IAM. If the `etag` values do not match, the request fails with
     * a `409` error code and `ABORTED` status.
     * </pre>
     *
     * <code>.google.iam.v2beta.Policy policy = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return Whether the policy field is set.
     */
    public boolean hasPolicy() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The policy to update.
     *
     * To prevent conflicting updates, the `etag` value must match the value that
     * is stored in IAM. If the `etag` values do not match, the request fails with
     * a `409` error code and `ABORTED` status.
     * </pre>
     *
     * <code>.google.iam.v2beta.Policy policy = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The policy.
     */
    public com.google.iam.v2beta.Policy getPolicy() {
      if (policyBuilder_ == null) {
        return policy_ == null ? com.google.iam.v2beta.Policy.getDefaultInstance() : policy_;
      } else {
        return policyBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The policy to update.
     *
     * To prevent conflicting updates, the `etag` value must match the value that
     * is stored in IAM. If the `etag` values do not match, the request fails with
     * a `409` error code and `ABORTED` status.
     * </pre>
     *
     * <code>.google.iam.v2beta.Policy policy = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setPolicy(com.google.iam.v2beta.Policy value) {
      if (policyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        policy_ = value;
      } else {
        policyBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The policy to update.
     *
     * To prevent conflicting updates, the `etag` value must match the value that
     * is stored in IAM. If the `etag` values do not match, the request fails with
     * a `409` error code and `ABORTED` status.
     * </pre>
     *
     * <code>.google.iam.v2beta.Policy policy = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setPolicy(com.google.iam.v2beta.Policy.Builder builderForValue) {
      if (policyBuilder_ == null) {
        policy_ = builderForValue.build();
      } else {
        policyBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The policy to update.
     *
     * To prevent conflicting updates, the `etag` value must match the value that
     * is stored in IAM. If the `etag` values do not match, the request fails with
     * a `409` error code and `ABORTED` status.
     * </pre>
     *
     * <code>.google.iam.v2beta.Policy policy = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergePolicy(com.google.iam.v2beta.Policy value) {
      if (policyBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && policy_ != null
            && policy_ != com.google.iam.v2beta.Policy.getDefaultInstance()) {
          getPolicyBuilder().mergeFrom(value);
        } else {
          policy_ = value;
        }
      } else {
        policyBuilder_.mergeFrom(value);
      }
      if (policy_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The policy to update.
     *
     * To prevent conflicting updates, the `etag` value must match the value that
     * is stored in IAM. If the `etag` values do not match, the request fails with
     * a `409` error code and `ABORTED` status.
     * </pre>
     *
     * <code>.google.iam.v2beta.Policy policy = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearPolicy() {
      bitField0_ = (bitField0_ & ~0x00000001);
      policy_ = null;
      if (policyBuilder_ != null) {
        policyBuilder_.dispose();
        policyBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The policy to update.
     *
     * To prevent conflicting updates, the `etag` value must match the value that
     * is stored in IAM. If the `etag` values do not match, the request fails with
     * a `409` error code and `ABORTED` status.
     * </pre>
     *
     * <code>.google.iam.v2beta.Policy policy = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.iam.v2beta.Policy.Builder getPolicyBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getPolicyFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The policy to update.
     *
     * To prevent conflicting updates, the `etag` value must match the value that
     * is stored in IAM. If the `etag` values do not match, the request fails with
     * a `409` error code and `ABORTED` status.
     * </pre>
     *
     * <code>.google.iam.v2beta.Policy policy = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.iam.v2beta.PolicyOrBuilder getPolicyOrBuilder() {
      if (policyBuilder_ != null) {
        return policyBuilder_.getMessageOrBuilder();
      } else {
        return policy_ == null ? com.google.iam.v2beta.Policy.getDefaultInstance() : policy_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The policy to update.
     *
     * To prevent conflicting updates, the `etag` value must match the value that
     * is stored in IAM. If the `etag` values do not match, the request fails with
     * a `409` error code and `ABORTED` status.
     * </pre>
     *
     * <code>.google.iam.v2beta.Policy policy = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.iam.v2beta.Policy,
            com.google.iam.v2beta.Policy.Builder,
            com.google.iam.v2beta.PolicyOrBuilder>
        getPolicyFieldBuilder() {
      if (policyBuilder_ == null) {
        policyBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.iam.v2beta.Policy,
                com.google.iam.v2beta.Policy.Builder,
                com.google.iam.v2beta.PolicyOrBuilder>(
                getPolicy(), getParentForChildren(), isClean());
        policy_ = null;
      }
      return policyBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.iam.v2beta.UpdatePolicyRequest)
  }

  // @@protoc_insertion_point(class_scope:google.iam.v2beta.UpdatePolicyRequest)
  private static final com.google.iam.v2beta.UpdatePolicyRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.iam.v2beta.UpdatePolicyRequest();
  }

  public static com.google.iam.v2beta.UpdatePolicyRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdatePolicyRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdatePolicyRequest>() {
        @java.lang.Override
        public UpdatePolicyRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdatePolicyRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdatePolicyRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.iam.v2beta.UpdatePolicyRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
