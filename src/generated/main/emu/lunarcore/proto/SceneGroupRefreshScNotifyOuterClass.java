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

public final class SceneGroupRefreshScNotifyOuterClass {
  /**
   * Protobuf type {@code SceneGroupRefreshScNotify}
   */
  public static final class SceneGroupRefreshScNotify extends ProtoMessage<SceneGroupRefreshScNotify> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>repeated .SceneGroupRefreshInfo group_refresh_info = 1;</code>
     */
    private final RepeatedMessage<SceneGroupRefreshInfoOuterClass.SceneGroupRefreshInfo> groupRefreshInfo = RepeatedMessage.newEmptyInstance(SceneGroupRefreshInfoOuterClass.SceneGroupRefreshInfo.getFactory());

    private SceneGroupRefreshScNotify() {
    }

    /**
     * @return a new empty instance of {@code SceneGroupRefreshScNotify}
     */
    public static SceneGroupRefreshScNotify newInstance() {
      return new SceneGroupRefreshScNotify();
    }

    /**
     * <code>repeated .SceneGroupRefreshInfo group_refresh_info = 1;</code>
     * @return whether the groupRefreshInfo field is set
     */
    public boolean hasGroupRefreshInfo() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>repeated .SceneGroupRefreshInfo group_refresh_info = 1;</code>
     * @return this
     */
    public SceneGroupRefreshScNotify clearGroupRefreshInfo() {
      bitField0_ &= ~0x00000001;
      groupRefreshInfo.clear();
      return this;
    }

    /**
     * <code>repeated .SceneGroupRefreshInfo group_refresh_info = 1;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableGroupRefreshInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<SceneGroupRefreshInfoOuterClass.SceneGroupRefreshInfo> getGroupRefreshInfo(
        ) {
      return groupRefreshInfo;
    }

    /**
     * <code>repeated .SceneGroupRefreshInfo group_refresh_info = 1;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<SceneGroupRefreshInfoOuterClass.SceneGroupRefreshInfo> getMutableGroupRefreshInfo(
        ) {
      bitField0_ |= 0x00000001;
      return groupRefreshInfo;
    }

    /**
     * <code>repeated .SceneGroupRefreshInfo group_refresh_info = 1;</code>
     * @param value the groupRefreshInfo to add
     * @return this
     */
    public SceneGroupRefreshScNotify addGroupRefreshInfo(
        final SceneGroupRefreshInfoOuterClass.SceneGroupRefreshInfo value) {
      bitField0_ |= 0x00000001;
      groupRefreshInfo.add(value);
      return this;
    }

    /**
     * <code>repeated .SceneGroupRefreshInfo group_refresh_info = 1;</code>
     * @param values the groupRefreshInfo to add
     * @return this
     */
    public SceneGroupRefreshScNotify addAllGroupRefreshInfo(
        final SceneGroupRefreshInfoOuterClass.SceneGroupRefreshInfo... values) {
      bitField0_ |= 0x00000001;
      groupRefreshInfo.addAll(values);
      return this;
    }

    @Override
    public SceneGroupRefreshScNotify copyFrom(final SceneGroupRefreshScNotify other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        groupRefreshInfo.copyFrom(other.groupRefreshInfo);
      }
      return this;
    }

    @Override
    public SceneGroupRefreshScNotify mergeFrom(final SceneGroupRefreshScNotify other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasGroupRefreshInfo()) {
        getMutableGroupRefreshInfo().addAll(other.groupRefreshInfo);
      }
      return this;
    }

    @Override
    public SceneGroupRefreshScNotify clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      groupRefreshInfo.clear();
      return this;
    }

    @Override
    public SceneGroupRefreshScNotify clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      groupRefreshInfo.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof SceneGroupRefreshScNotify)) {
        return false;
      }
      SceneGroupRefreshScNotify other = (SceneGroupRefreshScNotify) o;
      return bitField0_ == other.bitField0_
        && (!hasGroupRefreshInfo() || groupRefreshInfo.equals(other.groupRefreshInfo));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        for (int i = 0; i < groupRefreshInfo.length(); i++) {
          output.writeRawByte((byte) 10);
          output.writeMessageNoTag(groupRefreshInfo.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += (1 * groupRefreshInfo.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(groupRefreshInfo);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public SceneGroupRefreshScNotify mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 10: {
            // groupRefreshInfo
            tag = input.readRepeatedMessage(groupRefreshInfo, tag);
            bitField0_ |= 0x00000001;
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
        output.writeRepeatedMessage(FieldNames.groupRefreshInfo, groupRefreshInfo);
      }
      output.endObject();
    }

    @Override
    public SceneGroupRefreshScNotify mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 618562090:
          case 851400018: {
            if (input.isAtField(FieldNames.groupRefreshInfo)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(groupRefreshInfo);
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
    public SceneGroupRefreshScNotify clone() {
      return new SceneGroupRefreshScNotify().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static SceneGroupRefreshScNotify parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new SceneGroupRefreshScNotify(), data).checkInitialized();
    }

    public static SceneGroupRefreshScNotify parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SceneGroupRefreshScNotify(), input).checkInitialized();
    }

    public static SceneGroupRefreshScNotify parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SceneGroupRefreshScNotify(), input).checkInitialized();
    }

    /**
     * @return factory for creating SceneGroupRefreshScNotify messages
     */
    public static MessageFactory<SceneGroupRefreshScNotify> getFactory() {
      return SceneGroupRefreshScNotifyFactory.INSTANCE;
    }

    private enum SceneGroupRefreshScNotifyFactory implements MessageFactory<SceneGroupRefreshScNotify> {
      INSTANCE;

      @Override
      public SceneGroupRefreshScNotify create() {
        return SceneGroupRefreshScNotify.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName groupRefreshInfo = FieldName.forField("groupRefreshInfo", "group_refresh_info");
    }
  }
}
