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

public final class RogueRerollBuffOuterClass {
  /**
   * Protobuf type {@code RogueRerollBuff}
   */
  public static final class RogueRerollBuff extends ProtoMessage<RogueRerollBuff> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional .RogueCommonBuffSelectInfo buff_select_info = 15;</code>
     */
    private final RogueCommonBuffSelectInfoOuterClass.RogueCommonBuffSelectInfo buffSelectInfo = RogueCommonBuffSelectInfoOuterClass.RogueCommonBuffSelectInfo.newInstance();

    private RogueRerollBuff() {
    }

    /**
     * @return a new empty instance of {@code RogueRerollBuff}
     */
    public static RogueRerollBuff newInstance() {
      return new RogueRerollBuff();
    }

    /**
     * <code>optional .RogueCommonBuffSelectInfo buff_select_info = 15;</code>
     * @return whether the buffSelectInfo field is set
     */
    public boolean hasBuffSelectInfo() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional .RogueCommonBuffSelectInfo buff_select_info = 15;</code>
     * @return this
     */
    public RogueRerollBuff clearBuffSelectInfo() {
      bitField0_ &= ~0x00000001;
      buffSelectInfo.clear();
      return this;
    }

    /**
     * <code>optional .RogueCommonBuffSelectInfo buff_select_info = 15;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableBuffSelectInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RogueCommonBuffSelectInfoOuterClass.RogueCommonBuffSelectInfo getBuffSelectInfo() {
      return buffSelectInfo;
    }

    /**
     * <code>optional .RogueCommonBuffSelectInfo buff_select_info = 15;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RogueCommonBuffSelectInfoOuterClass.RogueCommonBuffSelectInfo getMutableBuffSelectInfo(
        ) {
      bitField0_ |= 0x00000001;
      return buffSelectInfo;
    }

    /**
     * <code>optional .RogueCommonBuffSelectInfo buff_select_info = 15;</code>
     * @param value the buffSelectInfo to set
     * @return this
     */
    public RogueRerollBuff setBuffSelectInfo(
        final RogueCommonBuffSelectInfoOuterClass.RogueCommonBuffSelectInfo value) {
      bitField0_ |= 0x00000001;
      buffSelectInfo.copyFrom(value);
      return this;
    }

    @Override
    public RogueRerollBuff copyFrom(final RogueRerollBuff other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        buffSelectInfo.copyFrom(other.buffSelectInfo);
      }
      return this;
    }

    @Override
    public RogueRerollBuff mergeFrom(final RogueRerollBuff other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasBuffSelectInfo()) {
        getMutableBuffSelectInfo().mergeFrom(other.buffSelectInfo);
      }
      return this;
    }

    @Override
    public RogueRerollBuff clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      buffSelectInfo.clear();
      return this;
    }

    @Override
    public RogueRerollBuff clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      buffSelectInfo.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof RogueRerollBuff)) {
        return false;
      }
      RogueRerollBuff other = (RogueRerollBuff) o;
      return bitField0_ == other.bitField0_
        && (!hasBuffSelectInfo() || buffSelectInfo.equals(other.buffSelectInfo));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 122);
        output.writeMessageNoTag(buffSelectInfo);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(buffSelectInfo);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public RogueRerollBuff mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 122: {
            // buffSelectInfo
            input.readMessage(buffSelectInfo);
            bitField0_ |= 0x00000001;
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
        output.writeMessage(FieldNames.buffSelectInfo, buffSelectInfo);
      }
      output.endObject();
    }

    @Override
    public RogueRerollBuff mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -255242115:
          case 1500540965: {
            if (input.isAtField(FieldNames.buffSelectInfo)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(buffSelectInfo);
                bitField0_ |= 0x00000001;
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
    public RogueRerollBuff clone() {
      return new RogueRerollBuff().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static RogueRerollBuff parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new RogueRerollBuff(), data).checkInitialized();
    }

    public static RogueRerollBuff parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueRerollBuff(), input).checkInitialized();
    }

    public static RogueRerollBuff parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueRerollBuff(), input).checkInitialized();
    }

    /**
     * @return factory for creating RogueRerollBuff messages
     */
    public static MessageFactory<RogueRerollBuff> getFactory() {
      return RogueRerollBuffFactory.INSTANCE;
    }

    private enum RogueRerollBuffFactory implements MessageFactory<RogueRerollBuff> {
      INSTANCE;

      @Override
      public RogueRerollBuff create() {
        return RogueRerollBuff.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName buffSelectInfo = FieldName.forField("buffSelectInfo", "buff_select_info");
    }
  }
}
