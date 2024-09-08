// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: InfernceWordInfo.proto

package emu.grasscutter.net.proto;

public final class InfernceWordInfoOuterClass {
  private InfernceWordInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface InfernceWordInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:InfernceWordInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 unlock_by_word_id = 13;</code>
     * @return The unlockByWordId.
     */
    int getUnlockByWordId();

    /**
     * <code>bool JKDGMJCFEDH = 2;</code>
     * @return The jKDGMJCFEDH.
     */
    boolean getJKDGMJCFEDH();

    /**
     * <code>bool DGMLJIKFAMI = 11;</code>
     * @return The dGMLJIKFAMI.
     */
    boolean getDGMLJIKFAMI();

    /**
     * <code>bool HKJHBOMCGLK = 1;</code>
     * @return The hKJHBOMCGLK.
     */
    boolean getHKJHBOMCGLK();

    /**
     * <code>uint32 word_id = 9;</code>
     * @return The wordId.
     */
    int getWordId();
  }
  /**
   * <pre>
   * Obf: JBNOKAPFIAH
   * </pre>
   *
   * Protobuf type {@code InfernceWordInfo}
   */
  public static final class InfernceWordInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:InfernceWordInfo)
      InfernceWordInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use InfernceWordInfo.newBuilder() to construct.
    private InfernceWordInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private InfernceWordInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new InfernceWordInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private InfernceWordInfo(
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

              hKJHBOMCGLK_ = input.readBool();
              break;
            }
            case 16: {

              jKDGMJCFEDH_ = input.readBool();
              break;
            }
            case 72: {

              wordId_ = input.readUInt32();
              break;
            }
            case 88: {

              dGMLJIKFAMI_ = input.readBool();
              break;
            }
            case 104: {

              unlockByWordId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.InfernceWordInfoOuterClass.internal_static_InfernceWordInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.InfernceWordInfoOuterClass.internal_static_InfernceWordInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.InfernceWordInfoOuterClass.InfernceWordInfo.class, emu.grasscutter.net.proto.InfernceWordInfoOuterClass.InfernceWordInfo.Builder.class);
    }

    public static final int UNLOCK_BY_WORD_ID_FIELD_NUMBER = 13;
    private int unlockByWordId_;
    /**
     * <code>uint32 unlock_by_word_id = 13;</code>
     * @return The unlockByWordId.
     */
    @java.lang.Override
    public int getUnlockByWordId() {
      return unlockByWordId_;
    }

    public static final int JKDGMJCFEDH_FIELD_NUMBER = 2;
    private boolean jKDGMJCFEDH_;
    /**
     * <code>bool JKDGMJCFEDH = 2;</code>
     * @return The jKDGMJCFEDH.
     */
    @java.lang.Override
    public boolean getJKDGMJCFEDH() {
      return jKDGMJCFEDH_;
    }

    public static final int DGMLJIKFAMI_FIELD_NUMBER = 11;
    private boolean dGMLJIKFAMI_;
    /**
     * <code>bool DGMLJIKFAMI = 11;</code>
     * @return The dGMLJIKFAMI.
     */
    @java.lang.Override
    public boolean getDGMLJIKFAMI() {
      return dGMLJIKFAMI_;
    }

    public static final int HKJHBOMCGLK_FIELD_NUMBER = 1;
    private boolean hKJHBOMCGLK_;
    /**
     * <code>bool HKJHBOMCGLK = 1;</code>
     * @return The hKJHBOMCGLK.
     */
    @java.lang.Override
    public boolean getHKJHBOMCGLK() {
      return hKJHBOMCGLK_;
    }

    public static final int WORD_ID_FIELD_NUMBER = 9;
    private int wordId_;
    /**
     * <code>uint32 word_id = 9;</code>
     * @return The wordId.
     */
    @java.lang.Override
    public int getWordId() {
      return wordId_;
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
      if (hKJHBOMCGLK_ != false) {
        output.writeBool(1, hKJHBOMCGLK_);
      }
      if (jKDGMJCFEDH_ != false) {
        output.writeBool(2, jKDGMJCFEDH_);
      }
      if (wordId_ != 0) {
        output.writeUInt32(9, wordId_);
      }
      if (dGMLJIKFAMI_ != false) {
        output.writeBool(11, dGMLJIKFAMI_);
      }
      if (unlockByWordId_ != 0) {
        output.writeUInt32(13, unlockByWordId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (hKJHBOMCGLK_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, hKJHBOMCGLK_);
      }
      if (jKDGMJCFEDH_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, jKDGMJCFEDH_);
      }
      if (wordId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, wordId_);
      }
      if (dGMLJIKFAMI_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(11, dGMLJIKFAMI_);
      }
      if (unlockByWordId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, unlockByWordId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.InfernceWordInfoOuterClass.InfernceWordInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.InfernceWordInfoOuterClass.InfernceWordInfo other = (emu.grasscutter.net.proto.InfernceWordInfoOuterClass.InfernceWordInfo) obj;

      if (getUnlockByWordId()
          != other.getUnlockByWordId()) return false;
      if (getJKDGMJCFEDH()
          != other.getJKDGMJCFEDH()) return false;
      if (getDGMLJIKFAMI()
          != other.getDGMLJIKFAMI()) return false;
      if (getHKJHBOMCGLK()
          != other.getHKJHBOMCGLK()) return false;
      if (getWordId()
          != other.getWordId()) return false;
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
      hash = (37 * hash) + UNLOCK_BY_WORD_ID_FIELD_NUMBER;
      hash = (53 * hash) + getUnlockByWordId();
      hash = (37 * hash) + JKDGMJCFEDH_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getJKDGMJCFEDH());
      hash = (37 * hash) + DGMLJIKFAMI_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getDGMLJIKFAMI());
      hash = (37 * hash) + HKJHBOMCGLK_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getHKJHBOMCGLK());
      hash = (37 * hash) + WORD_ID_FIELD_NUMBER;
      hash = (53 * hash) + getWordId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.InfernceWordInfoOuterClass.InfernceWordInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.InfernceWordInfoOuterClass.InfernceWordInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InfernceWordInfoOuterClass.InfernceWordInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.InfernceWordInfoOuterClass.InfernceWordInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InfernceWordInfoOuterClass.InfernceWordInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.InfernceWordInfoOuterClass.InfernceWordInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InfernceWordInfoOuterClass.InfernceWordInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.InfernceWordInfoOuterClass.InfernceWordInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InfernceWordInfoOuterClass.InfernceWordInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.InfernceWordInfoOuterClass.InfernceWordInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InfernceWordInfoOuterClass.InfernceWordInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.InfernceWordInfoOuterClass.InfernceWordInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.InfernceWordInfoOuterClass.InfernceWordInfo prototype) {
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
     * Obf: JBNOKAPFIAH
     * </pre>
     *
     * Protobuf type {@code InfernceWordInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:InfernceWordInfo)
        emu.grasscutter.net.proto.InfernceWordInfoOuterClass.InfernceWordInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.InfernceWordInfoOuterClass.internal_static_InfernceWordInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.InfernceWordInfoOuterClass.internal_static_InfernceWordInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.InfernceWordInfoOuterClass.InfernceWordInfo.class, emu.grasscutter.net.proto.InfernceWordInfoOuterClass.InfernceWordInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.InfernceWordInfoOuterClass.InfernceWordInfo.newBuilder()
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
        unlockByWordId_ = 0;

        jKDGMJCFEDH_ = false;

        dGMLJIKFAMI_ = false;

        hKJHBOMCGLK_ = false;

        wordId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.InfernceWordInfoOuterClass.internal_static_InfernceWordInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.InfernceWordInfoOuterClass.InfernceWordInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.InfernceWordInfoOuterClass.InfernceWordInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.InfernceWordInfoOuterClass.InfernceWordInfo build() {
        emu.grasscutter.net.proto.InfernceWordInfoOuterClass.InfernceWordInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.InfernceWordInfoOuterClass.InfernceWordInfo buildPartial() {
        emu.grasscutter.net.proto.InfernceWordInfoOuterClass.InfernceWordInfo result = new emu.grasscutter.net.proto.InfernceWordInfoOuterClass.InfernceWordInfo(this);
        result.unlockByWordId_ = unlockByWordId_;
        result.jKDGMJCFEDH_ = jKDGMJCFEDH_;
        result.dGMLJIKFAMI_ = dGMLJIKFAMI_;
        result.hKJHBOMCGLK_ = hKJHBOMCGLK_;
        result.wordId_ = wordId_;
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
        if (other instanceof emu.grasscutter.net.proto.InfernceWordInfoOuterClass.InfernceWordInfo) {
          return mergeFrom((emu.grasscutter.net.proto.InfernceWordInfoOuterClass.InfernceWordInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.InfernceWordInfoOuterClass.InfernceWordInfo other) {
        if (other == emu.grasscutter.net.proto.InfernceWordInfoOuterClass.InfernceWordInfo.getDefaultInstance()) return this;
        if (other.getUnlockByWordId() != 0) {
          setUnlockByWordId(other.getUnlockByWordId());
        }
        if (other.getJKDGMJCFEDH() != false) {
          setJKDGMJCFEDH(other.getJKDGMJCFEDH());
        }
        if (other.getDGMLJIKFAMI() != false) {
          setDGMLJIKFAMI(other.getDGMLJIKFAMI());
        }
        if (other.getHKJHBOMCGLK() != false) {
          setHKJHBOMCGLK(other.getHKJHBOMCGLK());
        }
        if (other.getWordId() != 0) {
          setWordId(other.getWordId());
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
        emu.grasscutter.net.proto.InfernceWordInfoOuterClass.InfernceWordInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.InfernceWordInfoOuterClass.InfernceWordInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int unlockByWordId_ ;
      /**
       * <code>uint32 unlock_by_word_id = 13;</code>
       * @return The unlockByWordId.
       */
      @java.lang.Override
      public int getUnlockByWordId() {
        return unlockByWordId_;
      }
      /**
       * <code>uint32 unlock_by_word_id = 13;</code>
       * @param value The unlockByWordId to set.
       * @return This builder for chaining.
       */
      public Builder setUnlockByWordId(int value) {
        
        unlockByWordId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 unlock_by_word_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnlockByWordId() {
        
        unlockByWordId_ = 0;
        onChanged();
        return this;
      }

      private boolean jKDGMJCFEDH_ ;
      /**
       * <code>bool JKDGMJCFEDH = 2;</code>
       * @return The jKDGMJCFEDH.
       */
      @java.lang.Override
      public boolean getJKDGMJCFEDH() {
        return jKDGMJCFEDH_;
      }
      /**
       * <code>bool JKDGMJCFEDH = 2;</code>
       * @param value The jKDGMJCFEDH to set.
       * @return This builder for chaining.
       */
      public Builder setJKDGMJCFEDH(boolean value) {
        
        jKDGMJCFEDH_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool JKDGMJCFEDH = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearJKDGMJCFEDH() {
        
        jKDGMJCFEDH_ = false;
        onChanged();
        return this;
      }

      private boolean dGMLJIKFAMI_ ;
      /**
       * <code>bool DGMLJIKFAMI = 11;</code>
       * @return The dGMLJIKFAMI.
       */
      @java.lang.Override
      public boolean getDGMLJIKFAMI() {
        return dGMLJIKFAMI_;
      }
      /**
       * <code>bool DGMLJIKFAMI = 11;</code>
       * @param value The dGMLJIKFAMI to set.
       * @return This builder for chaining.
       */
      public Builder setDGMLJIKFAMI(boolean value) {
        
        dGMLJIKFAMI_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool DGMLJIKFAMI = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearDGMLJIKFAMI() {
        
        dGMLJIKFAMI_ = false;
        onChanged();
        return this;
      }

      private boolean hKJHBOMCGLK_ ;
      /**
       * <code>bool HKJHBOMCGLK = 1;</code>
       * @return The hKJHBOMCGLK.
       */
      @java.lang.Override
      public boolean getHKJHBOMCGLK() {
        return hKJHBOMCGLK_;
      }
      /**
       * <code>bool HKJHBOMCGLK = 1;</code>
       * @param value The hKJHBOMCGLK to set.
       * @return This builder for chaining.
       */
      public Builder setHKJHBOMCGLK(boolean value) {
        
        hKJHBOMCGLK_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool HKJHBOMCGLK = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearHKJHBOMCGLK() {
        
        hKJHBOMCGLK_ = false;
        onChanged();
        return this;
      }

      private int wordId_ ;
      /**
       * <code>uint32 word_id = 9;</code>
       * @return The wordId.
       */
      @java.lang.Override
      public int getWordId() {
        return wordId_;
      }
      /**
       * <code>uint32 word_id = 9;</code>
       * @param value The wordId to set.
       * @return This builder for chaining.
       */
      public Builder setWordId(int value) {
        
        wordId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 word_id = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearWordId() {
        
        wordId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:InfernceWordInfo)
    }

    // @@protoc_insertion_point(class_scope:InfernceWordInfo)
    private static final emu.grasscutter.net.proto.InfernceWordInfoOuterClass.InfernceWordInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.InfernceWordInfoOuterClass.InfernceWordInfo();
    }

    public static emu.grasscutter.net.proto.InfernceWordInfoOuterClass.InfernceWordInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<InfernceWordInfo>
        PARSER = new com.google.protobuf.AbstractParser<InfernceWordInfo>() {
      @java.lang.Override
      public InfernceWordInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new InfernceWordInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<InfernceWordInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<InfernceWordInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.InfernceWordInfoOuterClass.InfernceWordInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_InfernceWordInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_InfernceWordInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026InfernceWordInfo.proto\"}\n\020InfernceWord" +
      "Info\022\031\n\021unlock_by_word_id\030\r \001(\r\022\023\n\013JKDGM" +
      "JCFEDH\030\002 \001(\010\022\023\n\013DGMLJIKFAMI\030\013 \001(\010\022\023\n\013HKJ" +
      "HBOMCGLK\030\001 \001(\010\022\017\n\007word_id\030\t \001(\rB\033\n\031emu.g" +
      "rasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_InfernceWordInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_InfernceWordInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_InfernceWordInfo_descriptor,
        new java.lang.String[] { "UnlockByWordId", "JKDGMJCFEDH", "DGMLJIKFAMI", "HKJHBOMCGLK", "WordId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
