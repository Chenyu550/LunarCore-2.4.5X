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

public final class ContentPackageDataOuterClass {
  /**
   * Protobuf type {@code ContentPackageData}
   */
  public static final class ContentPackageData extends ProtoMessage<ContentPackageData> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 cur_content_id = 2;</code>
     */
    private int curContentId;

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>repeated .ContentPackageInfo content_package_list = 14;</code>
     */
    private final RepeatedMessage<ContentPackageInfoOuterClass.ContentPackageInfo> contentPackageList = RepeatedMessage.newEmptyInstance(ContentPackageInfoOuterClass.ContentPackageInfo.getFactory());

    private ContentPackageData() {
    }

    /**
     * @return a new empty instance of {@code ContentPackageData}
     */
    public static ContentPackageData newInstance() {
      return new ContentPackageData();
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 cur_content_id = 2;</code>
     * @return whether the curContentId field is set
     */
    public boolean hasCurContentId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 cur_content_id = 2;</code>
     * @return this
     */
    public ContentPackageData clearCurContentId() {
      bitField0_ &= ~0x00000001;
      curContentId = 0;
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 cur_content_id = 2;</code>
     * @return the curContentId
     */
    public int getCurContentId() {
      return curContentId;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 cur_content_id = 2;</code>
     * @param value the curContentId to set
     * @return this
     */
    public ContentPackageData setCurContentId(final int value) {
      bitField0_ |= 0x00000001;
      curContentId = value;
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>repeated .ContentPackageInfo content_package_list = 14;</code>
     * @return whether the contentPackageList field is set
     */
    public boolean hasContentPackageList() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>repeated .ContentPackageInfo content_package_list = 14;</code>
     * @return this
     */
    public ContentPackageData clearContentPackageList() {
      bitField0_ &= ~0x00000002;
      contentPackageList.clear();
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>repeated .ContentPackageInfo content_package_list = 14;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableContentPackageList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<ContentPackageInfoOuterClass.ContentPackageInfo> getContentPackageList(
        ) {
      return contentPackageList;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>repeated .ContentPackageInfo content_package_list = 14;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<ContentPackageInfoOuterClass.ContentPackageInfo> getMutableContentPackageList(
        ) {
      bitField0_ |= 0x00000002;
      return contentPackageList;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>repeated .ContentPackageInfo content_package_list = 14;</code>
     * @param value the contentPackageList to add
     * @return this
     */
    public ContentPackageData addContentPackageList(
        final ContentPackageInfoOuterClass.ContentPackageInfo value) {
      bitField0_ |= 0x00000002;
      contentPackageList.add(value);
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>repeated .ContentPackageInfo content_package_list = 14;</code>
     * @param values the contentPackageList to add
     * @return this
     */
    public ContentPackageData addAllContentPackageList(
        final ContentPackageInfoOuterClass.ContentPackageInfo... values) {
      bitField0_ |= 0x00000002;
      contentPackageList.addAll(values);
      return this;
    }

    @Override
    public ContentPackageData copyFrom(final ContentPackageData other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        curContentId = other.curContentId;
        contentPackageList.copyFrom(other.contentPackageList);
      }
      return this;
    }

    @Override
    public ContentPackageData mergeFrom(final ContentPackageData other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasCurContentId()) {
        setCurContentId(other.curContentId);
      }
      if (other.hasContentPackageList()) {
        getMutableContentPackageList().addAll(other.contentPackageList);
      }
      return this;
    }

    @Override
    public ContentPackageData clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      curContentId = 0;
      contentPackageList.clear();
      return this;
    }

    @Override
    public ContentPackageData clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      contentPackageList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof ContentPackageData)) {
        return false;
      }
      ContentPackageData other = (ContentPackageData) o;
      return bitField0_ == other.bitField0_
        && (!hasCurContentId() || curContentId == other.curContentId)
        && (!hasContentPackageList() || contentPackageList.equals(other.contentPackageList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 16);
        output.writeUInt32NoTag(curContentId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        for (int i = 0; i < contentPackageList.length(); i++) {
          output.writeRawByte((byte) 114);
          output.writeMessageNoTag(contentPackageList.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(curContentId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += (1 * contentPackageList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(contentPackageList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public ContentPackageData mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 16: {
            // curContentId
            curContentId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 114) {
              break;
            }
          }
          case 114: {
            // contentPackageList
            tag = input.readRepeatedMessage(contentPackageList, tag);
            bitField0_ |= 0x00000002;
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
        output.writeUInt32(FieldNames.curContentId, curContentId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRepeatedMessage(FieldNames.contentPackageList, contentPackageList);
      }
      output.endObject();
    }

    @Override
    public ContentPackageData mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 773531924:
          case 409315840: {
            if (input.isAtField(FieldNames.curContentId)) {
              if (!input.trySkipNullValue()) {
                curContentId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1359668171:
          case -903023875: {
            if (input.isAtField(FieldNames.contentPackageList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(contentPackageList);
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
    public ContentPackageData clone() {
      return new ContentPackageData().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static ContentPackageData parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new ContentPackageData(), data).checkInitialized();
    }

    public static ContentPackageData parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ContentPackageData(), input).checkInitialized();
    }

    public static ContentPackageData parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ContentPackageData(), input).checkInitialized();
    }

    /**
     * @return factory for creating ContentPackageData messages
     */
    public static MessageFactory<ContentPackageData> getFactory() {
      return ContentPackageDataFactory.INSTANCE;
    }

    private enum ContentPackageDataFactory implements MessageFactory<ContentPackageData> {
      INSTANCE;

      @Override
      public ContentPackageData create() {
        return ContentPackageData.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName curContentId = FieldName.forField("curContentId", "cur_content_id");

      static final FieldName contentPackageList = FieldName.forField("contentPackageList", "content_package_list");
    }
  }
}
