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

public final class RankUpEquipmentCsReqOuterClass {
  /**
   * Protobuf type {@code RankUpEquipmentCsReq}
   */
  public static final class RankUpEquipmentCsReq extends ProtoMessage<RankUpEquipmentCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 equipment_unique_id = 12;</code>
     */
    private int equipmentUniqueId;

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional .ItemCostList item_cost_list = 4;</code>
     */
    private final ItemCostListOuterClass.ItemCostList itemCostList = ItemCostListOuterClass.ItemCostList.newInstance();

    private RankUpEquipmentCsReq() {
    }

    /**
     * @return a new empty instance of {@code RankUpEquipmentCsReq}
     */
    public static RankUpEquipmentCsReq newInstance() {
      return new RankUpEquipmentCsReq();
    }

    /**
     * <code>optional uint32 equipment_unique_id = 12;</code>
     * @return whether the equipmentUniqueId field is set
     */
    public boolean hasEquipmentUniqueId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 equipment_unique_id = 12;</code>
     * @return this
     */
    public RankUpEquipmentCsReq clearEquipmentUniqueId() {
      bitField0_ &= ~0x00000001;
      equipmentUniqueId = 0;
      return this;
    }

    /**
     * <code>optional uint32 equipment_unique_id = 12;</code>
     * @return the equipmentUniqueId
     */
    public int getEquipmentUniqueId() {
      return equipmentUniqueId;
    }

    /**
     * <code>optional uint32 equipment_unique_id = 12;</code>
     * @param value the equipmentUniqueId to set
     * @return this
     */
    public RankUpEquipmentCsReq setEquipmentUniqueId(final int value) {
      bitField0_ |= 0x00000001;
      equipmentUniqueId = value;
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional .ItemCostList item_cost_list = 4;</code>
     * @return whether the itemCostList field is set
     */
    public boolean hasItemCostList() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional .ItemCostList item_cost_list = 4;</code>
     * @return this
     */
    public RankUpEquipmentCsReq clearItemCostList() {
      bitField0_ &= ~0x00000002;
      itemCostList.clear();
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional .ItemCostList item_cost_list = 4;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableItemCostList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public ItemCostListOuterClass.ItemCostList getItemCostList() {
      return itemCostList;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional .ItemCostList item_cost_list = 4;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public ItemCostListOuterClass.ItemCostList getMutableItemCostList() {
      bitField0_ |= 0x00000002;
      return itemCostList;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional .ItemCostList item_cost_list = 4;</code>
     * @param value the itemCostList to set
     * @return this
     */
    public RankUpEquipmentCsReq setItemCostList(final ItemCostListOuterClass.ItemCostList value) {
      bitField0_ |= 0x00000002;
      itemCostList.copyFrom(value);
      return this;
    }

    @Override
    public RankUpEquipmentCsReq copyFrom(final RankUpEquipmentCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        equipmentUniqueId = other.equipmentUniqueId;
        itemCostList.copyFrom(other.itemCostList);
      }
      return this;
    }

    @Override
    public RankUpEquipmentCsReq mergeFrom(final RankUpEquipmentCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasEquipmentUniqueId()) {
        setEquipmentUniqueId(other.equipmentUniqueId);
      }
      if (other.hasItemCostList()) {
        getMutableItemCostList().mergeFrom(other.itemCostList);
      }
      return this;
    }

    @Override
    public RankUpEquipmentCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      equipmentUniqueId = 0;
      itemCostList.clear();
      return this;
    }

    @Override
    public RankUpEquipmentCsReq clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      itemCostList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof RankUpEquipmentCsReq)) {
        return false;
      }
      RankUpEquipmentCsReq other = (RankUpEquipmentCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasEquipmentUniqueId() || equipmentUniqueId == other.equipmentUniqueId)
        && (!hasItemCostList() || itemCostList.equals(other.itemCostList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 96);
        output.writeUInt32NoTag(equipmentUniqueId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 34);
        output.writeMessageNoTag(itemCostList);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(equipmentUniqueId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(itemCostList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public RankUpEquipmentCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 96: {
            // equipmentUniqueId
            equipmentUniqueId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 34) {
              break;
            }
          }
          case 34: {
            // itemCostList
            input.readMessage(itemCostList);
            bitField0_ |= 0x00000002;
            tag = input.readTag();
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
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.equipmentUniqueId, equipmentUniqueId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeMessage(FieldNames.itemCostList, itemCostList);
      }
      output.endObject();
    }

    @Override
    public RankUpEquipmentCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1867136902:
          case 760467160: {
            if (input.isAtField(FieldNames.equipmentUniqueId)) {
              if (!input.trySkipNullValue()) {
                equipmentUniqueId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 203506238:
          case -1124889692: {
            if (input.isAtField(FieldNames.itemCostList)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(itemCostList);
                bitField0_ |= 0x00000002;
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
    public RankUpEquipmentCsReq clone() {
      return new RankUpEquipmentCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static RankUpEquipmentCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new RankUpEquipmentCsReq(), data).checkInitialized();
    }

    public static RankUpEquipmentCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RankUpEquipmentCsReq(), input).checkInitialized();
    }

    public static RankUpEquipmentCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RankUpEquipmentCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating RankUpEquipmentCsReq messages
     */
    public static MessageFactory<RankUpEquipmentCsReq> getFactory() {
      return RankUpEquipmentCsReqFactory.INSTANCE;
    }

    private enum RankUpEquipmentCsReqFactory implements MessageFactory<RankUpEquipmentCsReq> {
      INSTANCE;

      @Override
      public RankUpEquipmentCsReq create() {
        return RankUpEquipmentCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName equipmentUniqueId = FieldName.forField("equipmentUniqueId", "equipment_unique_id");

      static final FieldName itemCostList = FieldName.forField("itemCostList", "item_cost_list");
    }
  }
}
