// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HideAndSeekStageType.proto

package emu.grasscutter.net.proto;

public final class HideAndSeekStageTypeOuterClass {
  private HideAndSeekStageTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * <pre>
   * Obf: AIHOPPMEJNG
   * </pre>
   *
   * Protobuf enum {@code HideAndSeekStageType}
   */
  public enum HideAndSeekStageType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>HIDE_AND_SEEK_STAGE_PREPARE = 0;</code>
     */
    HIDE_AND_SEEK_STAGE_PREPARE(0),
    /**
     * <code>HIDE_AND_SEEK_STAGE_PICK = 1;</code>
     */
    HIDE_AND_SEEK_STAGE_PICK(1),
    /**
     * <code>HIDE_AND_SEEK_STAGE_GAME = 2;</code>
     */
    HIDE_AND_SEEK_STAGE_GAME(2),
    /**
     * <code>HIDE_AND_SEEK_STAGE_HIDE = 3;</code>
     */
    HIDE_AND_SEEK_STAGE_HIDE(3),
    /**
     * <code>HIDE_AND_SEEK_STAGE_SEEK = 4;</code>
     */
    HIDE_AND_SEEK_STAGE_SEEK(4),
    /**
     * <code>HIDE_AND_SEEK_STAGE_SETTLE = 5;</code>
     */
    HIDE_AND_SEEK_STAGE_SETTLE(5),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>HIDE_AND_SEEK_STAGE_PREPARE = 0;</code>
     */
    public static final int HIDE_AND_SEEK_STAGE_PREPARE_VALUE = 0;
    /**
     * <code>HIDE_AND_SEEK_STAGE_PICK = 1;</code>
     */
    public static final int HIDE_AND_SEEK_STAGE_PICK_VALUE = 1;
    /**
     * <code>HIDE_AND_SEEK_STAGE_GAME = 2;</code>
     */
    public static final int HIDE_AND_SEEK_STAGE_GAME_VALUE = 2;
    /**
     * <code>HIDE_AND_SEEK_STAGE_HIDE = 3;</code>
     */
    public static final int HIDE_AND_SEEK_STAGE_HIDE_VALUE = 3;
    /**
     * <code>HIDE_AND_SEEK_STAGE_SEEK = 4;</code>
     */
    public static final int HIDE_AND_SEEK_STAGE_SEEK_VALUE = 4;
    /**
     * <code>HIDE_AND_SEEK_STAGE_SETTLE = 5;</code>
     */
    public static final int HIDE_AND_SEEK_STAGE_SETTLE_VALUE = 5;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static HideAndSeekStageType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static HideAndSeekStageType forNumber(int value) {
      switch (value) {
        case 0: return HIDE_AND_SEEK_STAGE_PREPARE;
        case 1: return HIDE_AND_SEEK_STAGE_PICK;
        case 2: return HIDE_AND_SEEK_STAGE_GAME;
        case 3: return HIDE_AND_SEEK_STAGE_HIDE;
        case 4: return HIDE_AND_SEEK_STAGE_SEEK;
        case 5: return HIDE_AND_SEEK_STAGE_SETTLE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<HideAndSeekStageType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        HideAndSeekStageType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<HideAndSeekStageType>() {
            public HideAndSeekStageType findValueByNumber(int number) {
              return HideAndSeekStageType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.HideAndSeekStageTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final HideAndSeekStageType[] VALUES = values();

    public static HideAndSeekStageType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private HideAndSeekStageType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:HideAndSeekStageType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032HideAndSeekStageType.proto*\317\001\n\024HideAnd" +
      "SeekStageType\022\037\n\033HIDE_AND_SEEK_STAGE_PRE" +
      "PARE\020\000\022\034\n\030HIDE_AND_SEEK_STAGE_PICK\020\001\022\034\n\030" +
      "HIDE_AND_SEEK_STAGE_GAME\020\002\022\034\n\030HIDE_AND_S" +
      "EEK_STAGE_HIDE\020\003\022\034\n\030HIDE_AND_SEEK_STAGE_" +
      "SEEK\020\004\022\036\n\032HIDE_AND_SEEK_STAGE_SETTLE\020\005B\033" +
      "\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
