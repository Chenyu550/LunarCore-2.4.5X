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

public final class RelicRecommendCsReqOuterClass {
  /**
   * Protobuf type {@code RelicRecommendCsReq}
   */
  public static final class RelicRecommendCsReq extends ProtoMessage<RelicRecommendCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 avatar_id = 10;</code>
     */
    private int avatarId;

    private RelicRecommendCsReq() {
    }

    /**
     * @return a new empty instance of {@code RelicRecommendCsReq}
     */
    public static RelicRecommendCsReq newInstance() {
      return new RelicRecommendCsReq();
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 avatar_id = 10;</code>
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
     * <code>optional uint32 avatar_id = 10;</code>
     * @return this
     */
    public RelicRecommendCsReq clearAvatarId() {
      bitField0_ &= ~0x00000001;
      avatarId = 0;
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 avatar_id = 10;</code>
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
     * <code>optional uint32 avatar_id = 10;</code>
     * @param value the avatarId to set
     * @return this
     */
    public RelicRecommendCsReq setAvatarId(final int value) {
      bitField0_ |= 0x00000001;
      avatarId = value;
      return this;
    }

    @Override
    public RelicRecommendCsReq copyFrom(final RelicRecommendCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        avatarId = other.avatarId;
      }
      return this;
    }

    @Override
    public RelicRecommendCsReq mergeFrom(final RelicRecommendCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasAvatarId()) {
        setAvatarId(other.avatarId);
      }
      return this;
    }

    @Override
    public RelicRecommendCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      avatarId = 0;
      return this;
    }

    @Override
    public RelicRecommendCsReq clearQuick() {
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
      if (!(o instanceof RelicRecommendCsReq)) {
        return false;
      }
      RelicRecommendCsReq other = (RelicRecommendCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasAvatarId() || avatarId == other.avatarId);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 80);
        output.writeUInt32NoTag(avatarId);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(avatarId);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public RelicRecommendCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 80: {
            // avatarId
            avatarId = input.readUInt32();
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
        output.writeUInt32(FieldNames.avatarId, avatarId);
      }
      output.endObject();
    }

    @Override
    public RelicRecommendCsReq mergeFrom(final JsonSource input) throws IOException {
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
    public RelicRecommendCsReq clone() {
      return new RelicRecommendCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static RelicRecommendCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new RelicRecommendCsReq(), data).checkInitialized();
    }

    public static RelicRecommendCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RelicRecommendCsReq(), input).checkInitialized();
    }

    public static RelicRecommendCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RelicRecommendCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating RelicRecommendCsReq messages
     */
    public static MessageFactory<RelicRecommendCsReq> getFactory() {
      return RelicRecommendCsReqFactory.INSTANCE;
    }

    private enum RelicRecommendCsReqFactory implements MessageFactory<RelicRecommendCsReq> {
      INSTANCE;

      @Override
      public RelicRecommendCsReq create() {
        return RelicRecommendCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName avatarId = FieldName.forField("avatarId", "avatar_id");
    }
  }
}
