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

public final class AvatarSyncOuterClass {
  /**
   * Protobuf type {@code AvatarSync}
   */
  public static final class AvatarSync extends ProtoMessage<AvatarSync> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>repeated .Avatar avatar_list = 10;</code>
     */
    private final RepeatedMessage<AvatarOuterClass.Avatar> avatarList = RepeatedMessage.newEmptyInstance(AvatarOuterClass.Avatar.getFactory());

    private AvatarSync() {
    }

    /**
     * @return a new empty instance of {@code AvatarSync}
     */
    public static AvatarSync newInstance() {
      return new AvatarSync();
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>repeated .Avatar avatar_list = 10;</code>
     * @return whether the avatarList field is set
     */
    public boolean hasAvatarList() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>repeated .Avatar avatar_list = 10;</code>
     * @return this
     */
    public AvatarSync clearAvatarList() {
      bitField0_ &= ~0x00000001;
      avatarList.clear();
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>repeated .Avatar avatar_list = 10;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableAvatarList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<AvatarOuterClass.Avatar> getAvatarList() {
      return avatarList;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>repeated .Avatar avatar_list = 10;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<AvatarOuterClass.Avatar> getMutableAvatarList() {
      bitField0_ |= 0x00000001;
      return avatarList;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>repeated .Avatar avatar_list = 10;</code>
     * @param value the avatarList to add
     * @return this
     */
    public AvatarSync addAvatarList(final AvatarOuterClass.Avatar value) {
      bitField0_ |= 0x00000001;
      avatarList.add(value);
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>repeated .Avatar avatar_list = 10;</code>
     * @param values the avatarList to add
     * @return this
     */
    public AvatarSync addAllAvatarList(final AvatarOuterClass.Avatar... values) {
      bitField0_ |= 0x00000001;
      avatarList.addAll(values);
      return this;
    }

    @Override
    public AvatarSync copyFrom(final AvatarSync other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        avatarList.copyFrom(other.avatarList);
      }
      return this;
    }

    @Override
    public AvatarSync mergeFrom(final AvatarSync other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasAvatarList()) {
        getMutableAvatarList().addAll(other.avatarList);
      }
      return this;
    }

    @Override
    public AvatarSync clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      avatarList.clear();
      return this;
    }

    @Override
    public AvatarSync clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      avatarList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof AvatarSync)) {
        return false;
      }
      AvatarSync other = (AvatarSync) o;
      return bitField0_ == other.bitField0_
        && (!hasAvatarList() || avatarList.equals(other.avatarList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        for (int i = 0; i < avatarList.length(); i++) {
          output.writeRawByte((byte) 82);
          output.writeMessageNoTag(avatarList.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += (1 * avatarList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(avatarList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public AvatarSync mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 82: {
            // avatarList
            tag = input.readRepeatedMessage(avatarList, tag);
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
        output.writeRepeatedMessage(FieldNames.avatarList, avatarList);
      }
      output.endObject();
    }

    @Override
    public AvatarSync mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -403402345:
          case 397055940: {
            if (input.isAtField(FieldNames.avatarList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(avatarList);
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
    public AvatarSync clone() {
      return new AvatarSync().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static AvatarSync parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new AvatarSync(), data).checkInitialized();
    }

    public static AvatarSync parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new AvatarSync(), input).checkInitialized();
    }

    public static AvatarSync parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new AvatarSync(), input).checkInitialized();
    }

    /**
     * @return factory for creating AvatarSync messages
     */
    public static MessageFactory<AvatarSync> getFactory() {
      return AvatarSyncFactory.INSTANCE;
    }

    private enum AvatarSyncFactory implements MessageFactory<AvatarSync> {
      INSTANCE;

      @Override
      public AvatarSync create() {
        return AvatarSync.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName avatarList = FieldName.forField("avatarList", "avatar_list");
    }
  }
}
