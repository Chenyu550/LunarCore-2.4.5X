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
import us.hebi.quickbuf.Utf8String;

public final class SimpleInfoOuterClass {
  /**
   * Protobuf type {@code SimpleInfo}
   */
  public static final class SimpleInfo extends ProtoMessage<SimpleInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional int64 last_active_time = 11;</code>
     */
    private long lastActiveTime;

    /**
     * <pre>
     * or 8
     * </pre>
     *
     * <code>optional uint32 chat_bubble_id = 5;</code>
     */
    private int chatBubbleId;

    /**
     * <pre>
     * or 5
     * </pre>
     *
     * <code>optional uint32 head_icon = 8;</code>
     */
    private int headIcon;

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 level = 12;</code>
     */
    private int level;

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 uid = 15;</code>
     */
    private int uid;

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional .PlatformType platform_type = 3;</code>
     */
    private int platformType;

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional .FriendOnlineStatus online_status = 14;</code>
     */
    private int onlineStatus;

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional bool is_banned = 4;</code>
     */
    private boolean isBanned;

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional string signature = 6;</code>
     */
    private final Utf8String signature = Utf8String.newEmptyInstance();

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional string nickname = 7;</code>
     */
    private final Utf8String nickname = Utf8String.newEmptyInstance();

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>repeated .AssistSimpleInfo assist_simple_info = 1;</code>
     */
    private final RepeatedMessage<AssistSimpleInfoOuterClass.AssistSimpleInfo> assistSimpleInfo = RepeatedMessage.newEmptyInstance(AssistSimpleInfoOuterClass.AssistSimpleInfo.getFactory());

    private SimpleInfo() {
    }

    /**
     * @return a new empty instance of {@code SimpleInfo}
     */
    public static SimpleInfo newInstance() {
      return new SimpleInfo();
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional int64 last_active_time = 11;</code>
     * @return whether the lastActiveTime field is set
     */
    public boolean hasLastActiveTime() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional int64 last_active_time = 11;</code>
     * @return this
     */
    public SimpleInfo clearLastActiveTime() {
      bitField0_ &= ~0x00000001;
      lastActiveTime = 0L;
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional int64 last_active_time = 11;</code>
     * @return the lastActiveTime
     */
    public long getLastActiveTime() {
      return lastActiveTime;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional int64 last_active_time = 11;</code>
     * @param value the lastActiveTime to set
     * @return this
     */
    public SimpleInfo setLastActiveTime(final long value) {
      bitField0_ |= 0x00000001;
      lastActiveTime = value;
      return this;
    }

    /**
     * <pre>
     * or 8
     * </pre>
     *
     * <code>optional uint32 chat_bubble_id = 5;</code>
     * @return whether the chatBubbleId field is set
     */
    public boolean hasChatBubbleId() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <pre>
     * or 8
     * </pre>
     *
     * <code>optional uint32 chat_bubble_id = 5;</code>
     * @return this
     */
    public SimpleInfo clearChatBubbleId() {
      bitField0_ &= ~0x00000002;
      chatBubbleId = 0;
      return this;
    }

    /**
     * <pre>
     * or 8
     * </pre>
     *
     * <code>optional uint32 chat_bubble_id = 5;</code>
     * @return the chatBubbleId
     */
    public int getChatBubbleId() {
      return chatBubbleId;
    }

    /**
     * <pre>
     * or 8
     * </pre>
     *
     * <code>optional uint32 chat_bubble_id = 5;</code>
     * @param value the chatBubbleId to set
     * @return this
     */
    public SimpleInfo setChatBubbleId(final int value) {
      bitField0_ |= 0x00000002;
      chatBubbleId = value;
      return this;
    }

    /**
     * <pre>
     * or 5
     * </pre>
     *
     * <code>optional uint32 head_icon = 8;</code>
     * @return whether the headIcon field is set
     */
    public boolean hasHeadIcon() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <pre>
     * or 5
     * </pre>
     *
     * <code>optional uint32 head_icon = 8;</code>
     * @return this
     */
    public SimpleInfo clearHeadIcon() {
      bitField0_ &= ~0x00000004;
      headIcon = 0;
      return this;
    }

    /**
     * <pre>
     * or 5
     * </pre>
     *
     * <code>optional uint32 head_icon = 8;</code>
     * @return the headIcon
     */
    public int getHeadIcon() {
      return headIcon;
    }

    /**
     * <pre>
     * or 5
     * </pre>
     *
     * <code>optional uint32 head_icon = 8;</code>
     * @param value the headIcon to set
     * @return this
     */
    public SimpleInfo setHeadIcon(final int value) {
      bitField0_ |= 0x00000004;
      headIcon = value;
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 level = 12;</code>
     * @return whether the level field is set
     */
    public boolean hasLevel() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 level = 12;</code>
     * @return this
     */
    public SimpleInfo clearLevel() {
      bitField0_ &= ~0x00000008;
      level = 0;
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 level = 12;</code>
     * @return the level
     */
    public int getLevel() {
      return level;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 level = 12;</code>
     * @param value the level to set
     * @return this
     */
    public SimpleInfo setLevel(final int value) {
      bitField0_ |= 0x00000008;
      level = value;
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 uid = 15;</code>
     * @return whether the uid field is set
     */
    public boolean hasUid() {
      return (bitField0_ & 0x00000010) != 0;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 uid = 15;</code>
     * @return this
     */
    public SimpleInfo clearUid() {
      bitField0_ &= ~0x00000010;
      uid = 0;
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 uid = 15;</code>
     * @return the uid
     */
    public int getUid() {
      return uid;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 uid = 15;</code>
     * @param value the uid to set
     * @return this
     */
    public SimpleInfo setUid(final int value) {
      bitField0_ |= 0x00000010;
      uid = value;
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional .PlatformType platform_type = 3;</code>
     * @return whether the platformType field is set
     */
    public boolean hasPlatformType() {
      return (bitField0_ & 0x00000020) != 0;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional .PlatformType platform_type = 3;</code>
     * @return this
     */
    public SimpleInfo clearPlatformType() {
      bitField0_ &= ~0x00000020;
      platformType = 0;
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional .PlatformType platform_type = 3;</code>
     * @return the platformType
     */
    public PlatformTypeOuterClass.PlatformType getPlatformType() {
      return PlatformTypeOuterClass.PlatformType.forNumber(platformType);
    }

    /**
     * Gets the value of the internal enum store. The result is
     * equivalent to {@link SimpleInfo#getPlatformType()}.getNumber().
     *
     * @return numeric wire representation
     */
    public int getPlatformTypeValue() {
      return platformType;
    }

    /**
     * Sets the value of the internal enum store. This does not
     * do any validity checks, so be sure to use appropriate value
     * constants from {@link PlatformTypeOuterClass.PlatformType}. Setting an invalid value
     * can cause {@link SimpleInfo#getPlatformType()} to return null
     *
     * @param value the numeric wire value to set
     * @return this
     */
    public SimpleInfo setPlatformTypeValue(final int value) {
      bitField0_ |= 0x00000020;
      platformType = value;
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional .PlatformType platform_type = 3;</code>
     * @param value the platformType to set
     * @return this
     */
    public SimpleInfo setPlatformType(final PlatformTypeOuterClass.PlatformType value) {
      bitField0_ |= 0x00000020;
      platformType = value.getNumber();
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional .FriendOnlineStatus online_status = 14;</code>
     * @return whether the onlineStatus field is set
     */
    public boolean hasOnlineStatus() {
      return (bitField0_ & 0x00000040) != 0;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional .FriendOnlineStatus online_status = 14;</code>
     * @return this
     */
    public SimpleInfo clearOnlineStatus() {
      bitField0_ &= ~0x00000040;
      onlineStatus = 0;
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional .FriendOnlineStatus online_status = 14;</code>
     * @return the onlineStatus
     */
    public FriendOnlineStatusOuterClass.FriendOnlineStatus getOnlineStatus() {
      return FriendOnlineStatusOuterClass.FriendOnlineStatus.forNumber(onlineStatus);
    }

    /**
     * Gets the value of the internal enum store. The result is
     * equivalent to {@link SimpleInfo#getOnlineStatus()}.getNumber().
     *
     * @return numeric wire representation
     */
    public int getOnlineStatusValue() {
      return onlineStatus;
    }

    /**
     * Sets the value of the internal enum store. This does not
     * do any validity checks, so be sure to use appropriate value
     * constants from {@link FriendOnlineStatusOuterClass.FriendOnlineStatus}. Setting an invalid value
     * can cause {@link SimpleInfo#getOnlineStatus()} to return null
     *
     * @param value the numeric wire value to set
     * @return this
     */
    public SimpleInfo setOnlineStatusValue(final int value) {
      bitField0_ |= 0x00000040;
      onlineStatus = value;
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional .FriendOnlineStatus online_status = 14;</code>
     * @param value the onlineStatus to set
     * @return this
     */
    public SimpleInfo setOnlineStatus(final FriendOnlineStatusOuterClass.FriendOnlineStatus value) {
      bitField0_ |= 0x00000040;
      onlineStatus = value.getNumber();
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional bool is_banned = 4;</code>
     * @return whether the isBanned field is set
     */
    public boolean hasIsBanned() {
      return (bitField0_ & 0x00000080) != 0;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional bool is_banned = 4;</code>
     * @return this
     */
    public SimpleInfo clearIsBanned() {
      bitField0_ &= ~0x00000080;
      isBanned = false;
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional bool is_banned = 4;</code>
     * @return the isBanned
     */
    public boolean getIsBanned() {
      return isBanned;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional bool is_banned = 4;</code>
     * @param value the isBanned to set
     * @return this
     */
    public SimpleInfo setIsBanned(final boolean value) {
      bitField0_ |= 0x00000080;
      isBanned = value;
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional string signature = 6;</code>
     * @return whether the signature field is set
     */
    public boolean hasSignature() {
      return (bitField0_ & 0x00000100) != 0;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional string signature = 6;</code>
     * @return this
     */
    public SimpleInfo clearSignature() {
      bitField0_ &= ~0x00000100;
      signature.clear();
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional string signature = 6;</code>
     * @return the signature
     */
    public String getSignature() {
      return signature.getString();
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional string signature = 6;</code>
     * @return internal {@code Utf8String} representation of signature for reading
     */
    public Utf8String getSignatureBytes() {
      return this.signature;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional string signature = 6;</code>
     * @return internal {@code Utf8String} representation of signature for modifications
     */
    public Utf8String getMutableSignatureBytes() {
      bitField0_ |= 0x00000100;
      return this.signature;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional string signature = 6;</code>
     * @param value the signature to set
     * @return this
     */
    public SimpleInfo setSignature(final CharSequence value) {
      bitField0_ |= 0x00000100;
      signature.copyFrom(value);
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional string signature = 6;</code>
     * @param value the signature to set
     * @return this
     */
    public SimpleInfo setSignature(final Utf8String value) {
      bitField0_ |= 0x00000100;
      signature.copyFrom(value);
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional string nickname = 7;</code>
     * @return whether the nickname field is set
     */
    public boolean hasNickname() {
      return (bitField0_ & 0x00000200) != 0;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional string nickname = 7;</code>
     * @return this
     */
    public SimpleInfo clearNickname() {
      bitField0_ &= ~0x00000200;
      nickname.clear();
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional string nickname = 7;</code>
     * @return the nickname
     */
    public String getNickname() {
      return nickname.getString();
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional string nickname = 7;</code>
     * @return internal {@code Utf8String} representation of nickname for reading
     */
    public Utf8String getNicknameBytes() {
      return this.nickname;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional string nickname = 7;</code>
     * @return internal {@code Utf8String} representation of nickname for modifications
     */
    public Utf8String getMutableNicknameBytes() {
      bitField0_ |= 0x00000200;
      return this.nickname;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional string nickname = 7;</code>
     * @param value the nickname to set
     * @return this
     */
    public SimpleInfo setNickname(final CharSequence value) {
      bitField0_ |= 0x00000200;
      nickname.copyFrom(value);
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional string nickname = 7;</code>
     * @param value the nickname to set
     * @return this
     */
    public SimpleInfo setNickname(final Utf8String value) {
      bitField0_ |= 0x00000200;
      nickname.copyFrom(value);
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>repeated .AssistSimpleInfo assist_simple_info = 1;</code>
     * @return whether the assistSimpleInfo field is set
     */
    public boolean hasAssistSimpleInfo() {
      return (bitField0_ & 0x00000400) != 0;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>repeated .AssistSimpleInfo assist_simple_info = 1;</code>
     * @return this
     */
    public SimpleInfo clearAssistSimpleInfo() {
      bitField0_ &= ~0x00000400;
      assistSimpleInfo.clear();
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>repeated .AssistSimpleInfo assist_simple_info = 1;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableAssistSimpleInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<AssistSimpleInfoOuterClass.AssistSimpleInfo> getAssistSimpleInfo() {
      return assistSimpleInfo;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>repeated .AssistSimpleInfo assist_simple_info = 1;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<AssistSimpleInfoOuterClass.AssistSimpleInfo> getMutableAssistSimpleInfo(
        ) {
      bitField0_ |= 0x00000400;
      return assistSimpleInfo;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>repeated .AssistSimpleInfo assist_simple_info = 1;</code>
     * @param value the assistSimpleInfo to add
     * @return this
     */
    public SimpleInfo addAssistSimpleInfo(final AssistSimpleInfoOuterClass.AssistSimpleInfo value) {
      bitField0_ |= 0x00000400;
      assistSimpleInfo.add(value);
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>repeated .AssistSimpleInfo assist_simple_info = 1;</code>
     * @param values the assistSimpleInfo to add
     * @return this
     */
    public SimpleInfo addAllAssistSimpleInfo(
        final AssistSimpleInfoOuterClass.AssistSimpleInfo... values) {
      bitField0_ |= 0x00000400;
      assistSimpleInfo.addAll(values);
      return this;
    }

    @Override
    public SimpleInfo copyFrom(final SimpleInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        lastActiveTime = other.lastActiveTime;
        chatBubbleId = other.chatBubbleId;
        headIcon = other.headIcon;
        level = other.level;
        uid = other.uid;
        platformType = other.platformType;
        onlineStatus = other.onlineStatus;
        isBanned = other.isBanned;
        signature.copyFrom(other.signature);
        nickname.copyFrom(other.nickname);
        assistSimpleInfo.copyFrom(other.assistSimpleInfo);
      }
      return this;
    }

    @Override
    public SimpleInfo mergeFrom(final SimpleInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasLastActiveTime()) {
        setLastActiveTime(other.lastActiveTime);
      }
      if (other.hasChatBubbleId()) {
        setChatBubbleId(other.chatBubbleId);
      }
      if (other.hasHeadIcon()) {
        setHeadIcon(other.headIcon);
      }
      if (other.hasLevel()) {
        setLevel(other.level);
      }
      if (other.hasUid()) {
        setUid(other.uid);
      }
      if (other.hasPlatformType()) {
        setPlatformTypeValue(other.platformType);
      }
      if (other.hasOnlineStatus()) {
        setOnlineStatusValue(other.onlineStatus);
      }
      if (other.hasIsBanned()) {
        setIsBanned(other.isBanned);
      }
      if (other.hasSignature()) {
        getMutableSignatureBytes().copyFrom(other.signature);
      }
      if (other.hasNickname()) {
        getMutableNicknameBytes().copyFrom(other.nickname);
      }
      if (other.hasAssistSimpleInfo()) {
        getMutableAssistSimpleInfo().addAll(other.assistSimpleInfo);
      }
      return this;
    }

    @Override
    public SimpleInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      lastActiveTime = 0L;
      chatBubbleId = 0;
      headIcon = 0;
      level = 0;
      uid = 0;
      platformType = 0;
      onlineStatus = 0;
      isBanned = false;
      signature.clear();
      nickname.clear();
      assistSimpleInfo.clear();
      return this;
    }

    @Override
    public SimpleInfo clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      signature.clear();
      nickname.clear();
      assistSimpleInfo.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof SimpleInfo)) {
        return false;
      }
      SimpleInfo other = (SimpleInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasLastActiveTime() || lastActiveTime == other.lastActiveTime)
        && (!hasChatBubbleId() || chatBubbleId == other.chatBubbleId)
        && (!hasHeadIcon() || headIcon == other.headIcon)
        && (!hasLevel() || level == other.level)
        && (!hasUid() || uid == other.uid)
        && (!hasPlatformType() || platformType == other.platformType)
        && (!hasOnlineStatus() || onlineStatus == other.onlineStatus)
        && (!hasIsBanned() || isBanned == other.isBanned)
        && (!hasSignature() || signature.equals(other.signature))
        && (!hasNickname() || nickname.equals(other.nickname))
        && (!hasAssistSimpleInfo() || assistSimpleInfo.equals(other.assistSimpleInfo));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 88);
        output.writeInt64NoTag(lastActiveTime);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 40);
        output.writeUInt32NoTag(chatBubbleId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 64);
        output.writeUInt32NoTag(headIcon);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 96);
        output.writeUInt32NoTag(level);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeRawByte((byte) 120);
        output.writeUInt32NoTag(uid);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeRawByte((byte) 24);
        output.writeEnumNoTag(platformType);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        output.writeRawByte((byte) 112);
        output.writeEnumNoTag(onlineStatus);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        output.writeRawByte((byte) 32);
        output.writeBoolNoTag(isBanned);
      }
      if ((bitField0_ & 0x00000100) != 0) {
        output.writeRawByte((byte) 50);
        output.writeStringNoTag(signature);
      }
      if ((bitField0_ & 0x00000200) != 0) {
        output.writeRawByte((byte) 58);
        output.writeStringNoTag(nickname);
      }
      if ((bitField0_ & 0x00000400) != 0) {
        for (int i = 0; i < assistSimpleInfo.length(); i++) {
          output.writeRawByte((byte) 10);
          output.writeMessageNoTag(assistSimpleInfo.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeInt64SizeNoTag(lastActiveTime);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(chatBubbleId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(headIcon);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(level);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(uid);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        size += 1 + ProtoSink.computeEnumSizeNoTag(platformType);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        size += 1 + ProtoSink.computeEnumSizeNoTag(onlineStatus);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        size += 2;
      }
      if ((bitField0_ & 0x00000100) != 0) {
        size += 1 + ProtoSink.computeStringSizeNoTag(signature);
      }
      if ((bitField0_ & 0x00000200) != 0) {
        size += 1 + ProtoSink.computeStringSizeNoTag(nickname);
      }
      if ((bitField0_ & 0x00000400) != 0) {
        size += (1 * assistSimpleInfo.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(assistSimpleInfo);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public SimpleInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 88: {
            // lastActiveTime
            lastActiveTime = input.readInt64();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 40) {
              break;
            }
          }
          case 40: {
            // chatBubbleId
            chatBubbleId = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 64) {
              break;
            }
          }
          case 64: {
            // headIcon
            headIcon = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 96) {
              break;
            }
          }
          case 96: {
            // level
            level = input.readUInt32();
            bitField0_ |= 0x00000008;
            tag = input.readTag();
            if (tag != 120) {
              break;
            }
          }
          case 120: {
            // uid
            uid = input.readUInt32();
            bitField0_ |= 0x00000010;
            tag = input.readTag();
            if (tag != 24) {
              break;
            }
          }
          case 24: {
            // platformType
            final int value = input.readInt32();
            if (PlatformTypeOuterClass.PlatformType.forNumber(value) != null) {
              platformType = value;
              bitField0_ |= 0x00000020;
            }
            tag = input.readTag();
            if (tag != 112) {
              break;
            }
          }
          case 112: {
            // onlineStatus
            final int value = input.readInt32();
            if (FriendOnlineStatusOuterClass.FriendOnlineStatus.forNumber(value) != null) {
              onlineStatus = value;
              bitField0_ |= 0x00000040;
            }
            tag = input.readTag();
            if (tag != 32) {
              break;
            }
          }
          case 32: {
            // isBanned
            isBanned = input.readBool();
            bitField0_ |= 0x00000080;
            tag = input.readTag();
            if (tag != 50) {
              break;
            }
          }
          case 50: {
            // signature
            input.readString(signature);
            bitField0_ |= 0x00000100;
            tag = input.readTag();
            if (tag != 58) {
              break;
            }
          }
          case 58: {
            // nickname
            input.readString(nickname);
            bitField0_ |= 0x00000200;
            tag = input.readTag();
            if (tag != 10) {
              break;
            }
          }
          case 10: {
            // assistSimpleInfo
            tag = input.readRepeatedMessage(assistSimpleInfo, tag);
            bitField0_ |= 0x00000400;
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
        output.writeInt64(FieldNames.lastActiveTime, lastActiveTime);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.chatBubbleId, chatBubbleId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.headIcon, headIcon);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeUInt32(FieldNames.level, level);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeUInt32(FieldNames.uid, uid);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeEnum(FieldNames.platformType, platformType, PlatformTypeOuterClass.PlatformType.converter());
      }
      if ((bitField0_ & 0x00000040) != 0) {
        output.writeEnum(FieldNames.onlineStatus, onlineStatus, FriendOnlineStatusOuterClass.FriendOnlineStatus.converter());
      }
      if ((bitField0_ & 0x00000080) != 0) {
        output.writeBool(FieldNames.isBanned, isBanned);
      }
      if ((bitField0_ & 0x00000100) != 0) {
        output.writeString(FieldNames.signature, signature);
      }
      if ((bitField0_ & 0x00000200) != 0) {
        output.writeString(FieldNames.nickname, nickname);
      }
      if ((bitField0_ & 0x00000400) != 0) {
        output.writeRepeatedMessage(FieldNames.assistSimpleInfo, assistSimpleInfo);
      }
      output.endObject();
    }

    @Override
    public SimpleInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -2041905623:
          case 1542438973: {
            if (input.isAtField(FieldNames.lastActiveTime)) {
              if (!input.trySkipNullValue()) {
                lastActiveTime = input.readInt64();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -678761921:
          case 1892426119: {
            if (input.isAtField(FieldNames.chatBubbleId)) {
              if (!input.trySkipNullValue()) {
                chatBubbleId = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1116107143:
          case -219098248: {
            if (input.isAtField(FieldNames.headIcon)) {
              if (!input.trySkipNullValue()) {
                headIcon = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 102865796: {
            if (input.isAtField(FieldNames.level)) {
              if (!input.trySkipNullValue()) {
                level = input.readUInt32();
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 115792: {
            if (input.isAtField(FieldNames.uid)) {
              if (!input.trySkipNullValue()) {
                uid = input.readUInt32();
                bitField0_ |= 0x00000010;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 155581005:
          case 538062726: {
            if (input.isAtField(FieldNames.platformType)) {
              if (!input.trySkipNullValue()) {
                final PlatformTypeOuterClass.PlatformType value = input.readEnum(PlatformTypeOuterClass.PlatformType.converter());
                if (value != null) {
                  platformType = value.getNumber();
                  bitField0_ |= 0x00000020;
                } else {
                  input.skipUnknownEnumValue();
                }
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1159866405:
          case -650386594: {
            if (input.isAtField(FieldNames.onlineStatus)) {
              if (!input.trySkipNullValue()) {
                final FriendOnlineStatusOuterClass.FriendOnlineStatus value = input.readEnum(FriendOnlineStatusOuterClass.FriendOnlineStatus.converter());
                if (value != null) {
                  onlineStatus = value.getNumber();
                  bitField0_ |= 0x00000040;
                } else {
                  input.skipUnknownEnumValue();
                }
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -722308888:
          case -932303917: {
            if (input.isAtField(FieldNames.isBanned)) {
              if (!input.trySkipNullValue()) {
                isBanned = input.readBool();
                bitField0_ |= 0x00000080;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1073584312: {
            if (input.isAtField(FieldNames.signature)) {
              if (!input.trySkipNullValue()) {
                input.readString(signature);
                bitField0_ |= 0x00000100;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 70690926: {
            if (input.isAtField(FieldNames.nickname)) {
              if (!input.trySkipNullValue()) {
                input.readString(nickname);
                bitField0_ |= 0x00000200;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 773591241:
          case -143608251: {
            if (input.isAtField(FieldNames.assistSimpleInfo)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(assistSimpleInfo);
                bitField0_ |= 0x00000400;
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
    public SimpleInfo clone() {
      return new SimpleInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static SimpleInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new SimpleInfo(), data).checkInitialized();
    }

    public static SimpleInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SimpleInfo(), input).checkInitialized();
    }

    public static SimpleInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SimpleInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating SimpleInfo messages
     */
    public static MessageFactory<SimpleInfo> getFactory() {
      return SimpleInfoFactory.INSTANCE;
    }

    private enum SimpleInfoFactory implements MessageFactory<SimpleInfo> {
      INSTANCE;

      @Override
      public SimpleInfo create() {
        return SimpleInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName lastActiveTime = FieldName.forField("lastActiveTime", "last_active_time");

      static final FieldName chatBubbleId = FieldName.forField("chatBubbleId", "chat_bubble_id");

      static final FieldName headIcon = FieldName.forField("headIcon", "head_icon");

      static final FieldName level = FieldName.forField("level");

      static final FieldName uid = FieldName.forField("uid");

      static final FieldName platformType = FieldName.forField("platformType", "platform_type");

      static final FieldName onlineStatus = FieldName.forField("onlineStatus", "online_status");

      static final FieldName isBanned = FieldName.forField("isBanned", "is_banned");

      static final FieldName signature = FieldName.forField("signature");

      static final FieldName nickname = FieldName.forField("nickname");

      static final FieldName assistSimpleInfo = FieldName.forField("assistSimpleInfo", "assist_simple_info");
    }
  }
}
