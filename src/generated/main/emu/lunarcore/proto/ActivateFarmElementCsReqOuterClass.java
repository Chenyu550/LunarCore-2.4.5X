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

public final class ActivateFarmElementCsReqOuterClass {
  /**
   * Protobuf type {@code ActivateFarmElementCsReq}
   */
  public static final class ActivateFarmElementCsReq extends ProtoMessage<ActivateFarmElementCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 world_level = 9;</code>
     */
    private int worldLevel;

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 entity_id = 13;</code>
     */
    private int entityId;

    private ActivateFarmElementCsReq() {
    }

    /**
     * @return a new empty instance of {@code ActivateFarmElementCsReq}
     */
    public static ActivateFarmElementCsReq newInstance() {
      return new ActivateFarmElementCsReq();
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 world_level = 9;</code>
     * @return whether the worldLevel field is set
     */
    public boolean hasWorldLevel() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 world_level = 9;</code>
     * @return this
     */
    public ActivateFarmElementCsReq clearWorldLevel() {
      bitField0_ &= ~0x00000001;
      worldLevel = 0;
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 world_level = 9;</code>
     * @return the worldLevel
     */
    public int getWorldLevel() {
      return worldLevel;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 world_level = 9;</code>
     * @param value the worldLevel to set
     * @return this
     */
    public ActivateFarmElementCsReq setWorldLevel(final int value) {
      bitField0_ |= 0x00000001;
      worldLevel = value;
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 entity_id = 13;</code>
     * @return whether the entityId field is set
     */
    public boolean hasEntityId() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 entity_id = 13;</code>
     * @return this
     */
    public ActivateFarmElementCsReq clearEntityId() {
      bitField0_ &= ~0x00000002;
      entityId = 0;
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 entity_id = 13;</code>
     * @return the entityId
     */
    public int getEntityId() {
      return entityId;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 entity_id = 13;</code>
     * @param value the entityId to set
     * @return this
     */
    public ActivateFarmElementCsReq setEntityId(final int value) {
      bitField0_ |= 0x00000002;
      entityId = value;
      return this;
    }

    @Override
    public ActivateFarmElementCsReq copyFrom(final ActivateFarmElementCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        worldLevel = other.worldLevel;
        entityId = other.entityId;
      }
      return this;
    }

    @Override
    public ActivateFarmElementCsReq mergeFrom(final ActivateFarmElementCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasWorldLevel()) {
        setWorldLevel(other.worldLevel);
      }
      if (other.hasEntityId()) {
        setEntityId(other.entityId);
      }
      return this;
    }

    @Override
    public ActivateFarmElementCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      worldLevel = 0;
      entityId = 0;
      return this;
    }

    @Override
    public ActivateFarmElementCsReq clearQuick() {
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
      if (!(o instanceof ActivateFarmElementCsReq)) {
        return false;
      }
      ActivateFarmElementCsReq other = (ActivateFarmElementCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasWorldLevel() || worldLevel == other.worldLevel)
        && (!hasEntityId() || entityId == other.entityId);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 72);
        output.writeUInt32NoTag(worldLevel);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 104);
        output.writeUInt32NoTag(entityId);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(worldLevel);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(entityId);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public ActivateFarmElementCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 72: {
            // worldLevel
            worldLevel = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 104) {
              break;
            }
          }
          case 104: {
            // entityId
            entityId = input.readUInt32();
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
        output.writeUInt32(FieldNames.worldLevel, worldLevel);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.entityId, entityId);
      }
      output.endObject();
    }

    @Override
    public ActivateFarmElementCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 440007442:
          case 1305257111: {
            if (input.isAtField(FieldNames.worldLevel)) {
              if (!input.trySkipNullValue()) {
                worldLevel = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -2102099874:
          case -740565257: {
            if (input.isAtField(FieldNames.entityId)) {
              if (!input.trySkipNullValue()) {
                entityId = input.readUInt32();
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
    public ActivateFarmElementCsReq clone() {
      return new ActivateFarmElementCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static ActivateFarmElementCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new ActivateFarmElementCsReq(), data).checkInitialized();
    }

    public static ActivateFarmElementCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ActivateFarmElementCsReq(), input).checkInitialized();
    }

    public static ActivateFarmElementCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ActivateFarmElementCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating ActivateFarmElementCsReq messages
     */
    public static MessageFactory<ActivateFarmElementCsReq> getFactory() {
      return ActivateFarmElementCsReqFactory.INSTANCE;
    }

    private enum ActivateFarmElementCsReqFactory implements MessageFactory<ActivateFarmElementCsReq> {
      INSTANCE;

      @Override
      public ActivateFarmElementCsReq create() {
        return ActivateFarmElementCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName worldLevel = FieldName.forField("worldLevel", "world_level");

      static final FieldName entityId = FieldName.forField("entityId", "entity_id");
    }
  }
}
