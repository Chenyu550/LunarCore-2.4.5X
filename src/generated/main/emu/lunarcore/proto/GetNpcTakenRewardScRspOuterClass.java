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

public final class GetNpcTakenRewardScRspOuterClass {
  /**
   * Protobuf type {@code GetNpcTakenRewardScRsp}
   */
  public static final class GetNpcTakenRewardScRsp extends ProtoMessage<GetNpcTakenRewardScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 5;</code>
     */
    private int retcode;

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 npc_id = 14;</code>
     */
    private int npcId;

    private GetNpcTakenRewardScRsp() {
    }

    /**
     * @return a new empty instance of {@code GetNpcTakenRewardScRsp}
     */
    public static GetNpcTakenRewardScRsp newInstance() {
      return new GetNpcTakenRewardScRsp();
    }

    /**
     * <code>optional uint32 retcode = 5;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 retcode = 5;</code>
     * @return this
     */
    public GetNpcTakenRewardScRsp clearRetcode() {
      bitField0_ &= ~0x00000001;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 5;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 5;</code>
     * @param value the retcode to set
     * @return this
     */
    public GetNpcTakenRewardScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 npc_id = 14;</code>
     * @return whether the npcId field is set
     */
    public boolean hasNpcId() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 npc_id = 14;</code>
     * @return this
     */
    public GetNpcTakenRewardScRsp clearNpcId() {
      bitField0_ &= ~0x00000002;
      npcId = 0;
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 npc_id = 14;</code>
     * @return the npcId
     */
    public int getNpcId() {
      return npcId;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 npc_id = 14;</code>
     * @param value the npcId to set
     * @return this
     */
    public GetNpcTakenRewardScRsp setNpcId(final int value) {
      bitField0_ |= 0x00000002;
      npcId = value;
      return this;
    }

    @Override
    public GetNpcTakenRewardScRsp copyFrom(final GetNpcTakenRewardScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        npcId = other.npcId;
      }
      return this;
    }

    @Override
    public GetNpcTakenRewardScRsp mergeFrom(final GetNpcTakenRewardScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasNpcId()) {
        setNpcId(other.npcId);
      }
      return this;
    }

    @Override
    public GetNpcTakenRewardScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      npcId = 0;
      return this;
    }

    @Override
    public GetNpcTakenRewardScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof GetNpcTakenRewardScRsp)) {
        return false;
      }
      GetNpcTakenRewardScRsp other = (GetNpcTakenRewardScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasNpcId() || npcId == other.npcId);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 40);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 112);
        output.writeUInt32NoTag(npcId);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(npcId);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public GetNpcTakenRewardScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 40: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 112) {
              break;
            }
          }
          case 112: {
            // npcId
            npcId = input.readUInt32();
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
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.npcId, npcId);
      }
      output.endObject();
    }

    @Override
    public GetNpcTakenRewardScRsp mergeFrom(final JsonSource input) throws IOException {
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
          case 105021404:
          case -1039282375: {
            if (input.isAtField(FieldNames.npcId)) {
              if (!input.trySkipNullValue()) {
                npcId = input.readUInt32();
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
    public GetNpcTakenRewardScRsp clone() {
      return new GetNpcTakenRewardScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static GetNpcTakenRewardScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new GetNpcTakenRewardScRsp(), data).checkInitialized();
    }

    public static GetNpcTakenRewardScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetNpcTakenRewardScRsp(), input).checkInitialized();
    }

    public static GetNpcTakenRewardScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetNpcTakenRewardScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating GetNpcTakenRewardScRsp messages
     */
    public static MessageFactory<GetNpcTakenRewardScRsp> getFactory() {
      return GetNpcTakenRewardScRspFactory.INSTANCE;
    }

    private enum GetNpcTakenRewardScRspFactory implements MessageFactory<GetNpcTakenRewardScRsp> {
      INSTANCE;

      @Override
      public GetNpcTakenRewardScRsp create() {
        return GetNpcTakenRewardScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName npcId = FieldName.forField("npcId", "npc_id");
    }
  }
}
