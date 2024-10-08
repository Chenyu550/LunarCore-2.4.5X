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

public final class FinishRogueDialogueGroupCsReqOuterClass {
  /**
   * Protobuf type {@code FinishRogueDialogueGroupCsReq}
   */
  public static final class FinishRogueDialogueGroupCsReq extends ProtoMessage<FinishRogueDialogueGroupCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <pre>
     *  
     * </pre>
     *
     * <code>optional uint32 dialogue_group_id = 10;</code>
     */
    private int dialogueGroupId;

    /**
     * <code>optional uint32 entity_id = 12;</code>
     */
    private int entityId;

    private FinishRogueDialogueGroupCsReq() {
    }

    /**
     * @return a new empty instance of {@code FinishRogueDialogueGroupCsReq}
     */
    public static FinishRogueDialogueGroupCsReq newInstance() {
      return new FinishRogueDialogueGroupCsReq();
    }

    /**
     * <pre>
     *  
     * </pre>
     *
     * <code>optional uint32 dialogue_group_id = 10;</code>
     * @return whether the dialogueGroupId field is set
     */
    public boolean hasDialogueGroupId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <pre>
     *  
     * </pre>
     *
     * <code>optional uint32 dialogue_group_id = 10;</code>
     * @return this
     */
    public FinishRogueDialogueGroupCsReq clearDialogueGroupId() {
      bitField0_ &= ~0x00000001;
      dialogueGroupId = 0;
      return this;
    }

    /**
     * <pre>
     *  
     * </pre>
     *
     * <code>optional uint32 dialogue_group_id = 10;</code>
     * @return the dialogueGroupId
     */
    public int getDialogueGroupId() {
      return dialogueGroupId;
    }

    /**
     * <pre>
     *  
     * </pre>
     *
     * <code>optional uint32 dialogue_group_id = 10;</code>
     * @param value the dialogueGroupId to set
     * @return this
     */
    public FinishRogueDialogueGroupCsReq setDialogueGroupId(final int value) {
      bitField0_ |= 0x00000001;
      dialogueGroupId = value;
      return this;
    }

    /**
     * <code>optional uint32 entity_id = 12;</code>
     * @return whether the entityId field is set
     */
    public boolean hasEntityId() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 entity_id = 12;</code>
     * @return this
     */
    public FinishRogueDialogueGroupCsReq clearEntityId() {
      bitField0_ &= ~0x00000002;
      entityId = 0;
      return this;
    }

    /**
     * <code>optional uint32 entity_id = 12;</code>
     * @return the entityId
     */
    public int getEntityId() {
      return entityId;
    }

    /**
     * <code>optional uint32 entity_id = 12;</code>
     * @param value the entityId to set
     * @return this
     */
    public FinishRogueDialogueGroupCsReq setEntityId(final int value) {
      bitField0_ |= 0x00000002;
      entityId = value;
      return this;
    }

    @Override
    public FinishRogueDialogueGroupCsReq copyFrom(final FinishRogueDialogueGroupCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        dialogueGroupId = other.dialogueGroupId;
        entityId = other.entityId;
      }
      return this;
    }

    @Override
    public FinishRogueDialogueGroupCsReq mergeFrom(final FinishRogueDialogueGroupCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasDialogueGroupId()) {
        setDialogueGroupId(other.dialogueGroupId);
      }
      if (other.hasEntityId()) {
        setEntityId(other.entityId);
      }
      return this;
    }

    @Override
    public FinishRogueDialogueGroupCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      dialogueGroupId = 0;
      entityId = 0;
      return this;
    }

    @Override
    public FinishRogueDialogueGroupCsReq clearQuick() {
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
      if (!(o instanceof FinishRogueDialogueGroupCsReq)) {
        return false;
      }
      FinishRogueDialogueGroupCsReq other = (FinishRogueDialogueGroupCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasDialogueGroupId() || dialogueGroupId == other.dialogueGroupId)
        && (!hasEntityId() || entityId == other.entityId);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 80);
        output.writeUInt32NoTag(dialogueGroupId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 96);
        output.writeUInt32NoTag(entityId);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(dialogueGroupId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(entityId);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public FinishRogueDialogueGroupCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 80: {
            // dialogueGroupId
            dialogueGroupId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 96) {
              break;
            }
          }
          case 96: {
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
        output.writeUInt32(FieldNames.dialogueGroupId, dialogueGroupId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.entityId, entityId);
      }
      output.endObject();
    }

    @Override
    public FinishRogueDialogueGroupCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1758320386:
          case 1899979106: {
            if (input.isAtField(FieldNames.dialogueGroupId)) {
              if (!input.trySkipNullValue()) {
                dialogueGroupId = input.readUInt32();
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
    public FinishRogueDialogueGroupCsReq clone() {
      return new FinishRogueDialogueGroupCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static FinishRogueDialogueGroupCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new FinishRogueDialogueGroupCsReq(), data).checkInitialized();
    }

    public static FinishRogueDialogueGroupCsReq parseFrom(final ProtoSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new FinishRogueDialogueGroupCsReq(), input).checkInitialized();
    }

    public static FinishRogueDialogueGroupCsReq parseFrom(final JsonSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new FinishRogueDialogueGroupCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating FinishRogueDialogueGroupCsReq messages
     */
    public static MessageFactory<FinishRogueDialogueGroupCsReq> getFactory() {
      return FinishRogueDialogueGroupCsReqFactory.INSTANCE;
    }

    private enum FinishRogueDialogueGroupCsReqFactory implements MessageFactory<FinishRogueDialogueGroupCsReq> {
      INSTANCE;

      @Override
      public FinishRogueDialogueGroupCsReq create() {
        return FinishRogueDialogueGroupCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName dialogueGroupId = FieldName.forField("dialogueGroupId", "dialogue_group_id");

      static final FieldName entityId = FieldName.forField("entityId", "entity_id");
    }
  }
}
