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

public final class SelectChatBubbleScRspOuterClass {
  /**
   * Protobuf type {@code SelectChatBubbleScRsp}
   */
  public static final class SelectChatBubbleScRsp extends ProtoMessage<SelectChatBubbleScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 cur_chat_bubble = 2;</code>
     */
    private int curChatBubble;

    /**
     * <code>optional uint32 PMCGOBLJNJJ = 3;</code>
     */
    private int pMCGOBLJNJJ;

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 retcode = 11;</code>
     */
    private int retcode;

    private SelectChatBubbleScRsp() {
    }

    /**
     * @return a new empty instance of {@code SelectChatBubbleScRsp}
     */
    public static SelectChatBubbleScRsp newInstance() {
      return new SelectChatBubbleScRsp();
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 cur_chat_bubble = 2;</code>
     * @return whether the curChatBubble field is set
     */
    public boolean hasCurChatBubble() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 cur_chat_bubble = 2;</code>
     * @return this
     */
    public SelectChatBubbleScRsp clearCurChatBubble() {
      bitField0_ &= ~0x00000001;
      curChatBubble = 0;
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 cur_chat_bubble = 2;</code>
     * @return the curChatBubble
     */
    public int getCurChatBubble() {
      return curChatBubble;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 cur_chat_bubble = 2;</code>
     * @param value the curChatBubble to set
     * @return this
     */
    public SelectChatBubbleScRsp setCurChatBubble(final int value) {
      bitField0_ |= 0x00000001;
      curChatBubble = value;
      return this;
    }

    /**
     * <code>optional uint32 PMCGOBLJNJJ = 3;</code>
     * @return whether the pMCGOBLJNJJ field is set
     */
    public boolean hasPMCGOBLJNJJ() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 PMCGOBLJNJJ = 3;</code>
     * @return this
     */
    public SelectChatBubbleScRsp clearPMCGOBLJNJJ() {
      bitField0_ &= ~0x00000002;
      pMCGOBLJNJJ = 0;
      return this;
    }

    /**
     * <code>optional uint32 PMCGOBLJNJJ = 3;</code>
     * @return the pMCGOBLJNJJ
     */
    public int getPMCGOBLJNJJ() {
      return pMCGOBLJNJJ;
    }

    /**
     * <code>optional uint32 PMCGOBLJNJJ = 3;</code>
     * @param value the pMCGOBLJNJJ to set
     * @return this
     */
    public SelectChatBubbleScRsp setPMCGOBLJNJJ(final int value) {
      bitField0_ |= 0x00000002;
      pMCGOBLJNJJ = value;
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 retcode = 11;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 retcode = 11;</code>
     * @return this
     */
    public SelectChatBubbleScRsp clearRetcode() {
      bitField0_ &= ~0x00000004;
      retcode = 0;
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 retcode = 11;</code>
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
     * <code>optional uint32 retcode = 11;</code>
     * @param value the retcode to set
     * @return this
     */
    public SelectChatBubbleScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000004;
      retcode = value;
      return this;
    }

    @Override
    public SelectChatBubbleScRsp copyFrom(final SelectChatBubbleScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        curChatBubble = other.curChatBubble;
        pMCGOBLJNJJ = other.pMCGOBLJNJJ;
        retcode = other.retcode;
      }
      return this;
    }

    @Override
    public SelectChatBubbleScRsp mergeFrom(final SelectChatBubbleScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasCurChatBubble()) {
        setCurChatBubble(other.curChatBubble);
      }
      if (other.hasPMCGOBLJNJJ()) {
        setPMCGOBLJNJJ(other.pMCGOBLJNJJ);
      }
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      return this;
    }

    @Override
    public SelectChatBubbleScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      curChatBubble = 0;
      pMCGOBLJNJJ = 0;
      retcode = 0;
      return this;
    }

    @Override
    public SelectChatBubbleScRsp clearQuick() {
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
      if (!(o instanceof SelectChatBubbleScRsp)) {
        return false;
      }
      SelectChatBubbleScRsp other = (SelectChatBubbleScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasCurChatBubble() || curChatBubble == other.curChatBubble)
        && (!hasPMCGOBLJNJJ() || pMCGOBLJNJJ == other.pMCGOBLJNJJ)
        && (!hasRetcode() || retcode == other.retcode);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 16);
        output.writeUInt32NoTag(curChatBubble);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 24);
        output.writeUInt32NoTag(pMCGOBLJNJJ);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 88);
        output.writeUInt32NoTag(retcode);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(curChatBubble);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(pMCGOBLJNJJ);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public SelectChatBubbleScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 16: {
            // curChatBubble
            curChatBubble = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 24) {
              break;
            }
          }
          case 24: {
            // pMCGOBLJNJJ
            pMCGOBLJNJJ = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 88) {
              break;
            }
          }
          case 88: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000004;
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
        output.writeUInt32(FieldNames.curChatBubble, curChatBubble);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.pMCGOBLJNJJ, pMCGOBLJNJJ);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      output.endObject();
    }

    @Override
    public SelectChatBubbleScRsp mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 94167140:
          case 1828957140: {
            if (input.isAtField(FieldNames.curChatBubble)) {
              if (!input.trySkipNullValue()) {
                curChatBubble = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1726566300: {
            if (input.isAtField(FieldNames.pMCGOBLJNJJ)) {
              if (!input.trySkipNullValue()) {
                pMCGOBLJNJJ = input.readUInt32();
                bitField0_ |= 0x00000002;
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
                bitField0_ |= 0x00000004;
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
    public SelectChatBubbleScRsp clone() {
      return new SelectChatBubbleScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static SelectChatBubbleScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new SelectChatBubbleScRsp(), data).checkInitialized();
    }

    public static SelectChatBubbleScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SelectChatBubbleScRsp(), input).checkInitialized();
    }

    public static SelectChatBubbleScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SelectChatBubbleScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating SelectChatBubbleScRsp messages
     */
    public static MessageFactory<SelectChatBubbleScRsp> getFactory() {
      return SelectChatBubbleScRspFactory.INSTANCE;
    }

    private enum SelectChatBubbleScRspFactory implements MessageFactory<SelectChatBubbleScRsp> {
      INSTANCE;

      @Override
      public SelectChatBubbleScRsp create() {
        return SelectChatBubbleScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName curChatBubble = FieldName.forField("curChatBubble", "cur_chat_bubble");

      static final FieldName pMCGOBLJNJJ = FieldName.forField("PMCGOBLJNJJ");

      static final FieldName retcode = FieldName.forField("retcode");
    }
  }
}
