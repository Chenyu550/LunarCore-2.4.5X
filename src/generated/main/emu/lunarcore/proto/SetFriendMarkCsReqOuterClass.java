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

public final class SetFriendMarkCsReqOuterClass {
  /**
   * Protobuf type {@code SetFriendMarkCsReq}
   */
  public static final class SetFriendMarkCsReq extends ProtoMessage<SetFriendMarkCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 uid = 15;</code>
     */
    private int uid;

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional bool is_set_mark = 11;</code>
     */
    private boolean isSetMark;

    private SetFriendMarkCsReq() {
    }

    /**
     * @return a new empty instance of {@code SetFriendMarkCsReq}
     */
    public static SetFriendMarkCsReq newInstance() {
      return new SetFriendMarkCsReq();
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 uid = 15;</code>
     * @return whether the uid field is set
     */
    public boolean hasUid() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 uid = 15;</code>
     * @return this
     */
    public SetFriendMarkCsReq clearUid() {
      bitField0_ &= ~0x00000001;
      uid = 0;
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 uid = 15;</code>
     * @return the uid
     */
    public int getUid() {
      return uid;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 uid = 15;</code>
     * @param value the uid to set
     * @return this
     */
    public SetFriendMarkCsReq setUid(final int value) {
      bitField0_ |= 0x00000001;
      uid = value;
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional bool is_set_mark = 11;</code>
     * @return whether the isSetMark field is set
     */
    public boolean hasIsSetMark() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional bool is_set_mark = 11;</code>
     * @return this
     */
    public SetFriendMarkCsReq clearIsSetMark() {
      bitField0_ &= ~0x00000002;
      isSetMark = false;
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional bool is_set_mark = 11;</code>
     * @return the isSetMark
     */
    public boolean getIsSetMark() {
      return isSetMark;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional bool is_set_mark = 11;</code>
     * @param value the isSetMark to set
     * @return this
     */
    public SetFriendMarkCsReq setIsSetMark(final boolean value) {
      bitField0_ |= 0x00000002;
      isSetMark = value;
      return this;
    }

    @Override
    public SetFriendMarkCsReq copyFrom(final SetFriendMarkCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        uid = other.uid;
        isSetMark = other.isSetMark;
      }
      return this;
    }

    @Override
    public SetFriendMarkCsReq mergeFrom(final SetFriendMarkCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasUid()) {
        setUid(other.uid);
      }
      if (other.hasIsSetMark()) {
        setIsSetMark(other.isSetMark);
      }
      return this;
    }

    @Override
    public SetFriendMarkCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      uid = 0;
      isSetMark = false;
      return this;
    }

    @Override
    public SetFriendMarkCsReq clearQuick() {
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
      if (!(o instanceof SetFriendMarkCsReq)) {
        return false;
      }
      SetFriendMarkCsReq other = (SetFriendMarkCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasUid() || uid == other.uid)
        && (!hasIsSetMark() || isSetMark == other.isSetMark);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 120);
        output.writeUInt32NoTag(uid);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 88);
        output.writeBoolNoTag(isSetMark);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(uid);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 2;
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public SetFriendMarkCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 120: {
            // uid
            uid = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 88) {
              break;
            }
          }
          case 88: {
            // isSetMark
            isSetMark = input.readBool();
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
        output.writeUInt32(FieldNames.uid, uid);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeBool(FieldNames.isSetMark, isSetMark);
      }
      output.endObject();
    }

    @Override
    public SetFriendMarkCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 115792: {
            if (input.isAtField(FieldNames.uid)) {
              if (!input.trySkipNullValue()) {
                uid = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1404992965:
          case 680313855: {
            if (input.isAtField(FieldNames.isSetMark)) {
              if (!input.trySkipNullValue()) {
                isSetMark = input.readBool();
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
    public SetFriendMarkCsReq clone() {
      return new SetFriendMarkCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static SetFriendMarkCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new SetFriendMarkCsReq(), data).checkInitialized();
    }

    public static SetFriendMarkCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SetFriendMarkCsReq(), input).checkInitialized();
    }

    public static SetFriendMarkCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SetFriendMarkCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating SetFriendMarkCsReq messages
     */
    public static MessageFactory<SetFriendMarkCsReq> getFactory() {
      return SetFriendMarkCsReqFactory.INSTANCE;
    }

    private enum SetFriendMarkCsReqFactory implements MessageFactory<SetFriendMarkCsReq> {
      INSTANCE;

      @Override
      public SetFriendMarkCsReq create() {
        return SetFriendMarkCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName uid = FieldName.forField("uid");

      static final FieldName isSetMark = FieldName.forField("isSetMark", "is_set_mark");
    }
  }
}
