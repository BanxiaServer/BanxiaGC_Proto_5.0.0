// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TowerLevelRecord.proto

package emu.grasscutter.net.proto;

public final class TowerLevelRecordOuterClass {
  private TowerLevelRecordOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TowerLevelRecordOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TowerLevelRecord)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 satisfied_cond_list = 3;</code>
     * @return A list containing the satisfiedCondList.
     */
    java.util.List<java.lang.Integer> getSatisfiedCondListList();
    /**
     * <code>repeated uint32 satisfied_cond_list = 3;</code>
     * @return The count of satisfiedCondList.
     */
    int getSatisfiedCondListCount();
    /**
     * <code>repeated uint32 satisfied_cond_list = 3;</code>
     * @param index The index of the element to return.
     * @return The satisfiedCondList at the given index.
     */
    int getSatisfiedCondList(int index);

    /**
     * <code>uint32 level_id = 6;</code>
     * @return The levelId.
     */
    int getLevelId();
  }
  /**
   * Protobuf type {@code TowerLevelRecord}
   */
  public static final class TowerLevelRecord extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TowerLevelRecord)
      TowerLevelRecordOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TowerLevelRecord.newBuilder() to construct.
    private TowerLevelRecord(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TowerLevelRecord() {
      satisfiedCondList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TowerLevelRecord();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TowerLevelRecord(
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
                satisfiedCondList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              satisfiedCondList_.addInt(input.readUInt32());
              break;
            }
            case 26: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                satisfiedCondList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                satisfiedCondList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 48: {

              levelId_ = input.readUInt32();
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
          satisfiedCondList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.TowerLevelRecordOuterClass.internal_static_TowerLevelRecord_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.TowerLevelRecordOuterClass.internal_static_TowerLevelRecord_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.TowerLevelRecordOuterClass.TowerLevelRecord.class, emu.grasscutter.net.proto.TowerLevelRecordOuterClass.TowerLevelRecord.Builder.class);
    }

    public static final int SATISFIED_COND_LIST_FIELD_NUMBER = 3;
    private com.google.protobuf.Internal.IntList satisfiedCondList_;
    /**
     * <code>repeated uint32 satisfied_cond_list = 3;</code>
     * @return A list containing the satisfiedCondList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getSatisfiedCondListList() {
      return satisfiedCondList_;
    }
    /**
     * <code>repeated uint32 satisfied_cond_list = 3;</code>
     * @return The count of satisfiedCondList.
     */
    public int getSatisfiedCondListCount() {
      return satisfiedCondList_.size();
    }
    /**
     * <code>repeated uint32 satisfied_cond_list = 3;</code>
     * @param index The index of the element to return.
     * @return The satisfiedCondList at the given index.
     */
    public int getSatisfiedCondList(int index) {
      return satisfiedCondList_.getInt(index);
    }
    private int satisfiedCondListMemoizedSerializedSize = -1;

    public static final int LEVEL_ID_FIELD_NUMBER = 6;
    private int levelId_;
    /**
     * <code>uint32 level_id = 6;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
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
      getSerializedSize();
      if (getSatisfiedCondListList().size() > 0) {
        output.writeUInt32NoTag(26);
        output.writeUInt32NoTag(satisfiedCondListMemoizedSerializedSize);
      }
      for (int i = 0; i < satisfiedCondList_.size(); i++) {
        output.writeUInt32NoTag(satisfiedCondList_.getInt(i));
      }
      if (levelId_ != 0) {
        output.writeUInt32(6, levelId_);
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
        for (int i = 0; i < satisfiedCondList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(satisfiedCondList_.getInt(i));
        }
        size += dataSize;
        if (!getSatisfiedCondListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        satisfiedCondListMemoizedSerializedSize = dataSize;
      }
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, levelId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.TowerLevelRecordOuterClass.TowerLevelRecord)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.TowerLevelRecordOuterClass.TowerLevelRecord other = (emu.grasscutter.net.proto.TowerLevelRecordOuterClass.TowerLevelRecord) obj;

      if (!getSatisfiedCondListList()
          .equals(other.getSatisfiedCondListList())) return false;
      if (getLevelId()
          != other.getLevelId()) return false;
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
      if (getSatisfiedCondListCount() > 0) {
        hash = (37 * hash) + SATISFIED_COND_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getSatisfiedCondListList().hashCode();
      }
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.TowerLevelRecordOuterClass.TowerLevelRecord parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TowerLevelRecordOuterClass.TowerLevelRecord parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerLevelRecordOuterClass.TowerLevelRecord parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TowerLevelRecordOuterClass.TowerLevelRecord parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerLevelRecordOuterClass.TowerLevelRecord parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TowerLevelRecordOuterClass.TowerLevelRecord parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerLevelRecordOuterClass.TowerLevelRecord parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TowerLevelRecordOuterClass.TowerLevelRecord parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerLevelRecordOuterClass.TowerLevelRecord parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TowerLevelRecordOuterClass.TowerLevelRecord parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerLevelRecordOuterClass.TowerLevelRecord parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TowerLevelRecordOuterClass.TowerLevelRecord parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.TowerLevelRecordOuterClass.TowerLevelRecord prototype) {
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
     * Protobuf type {@code TowerLevelRecord}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TowerLevelRecord)
        emu.grasscutter.net.proto.TowerLevelRecordOuterClass.TowerLevelRecordOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.TowerLevelRecordOuterClass.internal_static_TowerLevelRecord_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.TowerLevelRecordOuterClass.internal_static_TowerLevelRecord_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.TowerLevelRecordOuterClass.TowerLevelRecord.class, emu.grasscutter.net.proto.TowerLevelRecordOuterClass.TowerLevelRecord.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.TowerLevelRecordOuterClass.TowerLevelRecord.newBuilder()
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
        satisfiedCondList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        levelId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.TowerLevelRecordOuterClass.internal_static_TowerLevelRecord_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TowerLevelRecordOuterClass.TowerLevelRecord getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.TowerLevelRecordOuterClass.TowerLevelRecord.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TowerLevelRecordOuterClass.TowerLevelRecord build() {
        emu.grasscutter.net.proto.TowerLevelRecordOuterClass.TowerLevelRecord result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TowerLevelRecordOuterClass.TowerLevelRecord buildPartial() {
        emu.grasscutter.net.proto.TowerLevelRecordOuterClass.TowerLevelRecord result = new emu.grasscutter.net.proto.TowerLevelRecordOuterClass.TowerLevelRecord(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          satisfiedCondList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.satisfiedCondList_ = satisfiedCondList_;
        result.levelId_ = levelId_;
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
        if (other instanceof emu.grasscutter.net.proto.TowerLevelRecordOuterClass.TowerLevelRecord) {
          return mergeFrom((emu.grasscutter.net.proto.TowerLevelRecordOuterClass.TowerLevelRecord)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.TowerLevelRecordOuterClass.TowerLevelRecord other) {
        if (other == emu.grasscutter.net.proto.TowerLevelRecordOuterClass.TowerLevelRecord.getDefaultInstance()) return this;
        if (!other.satisfiedCondList_.isEmpty()) {
          if (satisfiedCondList_.isEmpty()) {
            satisfiedCondList_ = other.satisfiedCondList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSatisfiedCondListIsMutable();
            satisfiedCondList_.addAll(other.satisfiedCondList_);
          }
          onChanged();
        }
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
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
        emu.grasscutter.net.proto.TowerLevelRecordOuterClass.TowerLevelRecord parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.TowerLevelRecordOuterClass.TowerLevelRecord) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList satisfiedCondList_ = emptyIntList();
      private void ensureSatisfiedCondListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          satisfiedCondList_ = mutableCopy(satisfiedCondList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 satisfied_cond_list = 3;</code>
       * @return A list containing the satisfiedCondList.
       */
      public java.util.List<java.lang.Integer>
          getSatisfiedCondListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(satisfiedCondList_) : satisfiedCondList_;
      }
      /**
       * <code>repeated uint32 satisfied_cond_list = 3;</code>
       * @return The count of satisfiedCondList.
       */
      public int getSatisfiedCondListCount() {
        return satisfiedCondList_.size();
      }
      /**
       * <code>repeated uint32 satisfied_cond_list = 3;</code>
       * @param index The index of the element to return.
       * @return The satisfiedCondList at the given index.
       */
      public int getSatisfiedCondList(int index) {
        return satisfiedCondList_.getInt(index);
      }
      /**
       * <code>repeated uint32 satisfied_cond_list = 3;</code>
       * @param index The index to set the value at.
       * @param value The satisfiedCondList to set.
       * @return This builder for chaining.
       */
      public Builder setSatisfiedCondList(
          int index, int value) {
        ensureSatisfiedCondListIsMutable();
        satisfiedCondList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 satisfied_cond_list = 3;</code>
       * @param value The satisfiedCondList to add.
       * @return This builder for chaining.
       */
      public Builder addSatisfiedCondList(int value) {
        ensureSatisfiedCondListIsMutable();
        satisfiedCondList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 satisfied_cond_list = 3;</code>
       * @param values The satisfiedCondList to add.
       * @return This builder for chaining.
       */
      public Builder addAllSatisfiedCondList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureSatisfiedCondListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, satisfiedCondList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 satisfied_cond_list = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearSatisfiedCondList() {
        satisfiedCondList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int levelId_ ;
      /**
       * <code>uint32 level_id = 6;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 6;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {
        
        levelId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        
        levelId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:TowerLevelRecord)
    }

    // @@protoc_insertion_point(class_scope:TowerLevelRecord)
    private static final emu.grasscutter.net.proto.TowerLevelRecordOuterClass.TowerLevelRecord DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.TowerLevelRecordOuterClass.TowerLevelRecord();
    }

    public static emu.grasscutter.net.proto.TowerLevelRecordOuterClass.TowerLevelRecord getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TowerLevelRecord>
        PARSER = new com.google.protobuf.AbstractParser<TowerLevelRecord>() {
      @java.lang.Override
      public TowerLevelRecord parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TowerLevelRecord(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TowerLevelRecord> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TowerLevelRecord> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.TowerLevelRecordOuterClass.TowerLevelRecord getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TowerLevelRecord_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TowerLevelRecord_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026TowerLevelRecord.proto\"A\n\020TowerLevelRe" +
      "cord\022\033\n\023satisfied_cond_list\030\003 \003(\r\022\020\n\010lev" +
      "el_id\030\006 \001(\rB\033\n\031emu.grasscutter.net.proto" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_TowerLevelRecord_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TowerLevelRecord_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TowerLevelRecord_descriptor,
        new java.lang.String[] { "SatisfiedCondList", "LevelId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
