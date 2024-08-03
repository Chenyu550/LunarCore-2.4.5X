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

public final class StartChallengeStoryBuffInfoOuterClass {
  /**
   * Protobuf type {@code StartChallengeStoryBuffInfo}
   */
  public static final class StartChallengeStoryBuffInfo extends ProtoMessage<StartChallengeStoryBuffInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <pre>
     *  ?
     * </pre>
     *
     * <code>optional uint32 story_buff_one = 2;</code>
     */
    private int storyBuffOne;

    /**
     * <pre>
     *  ?
     * </pre>
     *
     * <code>optional uint32 story_buff_two = 13;</code>
     */
    private int storyBuffTwo;

    private StartChallengeStoryBuffInfo() {
    }

    /**
     * @return a new empty instance of {@code StartChallengeStoryBuffInfo}
     */
    public static StartChallengeStoryBuffInfo newInstance() {
      return new StartChallengeStoryBuffInfo();
    }

    /**
     * <pre>
     *  ?
     * </pre>
     *
     * <code>optional uint32 story_buff_one = 2;</code>
     * @return whether the storyBuffOne field is set
     */
    public boolean hasStoryBuffOne() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <pre>
     *  ?
     * </pre>
     *
     * <code>optional uint32 story_buff_one = 2;</code>
     * @return this
     */
    public StartChallengeStoryBuffInfo clearStoryBuffOne() {
      bitField0_ &= ~0x00000001;
      storyBuffOne = 0;
      return this;
    }

    /**
     * <pre>
     *  ?
     * </pre>
     *
     * <code>optional uint32 story_buff_one = 2;</code>
     * @return the storyBuffOne
     */
    public int getStoryBuffOne() {
      return storyBuffOne;
    }

    /**
     * <pre>
     *  ?
     * </pre>
     *
     * <code>optional uint32 story_buff_one = 2;</code>
     * @param value the storyBuffOne to set
     * @return this
     */
    public StartChallengeStoryBuffInfo setStoryBuffOne(final int value) {
      bitField0_ |= 0x00000001;
      storyBuffOne = value;
      return this;
    }

    /**
     * <pre>
     *  ?
     * </pre>
     *
     * <code>optional uint32 story_buff_two = 13;</code>
     * @return whether the storyBuffTwo field is set
     */
    public boolean hasStoryBuffTwo() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <pre>
     *  ?
     * </pre>
     *
     * <code>optional uint32 story_buff_two = 13;</code>
     * @return this
     */
    public StartChallengeStoryBuffInfo clearStoryBuffTwo() {
      bitField0_ &= ~0x00000002;
      storyBuffTwo = 0;
      return this;
    }

    /**
     * <pre>
     *  ?
     * </pre>
     *
     * <code>optional uint32 story_buff_two = 13;</code>
     * @return the storyBuffTwo
     */
    public int getStoryBuffTwo() {
      return storyBuffTwo;
    }

    /**
     * <pre>
     *  ?
     * </pre>
     *
     * <code>optional uint32 story_buff_two = 13;</code>
     * @param value the storyBuffTwo to set
     * @return this
     */
    public StartChallengeStoryBuffInfo setStoryBuffTwo(final int value) {
      bitField0_ |= 0x00000002;
      storyBuffTwo = value;
      return this;
    }

    @Override
    public StartChallengeStoryBuffInfo copyFrom(final StartChallengeStoryBuffInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        storyBuffOne = other.storyBuffOne;
        storyBuffTwo = other.storyBuffTwo;
      }
      return this;
    }

    @Override
    public StartChallengeStoryBuffInfo mergeFrom(final StartChallengeStoryBuffInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasStoryBuffOne()) {
        setStoryBuffOne(other.storyBuffOne);
      }
      if (other.hasStoryBuffTwo()) {
        setStoryBuffTwo(other.storyBuffTwo);
      }
      return this;
    }

    @Override
    public StartChallengeStoryBuffInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      storyBuffOne = 0;
      storyBuffTwo = 0;
      return this;
    }

    @Override
    public StartChallengeStoryBuffInfo clearQuick() {
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
      if (!(o instanceof StartChallengeStoryBuffInfo)) {
        return false;
      }
      StartChallengeStoryBuffInfo other = (StartChallengeStoryBuffInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasStoryBuffOne() || storyBuffOne == other.storyBuffOne)
        && (!hasStoryBuffTwo() || storyBuffTwo == other.storyBuffTwo);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 16);
        output.writeUInt32NoTag(storyBuffOne);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 104);
        output.writeUInt32NoTag(storyBuffTwo);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(storyBuffOne);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(storyBuffTwo);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public StartChallengeStoryBuffInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 16: {
            // storyBuffOne
            storyBuffOne = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 104) {
              break;
            }
          }
          case 104: {
            // storyBuffTwo
            storyBuffTwo = input.readUInt32();
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
        output.writeUInt32(FieldNames.storyBuffOne, storyBuffOne);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.storyBuffTwo, storyBuffTwo);
      }
      output.endObject();
    }

    @Override
    public StartChallengeStoryBuffInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1761423966:
          case 1329547396: {
            if (input.isAtField(FieldNames.storyBuffOne)) {
              if (!input.trySkipNullValue()) {
                storyBuffOne = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1761429060:
          case 1329552490: {
            if (input.isAtField(FieldNames.storyBuffTwo)) {
              if (!input.trySkipNullValue()) {
                storyBuffTwo = input.readUInt32();
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
    public StartChallengeStoryBuffInfo clone() {
      return new StartChallengeStoryBuffInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static StartChallengeStoryBuffInfo parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new StartChallengeStoryBuffInfo(), data).checkInitialized();
    }

    public static StartChallengeStoryBuffInfo parseFrom(final ProtoSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new StartChallengeStoryBuffInfo(), input).checkInitialized();
    }

    public static StartChallengeStoryBuffInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new StartChallengeStoryBuffInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating StartChallengeStoryBuffInfo messages
     */
    public static MessageFactory<StartChallengeStoryBuffInfo> getFactory() {
      return StartChallengeStoryBuffInfoFactory.INSTANCE;
    }

    private enum StartChallengeStoryBuffInfoFactory implements MessageFactory<StartChallengeStoryBuffInfo> {
      INSTANCE;

      @Override
      public StartChallengeStoryBuffInfo create() {
        return StartChallengeStoryBuffInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName storyBuffOne = FieldName.forField("storyBuffOne", "story_buff_one");

      static final FieldName storyBuffTwo = FieldName.forField("storyBuffTwo", "story_buff_two");
    }
  }
}
