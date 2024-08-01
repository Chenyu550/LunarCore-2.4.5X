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
import us.hebi.quickbuf.RepeatedMessage;

public final class StartChallengeScRspOuterClass {
  /**
   * Protobuf type {@code StartChallengeScRsp}
   */
  public static final class StartChallengeScRsp extends ProtoMessage<StartChallengeScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 retcode = 7;</code>
     */
    private int retcode;

    /**
     * <code>optional .ChallengeInfo challenge_info = 8;</code>
     */
    private final ChallengeInfoOuterClass.ChallengeInfo challengeInfo = ChallengeInfoOuterClass.ChallengeInfo.newInstance();

    /**
     * <code>optional .SceneInfo scene = 11;</code>
     */
    private final SceneInfoOuterClass.SceneInfo scene = SceneInfoOuterClass.SceneInfo.newInstance();

    /**
     * <code>optional .ChallengeExtInfo ext_info = 12;</code>
     */
    private final ChallengeExtInfoOuterClass.ChallengeExtInfo extInfo = ChallengeExtInfoOuterClass.ChallengeExtInfo.newInstance();

    /**
     * <code>repeated .LineupInfo lineup_list = 14;</code>
     */
    private final RepeatedMessage<LineupInfoOuterClass.LineupInfo> lineupList = RepeatedMessage.newEmptyInstance(LineupInfoOuterClass.LineupInfo.getFactory());

    private StartChallengeScRsp() {
    }

    /**
     * @return a new empty instance of {@code StartChallengeScRsp}
     */
    public static StartChallengeScRsp newInstance() {
      return new StartChallengeScRsp();
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 retcode = 7;</code>
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
     * <code>optional uint32 retcode = 7;</code>
     * @return this
     */
    public StartChallengeScRsp clearRetcode() {
      bitField0_ &= ~0x00000001;
      retcode = 0;
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 retcode = 7;</code>
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
     * <code>optional uint32 retcode = 7;</code>
     * @param value the retcode to set
     * @return this
     */
    public StartChallengeScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <code>optional .ChallengeInfo challenge_info = 8;</code>
     * @return whether the challengeInfo field is set
     */
    public boolean hasChallengeInfo() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional .ChallengeInfo challenge_info = 8;</code>
     * @return this
     */
    public StartChallengeScRsp clearChallengeInfo() {
      bitField0_ &= ~0x00000002;
      challengeInfo.clear();
      return this;
    }

    /**
     * <code>optional .ChallengeInfo challenge_info = 8;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableChallengeInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public ChallengeInfoOuterClass.ChallengeInfo getChallengeInfo() {
      return challengeInfo;
    }

    /**
     * <code>optional .ChallengeInfo challenge_info = 8;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public ChallengeInfoOuterClass.ChallengeInfo getMutableChallengeInfo() {
      bitField0_ |= 0x00000002;
      return challengeInfo;
    }

    /**
     * <code>optional .ChallengeInfo challenge_info = 8;</code>
     * @param value the challengeInfo to set
     * @return this
     */
    public StartChallengeScRsp setChallengeInfo(final ChallengeInfoOuterClass.ChallengeInfo value) {
      bitField0_ |= 0x00000002;
      challengeInfo.copyFrom(value);
      return this;
    }

    /**
     * <code>optional .SceneInfo scene = 11;</code>
     * @return whether the scene field is set
     */
    public boolean hasScene() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional .SceneInfo scene = 11;</code>
     * @return this
     */
    public StartChallengeScRsp clearScene() {
      bitField0_ &= ~0x00000004;
      scene.clear();
      return this;
    }

    /**
     * <code>optional .SceneInfo scene = 11;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableScene()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public SceneInfoOuterClass.SceneInfo getScene() {
      return scene;
    }

    /**
     * <code>optional .SceneInfo scene = 11;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public SceneInfoOuterClass.SceneInfo getMutableScene() {
      bitField0_ |= 0x00000004;
      return scene;
    }

    /**
     * <code>optional .SceneInfo scene = 11;</code>
     * @param value the scene to set
     * @return this
     */
    public StartChallengeScRsp setScene(final SceneInfoOuterClass.SceneInfo value) {
      bitField0_ |= 0x00000004;
      scene.copyFrom(value);
      return this;
    }

    /**
     * <code>optional .ChallengeExtInfo ext_info = 12;</code>
     * @return whether the extInfo field is set
     */
    public boolean hasExtInfo() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional .ChallengeExtInfo ext_info = 12;</code>
     * @return this
     */
    public StartChallengeScRsp clearExtInfo() {
      bitField0_ &= ~0x00000008;
      extInfo.clear();
      return this;
    }

    /**
     * <code>optional .ChallengeExtInfo ext_info = 12;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableExtInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public ChallengeExtInfoOuterClass.ChallengeExtInfo getExtInfo() {
      return extInfo;
    }

    /**
     * <code>optional .ChallengeExtInfo ext_info = 12;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public ChallengeExtInfoOuterClass.ChallengeExtInfo getMutableExtInfo() {
      bitField0_ |= 0x00000008;
      return extInfo;
    }

    /**
     * <code>optional .ChallengeExtInfo ext_info = 12;</code>
     * @param value the extInfo to set
     * @return this
     */
    public StartChallengeScRsp setExtInfo(final ChallengeExtInfoOuterClass.ChallengeExtInfo value) {
      bitField0_ |= 0x00000008;
      extInfo.copyFrom(value);
      return this;
    }

    /**
     * <code>repeated .LineupInfo lineup_list = 14;</code>
     * @return whether the lineupList field is set
     */
    public boolean hasLineupList() {
      return (bitField0_ & 0x00000010) != 0;
    }

    /**
     * <code>repeated .LineupInfo lineup_list = 14;</code>
     * @return this
     */
    public StartChallengeScRsp clearLineupList() {
      bitField0_ &= ~0x00000010;
      lineupList.clear();
      return this;
    }

    /**
     * <code>repeated .LineupInfo lineup_list = 14;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableLineupList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<LineupInfoOuterClass.LineupInfo> getLineupList() {
      return lineupList;
    }

    /**
     * <code>repeated .LineupInfo lineup_list = 14;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<LineupInfoOuterClass.LineupInfo> getMutableLineupList() {
      bitField0_ |= 0x00000010;
      return lineupList;
    }

    /**
     * <code>repeated .LineupInfo lineup_list = 14;</code>
     * @param value the lineupList to add
     * @return this
     */
    public StartChallengeScRsp addLineupList(final LineupInfoOuterClass.LineupInfo value) {
      bitField0_ |= 0x00000010;
      lineupList.add(value);
      return this;
    }

    /**
     * <code>repeated .LineupInfo lineup_list = 14;</code>
     * @param values the lineupList to add
     * @return this
     */
    public StartChallengeScRsp addAllLineupList(final LineupInfoOuterClass.LineupInfo... values) {
      bitField0_ |= 0x00000010;
      lineupList.addAll(values);
      return this;
    }

    @Override
    public StartChallengeScRsp copyFrom(final StartChallengeScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        challengeInfo.copyFrom(other.challengeInfo);
        scene.copyFrom(other.scene);
        extInfo.copyFrom(other.extInfo);
        lineupList.copyFrom(other.lineupList);
      }
      return this;
    }

    @Override
    public StartChallengeScRsp mergeFrom(final StartChallengeScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasChallengeInfo()) {
        getMutableChallengeInfo().mergeFrom(other.challengeInfo);
      }
      if (other.hasScene()) {
        getMutableScene().mergeFrom(other.scene);
      }
      if (other.hasExtInfo()) {
        getMutableExtInfo().mergeFrom(other.extInfo);
      }
      if (other.hasLineupList()) {
        getMutableLineupList().addAll(other.lineupList);
      }
      return this;
    }

    @Override
    public StartChallengeScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      challengeInfo.clear();
      scene.clear();
      extInfo.clear();
      lineupList.clear();
      return this;
    }

    @Override
    public StartChallengeScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      challengeInfo.clearQuick();
      scene.clearQuick();
      extInfo.clearQuick();
      lineupList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof StartChallengeScRsp)) {
        return false;
      }
      StartChallengeScRsp other = (StartChallengeScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasChallengeInfo() || challengeInfo.equals(other.challengeInfo))
        && (!hasScene() || scene.equals(other.scene))
        && (!hasExtInfo() || extInfo.equals(other.extInfo))
        && (!hasLineupList() || lineupList.equals(other.lineupList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 56);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 66);
        output.writeMessageNoTag(challengeInfo);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 90);
        output.writeMessageNoTag(scene);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 98);
        output.writeMessageNoTag(extInfo);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        for (int i = 0; i < lineupList.length(); i++) {
          output.writeRawByte((byte) 114);
          output.writeMessageNoTag(lineupList.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(challengeInfo);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(scene);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(extInfo);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        size += (1 * lineupList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(lineupList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public StartChallengeScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 56: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 66) {
              break;
            }
          }
          case 66: {
            // challengeInfo
            input.readMessage(challengeInfo);
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 90) {
              break;
            }
          }
          case 90: {
            // scene
            input.readMessage(scene);
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 98) {
              break;
            }
          }
          case 98: {
            // extInfo
            input.readMessage(extInfo);
            bitField0_ |= 0x00000008;
            tag = input.readTag();
            if (tag != 114) {
              break;
            }
          }
          case 114: {
            // lineupList
            tag = input.readRepeatedMessage(lineupList, tag);
            bitField0_ |= 0x00000010;
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
        output.writeMessage(FieldNames.challengeInfo, challengeInfo);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeMessage(FieldNames.scene, scene);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeMessage(FieldNames.extInfo, extInfo);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeRepeatedMessage(FieldNames.lineupList, lineupList);
      }
      output.endObject();
    }

    @Override
    public StartChallengeScRsp mergeFrom(final JsonSource input) throws IOException {
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
          case -812487759:
          case 602859274: {
            if (input.isAtField(FieldNames.challengeInfo)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(challengeInfo);
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 109254796: {
            if (input.isAtField(FieldNames.scene)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(scene);
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1306498449:
          case -1826570228: {
            if (input.isAtField(FieldNames.extInfo)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(extInfo);
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 781801165:
          case -1516340914: {
            if (input.isAtField(FieldNames.lineupList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(lineupList);
                bitField0_ |= 0x00000010;
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
    public StartChallengeScRsp clone() {
      return new StartChallengeScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static StartChallengeScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new StartChallengeScRsp(), data).checkInitialized();
    }

    public static StartChallengeScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new StartChallengeScRsp(), input).checkInitialized();
    }

    public static StartChallengeScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new StartChallengeScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating StartChallengeScRsp messages
     */
    public static MessageFactory<StartChallengeScRsp> getFactory() {
      return StartChallengeScRspFactory.INSTANCE;
    }

    private enum StartChallengeScRspFactory implements MessageFactory<StartChallengeScRsp> {
      INSTANCE;

      @Override
      public StartChallengeScRsp create() {
        return StartChallengeScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName challengeInfo = FieldName.forField("challengeInfo", "challenge_info");

      static final FieldName scene = FieldName.forField("scene");

      static final FieldName extInfo = FieldName.forField("extInfo", "ext_info");

      static final FieldName lineupList = FieldName.forField("lineupList", "lineup_list");
    }
  }
}
