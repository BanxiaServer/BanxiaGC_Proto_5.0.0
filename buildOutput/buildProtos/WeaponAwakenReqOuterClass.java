// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WeaponAwakenReq.proto

package emu.grasscutter.net.proto;

public final class WeaponAwakenReqOuterClass {
  private WeaponAwakenReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WeaponAwakenReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:WeaponAwakenReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 target_weapon_guid = 15;</code>
     * @return The targetWeaponGuid.
     */
    long getTargetWeaponGuid();

    /**
     * <code>uint32 affix_level_map = 13;</code>
     * @return The affixLevelMap.
     */
    int getAffixLevelMap();

    /**
     * <code>repeated uint64 item_guid = 3;</code>
     * @return A list containing the itemGuid.
     */
    java.util.List<java.lang.Long> getItemGuidList();
    /**
     * <code>repeated uint64 item_guid = 3;</code>
     * @return The count of itemGuid.
     */
    int getItemGuidCount();
    /**
     * <code>repeated uint64 item_guid = 3;</code>
     * @param index The index of the element to return.
     * @return The itemGuid at the given index.
     */
    long getItemGuid(int index);
  }
  /**
   * <pre>
   * 5.0.0
   * CmdId: 20421
   * Obf: BJAGGHLIDDA
   * </pre>
   *
   * Protobuf type {@code WeaponAwakenReq}
   */
  public static final class WeaponAwakenReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:WeaponAwakenReq)
      WeaponAwakenReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WeaponAwakenReq.newBuilder() to construct.
    private WeaponAwakenReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WeaponAwakenReq() {
      itemGuid_ = emptyLongList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new WeaponAwakenReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private WeaponAwakenReq(
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
            case 24: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                itemGuid_ = newLongList();
                mutable_bitField0_ |= 0x00000001;
              }
              itemGuid_.addLong(input.readUInt64());
              break;
            }
            case 26: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                itemGuid_ = newLongList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                itemGuid_.addLong(input.readUInt64());
              }
              input.popLimit(limit);
              break;
            }
            case 104: {

              affixLevelMap_ = input.readUInt32();
              break;
            }
            case 120: {

              targetWeaponGuid_ = input.readUInt64();
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          itemGuid_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.internal_static_WeaponAwakenReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.internal_static_WeaponAwakenReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReq.class, emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReq.Builder.class);
    }

    public static final int TARGET_WEAPON_GUID_FIELD_NUMBER = 15;
    private long targetWeaponGuid_;
    /**
     * <code>uint64 target_weapon_guid = 15;</code>
     * @return The targetWeaponGuid.
     */
    @java.lang.Override
    public long getTargetWeaponGuid() {
      return targetWeaponGuid_;
    }

    public static final int AFFIX_LEVEL_MAP_FIELD_NUMBER = 13;
    private int affixLevelMap_;
    /**
     * <code>uint32 affix_level_map = 13;</code>
     * @return The affixLevelMap.
     */
    @java.lang.Override
    public int getAffixLevelMap() {
      return affixLevelMap_;
    }

    public static final int ITEM_GUID_FIELD_NUMBER = 3;
    private com.google.protobuf.Internal.LongList itemGuid_;
    /**
     * <code>repeated uint64 item_guid = 3;</code>
     * @return A list containing the itemGuid.
     */
    @java.lang.Override
    public java.util.List<java.lang.Long>
        getItemGuidList() {
      return itemGuid_;
    }
    /**
     * <code>repeated uint64 item_guid = 3;</code>
     * @return The count of itemGuid.
     */
    public int getItemGuidCount() {
      return itemGuid_.size();
    }
    /**
     * <code>repeated uint64 item_guid = 3;</code>
     * @param index The index of the element to return.
     * @return The itemGuid at the given index.
     */
    public long getItemGuid(int index) {
      return itemGuid_.getLong(index);
    }
    private int itemGuidMemoizedSerializedSize = -1;

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
      getSerializedSize();
      if (getItemGuidList().size() > 0) {
        output.writeUInt32NoTag(26);
        output.writeUInt32NoTag(itemGuidMemoizedSerializedSize);
      }
      for (int i = 0; i < itemGuid_.size(); i++) {
        output.writeUInt64NoTag(itemGuid_.getLong(i));
      }
      if (affixLevelMap_ != 0) {
        output.writeUInt32(13, affixLevelMap_);
      }
      if (targetWeaponGuid_ != 0L) {
        output.writeUInt64(15, targetWeaponGuid_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < itemGuid_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt64SizeNoTag(itemGuid_.getLong(i));
        }
        size += dataSize;
        if (!getItemGuidList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        itemGuidMemoizedSerializedSize = dataSize;
      }
      if (affixLevelMap_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, affixLevelMap_);
      }
      if (targetWeaponGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(15, targetWeaponGuid_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReq other = (emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReq) obj;

      if (getTargetWeaponGuid()
          != other.getTargetWeaponGuid()) return false;
      if (getAffixLevelMap()
          != other.getAffixLevelMap()) return false;
      if (!getItemGuidList()
          .equals(other.getItemGuidList())) return false;
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
      hash = (37 * hash) + TARGET_WEAPON_GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getTargetWeaponGuid());
      hash = (37 * hash) + AFFIX_LEVEL_MAP_FIELD_NUMBER;
      hash = (53 * hash) + getAffixLevelMap();
      if (getItemGuidCount() > 0) {
        hash = (37 * hash) + ITEM_GUID_FIELD_NUMBER;
        hash = (53 * hash) + getItemGuidList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReq prototype) {
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
     * 5.0.0
     * CmdId: 20421
     * Obf: BJAGGHLIDDA
     * </pre>
     *
     * Protobuf type {@code WeaponAwakenReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:WeaponAwakenReq)
        emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.internal_static_WeaponAwakenReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.internal_static_WeaponAwakenReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReq.class, emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReq.newBuilder()
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
        targetWeaponGuid_ = 0L;

        affixLevelMap_ = 0;

        itemGuid_ = emptyLongList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.internal_static_WeaponAwakenReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReq build() {
        emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReq buildPartial() {
        emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReq result = new emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReq(this);
        int from_bitField0_ = bitField0_;
        result.targetWeaponGuid_ = targetWeaponGuid_;
        result.affixLevelMap_ = affixLevelMap_;
        if (((bitField0_ & 0x00000001) != 0)) {
          itemGuid_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.itemGuid_ = itemGuid_;
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
        if (other instanceof emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReq) {
          return mergeFrom((emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReq other) {
        if (other == emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReq.getDefaultInstance()) return this;
        if (other.getTargetWeaponGuid() != 0L) {
          setTargetWeaponGuid(other.getTargetWeaponGuid());
        }
        if (other.getAffixLevelMap() != 0) {
          setAffixLevelMap(other.getAffixLevelMap());
        }
        if (!other.itemGuid_.isEmpty()) {
          if (itemGuid_.isEmpty()) {
            itemGuid_ = other.itemGuid_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureItemGuidIsMutable();
            itemGuid_.addAll(other.itemGuid_);
          }
          onChanged();
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
        emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private long targetWeaponGuid_ ;
      /**
       * <code>uint64 target_weapon_guid = 15;</code>
       * @return The targetWeaponGuid.
       */
      @java.lang.Override
      public long getTargetWeaponGuid() {
        return targetWeaponGuid_;
      }
      /**
       * <code>uint64 target_weapon_guid = 15;</code>
       * @param value The targetWeaponGuid to set.
       * @return This builder for chaining.
       */
      public Builder setTargetWeaponGuid(long value) {
        
        targetWeaponGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 target_weapon_guid = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetWeaponGuid() {
        
        targetWeaponGuid_ = 0L;
        onChanged();
        return this;
      }

      private int affixLevelMap_ ;
      /**
       * <code>uint32 affix_level_map = 13;</code>
       * @return The affixLevelMap.
       */
      @java.lang.Override
      public int getAffixLevelMap() {
        return affixLevelMap_;
      }
      /**
       * <code>uint32 affix_level_map = 13;</code>
       * @param value The affixLevelMap to set.
       * @return This builder for chaining.
       */
      public Builder setAffixLevelMap(int value) {
        
        affixLevelMap_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 affix_level_map = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearAffixLevelMap() {
        
        affixLevelMap_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.LongList itemGuid_ = emptyLongList();
      private void ensureItemGuidIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          itemGuid_ = mutableCopy(itemGuid_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint64 item_guid = 3;</code>
       * @return A list containing the itemGuid.
       */
      public java.util.List<java.lang.Long>
          getItemGuidList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(itemGuid_) : itemGuid_;
      }
      /**
       * <code>repeated uint64 item_guid = 3;</code>
       * @return The count of itemGuid.
       */
      public int getItemGuidCount() {
        return itemGuid_.size();
      }
      /**
       * <code>repeated uint64 item_guid = 3;</code>
       * @param index The index of the element to return.
       * @return The itemGuid at the given index.
       */
      public long getItemGuid(int index) {
        return itemGuid_.getLong(index);
      }
      /**
       * <code>repeated uint64 item_guid = 3;</code>
       * @param index The index to set the value at.
       * @param value The itemGuid to set.
       * @return This builder for chaining.
       */
      public Builder setItemGuid(
          int index, long value) {
        ensureItemGuidIsMutable();
        itemGuid_.setLong(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 item_guid = 3;</code>
       * @param value The itemGuid to add.
       * @return This builder for chaining.
       */
      public Builder addItemGuid(long value) {
        ensureItemGuidIsMutable();
        itemGuid_.addLong(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 item_guid = 3;</code>
       * @param values The itemGuid to add.
       * @return This builder for chaining.
       */
      public Builder addAllItemGuid(
          java.lang.Iterable<? extends java.lang.Long> values) {
        ensureItemGuidIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, itemGuid_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 item_guid = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearItemGuid() {
        itemGuid_ = emptyLongList();
        bitField0_ = (bitField0_ & ~0x00000001);
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


      // @@protoc_insertion_point(builder_scope:WeaponAwakenReq)
    }

    // @@protoc_insertion_point(class_scope:WeaponAwakenReq)
    private static final emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReq();
    }

    public static emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<WeaponAwakenReq>
        PARSER = new com.google.protobuf.AbstractParser<WeaponAwakenReq>() {
      @java.lang.Override
      public WeaponAwakenReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new WeaponAwakenReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<WeaponAwakenReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WeaponAwakenReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WeaponAwakenReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WeaponAwakenReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025WeaponAwakenReq.proto\"Y\n\017WeaponAwakenR" +
      "eq\022\032\n\022target_weapon_guid\030\017 \001(\004\022\027\n\017affix_" +
      "level_map\030\r \001(\r\022\021\n\titem_guid\030\003 \003(\004B\033\n\031em" +
      "u.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_WeaponAwakenReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WeaponAwakenReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WeaponAwakenReq_descriptor,
        new java.lang.String[] { "TargetWeaponGuid", "AffixLevelMap", "ItemGuid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
