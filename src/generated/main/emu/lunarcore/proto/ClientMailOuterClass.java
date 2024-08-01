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
import us.hebi.quickbuf.Utf8String;

public final class ClientMailOuterClass {
  /**
   * Protobuf type {@code ClientMail}
   */
  public static final class ClientMail extends ProtoMessage<ClientMail> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional int64 expire_time = 3;</code>
     */
    private long expireTime;

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional int64 time = 15;</code>
     */
    private long time;

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 template_id = 8;</code>
     */
    private int templateId;

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 id = 12;</code>
     */
    private int id;

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional bool is_read = 13;</code>
     */
    private boolean isRead;

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional .ItemList attachment = 14;</code>
     */
    private final ItemListOuterClass.ItemList attachment = ItemListOuterClass.ItemList.newInstance();

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional string title = 1;</code>
     */
    private final Utf8String title = Utf8String.newEmptyInstance();

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional string sender = 7;</code>
     */
    private final Utf8String sender = Utf8String.newEmptyInstance();

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional string content = 11;</code>
     */
    private final Utf8String content = Utf8String.newEmptyInstance();

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>repeated string para_list = 9;</code>
     */
    private final RepeatedString paraList = RepeatedString.newEmptyInstance();

    private ClientMail() {
    }

    /**
     * @return a new empty instance of {@code ClientMail}
     */
    public static ClientMail newInstance() {
      return new ClientMail();
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional int64 expire_time = 3;</code>
     * @return whether the expireTime field is set
     */
    public boolean hasExpireTime() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional int64 expire_time = 3;</code>
     * @return this
     */
    public ClientMail clearExpireTime() {
      bitField0_ &= ~0x00000001;
      expireTime = 0L;
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional int64 expire_time = 3;</code>
     * @return the expireTime
     */
    public long getExpireTime() {
      return expireTime;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional int64 expire_time = 3;</code>
     * @param value the expireTime to set
     * @return this
     */
    public ClientMail setExpireTime(final long value) {
      bitField0_ |= 0x00000001;
      expireTime = value;
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional int64 time = 15;</code>
     * @return whether the time field is set
     */
    public boolean hasTime() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional int64 time = 15;</code>
     * @return this
     */
    public ClientMail clearTime() {
      bitField0_ &= ~0x00000002;
      time = 0L;
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional int64 time = 15;</code>
     * @return the time
     */
    public long getTime() {
      return time;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional int64 time = 15;</code>
     * @param value the time to set
     * @return this
     */
    public ClientMail setTime(final long value) {
      bitField0_ |= 0x00000002;
      time = value;
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 template_id = 8;</code>
     * @return whether the templateId field is set
     */
    public boolean hasTemplateId() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 template_id = 8;</code>
     * @return this
     */
    public ClientMail clearTemplateId() {
      bitField0_ &= ~0x00000004;
      templateId = 0;
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 template_id = 8;</code>
     * @return the templateId
     */
    public int getTemplateId() {
      return templateId;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 template_id = 8;</code>
     * @param value the templateId to set
     * @return this
     */
    public ClientMail setTemplateId(final int value) {
      bitField0_ |= 0x00000004;
      templateId = value;
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 id = 12;</code>
     * @return whether the id field is set
     */
    public boolean hasId() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 id = 12;</code>
     * @return this
     */
    public ClientMail clearId() {
      bitField0_ &= ~0x00000008;
      id = 0;
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 id = 12;</code>
     * @return the id
     */
    public int getId() {
      return id;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 id = 12;</code>
     * @param value the id to set
     * @return this
     */
    public ClientMail setId(final int value) {
      bitField0_ |= 0x00000008;
      id = value;
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional bool is_read = 13;</code>
     * @return whether the isRead field is set
     */
    public boolean hasIsRead() {
      return (bitField0_ & 0x00000010) != 0;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional bool is_read = 13;</code>
     * @return this
     */
    public ClientMail clearIsRead() {
      bitField0_ &= ~0x00000010;
      isRead = false;
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional bool is_read = 13;</code>
     * @return the isRead
     */
    public boolean getIsRead() {
      return isRead;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional bool is_read = 13;</code>
     * @param value the isRead to set
     * @return this
     */
    public ClientMail setIsRead(final boolean value) {
      bitField0_ |= 0x00000010;
      isRead = value;
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional .ItemList attachment = 14;</code>
     * @return whether the attachment field is set
     */
    public boolean hasAttachment() {
      return (bitField0_ & 0x00000020) != 0;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional .ItemList attachment = 14;</code>
     * @return this
     */
    public ClientMail clearAttachment() {
      bitField0_ &= ~0x00000020;
      attachment.clear();
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional .ItemList attachment = 14;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableAttachment()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public ItemListOuterClass.ItemList getAttachment() {
      return attachment;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional .ItemList attachment = 14;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public ItemListOuterClass.ItemList getMutableAttachment() {
      bitField0_ |= 0x00000020;
      return attachment;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional .ItemList attachment = 14;</code>
     * @param value the attachment to set
     * @return this
     */
    public ClientMail setAttachment(final ItemListOuterClass.ItemList value) {
      bitField0_ |= 0x00000020;
      attachment.copyFrom(value);
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional string title = 1;</code>
     * @return whether the title field is set
     */
    public boolean hasTitle() {
      return (bitField0_ & 0x00000040) != 0;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional string title = 1;</code>
     * @return this
     */
    public ClientMail clearTitle() {
      bitField0_ &= ~0x00000040;
      title.clear();
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional string title = 1;</code>
     * @return the title
     */
    public String getTitle() {
      return title.getString();
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional string title = 1;</code>
     * @return internal {@code Utf8String} representation of title for reading
     */
    public Utf8String getTitleBytes() {
      return this.title;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional string title = 1;</code>
     * @return internal {@code Utf8String} representation of title for modifications
     */
    public Utf8String getMutableTitleBytes() {
      bitField0_ |= 0x00000040;
      return this.title;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional string title = 1;</code>
     * @param value the title to set
     * @return this
     */
    public ClientMail setTitle(final CharSequence value) {
      bitField0_ |= 0x00000040;
      title.copyFrom(value);
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional string title = 1;</code>
     * @param value the title to set
     * @return this
     */
    public ClientMail setTitle(final Utf8String value) {
      bitField0_ |= 0x00000040;
      title.copyFrom(value);
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional string sender = 7;</code>
     * @return whether the sender field is set
     */
    public boolean hasSender() {
      return (bitField0_ & 0x00000080) != 0;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional string sender = 7;</code>
     * @return this
     */
    public ClientMail clearSender() {
      bitField0_ &= ~0x00000080;
      sender.clear();
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional string sender = 7;</code>
     * @return the sender
     */
    public String getSender() {
      return sender.getString();
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional string sender = 7;</code>
     * @return internal {@code Utf8String} representation of sender for reading
     */
    public Utf8String getSenderBytes() {
      return this.sender;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional string sender = 7;</code>
     * @return internal {@code Utf8String} representation of sender for modifications
     */
    public Utf8String getMutableSenderBytes() {
      bitField0_ |= 0x00000080;
      return this.sender;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional string sender = 7;</code>
     * @param value the sender to set
     * @return this
     */
    public ClientMail setSender(final CharSequence value) {
      bitField0_ |= 0x00000080;
      sender.copyFrom(value);
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional string sender = 7;</code>
     * @param value the sender to set
     * @return this
     */
    public ClientMail setSender(final Utf8String value) {
      bitField0_ |= 0x00000080;
      sender.copyFrom(value);
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional string content = 11;</code>
     * @return whether the content field is set
     */
    public boolean hasContent() {
      return (bitField0_ & 0x00000100) != 0;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional string content = 11;</code>
     * @return this
     */
    public ClientMail clearContent() {
      bitField0_ &= ~0x00000100;
      content.clear();
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional string content = 11;</code>
     * @return the content
     */
    public String getContent() {
      return content.getString();
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional string content = 11;</code>
     * @return internal {@code Utf8String} representation of content for reading
     */
    public Utf8String getContentBytes() {
      return this.content;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional string content = 11;</code>
     * @return internal {@code Utf8String} representation of content for modifications
     */
    public Utf8String getMutableContentBytes() {
      bitField0_ |= 0x00000100;
      return this.content;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional string content = 11;</code>
     * @param value the content to set
     * @return this
     */
    public ClientMail setContent(final CharSequence value) {
      bitField0_ |= 0x00000100;
      content.copyFrom(value);
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional string content = 11;</code>
     * @param value the content to set
     * @return this
     */
    public ClientMail setContent(final Utf8String value) {
      bitField0_ |= 0x00000100;
      content.copyFrom(value);
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>repeated string para_list = 9;</code>
     * @return whether the paraList field is set
     */
    public boolean hasParaList() {
      return (bitField0_ & 0x00000200) != 0;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>repeated string para_list = 9;</code>
     * @return this
     */
    public ClientMail clearParaList() {
      bitField0_ &= ~0x00000200;
      paraList.clear();
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>repeated string para_list = 9;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableParaList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedString getParaList() {
      return paraList;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>repeated string para_list = 9;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedString getMutableParaList() {
      bitField0_ |= 0x00000200;
      return paraList;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>repeated string para_list = 9;</code>
     * @param value the paraList to add
     * @return this
     */
    public ClientMail addParaList(final CharSequence value) {
      bitField0_ |= 0x00000200;
      paraList.add(value);
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>repeated string para_list = 9;</code>
     * @param values the paraList to add
     * @return this
     */
    public ClientMail addAllParaList(final CharSequence... values) {
      bitField0_ |= 0x00000200;
      paraList.addAll(values);
      return this;
    }

    @Override
    public ClientMail copyFrom(final ClientMail other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        expireTime = other.expireTime;
        time = other.time;
        templateId = other.templateId;
        id = other.id;
        isRead = other.isRead;
        attachment.copyFrom(other.attachment);
        title.copyFrom(other.title);
        sender.copyFrom(other.sender);
        content.copyFrom(other.content);
        paraList.copyFrom(other.paraList);
      }
      return this;
    }

    @Override
    public ClientMail mergeFrom(final ClientMail other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasExpireTime()) {
        setExpireTime(other.expireTime);
      }
      if (other.hasTime()) {
        setTime(other.time);
      }
      if (other.hasTemplateId()) {
        setTemplateId(other.templateId);
      }
      if (other.hasId()) {
        setId(other.id);
      }
      if (other.hasIsRead()) {
        setIsRead(other.isRead);
      }
      if (other.hasAttachment()) {
        getMutableAttachment().mergeFrom(other.attachment);
      }
      if (other.hasTitle()) {
        getMutableTitleBytes().copyFrom(other.title);
      }
      if (other.hasSender()) {
        getMutableSenderBytes().copyFrom(other.sender);
      }
      if (other.hasContent()) {
        getMutableContentBytes().copyFrom(other.content);
      }
      if (other.hasParaList()) {
        getMutableParaList().addAll(other.paraList);
      }
      return this;
    }

    @Override
    public ClientMail clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      expireTime = 0L;
      time = 0L;
      templateId = 0;
      id = 0;
      isRead = false;
      attachment.clear();
      title.clear();
      sender.clear();
      content.clear();
      paraList.clear();
      return this;
    }

    @Override
    public ClientMail clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      attachment.clearQuick();
      title.clear();
      sender.clear();
      content.clear();
      paraList.clear();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof ClientMail)) {
        return false;
      }
      ClientMail other = (ClientMail) o;
      return bitField0_ == other.bitField0_
        && (!hasExpireTime() || expireTime == other.expireTime)
        && (!hasTime() || time == other.time)
        && (!hasTemplateId() || templateId == other.templateId)
        && (!hasId() || id == other.id)
        && (!hasIsRead() || isRead == other.isRead)
        && (!hasAttachment() || attachment.equals(other.attachment))
        && (!hasTitle() || title.equals(other.title))
        && (!hasSender() || sender.equals(other.sender))
        && (!hasContent() || content.equals(other.content))
        && (!hasParaList() || paraList.equals(other.paraList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 24);
        output.writeInt64NoTag(expireTime);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 120);
        output.writeInt64NoTag(time);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 64);
        output.writeUInt32NoTag(templateId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 96);
        output.writeUInt32NoTag(id);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeRawByte((byte) 104);
        output.writeBoolNoTag(isRead);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeRawByte((byte) 114);
        output.writeMessageNoTag(attachment);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        output.writeRawByte((byte) 10);
        output.writeStringNoTag(title);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        output.writeRawByte((byte) 58);
        output.writeStringNoTag(sender);
      }
      if ((bitField0_ & 0x00000100) != 0) {
        output.writeRawByte((byte) 90);
        output.writeStringNoTag(content);
      }
      if ((bitField0_ & 0x00000200) != 0) {
        for (int i = 0; i < paraList.length(); i++) {
          output.writeRawByte((byte) 74);
          output.writeStringNoTag(paraList.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeInt64SizeNoTag(expireTime);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeInt64SizeNoTag(time);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(templateId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(id);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        size += 2;
      }
      if ((bitField0_ & 0x00000020) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(attachment);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        size += 1 + ProtoSink.computeStringSizeNoTag(title);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        size += 1 + ProtoSink.computeStringSizeNoTag(sender);
      }
      if ((bitField0_ & 0x00000100) != 0) {
        size += 1 + ProtoSink.computeStringSizeNoTag(content);
      }
      if ((bitField0_ & 0x00000200) != 0) {
        size += (1 * paraList.length()) + ProtoSink.computeRepeatedStringSizeNoTag(paraList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public ClientMail mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 24: {
            // expireTime
            expireTime = input.readInt64();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 120) {
              break;
            }
          }
          case 120: {
            // time
            time = input.readInt64();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 64) {
              break;
            }
          }
          case 64: {
            // templateId
            templateId = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 96) {
              break;
            }
          }
          case 96: {
            // id
            id = input.readUInt32();
            bitField0_ |= 0x00000008;
            tag = input.readTag();
            if (tag != 104) {
              break;
            }
          }
          case 104: {
            // isRead
            isRead = input.readBool();
            bitField0_ |= 0x00000010;
            tag = input.readTag();
            if (tag != 114) {
              break;
            }
          }
          case 114: {
            // attachment
            input.readMessage(attachment);
            bitField0_ |= 0x00000020;
            tag = input.readTag();
            if (tag != 10) {
              break;
            }
          }
          case 10: {
            // title
            input.readString(title);
            bitField0_ |= 0x00000040;
            tag = input.readTag();
            if (tag != 58) {
              break;
            }
          }
          case 58: {
            // sender
            input.readString(sender);
            bitField0_ |= 0x00000080;
            tag = input.readTag();
            if (tag != 90) {
              break;
            }
          }
          case 90: {
            // content
            input.readString(content);
            bitField0_ |= 0x00000100;
            tag = input.readTag();
            if (tag != 74) {
              break;
            }
          }
          case 74: {
            // paraList
            tag = input.readRepeatedString(paraList, tag);
            bitField0_ |= 0x00000200;
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
        output.writeInt64(FieldNames.expireTime, expireTime);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeInt64(FieldNames.time, time);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.templateId, templateId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeUInt32(FieldNames.id, id);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeBool(FieldNames.isRead, isRead);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeMessage(FieldNames.attachment, attachment);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        output.writeString(FieldNames.title, title);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        output.writeString(FieldNames.sender, sender);
      }
      if ((bitField0_ & 0x00000100) != 0) {
        output.writeString(FieldNames.content, content);
      }
      if ((bitField0_ & 0x00000200) != 0) {
        output.writeRepeatedString(FieldNames.paraList, paraList);
      }
      output.endObject();
    }

    @Override
    public ClientMail mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -834724724:
          case -96179731: {
            if (input.isAtField(FieldNames.expireTime)) {
              if (!input.trySkipNullValue()) {
                expireTime = input.readInt64();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 3560141: {
            if (input.isAtField(FieldNames.time)) {
              if (!input.trySkipNullValue()) {
                time = input.readInt64();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1304010549:
          case 1769642752: {
            if (input.isAtField(FieldNames.templateId)) {
              if (!input.trySkipNullValue()) {
                templateId = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 3355: {
            if (input.isAtField(FieldNames.id)) {
              if (!input.trySkipNullValue()) {
                id = input.readUInt32();
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1180158496:
          case 2082189195: {
            if (input.isAtField(FieldNames.isRead)) {
              if (!input.trySkipNullValue()) {
                isRead = input.readBool();
                bitField0_ |= 0x00000010;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1963501277: {
            if (input.isAtField(FieldNames.attachment)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(attachment);
                bitField0_ |= 0x00000020;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 110371416: {
            if (input.isAtField(FieldNames.title)) {
              if (!input.trySkipNullValue()) {
                input.readString(title);
                bitField0_ |= 0x00000040;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -905962955: {
            if (input.isAtField(FieldNames.sender)) {
              if (!input.trySkipNullValue()) {
                input.readString(sender);
                bitField0_ |= 0x00000080;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 951530617: {
            if (input.isAtField(FieldNames.content)) {
              if (!input.trySkipNullValue()) {
                input.readString(content);
                bitField0_ |= 0x00000100;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1170446494:
          case 1941729693: {
            if (input.isAtField(FieldNames.paraList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedString(paraList);
                bitField0_ |= 0x00000200;
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
    public ClientMail clone() {
      return new ClientMail().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static ClientMail parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new ClientMail(), data).checkInitialized();
    }

    public static ClientMail parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ClientMail(), input).checkInitialized();
    }

    public static ClientMail parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ClientMail(), input).checkInitialized();
    }

    /**
     * @return factory for creating ClientMail messages
     */
    public static MessageFactory<ClientMail> getFactory() {
      return ClientMailFactory.INSTANCE;
    }

    private enum ClientMailFactory implements MessageFactory<ClientMail> {
      INSTANCE;

      @Override
      public ClientMail create() {
        return ClientMail.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName expireTime = FieldName.forField("expireTime", "expire_time");

      static final FieldName time = FieldName.forField("time");

      static final FieldName templateId = FieldName.forField("templateId", "template_id");

      static final FieldName id = FieldName.forField("id");

      static final FieldName isRead = FieldName.forField("isRead", "is_read");

      static final FieldName attachment = FieldName.forField("attachment");

      static final FieldName title = FieldName.forField("title");

      static final FieldName sender = FieldName.forField("sender");

      static final FieldName content = FieldName.forField("content");

      static final FieldName paraList = FieldName.forField("paraList", "para_list");
    }
  }
}
