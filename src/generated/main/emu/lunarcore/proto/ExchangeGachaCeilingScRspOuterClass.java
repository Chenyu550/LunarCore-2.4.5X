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

public final class ExchangeGachaCeilingScRspOuterClass {
  /**
   * Protobuf type {@code ExchangeGachaCeilingScRsp}
   */
  public static final class ExchangeGachaCeilingScRsp extends ProtoMessage<ExchangeGachaCeilingScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 avatar_id = 1;</code>
     */
    private int avatarId;

    /**
     * <code>optional uint32 retcode = 3;</code>
     */
    private int retcode;

    /**
     * <code>optional uint32 gacha_type = 5;</code>
     */
    private int gachaType;

    /**
     * <code>optional .ItemList transfer_item_list = 8;</code>
     */
    private final ItemListOuterClass.ItemList transferItemList = ItemListOuterClass.ItemList.newInstance();

    /**
     * <code>optional .GachaCeiling gacha_ceiling = 9;</code>
     */
    private final GachaCeilingOuterClass.GachaCeiling gachaCeiling = GachaCeilingOuterClass.GachaCeiling.newInstance();

    private ExchangeGachaCeilingScRsp() {
    }

    /**
     * @return a new empty instance of {@code ExchangeGachaCeilingScRsp}
     */
    public static ExchangeGachaCeilingScRsp newInstance() {
      return new ExchangeGachaCeilingScRsp();
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 avatar_id = 1;</code>
     * @return whether the avatarId field is set
     */
    public boolean hasAvatarId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 avatar_id = 1;</code>
     * @return this
     */
    public ExchangeGachaCeilingScRsp clearAvatarId() {
      bitField0_ &= ~0x00000001;
      avatarId = 0;
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 avatar_id = 1;</code>
     * @return the avatarId
     */
    public int getAvatarId() {
      return avatarId;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 avatar_id = 1;</code>
     * @param value the avatarId to set
     * @return this
     */
    public ExchangeGachaCeilingScRsp setAvatarId(final int value) {
      bitField0_ |= 0x00000001;
      avatarId = value;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 3;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 retcode = 3;</code>
     * @return this
     */
    public ExchangeGachaCeilingScRsp clearRetcode() {
      bitField0_ &= ~0x00000002;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 3;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 3;</code>
     * @param value the retcode to set
     * @return this
     */
    public ExchangeGachaCeilingScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000002;
      retcode = value;
      return this;
    }

    /**
     * <code>optional uint32 gacha_type = 5;</code>
     * @return whether the gachaType field is set
     */
    public boolean hasGachaType() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 gacha_type = 5;</code>
     * @return this
     */
    public ExchangeGachaCeilingScRsp clearGachaType() {
      bitField0_ &= ~0x00000004;
      gachaType = 0;
      return this;
    }

    /**
     * <code>optional uint32 gacha_type = 5;</code>
     * @return the gachaType
     */
    public int getGachaType() {
      return gachaType;
    }

    /**
     * <code>optional uint32 gacha_type = 5;</code>
     * @param value the gachaType to set
     * @return this
     */
    public ExchangeGachaCeilingScRsp setGachaType(final int value) {
      bitField0_ |= 0x00000004;
      gachaType = value;
      return this;
    }

    /**
     * <code>optional .ItemList transfer_item_list = 8;</code>
     * @return whether the transferItemList field is set
     */
    public boolean hasTransferItemList() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional .ItemList transfer_item_list = 8;</code>
     * @return this
     */
    public ExchangeGachaCeilingScRsp clearTransferItemList() {
      bitField0_ &= ~0x00000008;
      transferItemList.clear();
      return this;
    }

    /**
     * <code>optional .ItemList transfer_item_list = 8;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableTransferItemList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public ItemListOuterClass.ItemList getTransferItemList() {
      return transferItemList;
    }

    /**
     * <code>optional .ItemList transfer_item_list = 8;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public ItemListOuterClass.ItemList getMutableTransferItemList() {
      bitField0_ |= 0x00000008;
      return transferItemList;
    }

    /**
     * <code>optional .ItemList transfer_item_list = 8;</code>
     * @param value the transferItemList to set
     * @return this
     */
    public ExchangeGachaCeilingScRsp setTransferItemList(final ItemListOuterClass.ItemList value) {
      bitField0_ |= 0x00000008;
      transferItemList.copyFrom(value);
      return this;
    }

    /**
     * <code>optional .GachaCeiling gacha_ceiling = 9;</code>
     * @return whether the gachaCeiling field is set
     */
    public boolean hasGachaCeiling() {
      return (bitField0_ & 0x00000010) != 0;
    }

    /**
     * <code>optional .GachaCeiling gacha_ceiling = 9;</code>
     * @return this
     */
    public ExchangeGachaCeilingScRsp clearGachaCeiling() {
      bitField0_ &= ~0x00000010;
      gachaCeiling.clear();
      return this;
    }

    /**
     * <code>optional .GachaCeiling gacha_ceiling = 9;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableGachaCeiling()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public GachaCeilingOuterClass.GachaCeiling getGachaCeiling() {
      return gachaCeiling;
    }

    /**
     * <code>optional .GachaCeiling gacha_ceiling = 9;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public GachaCeilingOuterClass.GachaCeiling getMutableGachaCeiling() {
      bitField0_ |= 0x00000010;
      return gachaCeiling;
    }

    /**
     * <code>optional .GachaCeiling gacha_ceiling = 9;</code>
     * @param value the gachaCeiling to set
     * @return this
     */
    public ExchangeGachaCeilingScRsp setGachaCeiling(
        final GachaCeilingOuterClass.GachaCeiling value) {
      bitField0_ |= 0x00000010;
      gachaCeiling.copyFrom(value);
      return this;
    }

    @Override
    public ExchangeGachaCeilingScRsp copyFrom(final ExchangeGachaCeilingScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        avatarId = other.avatarId;
        retcode = other.retcode;
        gachaType = other.gachaType;
        transferItemList.copyFrom(other.transferItemList);
        gachaCeiling.copyFrom(other.gachaCeiling);
      }
      return this;
    }

    @Override
    public ExchangeGachaCeilingScRsp mergeFrom(final ExchangeGachaCeilingScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasAvatarId()) {
        setAvatarId(other.avatarId);
      }
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasGachaType()) {
        setGachaType(other.gachaType);
      }
      if (other.hasTransferItemList()) {
        getMutableTransferItemList().mergeFrom(other.transferItemList);
      }
      if (other.hasGachaCeiling()) {
        getMutableGachaCeiling().mergeFrom(other.gachaCeiling);
      }
      return this;
    }

    @Override
    public ExchangeGachaCeilingScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      avatarId = 0;
      retcode = 0;
      gachaType = 0;
      transferItemList.clear();
      gachaCeiling.clear();
      return this;
    }

    @Override
    public ExchangeGachaCeilingScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      transferItemList.clearQuick();
      gachaCeiling.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof ExchangeGachaCeilingScRsp)) {
        return false;
      }
      ExchangeGachaCeilingScRsp other = (ExchangeGachaCeilingScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasAvatarId() || avatarId == other.avatarId)
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasGachaType() || gachaType == other.gachaType)
        && (!hasTransferItemList() || transferItemList.equals(other.transferItemList))
        && (!hasGachaCeiling() || gachaCeiling.equals(other.gachaCeiling));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 8);
        output.writeUInt32NoTag(avatarId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 24);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 40);
        output.writeUInt32NoTag(gachaType);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 66);
        output.writeMessageNoTag(transferItemList);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeRawByte((byte) 74);
        output.writeMessageNoTag(gachaCeiling);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(avatarId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(gachaType);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(transferItemList);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(gachaCeiling);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public ExchangeGachaCeilingScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 8: {
            // avatarId
            avatarId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 24) {
              break;
            }
          }
          case 24: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 40) {
              break;
            }
          }
          case 40: {
            // gachaType
            gachaType = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 66) {
              break;
            }
          }
          case 66: {
            // transferItemList
            input.readMessage(transferItemList);
            bitField0_ |= 0x00000008;
            tag = input.readTag();
            if (tag != 74) {
              break;
            }
          }
          case 74: {
            // gachaCeiling
            input.readMessage(gachaCeiling);
            bitField0_ |= 0x00000010;
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
        output.writeUInt32(FieldNames.avatarId, avatarId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.gachaType, gachaType);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeMessage(FieldNames.transferItemList, transferItemList);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeMessage(FieldNames.gachaCeiling, gachaCeiling);
      }
      output.endObject();
    }

    @Override
    public ExchangeGachaCeilingScRsp mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1787287636:
          case -428636735: {
            if (input.isAtField(FieldNames.avatarId)) {
              if (!input.trySkipNullValue()) {
                avatarId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1097936398: {
            if (input.isAtField(FieldNames.retcode)) {
              if (!input.trySkipNullValue()) {
                retcode = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 802848732:
          case -871474217: {
            if (input.isAtField(FieldNames.gachaType)) {
              if (!input.trySkipNullValue()) {
                gachaType = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -997597348:
          case 263056118: {
            if (input.isAtField(FieldNames.transferItemList)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(transferItemList);
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 507275483:
          case -1792489728: {
            if (input.isAtField(FieldNames.gachaCeiling)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(gachaCeiling);
                bitField0_ |= 0x00000010;
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
    public ExchangeGachaCeilingScRsp clone() {
      return new ExchangeGachaCeilingScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static ExchangeGachaCeilingScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new ExchangeGachaCeilingScRsp(), data).checkInitialized();
    }

    public static ExchangeGachaCeilingScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ExchangeGachaCeilingScRsp(), input).checkInitialized();
    }

    public static ExchangeGachaCeilingScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ExchangeGachaCeilingScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating ExchangeGachaCeilingScRsp messages
     */
    public static MessageFactory<ExchangeGachaCeilingScRsp> getFactory() {
      return ExchangeGachaCeilingScRspFactory.INSTANCE;
    }

    private enum ExchangeGachaCeilingScRspFactory implements MessageFactory<ExchangeGachaCeilingScRsp> {
      INSTANCE;

      @Override
      public ExchangeGachaCeilingScRsp create() {
        return ExchangeGachaCeilingScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName avatarId = FieldName.forField("avatarId", "avatar_id");

      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName gachaType = FieldName.forField("gachaType", "gacha_type");

      static final FieldName transferItemList = FieldName.forField("transferItemList", "transfer_item_list");

      static final FieldName gachaCeiling = FieldName.forField("gachaCeiling", "gacha_ceiling");
    }
  }
}
