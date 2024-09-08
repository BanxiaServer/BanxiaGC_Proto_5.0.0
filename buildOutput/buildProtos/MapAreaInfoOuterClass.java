// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MapAreaInfo.proto

package emu.grasscutter.net.proto;

public final class MapAreaInfoOuterClass {
  private MapAreaInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MapAreaInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MapAreaInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 map_area_id = 1;</code>
     * @return The mapAreaId.
     */
    int getMapAreaId();

    /**
     * <code>bool is_open = 2;</code>
     * @return The isOpen.
     */
    boolean getIsOpen();
  }
  /**
   * Protobuf type {@code MapAreaInfo}
   */
  public static final class MapAreaInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MapAreaInfo)
      MapAreaInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MapAreaInfo.newBuilder() to construct.
    private MapAreaInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MapAreaInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MapAreaInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MapAreaInfo(
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
            case 8: {

              mapAreaId_ = input.readUInt32();
              break;
            }
            case 16: {

              isOpen_ = input.readBool();
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
      return emu.grasscutter.net.proto.MapAreaInfoOuterClass.internal_static_MapAreaInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.MapAreaInfoOuterClass.internal_static_MapAreaInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.MapAreaInfoOuterClass.MapAreaInfo.class, emu.grasscutter.net.proto.MapAreaInfoOuterClass.MapAreaInfo.Builder.class);
    }

    public static final int MAP_AREA_ID_FIELD_NUMBER = 1;
    private int mapAreaId_;
    /**
     * <code>uint32 map_area_id = 1;</code>
     * @return The mapAreaId.
     */
    @java.lang.Override
    public int getMapAreaId() {
      return mapAreaId_;
    }

    public static final int IS_OPEN_FIELD_NUMBER = 2;
    private boolean isOpen_;
    /**
     * <code>bool is_open = 2;</code>
     * @return The isOpen.
     */
    @java.lang.Override
    public boolean getIsOpen() {
      return isOpen_;
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
      if (mapAreaId_ != 0) {
        output.writeUInt32(1, mapAreaId_);
      }
      if (isOpen_ != false) {
        output.writeBool(2, isOpen_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (mapAreaId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, mapAreaId_);
      }
      if (isOpen_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, isOpen_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.MapAreaInfoOuterClass.MapAreaInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.MapAreaInfoOuterClass.MapAreaInfo other = (emu.grasscutter.net.proto.MapAreaInfoOuterClass.MapAreaInfo) obj;

      if (getMapAreaId()
          != other.getMapAreaId()) return false;
      if (getIsOpen()
          != other.getIsOpen()) return false;
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
      hash = (37 * hash) + MAP_AREA_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMapAreaId();
      hash = (37 * hash) + IS_OPEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsOpen());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.MapAreaInfoOuterClass.MapAreaInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MapAreaInfoOuterClass.MapAreaInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MapAreaInfoOuterClass.MapAreaInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MapAreaInfoOuterClass.MapAreaInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MapAreaInfoOuterClass.MapAreaInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MapAreaInfoOuterClass.MapAreaInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MapAreaInfoOuterClass.MapAreaInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MapAreaInfoOuterClass.MapAreaInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MapAreaInfoOuterClass.MapAreaInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MapAreaInfoOuterClass.MapAreaInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MapAreaInfoOuterClass.MapAreaInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MapAreaInfoOuterClass.MapAreaInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.MapAreaInfoOuterClass.MapAreaInfo prototype) {
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
     * Protobuf type {@code MapAreaInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MapAreaInfo)
        emu.grasscutter.net.proto.MapAreaInfoOuterClass.MapAreaInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.MapAreaInfoOuterClass.internal_static_MapAreaInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.MapAreaInfoOuterClass.internal_static_MapAreaInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.MapAreaInfoOuterClass.MapAreaInfo.class, emu.grasscutter.net.proto.MapAreaInfoOuterClass.MapAreaInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.MapAreaInfoOuterClass.MapAreaInfo.newBuilder()
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
        mapAreaId_ = 0;

        isOpen_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.MapAreaInfoOuterClass.internal_static_MapAreaInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MapAreaInfoOuterClass.MapAreaInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.MapAreaInfoOuterClass.MapAreaInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MapAreaInfoOuterClass.MapAreaInfo build() {
        emu.grasscutter.net.proto.MapAreaInfoOuterClass.MapAreaInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MapAreaInfoOuterClass.MapAreaInfo buildPartial() {
        emu.grasscutter.net.proto.MapAreaInfoOuterClass.MapAreaInfo result = new emu.grasscutter.net.proto.MapAreaInfoOuterClass.MapAreaInfo(this);
        result.mapAreaId_ = mapAreaId_;
        result.isOpen_ = isOpen_;
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
        if (other instanceof emu.grasscutter.net.proto.MapAreaInfoOuterClass.MapAreaInfo) {
          return mergeFrom((emu.grasscutter.net.proto.MapAreaInfoOuterClass.MapAreaInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.MapAreaInfoOuterClass.MapAreaInfo other) {
        if (other == emu.grasscutter.net.proto.MapAreaInfoOuterClass.MapAreaInfo.getDefaultInstance()) return this;
        if (other.getMapAreaId() != 0) {
          setMapAreaId(other.getMapAreaId());
        }
        if (other.getIsOpen() != false) {
          setIsOpen(other.getIsOpen());
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
        emu.grasscutter.net.proto.MapAreaInfoOuterClass.MapAreaInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.MapAreaInfoOuterClass.MapAreaInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int mapAreaId_ ;
      /**
       * <code>uint32 map_area_id = 1;</code>
       * @return The mapAreaId.
       */
      @java.lang.Override
      public int getMapAreaId() {
        return mapAreaId_;
      }
      /**
       * <code>uint32 map_area_id = 1;</code>
       * @param value The mapAreaId to set.
       * @return This builder for chaining.
       */
      public Builder setMapAreaId(int value) {
        
        mapAreaId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 map_area_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearMapAreaId() {
        
        mapAreaId_ = 0;
        onChanged();
        return this;
      }

      private boolean isOpen_ ;
      /**
       * <code>bool is_open = 2;</code>
       * @return The isOpen.
       */
      @java.lang.Override
      public boolean getIsOpen() {
        return isOpen_;
      }
      /**
       * <code>bool is_open = 2;</code>
       * @param value The isOpen to set.
       * @return This builder for chaining.
       */
      public Builder setIsOpen(boolean value) {
        
        isOpen_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_open = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsOpen() {
        
        isOpen_ = false;
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


      // @@protoc_insertion_point(builder_scope:MapAreaInfo)
    }

    // @@protoc_insertion_point(class_scope:MapAreaInfo)
    private static final emu.grasscutter.net.proto.MapAreaInfoOuterClass.MapAreaInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.MapAreaInfoOuterClass.MapAreaInfo();
    }

    public static emu.grasscutter.net.proto.MapAreaInfoOuterClass.MapAreaInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MapAreaInfo>
        PARSER = new com.google.protobuf.AbstractParser<MapAreaInfo>() {
      @java.lang.Override
      public MapAreaInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MapAreaInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MapAreaInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MapAreaInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.MapAreaInfoOuterClass.MapAreaInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MapAreaInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MapAreaInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021MapAreaInfo.proto\"3\n\013MapAreaInfo\022\023\n\013ma" +
      "p_area_id\030\001 \001(\r\022\017\n\007is_open\030\002 \001(\010B\033\n\031emu." +
      "grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_MapAreaInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MapAreaInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MapAreaInfo_descriptor,
        new java.lang.String[] { "MapAreaId", "IsOpen", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
