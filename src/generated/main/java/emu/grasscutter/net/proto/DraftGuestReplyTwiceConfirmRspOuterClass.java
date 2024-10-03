// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DraftGuestReplyTwiceConfirmRsp.proto

package emu.grasscutter.net.proto;

public final class DraftGuestReplyTwiceConfirmRspOuterClass {
  private DraftGuestReplyTwiceConfirmRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DraftGuestReplyTwiceConfirmRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DraftGuestReplyTwiceConfirmRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_agree = 15;</code>
     * @return The isAgree.
     */
    boolean getIsAgree();

    /**
     * <code>uint32 draft_id = 12;</code>
     * @return The draftId.
     */
    int getDraftId();

    /**
     * <code>int32 retcode = 7;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * CmdId: 1114
   * Obf: DNLPDFFLIIK
   * </pre>
   *
   * Protobuf type {@code DraftGuestReplyTwiceConfirmRsp}
   */
  public static final class DraftGuestReplyTwiceConfirmRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DraftGuestReplyTwiceConfirmRsp)
      DraftGuestReplyTwiceConfirmRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DraftGuestReplyTwiceConfirmRsp.newBuilder() to construct.
    private DraftGuestReplyTwiceConfirmRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DraftGuestReplyTwiceConfirmRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DraftGuestReplyTwiceConfirmRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DraftGuestReplyTwiceConfirmRsp(
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
            case 56: {

              retcode_ = input.readInt32();
              break;
            }
            case 96: {

              draftId_ = input.readUInt32();
              break;
            }
            case 120: {

              isAgree_ = input.readBool();
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
      return emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmRspOuterClass.internal_static_DraftGuestReplyTwiceConfirmRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmRspOuterClass.internal_static_DraftGuestReplyTwiceConfirmRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmRspOuterClass.DraftGuestReplyTwiceConfirmRsp.class, emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmRspOuterClass.DraftGuestReplyTwiceConfirmRsp.Builder.class);
    }

    public static final int IS_AGREE_FIELD_NUMBER = 15;
    private boolean isAgree_;
    /**
     * <code>bool is_agree = 15;</code>
     * @return The isAgree.
     */
    @java.lang.Override
    public boolean getIsAgree() {
      return isAgree_;
    }

    public static final int DRAFT_ID_FIELD_NUMBER = 12;
    private int draftId_;
    /**
     * <code>uint32 draft_id = 12;</code>
     * @return The draftId.
     */
    @java.lang.Override
    public int getDraftId() {
      return draftId_;
    }

    public static final int RETCODE_FIELD_NUMBER = 7;
    private int retcode_;
    /**
     * <code>int32 retcode = 7;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
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
      if (retcode_ != 0) {
        output.writeInt32(7, retcode_);
      }
      if (draftId_ != 0) {
        output.writeUInt32(12, draftId_);
      }
      if (isAgree_ != false) {
        output.writeBool(15, isAgree_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(7, retcode_);
      }
      if (draftId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, draftId_);
      }
      if (isAgree_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(15, isAgree_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmRspOuterClass.DraftGuestReplyTwiceConfirmRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmRspOuterClass.DraftGuestReplyTwiceConfirmRsp other = (emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmRspOuterClass.DraftGuestReplyTwiceConfirmRsp) obj;

      if (getIsAgree()
          != other.getIsAgree()) return false;
      if (getDraftId()
          != other.getDraftId()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
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
      hash = (37 * hash) + IS_AGREE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsAgree());
      hash = (37 * hash) + DRAFT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getDraftId();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmRspOuterClass.DraftGuestReplyTwiceConfirmRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmRspOuterClass.DraftGuestReplyTwiceConfirmRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmRspOuterClass.DraftGuestReplyTwiceConfirmRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmRspOuterClass.DraftGuestReplyTwiceConfirmRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmRspOuterClass.DraftGuestReplyTwiceConfirmRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmRspOuterClass.DraftGuestReplyTwiceConfirmRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmRspOuterClass.DraftGuestReplyTwiceConfirmRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmRspOuterClass.DraftGuestReplyTwiceConfirmRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmRspOuterClass.DraftGuestReplyTwiceConfirmRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmRspOuterClass.DraftGuestReplyTwiceConfirmRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmRspOuterClass.DraftGuestReplyTwiceConfirmRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmRspOuterClass.DraftGuestReplyTwiceConfirmRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmRspOuterClass.DraftGuestReplyTwiceConfirmRsp prototype) {
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
     * CmdId: 1114
     * Obf: DNLPDFFLIIK
     * </pre>
     *
     * Protobuf type {@code DraftGuestReplyTwiceConfirmRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DraftGuestReplyTwiceConfirmRsp)
        emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmRspOuterClass.DraftGuestReplyTwiceConfirmRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmRspOuterClass.internal_static_DraftGuestReplyTwiceConfirmRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmRspOuterClass.internal_static_DraftGuestReplyTwiceConfirmRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmRspOuterClass.DraftGuestReplyTwiceConfirmRsp.class, emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmRspOuterClass.DraftGuestReplyTwiceConfirmRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmRspOuterClass.DraftGuestReplyTwiceConfirmRsp.newBuilder()
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
        isAgree_ = false;

        draftId_ = 0;

        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmRspOuterClass.internal_static_DraftGuestReplyTwiceConfirmRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmRspOuterClass.DraftGuestReplyTwiceConfirmRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmRspOuterClass.DraftGuestReplyTwiceConfirmRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmRspOuterClass.DraftGuestReplyTwiceConfirmRsp build() {
        emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmRspOuterClass.DraftGuestReplyTwiceConfirmRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmRspOuterClass.DraftGuestReplyTwiceConfirmRsp buildPartial() {
        emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmRspOuterClass.DraftGuestReplyTwiceConfirmRsp result = new emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmRspOuterClass.DraftGuestReplyTwiceConfirmRsp(this);
        result.isAgree_ = isAgree_;
        result.draftId_ = draftId_;
        result.retcode_ = retcode_;
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
        if (other instanceof emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmRspOuterClass.DraftGuestReplyTwiceConfirmRsp) {
          return mergeFrom((emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmRspOuterClass.DraftGuestReplyTwiceConfirmRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmRspOuterClass.DraftGuestReplyTwiceConfirmRsp other) {
        if (other == emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmRspOuterClass.DraftGuestReplyTwiceConfirmRsp.getDefaultInstance()) return this;
        if (other.getIsAgree() != false) {
          setIsAgree(other.getIsAgree());
        }
        if (other.getDraftId() != 0) {
          setDraftId(other.getDraftId());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
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
        emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmRspOuterClass.DraftGuestReplyTwiceConfirmRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmRspOuterClass.DraftGuestReplyTwiceConfirmRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean isAgree_ ;
      /**
       * <code>bool is_agree = 15;</code>
       * @return The isAgree.
       */
      @java.lang.Override
      public boolean getIsAgree() {
        return isAgree_;
      }
      /**
       * <code>bool is_agree = 15;</code>
       * @param value The isAgree to set.
       * @return This builder for chaining.
       */
      public Builder setIsAgree(boolean value) {
        
        isAgree_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_agree = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsAgree() {
        
        isAgree_ = false;
        onChanged();
        return this;
      }

      private int draftId_ ;
      /**
       * <code>uint32 draft_id = 12;</code>
       * @return The draftId.
       */
      @java.lang.Override
      public int getDraftId() {
        return draftId_;
      }
      /**
       * <code>uint32 draft_id = 12;</code>
       * @param value The draftId to set.
       * @return This builder for chaining.
       */
      public Builder setDraftId(int value) {
        
        draftId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 draft_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearDraftId() {
        
        draftId_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 7;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 7;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
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


      // @@protoc_insertion_point(builder_scope:DraftGuestReplyTwiceConfirmRsp)
    }

    // @@protoc_insertion_point(class_scope:DraftGuestReplyTwiceConfirmRsp)
    private static final emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmRspOuterClass.DraftGuestReplyTwiceConfirmRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmRspOuterClass.DraftGuestReplyTwiceConfirmRsp();
    }

    public static emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmRspOuterClass.DraftGuestReplyTwiceConfirmRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DraftGuestReplyTwiceConfirmRsp>
        PARSER = new com.google.protobuf.AbstractParser<DraftGuestReplyTwiceConfirmRsp>() {
      @java.lang.Override
      public DraftGuestReplyTwiceConfirmRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DraftGuestReplyTwiceConfirmRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DraftGuestReplyTwiceConfirmRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DraftGuestReplyTwiceConfirmRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmRspOuterClass.DraftGuestReplyTwiceConfirmRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DraftGuestReplyTwiceConfirmRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DraftGuestReplyTwiceConfirmRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$DraftGuestReplyTwiceConfirmRsp.proto\"U" +
      "\n\036DraftGuestReplyTwiceConfirmRsp\022\020\n\010is_a" +
      "gree\030\017 \001(\010\022\020\n\010draft_id\030\014 \001(\r\022\017\n\007retcode\030" +
      "\007 \001(\005B\033\n\031emu.grasscutter.net.protob\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_DraftGuestReplyTwiceConfirmRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DraftGuestReplyTwiceConfirmRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DraftGuestReplyTwiceConfirmRsp_descriptor,
        new java.lang.String[] { "IsAgree", "DraftId", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
