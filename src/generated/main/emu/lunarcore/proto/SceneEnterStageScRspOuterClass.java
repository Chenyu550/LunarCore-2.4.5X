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

public final class SceneEnterStageScRspOuterClass {
  /**
   * Protobuf type {@code SceneEnterStageScRsp}
   */
  public static final class SceneEnterStageScRsp extends ProtoMessage<SceneEnterStageScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 retcode = 10;</code>
     */
    private int retcode;

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional .SceneBattleInfo battle_info = 12;</code>
     */
    private final SceneBattleInfoOuterClass.SceneBattleInfo battleInfo = SceneBattleInfoOuterClass.SceneBattleInfo.newInstance();

    private SceneEnterStageScRsp() {
    }

    /**
     * @return a new empty instance of {@code SceneEnterStageScRsp}
     */
    public static SceneEnterStageScRsp newInstance() {
      return new SceneEnterStageScRsp();
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 retcode = 10;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 retcode = 10;</code>
     * @return this
     */
    public SceneEnterStageScRsp clearRetcode() {
      bitField0_ &= ~0x00000001;
      retcode = 0;
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 retcode = 10;</code>
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
     * <code>optional uint32 retcode = 10;</code>
     * @param value the retcode to set
     * @return this
     */
    public SceneEnterStageScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional .SceneBattleInfo battle_info = 12;</code>
     * @return whether the battleInfo field is set
     */
    public boolean hasBattleInfo() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional .SceneBattleInfo battle_info = 12;</code>
     * @return this
     */
    public SceneEnterStageScRsp clearBattleInfo() {
      bitField0_ &= ~0x00000002;
      battleInfo.clear();
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional .SceneBattleInfo battle_info = 12;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableBattleInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public SceneBattleInfoOuterClass.SceneBattleInfo getBattleInfo() {
      return battleInfo;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional .SceneBattleInfo battle_info = 12;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public SceneBattleInfoOuterClass.SceneBattleInfo getMutableBattleInfo() {
      bitField0_ |= 0x00000002;
      return battleInfo;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional .SceneBattleInfo battle_info = 12;</code>
     * @param value the battleInfo to set
     * @return this
     */
    public SceneEnterStageScRsp setBattleInfo(
        final SceneBattleInfoOuterClass.SceneBattleInfo value) {
      bitField0_ |= 0x00000002;
      battleInfo.copyFrom(value);
      return this;
    }

    @Override
    public SceneEnterStageScRsp copyFrom(final SceneEnterStageScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        battleInfo.copyFrom(other.battleInfo);
      }
      return this;
    }

    @Override
    public SceneEnterStageScRsp mergeFrom(final SceneEnterStageScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasBattleInfo()) {
        getMutableBattleInfo().mergeFrom(other.battleInfo);
      }
      return this;
    }

    @Override
    public SceneEnterStageScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      battleInfo.clear();
      return this;
    }

    @Override
    public SceneEnterStageScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      battleInfo.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof SceneEnterStageScRsp)) {
        return false;
      }
      SceneEnterStageScRsp other = (SceneEnterStageScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasBattleInfo() || battleInfo.equals(other.battleInfo));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 80);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 98);
        output.writeMessageNoTag(battleInfo);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(battleInfo);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public SceneEnterStageScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 80: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 98) {
              break;
            }
          }
          case 98: {
            // battleInfo
            input.readMessage(battleInfo);
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
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeMessage(FieldNames.battleInfo, battleInfo);
      }
      output.endObject();
    }

    @Override
    public SceneEnterStageScRsp mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1097936398: {
            if (input.isAtField(FieldNames.retcode)) {
              if (!input.trySkipNullValue()) {
                retcode = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 2053377414:
          case -749633579: {
            if (input.isAtField(FieldNames.battleInfo)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(battleInfo);
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
    public SceneEnterStageScRsp clone() {
      return new SceneEnterStageScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static SceneEnterStageScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new SceneEnterStageScRsp(), data).checkInitialized();
    }

    public static SceneEnterStageScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SceneEnterStageScRsp(), input).checkInitialized();
    }

    public static SceneEnterStageScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SceneEnterStageScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating SceneEnterStageScRsp messages
     */
    public static MessageFactory<SceneEnterStageScRsp> getFactory() {
      return SceneEnterStageScRspFactory.INSTANCE;
    }

    private enum SceneEnterStageScRspFactory implements MessageFactory<SceneEnterStageScRsp> {
      INSTANCE;

      @Override
      public SceneEnterStageScRsp create() {
        return SceneEnterStageScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName battleInfo = FieldName.forField("battleInfo", "battle_info");
    }
  }
}
