// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChangeHpReason.proto

package emu.grasscutter.net.proto;

public final class ChangeHpReasonOuterClass {
  private ChangeHpReasonOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code ChangeHpReason}
   */
  public enum ChangeHpReason
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>CHANGE_HP_REASON_NONE = 0;</code>
     */
    CHANGE_HP_REASON_NONE(0),
    /**
     * <code>CHANGE_HP_REASON_SUB_AVATAR = 1;</code>
     */
    CHANGE_HP_REASON_SUB_AVATAR(1),
    /**
     * <code>CHANGE_HP_REASON_SUB_MONSTER = 2;</code>
     */
    CHANGE_HP_REASON_SUB_MONSTER(2),
    /**
     * <code>CHANGE_HP_REASON_SUB_GEAR = 3;</code>
     */
    CHANGE_HP_REASON_SUB_GEAR(3),
    /**
     * <code>CHANGE_HP_REASON_SUB_ENVIR = 4;</code>
     */
    CHANGE_HP_REASON_SUB_ENVIR(4),
    /**
     * <code>CHANGE_HP_REASON_SUB_FALL = 5;</code>
     */
    CHANGE_HP_REASON_SUB_FALL(5),
    /**
     * <code>CHANGE_HP_REASON_SUB_DRAWN = 6;</code>
     */
    CHANGE_HP_REASON_SUB_DRAWN(6),
    /**
     * <code>CHANGE_HP_REASON_SUB_ABYSS = 7;</code>
     */
    CHANGE_HP_REASON_SUB_ABYSS(7),
    /**
     * <code>CHANGE_HP_REASON_SUB_ABILITY = 8;</code>
     */
    CHANGE_HP_REASON_SUB_ABILITY(8),
    /**
     * <code>CHANGE_HP_REASON_SUB_SUMMON = 9;</code>
     */
    CHANGE_HP_REASON_SUB_SUMMON(9),
    /**
     * <code>CHANGE_HP_REASON_SUB_SCRIPT = 10;</code>
     */
    CHANGE_HP_REASON_SUB_SCRIPT(10),
    /**
     * <code>CHANGE_HP_REASON_SUB_GM = 11;</code>
     */
    CHANGE_HP_REASON_SUB_GM(11),
    /**
     * <code>CHANGE_HP_REASON_SUB_KILL_SELF = 12;</code>
     */
    CHANGE_HP_REASON_SUB_KILL_SELF(12),
    /**
     * <code>CHANGE_HP_REASON_SUB_CLIMATE_COLD = 13;</code>
     */
    CHANGE_HP_REASON_SUB_CLIMATE_COLD(13),
    /**
     * <code>CHANGE_HP_REASON_SUB_STORM_LIGHTNING = 14;</code>
     */
    CHANGE_HP_REASON_SUB_STORM_LIGHTNING(14),
    /**
     * <code>CHANGE_HP_REASON_SUB_KILL_SERVER_GADGET = 15;</code>
     */
    CHANGE_HP_REASON_SUB_KILL_SERVER_GADGET(15),
    /**
     * <code>CHANGE_HP_REASON_SUB_REPLACE = 16;</code>
     */
    CHANGE_HP_REASON_SUB_REPLACE(16),
    /**
     * <code>CHANGE_HP_REASON_SUB_PLAYER_LEAVE = 17;</code>
     */
    CHANGE_HP_REASON_SUB_PLAYER_LEAVE(17),
    /**
     * <code>CHANGE_HP_REASON_ATTACK_BY_ENERGY = 18;</code>
     */
    CHANGE_HP_REASON_ATTACK_BY_ENERGY(18),
    /**
     * <code>CHANGE_HP_REASON_ATTACK_BY_RECYCLE = 19;</code>
     */
    CHANGE_HP_REASON_ATTACK_BY_RECYCLE(19),
    /**
     * <code>CHANGE_HP_REASON_SUB_PLAYER_BACK = 20;</code>
     */
    CHANGE_HP_REASON_SUB_PLAYER_BACK(20),
    /**
     * <code>CHANGE_HP_REASON_SUB_UGC = 21;</code>
     */
    CHANGE_HP_REASON_SUB_UGC(21),
    /**
     * <code>CHANGE_HP_REASON_BY_LUA = 51;</code>
     */
    CHANGE_HP_REASON_BY_LUA(51),
    /**
     * <code>CHANGE_HP_REASON_ADD_ABILITY = 101;</code>
     */
    CHANGE_HP_REASON_ADD_ABILITY(101),
    /**
     * <code>CHANGE_HP_REASON_ADD_ITEM = 102;</code>
     */
    CHANGE_HP_REASON_ADD_ITEM(102),
    /**
     * <code>CHANGE_HP_REASON_ADD_REVIVE = 103;</code>
     */
    CHANGE_HP_REASON_ADD_REVIVE(103),
    /**
     * <code>CHANGE_HP_REASON_ADD_UPGRADE = 104;</code>
     */
    CHANGE_HP_REASON_ADD_UPGRADE(104),
    /**
     * <code>CHANGE_HP_REASON_ADD_STATUE = 105;</code>
     */
    CHANGE_HP_REASON_ADD_STATUE(105),
    /**
     * <code>CHANGE_HP_REASON_ADD_BACKGROUND = 106;</code>
     */
    CHANGE_HP_REASON_ADD_BACKGROUND(106),
    /**
     * <code>CHANGE_HP_REASON_ADD_GM = 107;</code>
     */
    CHANGE_HP_REASON_ADD_GM(107),
    /**
     * <code>CHANGE_HP_REASON_ADD_TRIAL_AVATAR_ACTIVITY = 108;</code>
     */
    CHANGE_HP_REASON_ADD_TRIAL_AVATAR_ACTIVITY(108),
    /**
     * <code>CHANGE_HP_REASON_ADD_ROGUELIKE_SPRING = 109;</code>
     */
    CHANGE_HP_REASON_ADD_ROGUELIKE_SPRING(109),
    /**
     * <code>CHANGE_HP_REASON_ADD_EFFIGY_CHALLENGE_V_5 = 110;</code>
     */
    CHANGE_HP_REASON_ADD_EFFIGY_CHALLENGE_V_5(110),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>CHANGE_HP_REASON_NONE = 0;</code>
     */
    public static final int CHANGE_HP_REASON_NONE_VALUE = 0;
    /**
     * <code>CHANGE_HP_REASON_SUB_AVATAR = 1;</code>
     */
    public static final int CHANGE_HP_REASON_SUB_AVATAR_VALUE = 1;
    /**
     * <code>CHANGE_HP_REASON_SUB_MONSTER = 2;</code>
     */
    public static final int CHANGE_HP_REASON_SUB_MONSTER_VALUE = 2;
    /**
     * <code>CHANGE_HP_REASON_SUB_GEAR = 3;</code>
     */
    public static final int CHANGE_HP_REASON_SUB_GEAR_VALUE = 3;
    /**
     * <code>CHANGE_HP_REASON_SUB_ENVIR = 4;</code>
     */
    public static final int CHANGE_HP_REASON_SUB_ENVIR_VALUE = 4;
    /**
     * <code>CHANGE_HP_REASON_SUB_FALL = 5;</code>
     */
    public static final int CHANGE_HP_REASON_SUB_FALL_VALUE = 5;
    /**
     * <code>CHANGE_HP_REASON_SUB_DRAWN = 6;</code>
     */
    public static final int CHANGE_HP_REASON_SUB_DRAWN_VALUE = 6;
    /**
     * <code>CHANGE_HP_REASON_SUB_ABYSS = 7;</code>
     */
    public static final int CHANGE_HP_REASON_SUB_ABYSS_VALUE = 7;
    /**
     * <code>CHANGE_HP_REASON_SUB_ABILITY = 8;</code>
     */
    public static final int CHANGE_HP_REASON_SUB_ABILITY_VALUE = 8;
    /**
     * <code>CHANGE_HP_REASON_SUB_SUMMON = 9;</code>
     */
    public static final int CHANGE_HP_REASON_SUB_SUMMON_VALUE = 9;
    /**
     * <code>CHANGE_HP_REASON_SUB_SCRIPT = 10;</code>
     */
    public static final int CHANGE_HP_REASON_SUB_SCRIPT_VALUE = 10;
    /**
     * <code>CHANGE_HP_REASON_SUB_GM = 11;</code>
     */
    public static final int CHANGE_HP_REASON_SUB_GM_VALUE = 11;
    /**
     * <code>CHANGE_HP_REASON_SUB_KILL_SELF = 12;</code>
     */
    public static final int CHANGE_HP_REASON_SUB_KILL_SELF_VALUE = 12;
    /**
     * <code>CHANGE_HP_REASON_SUB_CLIMATE_COLD = 13;</code>
     */
    public static final int CHANGE_HP_REASON_SUB_CLIMATE_COLD_VALUE = 13;
    /**
     * <code>CHANGE_HP_REASON_SUB_STORM_LIGHTNING = 14;</code>
     */
    public static final int CHANGE_HP_REASON_SUB_STORM_LIGHTNING_VALUE = 14;
    /**
     * <code>CHANGE_HP_REASON_SUB_KILL_SERVER_GADGET = 15;</code>
     */
    public static final int CHANGE_HP_REASON_SUB_KILL_SERVER_GADGET_VALUE = 15;
    /**
     * <code>CHANGE_HP_REASON_SUB_REPLACE = 16;</code>
     */
    public static final int CHANGE_HP_REASON_SUB_REPLACE_VALUE = 16;
    /**
     * <code>CHANGE_HP_REASON_SUB_PLAYER_LEAVE = 17;</code>
     */
    public static final int CHANGE_HP_REASON_SUB_PLAYER_LEAVE_VALUE = 17;
    /**
     * <code>CHANGE_HP_REASON_ATTACK_BY_ENERGY = 18;</code>
     */
    public static final int CHANGE_HP_REASON_ATTACK_BY_ENERGY_VALUE = 18;
    /**
     * <code>CHANGE_HP_REASON_ATTACK_BY_RECYCLE = 19;</code>
     */
    public static final int CHANGE_HP_REASON_ATTACK_BY_RECYCLE_VALUE = 19;
    /**
     * <code>CHANGE_HP_REASON_SUB_PLAYER_BACK = 20;</code>
     */
    public static final int CHANGE_HP_REASON_SUB_PLAYER_BACK_VALUE = 20;
    /**
     * <code>CHANGE_HP_REASON_SUB_UGC = 21;</code>
     */
    public static final int CHANGE_HP_REASON_SUB_UGC_VALUE = 21;
    /**
     * <code>CHANGE_HP_REASON_BY_LUA = 51;</code>
     */
    public static final int CHANGE_HP_REASON_BY_LUA_VALUE = 51;
    /**
     * <code>CHANGE_HP_REASON_ADD_ABILITY = 101;</code>
     */
    public static final int CHANGE_HP_REASON_ADD_ABILITY_VALUE = 101;
    /**
     * <code>CHANGE_HP_REASON_ADD_ITEM = 102;</code>
     */
    public static final int CHANGE_HP_REASON_ADD_ITEM_VALUE = 102;
    /**
     * <code>CHANGE_HP_REASON_ADD_REVIVE = 103;</code>
     */
    public static final int CHANGE_HP_REASON_ADD_REVIVE_VALUE = 103;
    /**
     * <code>CHANGE_HP_REASON_ADD_UPGRADE = 104;</code>
     */
    public static final int CHANGE_HP_REASON_ADD_UPGRADE_VALUE = 104;
    /**
     * <code>CHANGE_HP_REASON_ADD_STATUE = 105;</code>
     */
    public static final int CHANGE_HP_REASON_ADD_STATUE_VALUE = 105;
    /**
     * <code>CHANGE_HP_REASON_ADD_BACKGROUND = 106;</code>
     */
    public static final int CHANGE_HP_REASON_ADD_BACKGROUND_VALUE = 106;
    /**
     * <code>CHANGE_HP_REASON_ADD_GM = 107;</code>
     */
    public static final int CHANGE_HP_REASON_ADD_GM_VALUE = 107;
    /**
     * <code>CHANGE_HP_REASON_ADD_TRIAL_AVATAR_ACTIVITY = 108;</code>
     */
    public static final int CHANGE_HP_REASON_ADD_TRIAL_AVATAR_ACTIVITY_VALUE = 108;
    /**
     * <code>CHANGE_HP_REASON_ADD_ROGUELIKE_SPRING = 109;</code>
     */
    public static final int CHANGE_HP_REASON_ADD_ROGUELIKE_SPRING_VALUE = 109;
    /**
     * <code>CHANGE_HP_REASON_ADD_EFFIGY_CHALLENGE_V_5 = 110;</code>
     */
    public static final int CHANGE_HP_REASON_ADD_EFFIGY_CHALLENGE_V_5_VALUE = 110;


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
    public static ChangeHpReason valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ChangeHpReason forNumber(int value) {
      switch (value) {
        case 0: return CHANGE_HP_REASON_NONE;
        case 1: return CHANGE_HP_REASON_SUB_AVATAR;
        case 2: return CHANGE_HP_REASON_SUB_MONSTER;
        case 3: return CHANGE_HP_REASON_SUB_GEAR;
        case 4: return CHANGE_HP_REASON_SUB_ENVIR;
        case 5: return CHANGE_HP_REASON_SUB_FALL;
        case 6: return CHANGE_HP_REASON_SUB_DRAWN;
        case 7: return CHANGE_HP_REASON_SUB_ABYSS;
        case 8: return CHANGE_HP_REASON_SUB_ABILITY;
        case 9: return CHANGE_HP_REASON_SUB_SUMMON;
        case 10: return CHANGE_HP_REASON_SUB_SCRIPT;
        case 11: return CHANGE_HP_REASON_SUB_GM;
        case 12: return CHANGE_HP_REASON_SUB_KILL_SELF;
        case 13: return CHANGE_HP_REASON_SUB_CLIMATE_COLD;
        case 14: return CHANGE_HP_REASON_SUB_STORM_LIGHTNING;
        case 15: return CHANGE_HP_REASON_SUB_KILL_SERVER_GADGET;
        case 16: return CHANGE_HP_REASON_SUB_REPLACE;
        case 17: return CHANGE_HP_REASON_SUB_PLAYER_LEAVE;
        case 18: return CHANGE_HP_REASON_ATTACK_BY_ENERGY;
        case 19: return CHANGE_HP_REASON_ATTACK_BY_RECYCLE;
        case 20: return CHANGE_HP_REASON_SUB_PLAYER_BACK;
        case 21: return CHANGE_HP_REASON_SUB_UGC;
        case 51: return CHANGE_HP_REASON_BY_LUA;
        case 101: return CHANGE_HP_REASON_ADD_ABILITY;
        case 102: return CHANGE_HP_REASON_ADD_ITEM;
        case 103: return CHANGE_HP_REASON_ADD_REVIVE;
        case 104: return CHANGE_HP_REASON_ADD_UPGRADE;
        case 105: return CHANGE_HP_REASON_ADD_STATUE;
        case 106: return CHANGE_HP_REASON_ADD_BACKGROUND;
        case 107: return CHANGE_HP_REASON_ADD_GM;
        case 108: return CHANGE_HP_REASON_ADD_TRIAL_AVATAR_ACTIVITY;
        case 109: return CHANGE_HP_REASON_ADD_ROGUELIKE_SPRING;
        case 110: return CHANGE_HP_REASON_ADD_EFFIGY_CHALLENGE_V_5;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ChangeHpReason>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ChangeHpReason> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ChangeHpReason>() {
            public ChangeHpReason findValueByNumber(int number) {
              return ChangeHpReason.forNumber(number);
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
      return emu.grasscutter.net.proto.ChangeHpReasonOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final ChangeHpReason[] VALUES = values();

    public static ChangeHpReason valueOf(
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

    private ChangeHpReason(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:ChangeHpReason)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024ChangeHpReason.proto*\231\t\n\016ChangeHpReaso" +
      "n\022\031\n\025CHANGE_HP_REASON_NONE\020\000\022\037\n\033CHANGE_H" +
      "P_REASON_SUB_AVATAR\020\001\022 \n\034CHANGE_HP_REASO" +
      "N_SUB_MONSTER\020\002\022\035\n\031CHANGE_HP_REASON_SUB_" +
      "GEAR\020\003\022\036\n\032CHANGE_HP_REASON_SUB_ENVIR\020\004\022\035" +
      "\n\031CHANGE_HP_REASON_SUB_FALL\020\005\022\036\n\032CHANGE_" +
      "HP_REASON_SUB_DRAWN\020\006\022\036\n\032CHANGE_HP_REASO" +
      "N_SUB_ABYSS\020\007\022 \n\034CHANGE_HP_REASON_SUB_AB" +
      "ILITY\020\010\022\037\n\033CHANGE_HP_REASON_SUB_SUMMON\020\t" +
      "\022\037\n\033CHANGE_HP_REASON_SUB_SCRIPT\020\n\022\033\n\027CHA" +
      "NGE_HP_REASON_SUB_GM\020\013\022\"\n\036CHANGE_HP_REAS" +
      "ON_SUB_KILL_SELF\020\014\022%\n!CHANGE_HP_REASON_S" +
      "UB_CLIMATE_COLD\020\r\022(\n$CHANGE_HP_REASON_SU" +
      "B_STORM_LIGHTNING\020\016\022+\n\'CHANGE_HP_REASON_" +
      "SUB_KILL_SERVER_GADGET\020\017\022 \n\034CHANGE_HP_RE" +
      "ASON_SUB_REPLACE\020\020\022%\n!CHANGE_HP_REASON_S" +
      "UB_PLAYER_LEAVE\020\021\022%\n!CHANGE_HP_REASON_AT" +
      "TACK_BY_ENERGY\020\022\022&\n\"CHANGE_HP_REASON_ATT" +
      "ACK_BY_RECYCLE\020\023\022$\n CHANGE_HP_REASON_SUB" +
      "_PLAYER_BACK\020\024\022\034\n\030CHANGE_HP_REASON_SUB_U" +
      "GC\020\025\022\033\n\027CHANGE_HP_REASON_BY_LUA\0203\022 \n\034CHA" +
      "NGE_HP_REASON_ADD_ABILITY\020e\022\035\n\031CHANGE_HP" +
      "_REASON_ADD_ITEM\020f\022\037\n\033CHANGE_HP_REASON_A" +
      "DD_REVIVE\020g\022 \n\034CHANGE_HP_REASON_ADD_UPGR" +
      "ADE\020h\022\037\n\033CHANGE_HP_REASON_ADD_STATUE\020i\022#" +
      "\n\037CHANGE_HP_REASON_ADD_BACKGROUND\020j\022\033\n\027C" +
      "HANGE_HP_REASON_ADD_GM\020k\022.\n*CHANGE_HP_RE" +
      "ASON_ADD_TRIAL_AVATAR_ACTIVITY\020l\022)\n%CHAN" +
      "GE_HP_REASON_ADD_ROGUELIKE_SPRING\020m\022-\n)C" +
      "HANGE_HP_REASON_ADD_EFFIGY_CHALLENGE_V_5" +
      "\020nB\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
