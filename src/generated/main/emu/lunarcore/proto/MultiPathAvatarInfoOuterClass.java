// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;
import us.hebi.quickbuf.RepeatedInt;
import us.hebi.quickbuf.RepeatedMessage;

public final class MultiPathAvatarInfoOuterClass {
  /**
   * Protobuf type {@code MultiPathAvatarInfo}
   */
  public static final class MultiPathAvatarInfo extends ProtoMessage<MultiPathAvatarInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 rank = 7;</code>
     */
    private int rank;

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 path_equipment_id = 10;</code>
     */
    private int pathEquipmentId;

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional .MultiPathAvatarType avatar_id = 2;</code>
     */
    private int avatarId;

    /**
     * <code>repeated uint32 unlocked_special_point_id_list = 15;</code>
     */
    private final RepeatedInt unlockedSpecialPointIdList = RepeatedInt.newEmptyInstance();

    /**
     * <pre>
     * 13
     * </pre>
     *
     * <code>repeated .EquipRelic equip_relic_list = 3;</code>
     */
    private final RepeatedMessage<EquipRelicOuterClass.EquipRelic> equipRelicList = RepeatedMessage.newEmptyInstance(EquipRelicOuterClass.EquipRelic.getFactory());

    /**
     * <pre>
     * or 4
     * </pre>
     *
     * <code>repeated .AvatarSkillTree special_skilltree_list = 4;</code>
     */
    private final RepeatedMessage<AvatarSkillTreeOuterClass.AvatarSkillTree> specialSkilltreeList = RepeatedMessage.newEmptyInstance(AvatarSkillTreeOuterClass.AvatarSkillTree.getFactory());

    /**
     * <pre>
     * or smth else
     * </pre>
     *
     * <code>repeated .AvatarSkillTree multi_path_skill_tree = 14;</code>
     */
    private final RepeatedMessage<AvatarSkillTreeOuterClass.AvatarSkillTree> multiPathSkillTree = RepeatedMessage.newEmptyInstance(AvatarSkillTreeOuterClass.AvatarSkillTree.getFactory());

    private MultiPathAvatarInfo() {
    }

    /**
     * @return a new empty instance of {@code MultiPathAvatarInfo}
     */
    public static MultiPathAvatarInfo newInstance() {
      return new MultiPathAvatarInfo();
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 rank = 7;</code>
     * @return whether the rank field is set
     */
    public boolean hasRank() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 rank = 7;</code>
     * @return this
     */
    public MultiPathAvatarInfo clearRank() {
      bitField0_ &= ~0x00000001;
      rank = 0;
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 rank = 7;</code>
     * @return the rank
     */
    public int getRank() {
      return rank;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 rank = 7;</code>
     * @param value the rank to set
     * @return this
     */
    public MultiPathAvatarInfo setRank(final int value) {
      bitField0_ |= 0x00000001;
      rank = value;
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 path_equipment_id = 10;</code>
     * @return whether the pathEquipmentId field is set
     */
    public boolean hasPathEquipmentId() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 path_equipment_id = 10;</code>
     * @return this
     */
    public MultiPathAvatarInfo clearPathEquipmentId() {
      bitField0_ &= ~0x00000002;
      pathEquipmentId = 0;
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 path_equipment_id = 10;</code>
     * @return the pathEquipmentId
     */
    public int getPathEquipmentId() {
      return pathEquipmentId;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 path_equipment_id = 10;</code>
     * @param value the pathEquipmentId to set
     * @return this
     */
    public MultiPathAvatarInfo setPathEquipmentId(final int value) {
      bitField0_ |= 0x00000002;
      pathEquipmentId = value;
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional .MultiPathAvatarType avatar_id = 2;</code>
     * @return whether the avatarId field is set
     */
    public boolean hasAvatarId() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional .MultiPathAvatarType avatar_id = 2;</code>
     * @return this
     */
    public MultiPathAvatarInfo clearAvatarId() {
      bitField0_ &= ~0x00000004;
      avatarId = 0;
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional .MultiPathAvatarType avatar_id = 2;</code>
     * @return the avatarId
     */
    public MultiPathAvatarTypeOuterClass.MultiPathAvatarType getAvatarId() {
      return MultiPathAvatarTypeOuterClass.MultiPathAvatarType.forNumber(avatarId);
    }

    /**
     * Gets the value of the internal enum store. The result is
     * equivalent to {@link MultiPathAvatarInfo#getAvatarId()}.getNumber().
     *
     * @return numeric wire representation
     */
    public int getAvatarIdValue() {
      return avatarId;
    }

    /**
     * Sets the value of the internal enum store. This does not
     * do any validity checks, so be sure to use appropriate value
     * constants from {@link MultiPathAvatarTypeOuterClass.MultiPathAvatarType}. Setting an invalid value
     * can cause {@link MultiPathAvatarInfo#getAvatarId()} to return null
     *
     * @param value the numeric wire value to set
     * @return this
     */
    public MultiPathAvatarInfo setAvatarIdValue(final int value) {
      bitField0_ |= 0x00000004;
      avatarId = value;
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional .MultiPathAvatarType avatar_id = 2;</code>
     * @param value the avatarId to set
     * @return this
     */
    public MultiPathAvatarInfo setAvatarId(
        final MultiPathAvatarTypeOuterClass.MultiPathAvatarType value) {
      bitField0_ |= 0x00000004;
      avatarId = value.getNumber();
      return this;
    }

    /**
     * <code>repeated uint32 unlocked_special_point_id_list = 15;</code>
     * @return whether the unlockedSpecialPointIdList field is set
     */
    public boolean hasUnlockedSpecialPointIdList() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>repeated uint32 unlocked_special_point_id_list = 15;</code>
     * @return this
     */
    public MultiPathAvatarInfo clearUnlockedSpecialPointIdList() {
      bitField0_ &= ~0x00000008;
      unlockedSpecialPointIdList.clear();
      return this;
    }

    /**
     * <code>repeated uint32 unlocked_special_point_id_list = 15;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableUnlockedSpecialPointIdList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedInt getUnlockedSpecialPointIdList() {
      return unlockedSpecialPointIdList;
    }

    /**
     * <code>repeated uint32 unlocked_special_point_id_list = 15;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedInt getMutableUnlockedSpecialPointIdList() {
      bitField0_ |= 0x00000008;
      return unlockedSpecialPointIdList;
    }

    /**
     * <code>repeated uint32 unlocked_special_point_id_list = 15;</code>
     * @param value the unlockedSpecialPointIdList to add
     * @return this
     */
    public MultiPathAvatarInfo addUnlockedSpecialPointIdList(final int value) {
      bitField0_ |= 0x00000008;
      unlockedSpecialPointIdList.add(value);
      return this;
    }

    /**
     * <code>repeated uint32 unlocked_special_point_id_list = 15;</code>
     * @param values the unlockedSpecialPointIdList to add
     * @return this
     */
    public MultiPathAvatarInfo addAllUnlockedSpecialPointIdList(final int... values) {
      bitField0_ |= 0x00000008;
      unlockedSpecialPointIdList.addAll(values);
      return this;
    }

    /**
     * <pre>
     * 13
     * </pre>
     *
     * <code>repeated .EquipRelic equip_relic_list = 3;</code>
     * @return whether the equipRelicList field is set
     */
    public boolean hasEquipRelicList() {
      return (bitField0_ & 0x00000010) != 0;
    }

    /**
     * <pre>
     * 13
     * </pre>
     *
     * <code>repeated .EquipRelic equip_relic_list = 3;</code>
     * @return this
     */
    public MultiPathAvatarInfo clearEquipRelicList() {
      bitField0_ &= ~0x00000010;
      equipRelicList.clear();
      return this;
    }

    /**
     * <pre>
     * 13
     * </pre>
     *
     * <code>repeated .EquipRelic equip_relic_list = 3;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableEquipRelicList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<EquipRelicOuterClass.EquipRelic> getEquipRelicList() {
      return equipRelicList;
    }

    /**
     * <pre>
     * 13
     * </pre>
     *
     * <code>repeated .EquipRelic equip_relic_list = 3;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<EquipRelicOuterClass.EquipRelic> getMutableEquipRelicList() {
      bitField0_ |= 0x00000010;
      return equipRelicList;
    }

    /**
     * <pre>
     * 13
     * </pre>
     *
     * <code>repeated .EquipRelic equip_relic_list = 3;</code>
     * @param value the equipRelicList to add
     * @return this
     */
    public MultiPathAvatarInfo addEquipRelicList(final EquipRelicOuterClass.EquipRelic value) {
      bitField0_ |= 0x00000010;
      equipRelicList.add(value);
      return this;
    }

    /**
     * <pre>
     * 13
     * </pre>
     *
     * <code>repeated .EquipRelic equip_relic_list = 3;</code>
     * @param values the equipRelicList to add
     * @return this
     */
    public MultiPathAvatarInfo addAllEquipRelicList(
        final EquipRelicOuterClass.EquipRelic... values) {
      bitField0_ |= 0x00000010;
      equipRelicList.addAll(values);
      return this;
    }

    /**
     * <pre>
     * or 4
     * </pre>
     *
     * <code>repeated .AvatarSkillTree special_skilltree_list = 4;</code>
     * @return whether the specialSkilltreeList field is set
     */
    public boolean hasSpecialSkilltreeList() {
      return (bitField0_ & 0x00000020) != 0;
    }

    /**
     * <pre>
     * or 4
     * </pre>
     *
     * <code>repeated .AvatarSkillTree special_skilltree_list = 4;</code>
     * @return this
     */
    public MultiPathAvatarInfo clearSpecialSkilltreeList() {
      bitField0_ &= ~0x00000020;
      specialSkilltreeList.clear();
      return this;
    }

    /**
     * <pre>
     * or 4
     * </pre>
     *
     * <code>repeated .AvatarSkillTree special_skilltree_list = 4;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableSpecialSkilltreeList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<AvatarSkillTreeOuterClass.AvatarSkillTree> getSpecialSkilltreeList() {
      return specialSkilltreeList;
    }

    /**
     * <pre>
     * or 4
     * </pre>
     *
     * <code>repeated .AvatarSkillTree special_skilltree_list = 4;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<AvatarSkillTreeOuterClass.AvatarSkillTree> getMutableSpecialSkilltreeList(
        ) {
      bitField0_ |= 0x00000020;
      return specialSkilltreeList;
    }

    /**
     * <pre>
     * or 4
     * </pre>
     *
     * <code>repeated .AvatarSkillTree special_skilltree_list = 4;</code>
     * @param value the specialSkilltreeList to add
     * @return this
     */
    public MultiPathAvatarInfo addSpecialSkilltreeList(
        final AvatarSkillTreeOuterClass.AvatarSkillTree value) {
      bitField0_ |= 0x00000020;
      specialSkilltreeList.add(value);
      return this;
    }

    /**
     * <pre>
     * or 4
     * </pre>
     *
     * <code>repeated .AvatarSkillTree special_skilltree_list = 4;</code>
     * @param values the specialSkilltreeList to add
     * @return this
     */
    public MultiPathAvatarInfo addAllSpecialSkilltreeList(
        final AvatarSkillTreeOuterClass.AvatarSkillTree... values) {
      bitField0_ |= 0x00000020;
      specialSkilltreeList.addAll(values);
      return this;
    }

    /**
     * <pre>
     * or smth else
     * </pre>
     *
     * <code>repeated .AvatarSkillTree multi_path_skill_tree = 14;</code>
     * @return whether the multiPathSkillTree field is set
     */
    public boolean hasMultiPathSkillTree() {
      return (bitField0_ & 0x00000040) != 0;
    }

    /**
     * <pre>
     * or smth else
     * </pre>
     *
     * <code>repeated .AvatarSkillTree multi_path_skill_tree = 14;</code>
     * @return this
     */
    public MultiPathAvatarInfo clearMultiPathSkillTree() {
      bitField0_ &= ~0x00000040;
      multiPathSkillTree.clear();
      return this;
    }

    /**
     * <pre>
     * or smth else
     * </pre>
     *
     * <code>repeated .AvatarSkillTree multi_path_skill_tree = 14;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableMultiPathSkillTree()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<AvatarSkillTreeOuterClass.AvatarSkillTree> getMultiPathSkillTree() {
      return multiPathSkillTree;
    }

    /**
     * <pre>
     * or smth else
     * </pre>
     *
     * <code>repeated .AvatarSkillTree multi_path_skill_tree = 14;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<AvatarSkillTreeOuterClass.AvatarSkillTree> getMutableMultiPathSkillTree(
        ) {
      bitField0_ |= 0x00000040;
      return multiPathSkillTree;
    }

    /**
     * <pre>
     * or smth else
     * </pre>
     *
     * <code>repeated .AvatarSkillTree multi_path_skill_tree = 14;</code>
     * @param value the multiPathSkillTree to add
     * @return this
     */
    public MultiPathAvatarInfo addMultiPathSkillTree(
        final AvatarSkillTreeOuterClass.AvatarSkillTree value) {
      bitField0_ |= 0x00000040;
      multiPathSkillTree.add(value);
      return this;
    }

    /**
     * <pre>
     * or smth else
     * </pre>
     *
     * <code>repeated .AvatarSkillTree multi_path_skill_tree = 14;</code>
     * @param values the multiPathSkillTree to add
     * @return this
     */
    public MultiPathAvatarInfo addAllMultiPathSkillTree(
        final AvatarSkillTreeOuterClass.AvatarSkillTree... values) {
      bitField0_ |= 0x00000040;
      multiPathSkillTree.addAll(values);
      return this;
    }

    @Override
    public MultiPathAvatarInfo copyFrom(final MultiPathAvatarInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        rank = other.rank;
        pathEquipmentId = other.pathEquipmentId;
        avatarId = other.avatarId;
        unlockedSpecialPointIdList.copyFrom(other.unlockedSpecialPointIdList);
        equipRelicList.copyFrom(other.equipRelicList);
        specialSkilltreeList.copyFrom(other.specialSkilltreeList);
        multiPathSkillTree.copyFrom(other.multiPathSkillTree);
      }
      return this;
    }

    @Override
    public MultiPathAvatarInfo mergeFrom(final MultiPathAvatarInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRank()) {
        setRank(other.rank);
      }
      if (other.hasPathEquipmentId()) {
        setPathEquipmentId(other.pathEquipmentId);
      }
      if (other.hasAvatarId()) {
        setAvatarIdValue(other.avatarId);
      }
      if (other.hasUnlockedSpecialPointIdList()) {
        getMutableUnlockedSpecialPointIdList().addAll(other.unlockedSpecialPointIdList);
      }
      if (other.hasEquipRelicList()) {
        getMutableEquipRelicList().addAll(other.equipRelicList);
      }
      if (other.hasSpecialSkilltreeList()) {
        getMutableSpecialSkilltreeList().addAll(other.specialSkilltreeList);
      }
      if (other.hasMultiPathSkillTree()) {
        getMutableMultiPathSkillTree().addAll(other.multiPathSkillTree);
      }
      return this;
    }

    @Override
    public MultiPathAvatarInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      rank = 0;
      pathEquipmentId = 0;
      avatarId = 0;
      unlockedSpecialPointIdList.clear();
      equipRelicList.clear();
      specialSkilltreeList.clear();
      multiPathSkillTree.clear();
      return this;
    }

    @Override
    public MultiPathAvatarInfo clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      unlockedSpecialPointIdList.clear();
      equipRelicList.clearQuick();
      specialSkilltreeList.clearQuick();
      multiPathSkillTree.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof MultiPathAvatarInfo)) {
        return false;
      }
      MultiPathAvatarInfo other = (MultiPathAvatarInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasRank() || rank == other.rank)
        && (!hasPathEquipmentId() || pathEquipmentId == other.pathEquipmentId)
        && (!hasAvatarId() || avatarId == other.avatarId)
        && (!hasUnlockedSpecialPointIdList() || unlockedSpecialPointIdList.equals(other.unlockedSpecialPointIdList))
        && (!hasEquipRelicList() || equipRelicList.equals(other.equipRelicList))
        && (!hasSpecialSkilltreeList() || specialSkilltreeList.equals(other.specialSkilltreeList))
        && (!hasMultiPathSkillTree() || multiPathSkillTree.equals(other.multiPathSkillTree));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 56);
        output.writeUInt32NoTag(rank);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 80);
        output.writeUInt32NoTag(pathEquipmentId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 16);
        output.writeEnumNoTag(avatarId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        for (int i = 0; i < unlockedSpecialPointIdList.length(); i++) {
          output.writeRawByte((byte) 120);
          output.writeUInt32NoTag(unlockedSpecialPointIdList.array()[i]);
        }
      }
      if ((bitField0_ & 0x00000010) != 0) {
        for (int i = 0; i < equipRelicList.length(); i++) {
          output.writeRawByte((byte) 26);
          output.writeMessageNoTag(equipRelicList.get(i));
        }
      }
      if ((bitField0_ & 0x00000020) != 0) {
        for (int i = 0; i < specialSkilltreeList.length(); i++) {
          output.writeRawByte((byte) 34);
          output.writeMessageNoTag(specialSkilltreeList.get(i));
        }
      }
      if ((bitField0_ & 0x00000040) != 0) {
        for (int i = 0; i < multiPathSkillTree.length(); i++) {
          output.writeRawByte((byte) 114);
          output.writeMessageNoTag(multiPathSkillTree.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(rank);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(pathEquipmentId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeEnumSizeNoTag(avatarId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += (1 * unlockedSpecialPointIdList.length()) + ProtoSink.computeRepeatedUInt32SizeNoTag(unlockedSpecialPointIdList);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        size += (1 * equipRelicList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(equipRelicList);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        size += (1 * specialSkilltreeList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(specialSkilltreeList);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        size += (1 * multiPathSkillTree.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(multiPathSkillTree);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public MultiPathAvatarInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 56: {
            // rank
            rank = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 80) {
              break;
            }
          }
          case 80: {
            // pathEquipmentId
            pathEquipmentId = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 16) {
              break;
            }
          }
          case 16: {
            // avatarId
            final int value = input.readInt32();
            if (MultiPathAvatarTypeOuterClass.MultiPathAvatarType.forNumber(value) != null) {
              avatarId = value;
              bitField0_ |= 0x00000004;
            }
            tag = input.readTag();
            if (tag != 122) {
              break;
            }
          }
          case 122: {
            // unlockedSpecialPointIdList [packed=true]
            input.readPackedUInt32(unlockedSpecialPointIdList, tag);
            bitField0_ |= 0x00000008;
            tag = input.readTag();
            if (tag != 26) {
              break;
            }
          }
          case 26: {
            // equipRelicList
            tag = input.readRepeatedMessage(equipRelicList, tag);
            bitField0_ |= 0x00000010;
            if (tag != 34) {
              break;
            }
          }
          case 34: {
            // specialSkilltreeList
            tag = input.readRepeatedMessage(specialSkilltreeList, tag);
            bitField0_ |= 0x00000020;
            if (tag != 114) {
              break;
            }
          }
          case 114: {
            // multiPathSkillTree
            tag = input.readRepeatedMessage(multiPathSkillTree, tag);
            bitField0_ |= 0x00000040;
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
          case 120: {
            // unlockedSpecialPointIdList [packed=false]
            tag = input.readRepeatedUInt32(unlockedSpecialPointIdList, tag);
            bitField0_ |= 0x00000008;
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.rank, rank);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.pathEquipmentId, pathEquipmentId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeEnum(FieldNames.avatarId, avatarId, MultiPathAvatarTypeOuterClass.MultiPathAvatarType.converter());
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRepeatedUInt32(FieldNames.unlockedSpecialPointIdList, unlockedSpecialPointIdList);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeRepeatedMessage(FieldNames.equipRelicList, equipRelicList);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeRepeatedMessage(FieldNames.specialSkilltreeList, specialSkilltreeList);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        output.writeRepeatedMessage(FieldNames.multiPathSkillTree, multiPathSkillTree);
      }
      output.endObject();
    }

    @Override
    public MultiPathAvatarInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 3492908: {
            if (input.isAtField(FieldNames.rank)) {
              if (!input.trySkipNullValue()) {
                rank = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1371565540:
          case -1584422074: {
            if (input.isAtField(FieldNames.pathEquipmentId)) {
              if (!input.trySkipNullValue()) {
                pathEquipmentId = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1787287636:
          case -428636735: {
            if (input.isAtField(FieldNames.avatarId)) {
              if (!input.trySkipNullValue()) {
                final MultiPathAvatarTypeOuterClass.MultiPathAvatarType value = input.readEnum(MultiPathAvatarTypeOuterClass.MultiPathAvatarType.converter());
                if (value != null) {
                  avatarId = value.getNumber();
                  bitField0_ |= 0x00000004;
                } else {
                  input.skipUnknownEnumValue();
                }
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1953824813:
          case 321612849: {
            if (input.isAtField(FieldNames.unlockedSpecialPointIdList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedUInt32(unlockedSpecialPointIdList);
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1578968161:
          case -795441831: {
            if (input.isAtField(FieldNames.equipRelicList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(equipRelicList);
                bitField0_ |= 0x00000010;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 772023924:
          case -1081979468: {
            if (input.isAtField(FieldNames.specialSkilltreeList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(specialSkilltreeList);
                bitField0_ |= 0x00000020;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 730273329:
          case -1809703392: {
            if (input.isAtField(FieldNames.multiPathSkillTree)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(multiPathSkillTree);
                bitField0_ |= 0x00000040;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public MultiPathAvatarInfo clone() {
      return new MultiPathAvatarInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static MultiPathAvatarInfo parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new MultiPathAvatarInfo(), data).checkInitialized();
    }

    public static MultiPathAvatarInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new MultiPathAvatarInfo(), input).checkInitialized();
    }

    public static MultiPathAvatarInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new MultiPathAvatarInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating MultiPathAvatarInfo messages
     */
    public static MessageFactory<MultiPathAvatarInfo> getFactory() {
      return MultiPathAvatarInfoFactory.INSTANCE;
    }

    private enum MultiPathAvatarInfoFactory implements MessageFactory<MultiPathAvatarInfo> {
      INSTANCE;

      @Override
      public MultiPathAvatarInfo create() {
        return MultiPathAvatarInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName rank = FieldName.forField("rank");

      static final FieldName pathEquipmentId = FieldName.forField("pathEquipmentId", "path_equipment_id");

      static final FieldName avatarId = FieldName.forField("avatarId", "avatar_id");

      static final FieldName unlockedSpecialPointIdList = FieldName.forField("unlockedSpecialPointIdList", "unlocked_special_point_id_list");

      static final FieldName equipRelicList = FieldName.forField("equipRelicList", "equip_relic_list");

      static final FieldName specialSkilltreeList = FieldName.forField("specialSkilltreeList", "special_skilltree_list");

      static final FieldName multiPathSkillTree = FieldName.forField("multiPathSkillTree", "multi_path_skill_tree");
    }
  }
}
