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

public final class MazePropOuterClass {
  /**
   * Protobuf type {@code MazeProp}
   */
  public static final class MazeProp extends ProtoMessage<MazeProp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 state = 1;</code>
     */
    private int state;

    /**
     * <code>optional uint32 config_id = 3;</code>
     */
    private int configId;

    /**
     * <code>optional uint32 group_id = 6;</code>
     */
    private int groupId;

    private MazeProp() {
    }

    /**
     * @return a new empty instance of {@code MazeProp}
     */
    public static MazeProp newInstance() {
      return new MazeProp();
    }

    /**
     * <code>optional uint32 state = 1;</code>
     * @return whether the state field is set
     */
    public boolean hasState() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 state = 1;</code>
     * @return this
     */
    public MazeProp clearState() {
      bitField0_ &= ~0x00000001;
      state = 0;
      return this;
    }

    /**
     * <code>optional uint32 state = 1;</code>
     * @return the state
     */
    public int getState() {
      return state;
    }

    /**
     * <code>optional uint32 state = 1;</code>
     * @param value the state to set
     * @return this
     */
    public MazeProp setState(final int value) {
      bitField0_ |= 0x00000001;
      state = value;
      return this;
    }

    /**
     * <code>optional uint32 config_id = 3;</code>
     * @return whether the configId field is set
     */
    public boolean hasConfigId() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 config_id = 3;</code>
     * @return this
     */
    public MazeProp clearConfigId() {
      bitField0_ &= ~0x00000002;
      configId = 0;
      return this;
    }

    /**
     * <code>optional uint32 config_id = 3;</code>
     * @return the configId
     */
    public int getConfigId() {
      return configId;
    }

    /**
     * <code>optional uint32 config_id = 3;</code>
     * @param value the configId to set
     * @return this
     */
    public MazeProp setConfigId(final int value) {
      bitField0_ |= 0x00000002;
      configId = value;
      return this;
    }

    /**
     * <code>optional uint32 group_id = 6;</code>
     * @return whether the groupId field is set
     */
    public boolean hasGroupId() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 group_id = 6;</code>
     * @return this
     */
    public MazeProp clearGroupId() {
      bitField0_ &= ~0x00000004;
      groupId = 0;
      return this;
    }

    /**
     * <code>optional uint32 group_id = 6;</code>
     * @return the groupId
     */
    public int getGroupId() {
      return groupId;
    }

    /**
     * <code>optional uint32 group_id = 6;</code>
     * @param value the groupId to set
     * @return this
     */
    public MazeProp setGroupId(final int value) {
      bitField0_ |= 0x00000004;
      groupId = value;
      return this;
    }

    @Override
    public MazeProp copyFrom(final MazeProp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        state = other.state;
        configId = other.configId;
        groupId = other.groupId;
      }
      return this;
    }

    @Override
    public MazeProp mergeFrom(final MazeProp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasState()) {
        setState(other.state);
      }
      if (other.hasConfigId()) {
        setConfigId(other.configId);
      }
      if (other.hasGroupId()) {
        setGroupId(other.groupId);
      }
      return this;
    }

    @Override
    public MazeProp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      state = 0;
      configId = 0;
      groupId = 0;
      return this;
    }

    @Override
    public MazeProp clearQuick() {
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
      if (!(o instanceof MazeProp)) {
        return false;
      }
      MazeProp other = (MazeProp) o;
      return bitField0_ == other.bitField0_
        && (!hasState() || state == other.state)
        && (!hasConfigId() || configId == other.configId)
        && (!hasGroupId() || groupId == other.groupId);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 8);
        output.writeUInt32NoTag(state);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 24);
        output.writeUInt32NoTag(configId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 48);
        output.writeUInt32NoTag(groupId);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(state);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(configId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(groupId);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public MazeProp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 8: {
            // state
            state = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 24) {
              break;
            }
          }
          case 24: {
            // configId
            configId = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 48) {
              break;
            }
          }
          case 48: {
            // groupId
            groupId = input.readUInt32();
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
        output.writeUInt32(FieldNames.state, state);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.configId, configId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.groupId, groupId);
      }
      output.endObject();
    }

    @Override
    public MazeProp mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 109757585: {
            if (input.isAtField(FieldNames.state)) {
              if (!input.trySkipNullValue()) {
                state = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -580140035:
          case -804450504: {
            if (input.isAtField(FieldNames.configId)) {
              if (!input.trySkipNullValue()) {
                configId = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 293428218:
          case 506361563: {
            if (input.isAtField(FieldNames.groupId)) {
              if (!input.trySkipNullValue()) {
                groupId = input.readUInt32();
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
    public MazeProp clone() {
      return new MazeProp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static MazeProp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new MazeProp(), data).checkInitialized();
    }

    public static MazeProp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new MazeProp(), input).checkInitialized();
    }

    public static MazeProp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new MazeProp(), input).checkInitialized();
    }

    /**
     * @return factory for creating MazeProp messages
     */
    public static MessageFactory<MazeProp> getFactory() {
      return MazePropFactory.INSTANCE;
    }

    private enum MazePropFactory implements MessageFactory<MazeProp> {
      INSTANCE;

      @Override
      public MazeProp create() {
        return MazeProp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName state = FieldName.forField("state");

      static final FieldName configId = FieldName.forField("configId", "config_id");

      static final FieldName groupId = FieldName.forField("groupId", "group_id");
    }
  }
}
