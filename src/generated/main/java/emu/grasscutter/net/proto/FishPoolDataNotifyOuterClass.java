// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FishPoolDataNotify.proto

package emu.grasscutter.net.proto;

public final class FishPoolDataNotifyOuterClass {
  private FishPoolDataNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FishPoolDataNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FishPoolDataNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 entity_id = 11;</code>
     * @return The entityId.
     */
    int getEntityId();

    /**
     * <code>uint32 today_fish_num = 8;</code>
     * @return The todayFishNum.
     */
    int getTodayFishNum();
  }
  /**
   * <pre>
   * CmdId: 27962
   * Obf: AOIPEJKPGCJ
   * </pre>
   *
   * Protobuf type {@code FishPoolDataNotify}
   */
  public static final class FishPoolDataNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FishPoolDataNotify)
      FishPoolDataNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FishPoolDataNotify.newBuilder() to construct.
    private FishPoolDataNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FishPoolDataNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FishPoolDataNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private FishPoolDataNotify(
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
            case 64: {

              todayFishNum_ = input.readUInt32();
              break;
            }
            case 88: {

              entityId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.FishPoolDataNotifyOuterClass.internal_static_FishPoolDataNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.FishPoolDataNotifyOuterClass.internal_static_FishPoolDataNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.FishPoolDataNotifyOuterClass.FishPoolDataNotify.class, emu.grasscutter.net.proto.FishPoolDataNotifyOuterClass.FishPoolDataNotify.Builder.class);
    }

    public static final int ENTITY_ID_FIELD_NUMBER = 11;
    private int entityId_;
    /**
     * <code>uint32 entity_id = 11;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
    }

    public static final int TODAY_FISH_NUM_FIELD_NUMBER = 8;
    private int todayFishNum_;
    /**
     * <code>uint32 today_fish_num = 8;</code>
     * @return The todayFishNum.
     */
    @java.lang.Override
    public int getTodayFishNum() {
      return todayFishNum_;
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
      if (todayFishNum_ != 0) {
        output.writeUInt32(8, todayFishNum_);
      }
      if (entityId_ != 0) {
        output.writeUInt32(11, entityId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (todayFishNum_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, todayFishNum_);
      }
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, entityId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.FishPoolDataNotifyOuterClass.FishPoolDataNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.FishPoolDataNotifyOuterClass.FishPoolDataNotify other = (emu.grasscutter.net.proto.FishPoolDataNotifyOuterClass.FishPoolDataNotify) obj;

      if (getEntityId()
          != other.getEntityId()) return false;
      if (getTodayFishNum()
          != other.getTodayFishNum()) return false;
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
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      hash = (37 * hash) + TODAY_FISH_NUM_FIELD_NUMBER;
      hash = (53 * hash) + getTodayFishNum();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.FishPoolDataNotifyOuterClass.FishPoolDataNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FishPoolDataNotifyOuterClass.FishPoolDataNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FishPoolDataNotifyOuterClass.FishPoolDataNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FishPoolDataNotifyOuterClass.FishPoolDataNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FishPoolDataNotifyOuterClass.FishPoolDataNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FishPoolDataNotifyOuterClass.FishPoolDataNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FishPoolDataNotifyOuterClass.FishPoolDataNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FishPoolDataNotifyOuterClass.FishPoolDataNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FishPoolDataNotifyOuterClass.FishPoolDataNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FishPoolDataNotifyOuterClass.FishPoolDataNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FishPoolDataNotifyOuterClass.FishPoolDataNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FishPoolDataNotifyOuterClass.FishPoolDataNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.FishPoolDataNotifyOuterClass.FishPoolDataNotify prototype) {
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
     * <pre>
     * CmdId: 27962
     * Obf: AOIPEJKPGCJ
     * </pre>
     *
     * Protobuf type {@code FishPoolDataNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FishPoolDataNotify)
        emu.grasscutter.net.proto.FishPoolDataNotifyOuterClass.FishPoolDataNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.FishPoolDataNotifyOuterClass.internal_static_FishPoolDataNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.FishPoolDataNotifyOuterClass.internal_static_FishPoolDataNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.FishPoolDataNotifyOuterClass.FishPoolDataNotify.class, emu.grasscutter.net.proto.FishPoolDataNotifyOuterClass.FishPoolDataNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.FishPoolDataNotifyOuterClass.FishPoolDataNotify.newBuilder()
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
        entityId_ = 0;

        todayFishNum_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.FishPoolDataNotifyOuterClass.internal_static_FishPoolDataNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FishPoolDataNotifyOuterClass.FishPoolDataNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.FishPoolDataNotifyOuterClass.FishPoolDataNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FishPoolDataNotifyOuterClass.FishPoolDataNotify build() {
        emu.grasscutter.net.proto.FishPoolDataNotifyOuterClass.FishPoolDataNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FishPoolDataNotifyOuterClass.FishPoolDataNotify buildPartial() {
        emu.grasscutter.net.proto.FishPoolDataNotifyOuterClass.FishPoolDataNotify result = new emu.grasscutter.net.proto.FishPoolDataNotifyOuterClass.FishPoolDataNotify(this);
        result.entityId_ = entityId_;
        result.todayFishNum_ = todayFishNum_;
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
        if (other instanceof emu.grasscutter.net.proto.FishPoolDataNotifyOuterClass.FishPoolDataNotify) {
          return mergeFrom((emu.grasscutter.net.proto.FishPoolDataNotifyOuterClass.FishPoolDataNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.FishPoolDataNotifyOuterClass.FishPoolDataNotify other) {
        if (other == emu.grasscutter.net.proto.FishPoolDataNotifyOuterClass.FishPoolDataNotify.getDefaultInstance()) return this;
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
        }
        if (other.getTodayFishNum() != 0) {
          setTodayFishNum(other.getTodayFishNum());
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
        emu.grasscutter.net.proto.FishPoolDataNotifyOuterClass.FishPoolDataNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.FishPoolDataNotifyOuterClass.FishPoolDataNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int entityId_ ;
      /**
       * <code>uint32 entity_id = 11;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entity_id = 11;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entity_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        
        entityId_ = 0;
        onChanged();
        return this;
      }

      private int todayFishNum_ ;
      /**
       * <code>uint32 today_fish_num = 8;</code>
       * @return The todayFishNum.
       */
      @java.lang.Override
      public int getTodayFishNum() {
        return todayFishNum_;
      }
      /**
       * <code>uint32 today_fish_num = 8;</code>
       * @param value The todayFishNum to set.
       * @return This builder for chaining.
       */
      public Builder setTodayFishNum(int value) {
        
        todayFishNum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 today_fish_num = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearTodayFishNum() {
        
        todayFishNum_ = 0;
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


      // @@protoc_insertion_point(builder_scope:FishPoolDataNotify)
    }

    // @@protoc_insertion_point(class_scope:FishPoolDataNotify)
    private static final emu.grasscutter.net.proto.FishPoolDataNotifyOuterClass.FishPoolDataNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.FishPoolDataNotifyOuterClass.FishPoolDataNotify();
    }

    public static emu.grasscutter.net.proto.FishPoolDataNotifyOuterClass.FishPoolDataNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FishPoolDataNotify>
        PARSER = new com.google.protobuf.AbstractParser<FishPoolDataNotify>() {
      @java.lang.Override
      public FishPoolDataNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new FishPoolDataNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<FishPoolDataNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FishPoolDataNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.FishPoolDataNotifyOuterClass.FishPoolDataNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FishPoolDataNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FishPoolDataNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030FishPoolDataNotify.proto\"?\n\022FishPoolDa" +
      "taNotify\022\021\n\tentity_id\030\013 \001(\r\022\026\n\016today_fis" +
      "h_num\030\010 \001(\rB\033\n\031emu.grasscutter.net.proto" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_FishPoolDataNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FishPoolDataNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FishPoolDataNotify_descriptor,
        new java.lang.String[] { "EntityId", "TodayFishNum", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}