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
import us.hebi.quickbuf.RepeatedEnum;

public final class SyncLineupNotifyOuterClass {
  /**
   * Protobuf type {@code SyncLineupNotify}
   */
  public static final class SyncLineupNotify extends ProtoMessage<SyncLineupNotify> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional .LineupInfo lineup = 14;</code>
     */
    private final LineupInfoOuterClass.LineupInfo lineup = LineupInfoOuterClass.LineupInfo.newInstance();

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>repeated .SyncReason reason_list = 3;</code>
     */
    private final RepeatedEnum<SyncReasonOuterClass.SyncReason> reasonList = RepeatedEnum.newEmptyInstance(SyncReasonOuterClass.SyncReason.converter());

    private SyncLineupNotify() {
    }

    /**
     * @return a new empty instance of {@code SyncLineupNotify}
     */
    public static SyncLineupNotify newInstance() {
      return new SyncLineupNotify();
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional .LineupInfo lineup = 14;</code>
     * @return whether the lineup field is set
     */
    public boolean hasLineup() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional .LineupInfo lineup = 14;</code>
     * @return this
     */
    public SyncLineupNotify clearLineup() {
      bitField0_ &= ~0x00000001;
      lineup.clear();
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional .LineupInfo lineup = 14;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableLineup()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public LineupInfoOuterClass.LineupInfo getLineup() {
      return lineup;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional .LineupInfo lineup = 14;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public LineupInfoOuterClass.LineupInfo getMutableLineup() {
      bitField0_ |= 0x00000001;
      return lineup;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional .LineupInfo lineup = 14;</code>
     * @param value the lineup to set
     * @return this
     */
    public SyncLineupNotify setLineup(final LineupInfoOuterClass.LineupInfo value) {
      bitField0_ |= 0x00000001;
      lineup.copyFrom(value);
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>repeated .SyncReason reason_list = 3;</code>
     * @return whether the reasonList field is set
     */
    public boolean hasReasonList() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>repeated .SyncReason reason_list = 3;</code>
     * @return this
     */
    public SyncLineupNotify clearReasonList() {
      bitField0_ &= ~0x00000002;
      reasonList.clear();
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>repeated .SyncReason reason_list = 3;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableReasonList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedEnum<SyncReasonOuterClass.SyncReason> getReasonList() {
      return reasonList;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>repeated .SyncReason reason_list = 3;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedEnum<SyncReasonOuterClass.SyncReason> getMutableReasonList() {
      bitField0_ |= 0x00000002;
      return reasonList;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>repeated .SyncReason reason_list = 3;</code>
     * @param value the reasonList to add
     * @return this
     */
    public SyncLineupNotify addReasonList(final SyncReasonOuterClass.SyncReason value) {
      bitField0_ |= 0x00000002;
      reasonList.add(value);
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>repeated .SyncReason reason_list = 3;</code>
     * @param values the reasonList to add
     * @return this
     */
    public SyncLineupNotify addAllReasonList(final SyncReasonOuterClass.SyncReason... values) {
      bitField0_ |= 0x00000002;
      reasonList.addAll(values);
      return this;
    }

    @Override
    public SyncLineupNotify copyFrom(final SyncLineupNotify other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        lineup.copyFrom(other.lineup);
        reasonList.copyFrom(other.reasonList);
      }
      return this;
    }

    @Override
    public SyncLineupNotify mergeFrom(final SyncLineupNotify other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasLineup()) {
        getMutableLineup().mergeFrom(other.lineup);
      }
      if (other.hasReasonList()) {
        getMutableReasonList().addAll(other.reasonList);
      }
      return this;
    }

    @Override
    public SyncLineupNotify clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      lineup.clear();
      reasonList.clear();
      return this;
    }

    @Override
    public SyncLineupNotify clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      lineup.clearQuick();
      reasonList.clear();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof SyncLineupNotify)) {
        return false;
      }
      SyncLineupNotify other = (SyncLineupNotify) o;
      return bitField0_ == other.bitField0_
        && (!hasLineup() || lineup.equals(other.lineup))
        && (!hasReasonList() || reasonList.equals(other.reasonList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 114);
        output.writeMessageNoTag(lineup);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        for (int i = 0; i < reasonList.length(); i++) {
          output.writeRawByte((byte) 24);
          output.writeEnumNoTag(reasonList.array()[i]);
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(lineup);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += (1 * reasonList.length()) + ProtoSink.computeRepeatedEnumSizeNoTag(reasonList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public SyncLineupNotify mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 114: {
            // lineup
            input.readMessage(lineup);
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 26) {
              break;
            }
          }
          case 26: {
            // reasonList [packed=true]
            input.readPackedEnum(reasonList, tag);
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
          case 24: {
            // reasonList [packed=false]
            tag = input.readRepeatedEnum(reasonList, tag);
            bitField0_ |= 0x00000002;
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeMessage(FieldNames.lineup, lineup);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRepeatedEnum(FieldNames.reasonList, reasonList);
      }
      output.endObject();
    }

    @Override
    public SyncLineupNotify mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1102671473: {
            if (input.isAtField(FieldNames.lineup)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(lineup);
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 722400514:
          case 937206201: {
            if (input.isAtField(FieldNames.reasonList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedEnum(reasonList, SyncReasonOuterClass.SyncReason.converter());
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
    public SyncLineupNotify clone() {
      return new SyncLineupNotify().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static SyncLineupNotify parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new SyncLineupNotify(), data).checkInitialized();
    }

    public static SyncLineupNotify parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SyncLineupNotify(), input).checkInitialized();
    }

    public static SyncLineupNotify parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SyncLineupNotify(), input).checkInitialized();
    }

    /**
     * @return factory for creating SyncLineupNotify messages
     */
    public static MessageFactory<SyncLineupNotify> getFactory() {
      return SyncLineupNotifyFactory.INSTANCE;
    }

    private enum SyncLineupNotifyFactory implements MessageFactory<SyncLineupNotify> {
      INSTANCE;

      @Override
      public SyncLineupNotify create() {
        return SyncLineupNotify.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName lineup = FieldName.forField("lineup");

      static final FieldName reasonList = FieldName.forField("reasonList", "reason_list");
    }
  }
}
