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

public final class GetChallengeScRspOuterClass {
  /**
   * Protobuf type {@code GetChallengeScRsp}
   */
  public static final class GetChallengeScRsp extends ProtoMessage<GetChallengeScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 10;</code>
     */
    private int retcode;

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>repeated .Challenge challenge_list = 1;</code>
     */
    private final RepeatedMessage<ChallengeOuterClass.Challenge> challengeList = RepeatedMessage.newEmptyInstance(ChallengeOuterClass.Challenge.getFactory());

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>repeated .ChallengeReward challenge_reward_list = 14;</code>
     */
    private final RepeatedMessage<ChallengeRewardOuterClass.ChallengeReward> challengeRewardList = RepeatedMessage.newEmptyInstance(ChallengeRewardOuterClass.ChallengeReward.getFactory());

    private GetChallengeScRsp() {
    }

    /**
     * @return a new empty instance of {@code GetChallengeScRsp}
     */
    public static GetChallengeScRsp newInstance() {
      return new GetChallengeScRsp();
    }

    /**
     * <code>optional uint32 retcode = 10;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 retcode = 10;</code>
     * @return this
     */
    public GetChallengeScRsp clearRetcode() {
      bitField0_ &= ~0x00000001;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 10;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 10;</code>
     * @param value the retcode to set
     * @return this
     */
    public GetChallengeScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>repeated .Challenge challenge_list = 1;</code>
     * @return whether the challengeList field is set
     */
    public boolean hasChallengeList() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>repeated .Challenge challenge_list = 1;</code>
     * @return this
     */
    public GetChallengeScRsp clearChallengeList() {
      bitField0_ &= ~0x00000002;
      challengeList.clear();
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>repeated .Challenge challenge_list = 1;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableChallengeList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<ChallengeOuterClass.Challenge> getChallengeList() {
      return challengeList;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>repeated .Challenge challenge_list = 1;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<ChallengeOuterClass.Challenge> getMutableChallengeList() {
      bitField0_ |= 0x00000002;
      return challengeList;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>repeated .Challenge challenge_list = 1;</code>
     * @param value the challengeList to add
     * @return this
     */
    public GetChallengeScRsp addChallengeList(final ChallengeOuterClass.Challenge value) {
      bitField0_ |= 0x00000002;
      challengeList.add(value);
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>repeated .Challenge challenge_list = 1;</code>
     * @param values the challengeList to add
     * @return this
     */
    public GetChallengeScRsp addAllChallengeList(final ChallengeOuterClass.Challenge... values) {
      bitField0_ |= 0x00000002;
      challengeList.addAll(values);
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>repeated .ChallengeReward challenge_reward_list = 14;</code>
     * @return whether the challengeRewardList field is set
     */
    public boolean hasChallengeRewardList() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>repeated .ChallengeReward challenge_reward_list = 14;</code>
     * @return this
     */
    public GetChallengeScRsp clearChallengeRewardList() {
      bitField0_ &= ~0x00000004;
      challengeRewardList.clear();
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>repeated .ChallengeReward challenge_reward_list = 14;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableChallengeRewardList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<ChallengeRewardOuterClass.ChallengeReward> getChallengeRewardList() {
      return challengeRewardList;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>repeated .ChallengeReward challenge_reward_list = 14;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<ChallengeRewardOuterClass.ChallengeReward> getMutableChallengeRewardList(
        ) {
      bitField0_ |= 0x00000004;
      return challengeRewardList;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>repeated .ChallengeReward challenge_reward_list = 14;</code>
     * @param value the challengeRewardList to add
     * @return this
     */
    public GetChallengeScRsp addChallengeRewardList(
        final ChallengeRewardOuterClass.ChallengeReward value) {
      bitField0_ |= 0x00000004;
      challengeRewardList.add(value);
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>repeated .ChallengeReward challenge_reward_list = 14;</code>
     * @param values the challengeRewardList to add
     * @return this
     */
    public GetChallengeScRsp addAllChallengeRewardList(
        final ChallengeRewardOuterClass.ChallengeReward... values) {
      bitField0_ |= 0x00000004;
      challengeRewardList.addAll(values);
      return this;
    }

    @Override
    public GetChallengeScRsp copyFrom(final GetChallengeScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        challengeList.copyFrom(other.challengeList);
        challengeRewardList.copyFrom(other.challengeRewardList);
      }
      return this;
    }

    @Override
    public GetChallengeScRsp mergeFrom(final GetChallengeScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasChallengeList()) {
        getMutableChallengeList().addAll(other.challengeList);
      }
      if (other.hasChallengeRewardList()) {
        getMutableChallengeRewardList().addAll(other.challengeRewardList);
      }
      return this;
    }

    @Override
    public GetChallengeScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      challengeList.clear();
      challengeRewardList.clear();
      return this;
    }

    @Override
    public GetChallengeScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      challengeList.clearQuick();
      challengeRewardList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof GetChallengeScRsp)) {
        return false;
      }
      GetChallengeScRsp other = (GetChallengeScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasChallengeList() || challengeList.equals(other.challengeList))
        && (!hasChallengeRewardList() || challengeRewardList.equals(other.challengeRewardList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 80);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        for (int i = 0; i < challengeList.length(); i++) {
          output.writeRawByte((byte) 10);
          output.writeMessageNoTag(challengeList.get(i));
        }
      }
      if ((bitField0_ & 0x00000004) != 0) {
        for (int i = 0; i < challengeRewardList.length(); i++) {
          output.writeRawByte((byte) 114);
          output.writeMessageNoTag(challengeRewardList.get(i));
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
        size += (1 * challengeList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(challengeList);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += (1 * challengeRewardList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(challengeRewardList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public GetChallengeScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 80: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 10) {
              break;
            }
          }
          case 10: {
            // challengeList
            tag = input.readRepeatedMessage(challengeList, tag);
            bitField0_ |= 0x00000002;
            if (tag != 114) {
              break;
            }
          }
          case 114: {
            // challengeRewardList
            tag = input.readRepeatedMessage(challengeRewardList, tag);
            bitField0_ |= 0x00000004;
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
        output.writeRepeatedMessage(FieldNames.challengeList, challengeList);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRepeatedMessage(FieldNames.challengeRewardList, challengeRewardList);
      }
      output.endObject();
    }

    @Override
    public GetChallengeScRsp mergeFrom(final JsonSource input) throws IOException {
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
          case -812402783:
          case 602944250: {
            if (input.isAtField(FieldNames.challengeList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(challengeList);
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1371323696:
          case -2132566574: {
            if (input.isAtField(FieldNames.challengeRewardList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(challengeRewardList);
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
    public GetChallengeScRsp clone() {
      return new GetChallengeScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static GetChallengeScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new GetChallengeScRsp(), data).checkInitialized();
    }

    public static GetChallengeScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetChallengeScRsp(), input).checkInitialized();
    }

    public static GetChallengeScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetChallengeScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating GetChallengeScRsp messages
     */
    public static MessageFactory<GetChallengeScRsp> getFactory() {
      return GetChallengeScRspFactory.INSTANCE;
    }

    private enum GetChallengeScRspFactory implements MessageFactory<GetChallengeScRsp> {
      INSTANCE;

      @Override
      public GetChallengeScRsp create() {
        return GetChallengeScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName challengeList = FieldName.forField("challengeList", "challenge_list");

      static final FieldName challengeRewardList = FieldName.forField("challengeRewardList", "challenge_reward_list");
    }
  }
}
