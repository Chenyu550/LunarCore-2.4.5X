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

public final class PlayerHeartbeatScRspOuterClass {
  /**
   * Protobuf type {@code PlayerHeartbeatScRsp}
   */
  public static final class PlayerHeartbeatScRsp extends ProtoMessage<PlayerHeartbeatScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint64 client_time_ms = 11;</code>
     */
    private long clientTimeMs;

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint64 server_time_ms = 12;</code>
     */
    private long serverTimeMs;

    /**
     * <code>optional uint32 retcode = 13;</code>
     */
    private int retcode;

    private PlayerHeartbeatScRsp() {
    }

    /**
     * @return a new empty instance of {@code PlayerHeartbeatScRsp}
     */
    public static PlayerHeartbeatScRsp newInstance() {
      return new PlayerHeartbeatScRsp();
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint64 client_time_ms = 11;</code>
     * @return whether the clientTimeMs field is set
     */
    public boolean hasClientTimeMs() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint64 client_time_ms = 11;</code>
     * @return this
     */
    public PlayerHeartbeatScRsp clearClientTimeMs() {
      bitField0_ &= ~0x00000001;
      clientTimeMs = 0L;
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint64 client_time_ms = 11;</code>
     * @return the clientTimeMs
     */
    public long getClientTimeMs() {
      return clientTimeMs;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint64 client_time_ms = 11;</code>
     * @param value the clientTimeMs to set
     * @return this
     */
    public PlayerHeartbeatScRsp setClientTimeMs(final long value) {
      bitField0_ |= 0x00000001;
      clientTimeMs = value;
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint64 server_time_ms = 12;</code>
     * @return whether the serverTimeMs field is set
     */
    public boolean hasServerTimeMs() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint64 server_time_ms = 12;</code>
     * @return this
     */
    public PlayerHeartbeatScRsp clearServerTimeMs() {
      bitField0_ &= ~0x00000002;
      serverTimeMs = 0L;
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint64 server_time_ms = 12;</code>
     * @return the serverTimeMs
     */
    public long getServerTimeMs() {
      return serverTimeMs;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint64 server_time_ms = 12;</code>
     * @param value the serverTimeMs to set
     * @return this
     */
    public PlayerHeartbeatScRsp setServerTimeMs(final long value) {
      bitField0_ |= 0x00000002;
      serverTimeMs = value;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 13;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 retcode = 13;</code>
     * @return this
     */
    public PlayerHeartbeatScRsp clearRetcode() {
      bitField0_ &= ~0x00000004;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 13;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 13;</code>
     * @param value the retcode to set
     * @return this
     */
    public PlayerHeartbeatScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000004;
      retcode = value;
      return this;
    }

    @Override
    public PlayerHeartbeatScRsp copyFrom(final PlayerHeartbeatScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        clientTimeMs = other.clientTimeMs;
        serverTimeMs = other.serverTimeMs;
        retcode = other.retcode;
      }
      return this;
    }

    @Override
    public PlayerHeartbeatScRsp mergeFrom(final PlayerHeartbeatScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasClientTimeMs()) {
        setClientTimeMs(other.clientTimeMs);
      }
      if (other.hasServerTimeMs()) {
        setServerTimeMs(other.serverTimeMs);
      }
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      return this;
    }

    @Override
    public PlayerHeartbeatScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      clientTimeMs = 0L;
      serverTimeMs = 0L;
      retcode = 0;
      return this;
    }

    @Override
    public PlayerHeartbeatScRsp clearQuick() {
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
      if (!(o instanceof PlayerHeartbeatScRsp)) {
        return false;
      }
      PlayerHeartbeatScRsp other = (PlayerHeartbeatScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasClientTimeMs() || clientTimeMs == other.clientTimeMs)
        && (!hasServerTimeMs() || serverTimeMs == other.serverTimeMs)
        && (!hasRetcode() || retcode == other.retcode);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 88);
        output.writeUInt64NoTag(clientTimeMs);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 96);
        output.writeUInt64NoTag(serverTimeMs);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 104);
        output.writeUInt32NoTag(retcode);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt64SizeNoTag(clientTimeMs);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt64SizeNoTag(serverTimeMs);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public PlayerHeartbeatScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 88: {
            // clientTimeMs
            clientTimeMs = input.readUInt64();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 96) {
              break;
            }
          }
          case 96: {
            // serverTimeMs
            serverTimeMs = input.readUInt64();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 104) {
              break;
            }
          }
          case 104: {
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
        output.writeUInt64(FieldNames.clientTimeMs, clientTimeMs);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt64(FieldNames.serverTimeMs, serverTimeMs);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      output.endObject();
    }

    @Override
    public PlayerHeartbeatScRsp mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1414301442:
          case 1123200996: {
            if (input.isAtField(FieldNames.clientTimeMs)) {
              if (!input.trySkipNullValue()) {
                clientTimeMs = input.readUInt64();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1928739446:
          case 1149956956: {
            if (input.isAtField(FieldNames.serverTimeMs)) {
              if (!input.trySkipNullValue()) {
                serverTimeMs = input.readUInt64();
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
    public PlayerHeartbeatScRsp clone() {
      return new PlayerHeartbeatScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static PlayerHeartbeatScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new PlayerHeartbeatScRsp(), data).checkInitialized();
    }

    public static PlayerHeartbeatScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new PlayerHeartbeatScRsp(), input).checkInitialized();
    }

    public static PlayerHeartbeatScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new PlayerHeartbeatScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating PlayerHeartbeatScRsp messages
     */
    public static MessageFactory<PlayerHeartbeatScRsp> getFactory() {
      return PlayerHeartbeatScRspFactory.INSTANCE;
    }

    private enum PlayerHeartbeatScRspFactory implements MessageFactory<PlayerHeartbeatScRsp> {
      INSTANCE;

      @Override
      public PlayerHeartbeatScRsp create() {
        return PlayerHeartbeatScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName clientTimeMs = FieldName.forField("clientTimeMs", "client_time_ms");

      static final FieldName serverTimeMs = FieldName.forField("serverTimeMs", "server_time_ms");

      static final FieldName retcode = FieldName.forField("retcode");
    }
  }
}
