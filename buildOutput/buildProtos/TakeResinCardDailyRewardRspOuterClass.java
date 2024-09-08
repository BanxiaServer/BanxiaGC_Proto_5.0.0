// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TakeResinCardDailyRewardRsp.proto

package emu.grasscutter.net.proto;

public final class TakeResinCardDailyRewardRspOuterClass {
  private TakeResinCardDailyRewardRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TakeResinCardDailyRewardRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TakeResinCardDailyRewardRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .ItemParam item_vec = 6;</code>
     */
    java.util.List<emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam> 
        getItemVecList();
    /**
     * <code>repeated .ItemParam item_vec = 6;</code>
     */
    emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam getItemVec(int index);
    /**
     * <code>repeated .ItemParam item_vec = 6;</code>
     */
    int getItemVecCount();
    /**
     * <code>repeated .ItemParam item_vec = 6;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder> 
        getItemVecOrBuilderList();
    /**
     * <code>repeated .ItemParam item_vec = 6;</code>
     */
    emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder getItemVecOrBuilder(
        int index);

    /**
     * <code>uint32 product_config_id = 9;</code>
     * @return The productConfigId.
     */
    int getProductConfigId();

    /**
     * <code>int32 retcode = 2;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * CmdId: 319
   * Obf: BCALHNAGNKI
   * </pre>
   *
   * Protobuf type {@code TakeResinCardDailyRewardRsp}
   */
  public static final class TakeResinCardDailyRewardRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TakeResinCardDailyRewardRsp)
      TakeResinCardDailyRewardRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TakeResinCardDailyRewardRsp.newBuilder() to construct.
    private TakeResinCardDailyRewardRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TakeResinCardDailyRewardRsp() {
      itemVec_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TakeResinCardDailyRewardRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TakeResinCardDailyRewardRsp(
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
            case 16: {

              retcode_ = input.readInt32();
              break;
            }
            case 50: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                itemVec_ = new java.util.ArrayList<emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam>();
                mutable_bitField0_ |= 0x00000001;
              }
              itemVec_.add(
                  input.readMessage(emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.parser(), extensionRegistry));
              break;
            }
            case 72: {

              productConfigId_ = input.readUInt32();
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
          itemVec_ = java.util.Collections.unmodifiableList(itemVec_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.TakeResinCardDailyRewardRspOuterClass.internal_static_TakeResinCardDailyRewardRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.TakeResinCardDailyRewardRspOuterClass.internal_static_TakeResinCardDailyRewardRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.TakeResinCardDailyRewardRspOuterClass.TakeResinCardDailyRewardRsp.class, emu.grasscutter.net.proto.TakeResinCardDailyRewardRspOuterClass.TakeResinCardDailyRewardRsp.Builder.class);
    }

    public static final int ITEM_VEC_FIELD_NUMBER = 6;
    private java.util.List<emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam> itemVec_;
    /**
     * <code>repeated .ItemParam item_vec = 6;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam> getItemVecList() {
      return itemVec_;
    }
    /**
     * <code>repeated .ItemParam item_vec = 6;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder> 
        getItemVecOrBuilderList() {
      return itemVec_;
    }
    /**
     * <code>repeated .ItemParam item_vec = 6;</code>
     */
    @java.lang.Override
    public int getItemVecCount() {
      return itemVec_.size();
    }
    /**
     * <code>repeated .ItemParam item_vec = 6;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam getItemVec(int index) {
      return itemVec_.get(index);
    }
    /**
     * <code>repeated .ItemParam item_vec = 6;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder getItemVecOrBuilder(
        int index) {
      return itemVec_.get(index);
    }

    public static final int PRODUCT_CONFIG_ID_FIELD_NUMBER = 9;
    private int productConfigId_;
    /**
     * <code>uint32 product_config_id = 9;</code>
     * @return The productConfigId.
     */
    @java.lang.Override
    public int getProductConfigId() {
      return productConfigId_;
    }

    public static final int RETCODE_FIELD_NUMBER = 2;
    private int retcode_;
    /**
     * <code>int32 retcode = 2;</code>
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
        output.writeInt32(2, retcode_);
      }
      for (int i = 0; i < itemVec_.size(); i++) {
        output.writeMessage(6, itemVec_.get(i));
      }
      if (productConfigId_ != 0) {
        output.writeUInt32(9, productConfigId_);
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
          .computeInt32Size(2, retcode_);
      }
      for (int i = 0; i < itemVec_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(6, itemVec_.get(i));
      }
      if (productConfigId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, productConfigId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.TakeResinCardDailyRewardRspOuterClass.TakeResinCardDailyRewardRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.TakeResinCardDailyRewardRspOuterClass.TakeResinCardDailyRewardRsp other = (emu.grasscutter.net.proto.TakeResinCardDailyRewardRspOuterClass.TakeResinCardDailyRewardRsp) obj;

      if (!getItemVecList()
          .equals(other.getItemVecList())) return false;
      if (getProductConfigId()
          != other.getProductConfigId()) return false;
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
      if (getItemVecCount() > 0) {
        hash = (37 * hash) + ITEM_VEC_FIELD_NUMBER;
        hash = (53 * hash) + getItemVecList().hashCode();
      }
      hash = (37 * hash) + PRODUCT_CONFIG_ID_FIELD_NUMBER;
      hash = (53 * hash) + getProductConfigId();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.TakeResinCardDailyRewardRspOuterClass.TakeResinCardDailyRewardRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TakeResinCardDailyRewardRspOuterClass.TakeResinCardDailyRewardRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TakeResinCardDailyRewardRspOuterClass.TakeResinCardDailyRewardRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TakeResinCardDailyRewardRspOuterClass.TakeResinCardDailyRewardRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TakeResinCardDailyRewardRspOuterClass.TakeResinCardDailyRewardRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TakeResinCardDailyRewardRspOuterClass.TakeResinCardDailyRewardRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TakeResinCardDailyRewardRspOuterClass.TakeResinCardDailyRewardRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TakeResinCardDailyRewardRspOuterClass.TakeResinCardDailyRewardRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TakeResinCardDailyRewardRspOuterClass.TakeResinCardDailyRewardRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TakeResinCardDailyRewardRspOuterClass.TakeResinCardDailyRewardRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TakeResinCardDailyRewardRspOuterClass.TakeResinCardDailyRewardRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TakeResinCardDailyRewardRspOuterClass.TakeResinCardDailyRewardRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.TakeResinCardDailyRewardRspOuterClass.TakeResinCardDailyRewardRsp prototype) {
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
     * CmdId: 319
     * Obf: BCALHNAGNKI
     * </pre>
     *
     * Protobuf type {@code TakeResinCardDailyRewardRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TakeResinCardDailyRewardRsp)
        emu.grasscutter.net.proto.TakeResinCardDailyRewardRspOuterClass.TakeResinCardDailyRewardRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.TakeResinCardDailyRewardRspOuterClass.internal_static_TakeResinCardDailyRewardRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.TakeResinCardDailyRewardRspOuterClass.internal_static_TakeResinCardDailyRewardRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.TakeResinCardDailyRewardRspOuterClass.TakeResinCardDailyRewardRsp.class, emu.grasscutter.net.proto.TakeResinCardDailyRewardRspOuterClass.TakeResinCardDailyRewardRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.TakeResinCardDailyRewardRspOuterClass.TakeResinCardDailyRewardRsp.newBuilder()
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
          getItemVecFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (itemVecBuilder_ == null) {
          itemVec_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          itemVecBuilder_.clear();
        }
        productConfigId_ = 0;

        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.TakeResinCardDailyRewardRspOuterClass.internal_static_TakeResinCardDailyRewardRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TakeResinCardDailyRewardRspOuterClass.TakeResinCardDailyRewardRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.TakeResinCardDailyRewardRspOuterClass.TakeResinCardDailyRewardRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TakeResinCardDailyRewardRspOuterClass.TakeResinCardDailyRewardRsp build() {
        emu.grasscutter.net.proto.TakeResinCardDailyRewardRspOuterClass.TakeResinCardDailyRewardRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TakeResinCardDailyRewardRspOuterClass.TakeResinCardDailyRewardRsp buildPartial() {
        emu.grasscutter.net.proto.TakeResinCardDailyRewardRspOuterClass.TakeResinCardDailyRewardRsp result = new emu.grasscutter.net.proto.TakeResinCardDailyRewardRspOuterClass.TakeResinCardDailyRewardRsp(this);
        int from_bitField0_ = bitField0_;
        if (itemVecBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            itemVec_ = java.util.Collections.unmodifiableList(itemVec_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.itemVec_ = itemVec_;
        } else {
          result.itemVec_ = itemVecBuilder_.build();
        }
        result.productConfigId_ = productConfigId_;
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
        if (other instanceof emu.grasscutter.net.proto.TakeResinCardDailyRewardRspOuterClass.TakeResinCardDailyRewardRsp) {
          return mergeFrom((emu.grasscutter.net.proto.TakeResinCardDailyRewardRspOuterClass.TakeResinCardDailyRewardRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.TakeResinCardDailyRewardRspOuterClass.TakeResinCardDailyRewardRsp other) {
        if (other == emu.grasscutter.net.proto.TakeResinCardDailyRewardRspOuterClass.TakeResinCardDailyRewardRsp.getDefaultInstance()) return this;
        if (itemVecBuilder_ == null) {
          if (!other.itemVec_.isEmpty()) {
            if (itemVec_.isEmpty()) {
              itemVec_ = other.itemVec_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureItemVecIsMutable();
              itemVec_.addAll(other.itemVec_);
            }
            onChanged();
          }
        } else {
          if (!other.itemVec_.isEmpty()) {
            if (itemVecBuilder_.isEmpty()) {
              itemVecBuilder_.dispose();
              itemVecBuilder_ = null;
              itemVec_ = other.itemVec_;
              bitField0_ = (bitField0_ & ~0x00000001);
              itemVecBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getItemVecFieldBuilder() : null;
            } else {
              itemVecBuilder_.addAllMessages(other.itemVec_);
            }
          }
        }
        if (other.getProductConfigId() != 0) {
          setProductConfigId(other.getProductConfigId());
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
        emu.grasscutter.net.proto.TakeResinCardDailyRewardRspOuterClass.TakeResinCardDailyRewardRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.TakeResinCardDailyRewardRspOuterClass.TakeResinCardDailyRewardRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam> itemVec_ =
        java.util.Collections.emptyList();
      private void ensureItemVecIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          itemVec_ = new java.util.ArrayList<emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam>(itemVec_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder> itemVecBuilder_;

      /**
       * <code>repeated .ItemParam item_vec = 6;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam> getItemVecList() {
        if (itemVecBuilder_ == null) {
          return java.util.Collections.unmodifiableList(itemVec_);
        } else {
          return itemVecBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .ItemParam item_vec = 6;</code>
       */
      public int getItemVecCount() {
        if (itemVecBuilder_ == null) {
          return itemVec_.size();
        } else {
          return itemVecBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .ItemParam item_vec = 6;</code>
       */
      public emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam getItemVec(int index) {
        if (itemVecBuilder_ == null) {
          return itemVec_.get(index);
        } else {
          return itemVecBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .ItemParam item_vec = 6;</code>
       */
      public Builder setItemVec(
          int index, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam value) {
        if (itemVecBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemVecIsMutable();
          itemVec_.set(index, value);
          onChanged();
        } else {
          itemVecBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam item_vec = 6;</code>
       */
      public Builder setItemVec(
          int index, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder builderForValue) {
        if (itemVecBuilder_ == null) {
          ensureItemVecIsMutable();
          itemVec_.set(index, builderForValue.build());
          onChanged();
        } else {
          itemVecBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam item_vec = 6;</code>
       */
      public Builder addItemVec(emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam value) {
        if (itemVecBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemVecIsMutable();
          itemVec_.add(value);
          onChanged();
        } else {
          itemVecBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam item_vec = 6;</code>
       */
      public Builder addItemVec(
          int index, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam value) {
        if (itemVecBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemVecIsMutable();
          itemVec_.add(index, value);
          onChanged();
        } else {
          itemVecBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam item_vec = 6;</code>
       */
      public Builder addItemVec(
          emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder builderForValue) {
        if (itemVecBuilder_ == null) {
          ensureItemVecIsMutable();
          itemVec_.add(builderForValue.build());
          onChanged();
        } else {
          itemVecBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam item_vec = 6;</code>
       */
      public Builder addItemVec(
          int index, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder builderForValue) {
        if (itemVecBuilder_ == null) {
          ensureItemVecIsMutable();
          itemVec_.add(index, builderForValue.build());
          onChanged();
        } else {
          itemVecBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam item_vec = 6;</code>
       */
      public Builder addAllItemVec(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam> values) {
        if (itemVecBuilder_ == null) {
          ensureItemVecIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, itemVec_);
          onChanged();
        } else {
          itemVecBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam item_vec = 6;</code>
       */
      public Builder clearItemVec() {
        if (itemVecBuilder_ == null) {
          itemVec_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          itemVecBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam item_vec = 6;</code>
       */
      public Builder removeItemVec(int index) {
        if (itemVecBuilder_ == null) {
          ensureItemVecIsMutable();
          itemVec_.remove(index);
          onChanged();
        } else {
          itemVecBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam item_vec = 6;</code>
       */
      public emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder getItemVecBuilder(
          int index) {
        return getItemVecFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .ItemParam item_vec = 6;</code>
       */
      public emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder getItemVecOrBuilder(
          int index) {
        if (itemVecBuilder_ == null) {
          return itemVec_.get(index);  } else {
          return itemVecBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .ItemParam item_vec = 6;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder> 
           getItemVecOrBuilderList() {
        if (itemVecBuilder_ != null) {
          return itemVecBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(itemVec_);
        }
      }
      /**
       * <code>repeated .ItemParam item_vec = 6;</code>
       */
      public emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder addItemVecBuilder() {
        return getItemVecFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.getDefaultInstance());
      }
      /**
       * <code>repeated .ItemParam item_vec = 6;</code>
       */
      public emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder addItemVecBuilder(
          int index) {
        return getItemVecFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.getDefaultInstance());
      }
      /**
       * <code>repeated .ItemParam item_vec = 6;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder> 
           getItemVecBuilderList() {
        return getItemVecFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder> 
          getItemVecFieldBuilder() {
        if (itemVecBuilder_ == null) {
          itemVecBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder>(
                  itemVec_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          itemVec_ = null;
        }
        return itemVecBuilder_;
      }

      private int productConfigId_ ;
      /**
       * <code>uint32 product_config_id = 9;</code>
       * @return The productConfigId.
       */
      @java.lang.Override
      public int getProductConfigId() {
        return productConfigId_;
      }
      /**
       * <code>uint32 product_config_id = 9;</code>
       * @param value The productConfigId to set.
       * @return This builder for chaining.
       */
      public Builder setProductConfigId(int value) {
        
        productConfigId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 product_config_id = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearProductConfigId() {
        
        productConfigId_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 2;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 2;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 2;</code>
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


      // @@protoc_insertion_point(builder_scope:TakeResinCardDailyRewardRsp)
    }

    // @@protoc_insertion_point(class_scope:TakeResinCardDailyRewardRsp)
    private static final emu.grasscutter.net.proto.TakeResinCardDailyRewardRspOuterClass.TakeResinCardDailyRewardRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.TakeResinCardDailyRewardRspOuterClass.TakeResinCardDailyRewardRsp();
    }

    public static emu.grasscutter.net.proto.TakeResinCardDailyRewardRspOuterClass.TakeResinCardDailyRewardRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TakeResinCardDailyRewardRsp>
        PARSER = new com.google.protobuf.AbstractParser<TakeResinCardDailyRewardRsp>() {
      @java.lang.Override
      public TakeResinCardDailyRewardRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TakeResinCardDailyRewardRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TakeResinCardDailyRewardRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TakeResinCardDailyRewardRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.TakeResinCardDailyRewardRspOuterClass.TakeResinCardDailyRewardRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TakeResinCardDailyRewardRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TakeResinCardDailyRewardRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!TakeResinCardDailyRewardRsp.proto\032\017Ite" +
      "mParam.proto\"g\n\033TakeResinCardDailyReward" +
      "Rsp\022\034\n\010item_vec\030\006 \003(\0132\n.ItemParam\022\031\n\021pro" +
      "duct_config_id\030\t \001(\r\022\017\n\007retcode\030\002 \001(\005B\033\n" +
      "\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.ItemParamOuterClass.getDescriptor(),
        });
    internal_static_TakeResinCardDailyRewardRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TakeResinCardDailyRewardRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TakeResinCardDailyRewardRsp_descriptor,
        new java.lang.String[] { "ItemVec", "ProductConfigId", "Retcode", });
    emu.grasscutter.net.proto.ItemParamOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
