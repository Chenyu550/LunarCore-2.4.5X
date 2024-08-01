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

public final class GetRollShopInfoScRspOuterClass {
  /**
   * Protobuf type {@code GetRollShopInfoScRsp}
   */
  public static final class GetRollShopInfoScRsp extends ProtoMessage<GetRollShopInfoScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 retcode = 8;</code>
     */
    private int retcode;

    /**
     * <pre>
     *  gacha_random
     * </pre>
     *
     * <code>optional uint32 BBJIJINJAFK = 9;</code>
     */
    private int bBJIJINJAFK;

    /**
     * <code>optional uint32 roll_shop_id = 15;</code>
     */
    private int rollShopId;

    /**
     * <code>repeated uint32 DLPBJMPECFC = 11;</code>
     */
    private final RepeatedInt dLPBJMPECFC = RepeatedInt.newEmptyInstance();

    private GetRollShopInfoScRsp() {
    }

    /**
     * @return a new empty instance of {@code GetRollShopInfoScRsp}
     */
    public static GetRollShopInfoScRsp newInstance() {
      return new GetRollShopInfoScRsp();
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 retcode = 8;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 retcode = 8;</code>
     * @return this
     */
    public GetRollShopInfoScRsp clearRetcode() {
      bitField0_ &= ~0x00000001;
      retcode = 0;
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 retcode = 8;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 retcode = 8;</code>
     * @param value the retcode to set
     * @return this
     */
    public GetRollShopInfoScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <pre>
     *  gacha_random
     * </pre>
     *
     * <code>optional uint32 BBJIJINJAFK = 9;</code>
     * @return whether the bBJIJINJAFK field is set
     */
    public boolean hasBBJIJINJAFK() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <pre>
     *  gacha_random
     * </pre>
     *
     * <code>optional uint32 BBJIJINJAFK = 9;</code>
     * @return this
     */
    public GetRollShopInfoScRsp clearBBJIJINJAFK() {
      bitField0_ &= ~0x00000002;
      bBJIJINJAFK = 0;
      return this;
    }

    /**
     * <pre>
     *  gacha_random
     * </pre>
     *
     * <code>optional uint32 BBJIJINJAFK = 9;</code>
     * @return the bBJIJINJAFK
     */
    public int getBBJIJINJAFK() {
      return bBJIJINJAFK;
    }

    /**
     * <pre>
     *  gacha_random
     * </pre>
     *
     * <code>optional uint32 BBJIJINJAFK = 9;</code>
     * @param value the bBJIJINJAFK to set
     * @return this
     */
    public GetRollShopInfoScRsp setBBJIJINJAFK(final int value) {
      bitField0_ |= 0x00000002;
      bBJIJINJAFK = value;
      return this;
    }

    /**
     * <code>optional uint32 roll_shop_id = 15;</code>
     * @return whether the rollShopId field is set
     */
    public boolean hasRollShopId() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 roll_shop_id = 15;</code>
     * @return this
     */
    public GetRollShopInfoScRsp clearRollShopId() {
      bitField0_ &= ~0x00000004;
      rollShopId = 0;
      return this;
    }

    /**
     * <code>optional uint32 roll_shop_id = 15;</code>
     * @return the rollShopId
     */
    public int getRollShopId() {
      return rollShopId;
    }

    /**
     * <code>optional uint32 roll_shop_id = 15;</code>
     * @param value the rollShopId to set
     * @return this
     */
    public GetRollShopInfoScRsp setRollShopId(final int value) {
      bitField0_ |= 0x00000004;
      rollShopId = value;
      return this;
    }

    /**
     * <code>repeated uint32 DLPBJMPECFC = 11;</code>
     * @return whether the dLPBJMPECFC field is set
     */
    public boolean hasDLPBJMPECFC() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>repeated uint32 DLPBJMPECFC = 11;</code>
     * @return this
     */
    public GetRollShopInfoScRsp clearDLPBJMPECFC() {
      bitField0_ &= ~0x00000008;
      dLPBJMPECFC.clear();
      return this;
    }

    /**
     * <code>repeated uint32 DLPBJMPECFC = 11;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableDLPBJMPECFC()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedInt getDLPBJMPECFC() {
      return dLPBJMPECFC;
    }

    /**
     * <code>repeated uint32 DLPBJMPECFC = 11;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedInt getMutableDLPBJMPECFC() {
      bitField0_ |= 0x00000008;
      return dLPBJMPECFC;
    }

    /**
     * <code>repeated uint32 DLPBJMPECFC = 11;</code>
     * @param value the dLPBJMPECFC to add
     * @return this
     */
    public GetRollShopInfoScRsp addDLPBJMPECFC(final int value) {
      bitField0_ |= 0x00000008;
      dLPBJMPECFC.add(value);
      return this;
    }

    /**
     * <code>repeated uint32 DLPBJMPECFC = 11;</code>
     * @param values the dLPBJMPECFC to add
     * @return this
     */
    public GetRollShopInfoScRsp addAllDLPBJMPECFC(final int... values) {
      bitField0_ |= 0x00000008;
      dLPBJMPECFC.addAll(values);
      return this;
    }

    @Override
    public GetRollShopInfoScRsp copyFrom(final GetRollShopInfoScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        bBJIJINJAFK = other.bBJIJINJAFK;
        rollShopId = other.rollShopId;
        dLPBJMPECFC.copyFrom(other.dLPBJMPECFC);
      }
      return this;
    }

    @Override
    public GetRollShopInfoScRsp mergeFrom(final GetRollShopInfoScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasBBJIJINJAFK()) {
        setBBJIJINJAFK(other.bBJIJINJAFK);
      }
      if (other.hasRollShopId()) {
        setRollShopId(other.rollShopId);
      }
      if (other.hasDLPBJMPECFC()) {
        getMutableDLPBJMPECFC().addAll(other.dLPBJMPECFC);
      }
      return this;
    }

    @Override
    public GetRollShopInfoScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      bBJIJINJAFK = 0;
      rollShopId = 0;
      dLPBJMPECFC.clear();
      return this;
    }

    @Override
    public GetRollShopInfoScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      dLPBJMPECFC.clear();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof GetRollShopInfoScRsp)) {
        return false;
      }
      GetRollShopInfoScRsp other = (GetRollShopInfoScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasBBJIJINJAFK() || bBJIJINJAFK == other.bBJIJINJAFK)
        && (!hasRollShopId() || rollShopId == other.rollShopId)
        && (!hasDLPBJMPECFC() || dLPBJMPECFC.equals(other.dLPBJMPECFC));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 64);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 72);
        output.writeUInt32NoTag(bBJIJINJAFK);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 120);
        output.writeUInt32NoTag(rollShopId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        for (int i = 0; i < dLPBJMPECFC.length(); i++) {
          output.writeRawByte((byte) 88);
          output.writeUInt32NoTag(dLPBJMPECFC.array()[i]);
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(bBJIJINJAFK);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(rollShopId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += (1 * dLPBJMPECFC.length()) + ProtoSink.computeRepeatedUInt32SizeNoTag(dLPBJMPECFC);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public GetRollShopInfoScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 64: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 72) {
              break;
            }
          }
          case 72: {
            // bBJIJINJAFK
            bBJIJINJAFK = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 120) {
              break;
            }
          }
          case 120: {
            // rollShopId
            rollShopId = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 90) {
              break;
            }
          }
          case 90: {
            // dLPBJMPECFC [packed=true]
            input.readPackedUInt32(dLPBJMPECFC, tag);
            bitField0_ |= 0x00000008;
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
          case 88: {
            // dLPBJMPECFC [packed=false]
            tag = input.readRepeatedUInt32(dLPBJMPECFC, tag);
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
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.bBJIJINJAFK, bBJIJINJAFK);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.rollShopId, rollShopId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRepeatedUInt32(FieldNames.dLPBJMPECFC, dLPBJMPECFC);
      }
      output.endObject();
    }

    @Override
    public GetRollShopInfoScRsp mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1097936398: {
            if (input.isAtField(FieldNames.retcode)) {
              if (!input.trySkipNullValue()) {
                retcode = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1536175796: {
            if (input.isAtField(FieldNames.bBJIJINJAFK)) {
              if (!input.trySkipNullValue()) {
                bBJIJINJAFK = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -904898162:
          case -1612413630: {
            if (input.isAtField(FieldNames.rollShopId)) {
              if (!input.trySkipNullValue()) {
                rollShopId = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 41374990: {
            if (input.isAtField(FieldNames.dLPBJMPECFC)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedUInt32(dLPBJMPECFC);
                bitField0_ |= 0x00000008;
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
    public GetRollShopInfoScRsp clone() {
      return new GetRollShopInfoScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static GetRollShopInfoScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new GetRollShopInfoScRsp(), data).checkInitialized();
    }

    public static GetRollShopInfoScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetRollShopInfoScRsp(), input).checkInitialized();
    }

    public static GetRollShopInfoScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetRollShopInfoScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating GetRollShopInfoScRsp messages
     */
    public static MessageFactory<GetRollShopInfoScRsp> getFactory() {
      return GetRollShopInfoScRspFactory.INSTANCE;
    }

    private enum GetRollShopInfoScRspFactory implements MessageFactory<GetRollShopInfoScRsp> {
      INSTANCE;

      @Override
      public GetRollShopInfoScRsp create() {
        return GetRollShopInfoScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName bBJIJINJAFK = FieldName.forField("BBJIJINJAFK");

      static final FieldName rollShopId = FieldName.forField("rollShopId", "roll_shop_id");

      static final FieldName dLPBJMPECFC = FieldName.forField("DLPBJMPECFC");
    }
  }
}
