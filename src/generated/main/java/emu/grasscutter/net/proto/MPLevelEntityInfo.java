// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MPLevelEntityInfo.proto

package emu.grasscutter.net.proto;

public final class MPLevelEntityInfo {
  private MPLevelEntityInfo() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MpLevelEntityInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MpLevelEntityInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.AbilitySyncStateInfo ability_info = 2;</code>
     * @return Whether the abilityInfo field is set.
     */
    boolean hasAbilityInfo();
    /**
     * <code>.AbilitySyncStateInfo ability_info = 2;</code>
     * @return The abilityInfo.
     */
    emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo getAbilityInfo();
    /**
     * <code>.AbilitySyncStateInfo ability_info = 2;</code>
     */
    emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder getAbilityInfoOrBuilder();

    /**
     * <code>uint32 authority_peer_id = 9;</code>
     * @return The authorityPeerId.
     */
    int getAuthorityPeerId();

    /**
     * <code>uint32 entity_id = 7;</code>
     * @return The entityId.
     */
    int getEntityId();
  }
  /**
   * Protobuf type {@code MpLevelEntityInfo}
   */
  public static final class MpLevelEntityInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MpLevelEntityInfo)
      MpLevelEntityInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MpLevelEntityInfo.newBuilder() to construct.
    private MpLevelEntityInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MpLevelEntityInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MpLevelEntityInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MpLevelEntityInfo(
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
            case 18: {
              emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder subBuilder = null;
              if (abilityInfo_ != null) {
                subBuilder = abilityInfo_.toBuilder();
              }
              abilityInfo_ = input.readMessage(emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(abilityInfo_);
                abilityInfo_ = subBuilder.buildPartial();
              }

              break;
            }
            case 56: {

              entityId_ = input.readUInt32();
              break;
            }
            case 72: {

              authorityPeerId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.MPLevelEntityInfo.internal_static_MpLevelEntityInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.MPLevelEntityInfo.internal_static_MpLevelEntityInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.MPLevelEntityInfo.MpLevelEntityInfo.class, emu.grasscutter.net.proto.MPLevelEntityInfo.MpLevelEntityInfo.Builder.class);
    }

    public static final int ABILITY_INFO_FIELD_NUMBER = 2;
    private emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo abilityInfo_;
    /**
     * <code>.AbilitySyncStateInfo ability_info = 2;</code>
     * @return Whether the abilityInfo field is set.
     */
    @java.lang.Override
    public boolean hasAbilityInfo() {
      return abilityInfo_ != null;
    }
    /**
     * <code>.AbilitySyncStateInfo ability_info = 2;</code>
     * @return The abilityInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo getAbilityInfo() {
      return abilityInfo_ == null ? emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.getDefaultInstance() : abilityInfo_;
    }
    /**
     * <code>.AbilitySyncStateInfo ability_info = 2;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder getAbilityInfoOrBuilder() {
      return getAbilityInfo();
    }

    public static final int AUTHORITY_PEER_ID_FIELD_NUMBER = 9;
    private int authorityPeerId_;
    /**
     * <code>uint32 authority_peer_id = 9;</code>
     * @return The authorityPeerId.
     */
    @java.lang.Override
    public int getAuthorityPeerId() {
      return authorityPeerId_;
    }

    public static final int ENTITY_ID_FIELD_NUMBER = 7;
    private int entityId_;
    /**
     * <code>uint32 entity_id = 7;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
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
      if (abilityInfo_ != null) {
        output.writeMessage(2, getAbilityInfo());
      }
      if (entityId_ != 0) {
        output.writeUInt32(7, entityId_);
      }
      if (authorityPeerId_ != 0) {
        output.writeUInt32(9, authorityPeerId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (abilityInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getAbilityInfo());
      }
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, entityId_);
      }
      if (authorityPeerId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, authorityPeerId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.MPLevelEntityInfo.MpLevelEntityInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.MPLevelEntityInfo.MpLevelEntityInfo other = (emu.grasscutter.net.proto.MPLevelEntityInfo.MpLevelEntityInfo) obj;

      if (hasAbilityInfo() != other.hasAbilityInfo()) return false;
      if (hasAbilityInfo()) {
        if (!getAbilityInfo()
            .equals(other.getAbilityInfo())) return false;
      }
      if (getAuthorityPeerId()
          != other.getAuthorityPeerId()) return false;
      if (getEntityId()
          != other.getEntityId()) return false;
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
      if (hasAbilityInfo()) {
        hash = (37 * hash) + ABILITY_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getAbilityInfo().hashCode();
      }
      hash = (37 * hash) + AUTHORITY_PEER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getAuthorityPeerId();
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.MPLevelEntityInfo.MpLevelEntityInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MPLevelEntityInfo.MpLevelEntityInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MPLevelEntityInfo.MpLevelEntityInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MPLevelEntityInfo.MpLevelEntityInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MPLevelEntityInfo.MpLevelEntityInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MPLevelEntityInfo.MpLevelEntityInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MPLevelEntityInfo.MpLevelEntityInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MPLevelEntityInfo.MpLevelEntityInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MPLevelEntityInfo.MpLevelEntityInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MPLevelEntityInfo.MpLevelEntityInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MPLevelEntityInfo.MpLevelEntityInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MPLevelEntityInfo.MpLevelEntityInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.MPLevelEntityInfo.MpLevelEntityInfo prototype) {
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
     * Protobuf type {@code MpLevelEntityInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MpLevelEntityInfo)
        emu.grasscutter.net.proto.MPLevelEntityInfo.MpLevelEntityInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.MPLevelEntityInfo.internal_static_MpLevelEntityInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.MPLevelEntityInfo.internal_static_MpLevelEntityInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.MPLevelEntityInfo.MpLevelEntityInfo.class, emu.grasscutter.net.proto.MPLevelEntityInfo.MpLevelEntityInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.MPLevelEntityInfo.MpLevelEntityInfo.newBuilder()
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
        if (abilityInfoBuilder_ == null) {
          abilityInfo_ = null;
        } else {
          abilityInfo_ = null;
          abilityInfoBuilder_ = null;
        }
        authorityPeerId_ = 0;

        entityId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.MPLevelEntityInfo.internal_static_MpLevelEntityInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MPLevelEntityInfo.MpLevelEntityInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.MPLevelEntityInfo.MpLevelEntityInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MPLevelEntityInfo.MpLevelEntityInfo build() {
        emu.grasscutter.net.proto.MPLevelEntityInfo.MpLevelEntityInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MPLevelEntityInfo.MpLevelEntityInfo buildPartial() {
        emu.grasscutter.net.proto.MPLevelEntityInfo.MpLevelEntityInfo result = new emu.grasscutter.net.proto.MPLevelEntityInfo.MpLevelEntityInfo(this);
        if (abilityInfoBuilder_ == null) {
          result.abilityInfo_ = abilityInfo_;
        } else {
          result.abilityInfo_ = abilityInfoBuilder_.build();
        }
        result.authorityPeerId_ = authorityPeerId_;
        result.entityId_ = entityId_;
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
        if (other instanceof emu.grasscutter.net.proto.MPLevelEntityInfo.MpLevelEntityInfo) {
          return mergeFrom((emu.grasscutter.net.proto.MPLevelEntityInfo.MpLevelEntityInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.MPLevelEntityInfo.MpLevelEntityInfo other) {
        if (other == emu.grasscutter.net.proto.MPLevelEntityInfo.MpLevelEntityInfo.getDefaultInstance()) return this;
        if (other.hasAbilityInfo()) {
          mergeAbilityInfo(other.getAbilityInfo());
        }
        if (other.getAuthorityPeerId() != 0) {
          setAuthorityPeerId(other.getAuthorityPeerId());
        }
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
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
        emu.grasscutter.net.proto.MPLevelEntityInfo.MpLevelEntityInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.MPLevelEntityInfo.MpLevelEntityInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo abilityInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo, emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder, emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder> abilityInfoBuilder_;
      /**
       * <code>.AbilitySyncStateInfo ability_info = 2;</code>
       * @return Whether the abilityInfo field is set.
       */
      public boolean hasAbilityInfo() {
        return abilityInfoBuilder_ != null || abilityInfo_ != null;
      }
      /**
       * <code>.AbilitySyncStateInfo ability_info = 2;</code>
       * @return The abilityInfo.
       */
      public emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo getAbilityInfo() {
        if (abilityInfoBuilder_ == null) {
          return abilityInfo_ == null ? emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.getDefaultInstance() : abilityInfo_;
        } else {
          return abilityInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.AbilitySyncStateInfo ability_info = 2;</code>
       */
      public Builder setAbilityInfo(emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo value) {
        if (abilityInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          abilityInfo_ = value;
          onChanged();
        } else {
          abilityInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.AbilitySyncStateInfo ability_info = 2;</code>
       */
      public Builder setAbilityInfo(
          emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder builderForValue) {
        if (abilityInfoBuilder_ == null) {
          abilityInfo_ = builderForValue.build();
          onChanged();
        } else {
          abilityInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.AbilitySyncStateInfo ability_info = 2;</code>
       */
      public Builder mergeAbilityInfo(emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo value) {
        if (abilityInfoBuilder_ == null) {
          if (abilityInfo_ != null) {
            abilityInfo_ =
              emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.newBuilder(abilityInfo_).mergeFrom(value).buildPartial();
          } else {
            abilityInfo_ = value;
          }
          onChanged();
        } else {
          abilityInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.AbilitySyncStateInfo ability_info = 2;</code>
       */
      public Builder clearAbilityInfo() {
        if (abilityInfoBuilder_ == null) {
          abilityInfo_ = null;
          onChanged();
        } else {
          abilityInfo_ = null;
          abilityInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.AbilitySyncStateInfo ability_info = 2;</code>
       */
      public emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder getAbilityInfoBuilder() {
        
        onChanged();
        return getAbilityInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.AbilitySyncStateInfo ability_info = 2;</code>
       */
      public emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder getAbilityInfoOrBuilder() {
        if (abilityInfoBuilder_ != null) {
          return abilityInfoBuilder_.getMessageOrBuilder();
        } else {
          return abilityInfo_ == null ?
              emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.getDefaultInstance() : abilityInfo_;
        }
      }
      /**
       * <code>.AbilitySyncStateInfo ability_info = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo, emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder, emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder> 
          getAbilityInfoFieldBuilder() {
        if (abilityInfoBuilder_ == null) {
          abilityInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo, emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder, emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder>(
                  getAbilityInfo(),
                  getParentForChildren(),
                  isClean());
          abilityInfo_ = null;
        }
        return abilityInfoBuilder_;
      }

      private int authorityPeerId_ ;
      /**
       * <code>uint32 authority_peer_id = 9;</code>
       * @return The authorityPeerId.
       */
      @java.lang.Override
      public int getAuthorityPeerId() {
        return authorityPeerId_;
      }
      /**
       * <code>uint32 authority_peer_id = 9;</code>
       * @param value The authorityPeerId to set.
       * @return This builder for chaining.
       */
      public Builder setAuthorityPeerId(int value) {
        
        authorityPeerId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 authority_peer_id = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearAuthorityPeerId() {
        
        authorityPeerId_ = 0;
        onChanged();
        return this;
      }

      private int entityId_ ;
      /**
       * <code>uint32 entity_id = 7;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entity_id = 7;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entity_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        
        entityId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:MpLevelEntityInfo)
    }

    // @@protoc_insertion_point(class_scope:MpLevelEntityInfo)
    private static final emu.grasscutter.net.proto.MPLevelEntityInfo.MpLevelEntityInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.MPLevelEntityInfo.MpLevelEntityInfo();
    }

    public static emu.grasscutter.net.proto.MPLevelEntityInfo.MpLevelEntityInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MpLevelEntityInfo>
        PARSER = new com.google.protobuf.AbstractParser<MpLevelEntityInfo>() {
      @java.lang.Override
      public MpLevelEntityInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MpLevelEntityInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MpLevelEntityInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MpLevelEntityInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.MPLevelEntityInfo.MpLevelEntityInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MpLevelEntityInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MpLevelEntityInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027MPLevelEntityInfo.proto\032\032AbilitySyncSt" +
      "ateInfo.proto\"n\n\021MpLevelEntityInfo\022+\n\014ab" +
      "ility_info\030\002 \001(\0132\025.AbilitySyncStateInfo\022" +
      "\031\n\021authority_peer_id\030\t \001(\r\022\021\n\tentity_id\030" +
      "\007 \001(\rB\033\n\031emu.grasscutter.net.protob\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.getDescriptor(),
        });
    internal_static_MpLevelEntityInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MpLevelEntityInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MpLevelEntityInfo_descriptor,
        new java.lang.String[] { "AbilityInfo", "AuthorityPeerId", "EntityId", });
    emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}