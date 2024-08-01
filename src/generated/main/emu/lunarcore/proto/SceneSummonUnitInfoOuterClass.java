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
import us.hebi.quickbuf.RepeatedString;

public final class SceneSummonUnitInfoOuterClass {
  /**
   * Protobuf type {@code SceneSummonUnitInfo}
   */
  public static final class SceneSummonUnitInfo extends ProtoMessage<SceneSummonUnitInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint64 create_time_ms = 11;</code>
     */
    private long createTimeMs;

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 summon_unit_id = 4;</code>
     */
    private int summonUnitId;

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 caster_entity_id = 7;</code>
     */
    private int casterEntityId;

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 attach_entity_id = 9;</code>
     */
    private int attachEntityId;

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional sint32 life_time_ms = 5;</code>
     */
    private int lifeTimeMs;

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>repeated string trigger_name_list = 6;</code>
     */
    private final RepeatedString triggerNameList = RepeatedString.newEmptyInstance();

    private SceneSummonUnitInfo() {
    }

    /**
     * @return a new empty instance of {@code SceneSummonUnitInfo}
     */
    public static SceneSummonUnitInfo newInstance() {
      return new SceneSummonUnitInfo();
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint64 create_time_ms = 11;</code>
     * @return whether the createTimeMs field is set
     */
    public boolean hasCreateTimeMs() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint64 create_time_ms = 11;</code>
     * @return this
     */
    public SceneSummonUnitInfo clearCreateTimeMs() {
      bitField0_ &= ~0x00000001;
      createTimeMs = 0L;
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint64 create_time_ms = 11;</code>
     * @return the createTimeMs
     */
    public long getCreateTimeMs() {
      return createTimeMs;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint64 create_time_ms = 11;</code>
     * @param value the createTimeMs to set
     * @return this
     */
    public SceneSummonUnitInfo setCreateTimeMs(final long value) {
      bitField0_ |= 0x00000001;
      createTimeMs = value;
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 summon_unit_id = 4;</code>
     * @return whether the summonUnitId field is set
     */
    public boolean hasSummonUnitId() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 summon_unit_id = 4;</code>
     * @return this
     */
    public SceneSummonUnitInfo clearSummonUnitId() {
      bitField0_ &= ~0x00000002;
      summonUnitId = 0;
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 summon_unit_id = 4;</code>
     * @return the summonUnitId
     */
    public int getSummonUnitId() {
      return summonUnitId;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 summon_unit_id = 4;</code>
     * @param value the summonUnitId to set
     * @return this
     */
    public SceneSummonUnitInfo setSummonUnitId(final int value) {
      bitField0_ |= 0x00000002;
      summonUnitId = value;
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 caster_entity_id = 7;</code>
     * @return whether the casterEntityId field is set
     */
    public boolean hasCasterEntityId() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 caster_entity_id = 7;</code>
     * @return this
     */
    public SceneSummonUnitInfo clearCasterEntityId() {
      bitField0_ &= ~0x00000004;
      casterEntityId = 0;
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 caster_entity_id = 7;</code>
     * @return the casterEntityId
     */
    public int getCasterEntityId() {
      return casterEntityId;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 caster_entity_id = 7;</code>
     * @param value the casterEntityId to set
     * @return this
     */
    public SceneSummonUnitInfo setCasterEntityId(final int value) {
      bitField0_ |= 0x00000004;
      casterEntityId = value;
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 attach_entity_id = 9;</code>
     * @return whether the attachEntityId field is set
     */
    public boolean hasAttachEntityId() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 attach_entity_id = 9;</code>
     * @return this
     */
    public SceneSummonUnitInfo clearAttachEntityId() {
      bitField0_ &= ~0x00000008;
      attachEntityId = 0;
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 attach_entity_id = 9;</code>
     * @return the attachEntityId
     */
    public int getAttachEntityId() {
      return attachEntityId;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 attach_entity_id = 9;</code>
     * @param value the attachEntityId to set
     * @return this
     */
    public SceneSummonUnitInfo setAttachEntityId(final int value) {
      bitField0_ |= 0x00000008;
      attachEntityId = value;
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional sint32 life_time_ms = 5;</code>
     * @return whether the lifeTimeMs field is set
     */
    public boolean hasLifeTimeMs() {
      return (bitField0_ & 0x00000010) != 0;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional sint32 life_time_ms = 5;</code>
     * @return this
     */
    public SceneSummonUnitInfo clearLifeTimeMs() {
      bitField0_ &= ~0x00000010;
      lifeTimeMs = 0;
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional sint32 life_time_ms = 5;</code>
     * @return the lifeTimeMs
     */
    public int getLifeTimeMs() {
      return lifeTimeMs;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional sint32 life_time_ms = 5;</code>
     * @param value the lifeTimeMs to set
     * @return this
     */
    public SceneSummonUnitInfo setLifeTimeMs(final int value) {
      bitField0_ |= 0x00000010;
      lifeTimeMs = value;
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>repeated string trigger_name_list = 6;</code>
     * @return whether the triggerNameList field is set
     */
    public boolean hasTriggerNameList() {
      return (bitField0_ & 0x00000020) != 0;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>repeated string trigger_name_list = 6;</code>
     * @return this
     */
    public SceneSummonUnitInfo clearTriggerNameList() {
      bitField0_ &= ~0x00000020;
      triggerNameList.clear();
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>repeated string trigger_name_list = 6;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableTriggerNameList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedString getTriggerNameList() {
      return triggerNameList;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>repeated string trigger_name_list = 6;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedString getMutableTriggerNameList() {
      bitField0_ |= 0x00000020;
      return triggerNameList;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>repeated string trigger_name_list = 6;</code>
     * @param value the triggerNameList to add
     * @return this
     */
    public SceneSummonUnitInfo addTriggerNameList(final CharSequence value) {
      bitField0_ |= 0x00000020;
      triggerNameList.add(value);
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>repeated string trigger_name_list = 6;</code>
     * @param values the triggerNameList to add
     * @return this
     */
    public SceneSummonUnitInfo addAllTriggerNameList(final CharSequence... values) {
      bitField0_ |= 0x00000020;
      triggerNameList.addAll(values);
      return this;
    }

    @Override
    public SceneSummonUnitInfo copyFrom(final SceneSummonUnitInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        createTimeMs = other.createTimeMs;
        summonUnitId = other.summonUnitId;
        casterEntityId = other.casterEntityId;
        attachEntityId = other.attachEntityId;
        lifeTimeMs = other.lifeTimeMs;
        triggerNameList.copyFrom(other.triggerNameList);
      }
      return this;
    }

    @Override
    public SceneSummonUnitInfo mergeFrom(final SceneSummonUnitInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasCreateTimeMs()) {
        setCreateTimeMs(other.createTimeMs);
      }
      if (other.hasSummonUnitId()) {
        setSummonUnitId(other.summonUnitId);
      }
      if (other.hasCasterEntityId()) {
        setCasterEntityId(other.casterEntityId);
      }
      if (other.hasAttachEntityId()) {
        setAttachEntityId(other.attachEntityId);
      }
      if (other.hasLifeTimeMs()) {
        setLifeTimeMs(other.lifeTimeMs);
      }
      if (other.hasTriggerNameList()) {
        getMutableTriggerNameList().addAll(other.triggerNameList);
      }
      return this;
    }

    @Override
    public SceneSummonUnitInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      createTimeMs = 0L;
      summonUnitId = 0;
      casterEntityId = 0;
      attachEntityId = 0;
      lifeTimeMs = 0;
      triggerNameList.clear();
      return this;
    }

    @Override
    public SceneSummonUnitInfo clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      triggerNameList.clear();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof SceneSummonUnitInfo)) {
        return false;
      }
      SceneSummonUnitInfo other = (SceneSummonUnitInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasCreateTimeMs() || createTimeMs == other.createTimeMs)
        && (!hasSummonUnitId() || summonUnitId == other.summonUnitId)
        && (!hasCasterEntityId() || casterEntityId == other.casterEntityId)
        && (!hasAttachEntityId() || attachEntityId == other.attachEntityId)
        && (!hasLifeTimeMs() || lifeTimeMs == other.lifeTimeMs)
        && (!hasTriggerNameList() || triggerNameList.equals(other.triggerNameList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 88);
        output.writeUInt64NoTag(createTimeMs);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 32);
        output.writeUInt32NoTag(summonUnitId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 56);
        output.writeUInt32NoTag(casterEntityId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 72);
        output.writeUInt32NoTag(attachEntityId);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeRawByte((byte) 40);
        output.writeSInt32NoTag(lifeTimeMs);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        for (int i = 0; i < triggerNameList.length(); i++) {
          output.writeRawByte((byte) 50);
          output.writeStringNoTag(triggerNameList.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt64SizeNoTag(createTimeMs);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(summonUnitId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(casterEntityId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(attachEntityId);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        size += 1 + ProtoSink.computeSInt32SizeNoTag(lifeTimeMs);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        size += (1 * triggerNameList.length()) + ProtoSink.computeRepeatedStringSizeNoTag(triggerNameList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public SceneSummonUnitInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 88: {
            // createTimeMs
            createTimeMs = input.readUInt64();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 32) {
              break;
            }
          }
          case 32: {
            // summonUnitId
            summonUnitId = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 56) {
              break;
            }
          }
          case 56: {
            // casterEntityId
            casterEntityId = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 72) {
              break;
            }
          }
          case 72: {
            // attachEntityId
            attachEntityId = input.readUInt32();
            bitField0_ |= 0x00000008;
            tag = input.readTag();
            if (tag != 40) {
              break;
            }
          }
          case 40: {
            // lifeTimeMs
            lifeTimeMs = input.readSInt32();
            bitField0_ |= 0x00000010;
            tag = input.readTag();
            if (tag != 50) {
              break;
            }
          }
          case 50: {
            // triggerNameList
            tag = input.readRepeatedString(triggerNameList, tag);
            bitField0_ |= 0x00000020;
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
        output.writeUInt64(FieldNames.createTimeMs, createTimeMs);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.summonUnitId, summonUnitId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.casterEntityId, casterEntityId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeUInt32(FieldNames.attachEntityId, attachEntityId);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeSInt32(FieldNames.lifeTimeMs, lifeTimeMs);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeRepeatedString(FieldNames.triggerNameList, triggerNameList);
      }
      output.endObject();
    }

    @Override
    public SceneSummonUnitInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1554103663:
          case 1902222357: {
            if (input.isAtField(FieldNames.createTimeMs)) {
              if (!input.trySkipNullValue()) {
                createTimeMs = input.readUInt64();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 43438592:
          case 1094873176: {
            if (input.isAtField(FieldNames.summonUnitId)) {
              if (!input.trySkipNullValue()) {
                summonUnitId = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1831162710:
          case -1550367068: {
            if (input.isAtField(FieldNames.casterEntityId)) {
              if (!input.trySkipNullValue()) {
                casterEntityId = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -900612669:
          case -644975235: {
            if (input.isAtField(FieldNames.attachEntityId)) {
              if (!input.trySkipNullValue()) {
                attachEntityId = input.readUInt32();
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1226028177:
          case 1665182229: {
            if (input.isAtField(FieldNames.lifeTimeMs)) {
              if (!input.trySkipNullValue()) {
                lifeTimeMs = input.readSInt32();
                bitField0_ |= 0x00000010;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -110500959:
          case -107587573: {
            if (input.isAtField(FieldNames.triggerNameList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedString(triggerNameList);
                bitField0_ |= 0x00000020;
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
    public SceneSummonUnitInfo clone() {
      return new SceneSummonUnitInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static SceneSummonUnitInfo parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new SceneSummonUnitInfo(), data).checkInitialized();
    }

    public static SceneSummonUnitInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SceneSummonUnitInfo(), input).checkInitialized();
    }

    public static SceneSummonUnitInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SceneSummonUnitInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating SceneSummonUnitInfo messages
     */
    public static MessageFactory<SceneSummonUnitInfo> getFactory() {
      return SceneSummonUnitInfoFactory.INSTANCE;
    }

    private enum SceneSummonUnitInfoFactory implements MessageFactory<SceneSummonUnitInfo> {
      INSTANCE;

      @Override
      public SceneSummonUnitInfo create() {
        return SceneSummonUnitInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName createTimeMs = FieldName.forField("createTimeMs", "create_time_ms");

      static final FieldName summonUnitId = FieldName.forField("summonUnitId", "summon_unit_id");

      static final FieldName casterEntityId = FieldName.forField("casterEntityId", "caster_entity_id");

      static final FieldName attachEntityId = FieldName.forField("attachEntityId", "attach_entity_id");

      static final FieldName lifeTimeMs = FieldName.forField("lifeTimeMs", "life_time_ms");

      static final FieldName triggerNameList = FieldName.forField("triggerNameList", "trigger_name_list");
    }
  }
}
