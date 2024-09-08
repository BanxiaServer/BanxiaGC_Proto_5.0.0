// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AvatarSkillUpgradeRsp.proto

package emu.grasscutter.net.proto;

public final class AvatarSkillUpgradeRspOuterClass {
  private AvatarSkillUpgradeRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AvatarSkillUpgradeRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AvatarSkillUpgradeRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 old_level = 2;</code>
     * @return The oldLevel.
     */
    int getOldLevel();

    /**
     * <code>int32 retcode = 3;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 cur_level = 6;</code>
     * @return The curLevel.
     */
    int getCurLevel();

    /**
     * <code>uint32 avatar_skill_id = 9;</code>
     * @return The avatarSkillId.
     */
    int getAvatarSkillId();

    /**
     * <code>uint64 avatar_guid = 11;</code>
     * @return The avatarGuid.
     */
    long getAvatarGuid();
  }
  /**
   * <pre>
   * CmdId: 7799
   * </pre>
   *
   * Protobuf type {@code AvatarSkillUpgradeRsp}
   */
  public static final class AvatarSkillUpgradeRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AvatarSkillUpgradeRsp)
      AvatarSkillUpgradeRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AvatarSkillUpgradeRsp.newBuilder() to construct.
    private AvatarSkillUpgradeRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AvatarSkillUpgradeRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AvatarSkillUpgradeRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AvatarSkillUpgradeRsp(
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
            case 16: {

              oldLevel_ = input.readUInt32();
              break;
            }
            case 24: {

              retcode_ = input.readInt32();
              break;
            }
            case 48: {

              curLevel_ = input.readUInt32();
              break;
            }
            case 72: {

              avatarSkillId_ = input.readUInt32();
              break;
            }
            case 88: {

              avatarGuid_ = input.readUInt64();
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
      return emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.internal_static_AvatarSkillUpgradeRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.internal_static_AvatarSkillUpgradeRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.AvatarSkillUpgradeRsp.class, emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.AvatarSkillUpgradeRsp.Builder.class);
    }

    public static final int OLD_LEVEL_FIELD_NUMBER = 2;
    private int oldLevel_;
    /**
     * <code>uint32 old_level = 2;</code>
     * @return The oldLevel.
     */
    @java.lang.Override
    public int getOldLevel() {
      return oldLevel_;
    }

    public static final int RETCODE_FIELD_NUMBER = 3;
    private int retcode_;
    /**
     * <code>int32 retcode = 3;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int CUR_LEVEL_FIELD_NUMBER = 6;
    private int curLevel_;
    /**
     * <code>uint32 cur_level = 6;</code>
     * @return The curLevel.
     */
    @java.lang.Override
    public int getCurLevel() {
      return curLevel_;
    }

    public static final int AVATAR_SKILL_ID_FIELD_NUMBER = 9;
    private int avatarSkillId_;
    /**
     * <code>uint32 avatar_skill_id = 9;</code>
     * @return The avatarSkillId.
     */
    @java.lang.Override
    public int getAvatarSkillId() {
      return avatarSkillId_;
    }

    public static final int AVATAR_GUID_FIELD_NUMBER = 11;
    private long avatarGuid_;
    /**
     * <code>uint64 avatar_guid = 11;</code>
     * @return The avatarGuid.
     */
    @java.lang.Override
    public long getAvatarGuid() {
      return avatarGuid_;
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
      if (oldLevel_ != 0) {
        output.writeUInt32(2, oldLevel_);
      }
      if (retcode_ != 0) {
        output.writeInt32(3, retcode_);
      }
      if (curLevel_ != 0) {
        output.writeUInt32(6, curLevel_);
      }
      if (avatarSkillId_ != 0) {
        output.writeUInt32(9, avatarSkillId_);
      }
      if (avatarGuid_ != 0L) {
        output.writeUInt64(11, avatarGuid_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (oldLevel_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, oldLevel_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, retcode_);
      }
      if (curLevel_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, curLevel_);
      }
      if (avatarSkillId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, avatarSkillId_);
      }
      if (avatarGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(11, avatarGuid_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.AvatarSkillUpgradeRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.AvatarSkillUpgradeRsp other = (emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.AvatarSkillUpgradeRsp) obj;

      if (getOldLevel()
          != other.getOldLevel()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (getCurLevel()
          != other.getCurLevel()) return false;
      if (getAvatarSkillId()
          != other.getAvatarSkillId()) return false;
      if (getAvatarGuid()
          != other.getAvatarGuid()) return false;
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
      hash = (37 * hash) + OLD_LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getOldLevel();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + CUR_LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getCurLevel();
      hash = (37 * hash) + AVATAR_SKILL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getAvatarSkillId();
      hash = (37 * hash) + AVATAR_GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getAvatarGuid());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.AvatarSkillUpgradeRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.AvatarSkillUpgradeRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.AvatarSkillUpgradeRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.AvatarSkillUpgradeRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.AvatarSkillUpgradeRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.AvatarSkillUpgradeRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.AvatarSkillUpgradeRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.AvatarSkillUpgradeRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.AvatarSkillUpgradeRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.AvatarSkillUpgradeRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.AvatarSkillUpgradeRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.AvatarSkillUpgradeRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.AvatarSkillUpgradeRsp prototype) {
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
     * CmdId: 7799
     * </pre>
     *
     * Protobuf type {@code AvatarSkillUpgradeRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AvatarSkillUpgradeRsp)
        emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.AvatarSkillUpgradeRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.internal_static_AvatarSkillUpgradeRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.internal_static_AvatarSkillUpgradeRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.AvatarSkillUpgradeRsp.class, emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.AvatarSkillUpgradeRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.AvatarSkillUpgradeRsp.newBuilder()
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
        oldLevel_ = 0;

        retcode_ = 0;

        curLevel_ = 0;

        avatarSkillId_ = 0;

        avatarGuid_ = 0L;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.internal_static_AvatarSkillUpgradeRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.AvatarSkillUpgradeRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.AvatarSkillUpgradeRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.AvatarSkillUpgradeRsp build() {
        emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.AvatarSkillUpgradeRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.AvatarSkillUpgradeRsp buildPartial() {
        emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.AvatarSkillUpgradeRsp result = new emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.AvatarSkillUpgradeRsp(this);
        result.oldLevel_ = oldLevel_;
        result.retcode_ = retcode_;
        result.curLevel_ = curLevel_;
        result.avatarSkillId_ = avatarSkillId_;
        result.avatarGuid_ = avatarGuid_;
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
        if (other instanceof emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.AvatarSkillUpgradeRsp) {
          return mergeFrom((emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.AvatarSkillUpgradeRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.AvatarSkillUpgradeRsp other) {
        if (other == emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.AvatarSkillUpgradeRsp.getDefaultInstance()) return this;
        if (other.getOldLevel() != 0) {
          setOldLevel(other.getOldLevel());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getCurLevel() != 0) {
          setCurLevel(other.getCurLevel());
        }
        if (other.getAvatarSkillId() != 0) {
          setAvatarSkillId(other.getAvatarSkillId());
        }
        if (other.getAvatarGuid() != 0L) {
          setAvatarGuid(other.getAvatarGuid());
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
        emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.AvatarSkillUpgradeRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.AvatarSkillUpgradeRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int oldLevel_ ;
      /**
       * <code>uint32 old_level = 2;</code>
       * @return The oldLevel.
       */
      @java.lang.Override
      public int getOldLevel() {
        return oldLevel_;
      }
      /**
       * <code>uint32 old_level = 2;</code>
       * @param value The oldLevel to set.
       * @return This builder for chaining.
       */
      public Builder setOldLevel(int value) {
        
        oldLevel_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 old_level = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearOldLevel() {
        
        oldLevel_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 3;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 3;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int curLevel_ ;
      /**
       * <code>uint32 cur_level = 6;</code>
       * @return The curLevel.
       */
      @java.lang.Override
      public int getCurLevel() {
        return curLevel_;
      }
      /**
       * <code>uint32 cur_level = 6;</code>
       * @param value The curLevel to set.
       * @return This builder for chaining.
       */
      public Builder setCurLevel(int value) {
        
        curLevel_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cur_level = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearCurLevel() {
        
        curLevel_ = 0;
        onChanged();
        return this;
      }

      private int avatarSkillId_ ;
      /**
       * <code>uint32 avatar_skill_id = 9;</code>
       * @return The avatarSkillId.
       */
      @java.lang.Override
      public int getAvatarSkillId() {
        return avatarSkillId_;
      }
      /**
       * <code>uint32 avatar_skill_id = 9;</code>
       * @param value The avatarSkillId to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarSkillId(int value) {
        
        avatarSkillId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 avatar_skill_id = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarSkillId() {
        
        avatarSkillId_ = 0;
        onChanged();
        return this;
      }

      private long avatarGuid_ ;
      /**
       * <code>uint64 avatar_guid = 11;</code>
       * @return The avatarGuid.
       */
      @java.lang.Override
      public long getAvatarGuid() {
        return avatarGuid_;
      }
      /**
       * <code>uint64 avatar_guid = 11;</code>
       * @param value The avatarGuid to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarGuid(long value) {
        
        avatarGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 avatar_guid = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarGuid() {
        
        avatarGuid_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:AvatarSkillUpgradeRsp)
    }

    // @@protoc_insertion_point(class_scope:AvatarSkillUpgradeRsp)
    private static final emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.AvatarSkillUpgradeRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.AvatarSkillUpgradeRsp();
    }

    public static emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.AvatarSkillUpgradeRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AvatarSkillUpgradeRsp>
        PARSER = new com.google.protobuf.AbstractParser<AvatarSkillUpgradeRsp>() {
      @java.lang.Override
      public AvatarSkillUpgradeRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AvatarSkillUpgradeRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AvatarSkillUpgradeRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AvatarSkillUpgradeRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.AvatarSkillUpgradeRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AvatarSkillUpgradeRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AvatarSkillUpgradeRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033AvatarSkillUpgradeRsp.proto\"|\n\025AvatarS" +
      "killUpgradeRsp\022\021\n\told_level\030\002 \001(\r\022\017\n\007ret" +
      "code\030\003 \001(\005\022\021\n\tcur_level\030\006 \001(\r\022\027\n\017avatar_" +
      "skill_id\030\t \001(\r\022\023\n\013avatar_guid\030\013 \001(\004B\033\n\031e" +
      "mu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AvatarSkillUpgradeRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AvatarSkillUpgradeRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AvatarSkillUpgradeRsp_descriptor,
        new java.lang.String[] { "OldLevel", "Retcode", "CurLevel", "AvatarSkillId", "AvatarGuid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
