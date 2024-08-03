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

public final class ReEnterLastElementStageCsReqOuterClass {
  /**
   * Protobuf type {@code ReEnterLastElementStageCsReq}
   */
  public static final class ReEnterLastElementStageCsReq extends ProtoMessage<ReEnterLastElementStageCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 stage_id = 1;</code>
     */
    private int stageId;

    private ReEnterLastElementStageCsReq() {
    }

    /**
     * @return a new empty instance of {@code ReEnterLastElementStageCsReq}
     */
    public static ReEnterLastElementStageCsReq newInstance() {
      return new ReEnterLastElementStageCsReq();
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 stage_id = 1;</code>
     * @return whether the stageId field is set
     */
    public boolean hasStageId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 stage_id = 1;</code>
     * @return this
     */
    public ReEnterLastElementStageCsReq clearStageId() {
      bitField0_ &= ~0x00000001;
      stageId = 0;
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 stage_id = 1;</code>
     * @return the stageId
     */
    public int getStageId() {
      return stageId;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 stage_id = 1;</code>
     * @param value the stageId to set
     * @return this
     */
    public ReEnterLastElementStageCsReq setStageId(final int value) {
      bitField0_ |= 0x00000001;
      stageId = value;
      return this;
    }

    @Override
    public ReEnterLastElementStageCsReq copyFrom(final ReEnterLastElementStageCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        stageId = other.stageId;
      }
      return this;
    }

    @Override
    public ReEnterLastElementStageCsReq mergeFrom(final ReEnterLastElementStageCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasStageId()) {
        setStageId(other.stageId);
      }
      return this;
    }

    @Override
    public ReEnterLastElementStageCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      stageId = 0;
      return this;
    }

    @Override
    public ReEnterLastElementStageCsReq clearQuick() {
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
      if (!(o instanceof ReEnterLastElementStageCsReq)) {
        return false;
      }
      ReEnterLastElementStageCsReq other = (ReEnterLastElementStageCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasStageId() || stageId == other.stageId);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 8);
        output.writeUInt32NoTag(stageId);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(stageId);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public ReEnterLastElementStageCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 8: {
            // stageId
            stageId = input.readUInt32();
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
        output.writeUInt32(FieldNames.stageId, stageId);
      }
      output.endObject();
    }

    @Override
    public ReEnterLastElementStageCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1897528135:
          case 1306191356: {
            if (input.isAtField(FieldNames.stageId)) {
              if (!input.trySkipNullValue()) {
                stageId = input.readUInt32();
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
    public ReEnterLastElementStageCsReq clone() {
      return new ReEnterLastElementStageCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static ReEnterLastElementStageCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new ReEnterLastElementStageCsReq(), data).checkInitialized();
    }

    public static ReEnterLastElementStageCsReq parseFrom(final ProtoSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new ReEnterLastElementStageCsReq(), input).checkInitialized();
    }

    public static ReEnterLastElementStageCsReq parseFrom(final JsonSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new ReEnterLastElementStageCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating ReEnterLastElementStageCsReq messages
     */
    public static MessageFactory<ReEnterLastElementStageCsReq> getFactory() {
      return ReEnterLastElementStageCsReqFactory.INSTANCE;
    }

    private enum ReEnterLastElementStageCsReqFactory implements MessageFactory<ReEnterLastElementStageCsReq> {
      INSTANCE;

      @Override
      public ReEnterLastElementStageCsReq create() {
        return ReEnterLastElementStageCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName stageId = FieldName.forField("stageId", "stage_id");
    }
  }
}
