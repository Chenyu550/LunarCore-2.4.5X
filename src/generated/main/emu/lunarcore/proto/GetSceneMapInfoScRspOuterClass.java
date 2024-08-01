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

public final class GetSceneMapInfoScRspOuterClass {
  /**
   * Protobuf type {@code GetSceneMapInfoScRsp}
   */
  public static final class GetSceneMapInfoScRsp extends ProtoMessage<GetSceneMapInfoScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 9;</code>
     */
    private int retcode;

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>repeated .MazeMapData map_list = 5;</code>
     */
    private final RepeatedMessage<MazeMapDataOuterClass.MazeMapData> mapList = RepeatedMessage.newEmptyInstance(MazeMapDataOuterClass.MazeMapData.getFactory());

    private GetSceneMapInfoScRsp() {
    }

    /**
     * @return a new empty instance of {@code GetSceneMapInfoScRsp}
     */
    public static GetSceneMapInfoScRsp newInstance() {
      return new GetSceneMapInfoScRsp();
    }

    /**
     * <code>optional uint32 retcode = 9;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 retcode = 9;</code>
     * @return this
     */
    public GetSceneMapInfoScRsp clearRetcode() {
      bitField0_ &= ~0x00000001;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 9;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 9;</code>
     * @param value the retcode to set
     * @return this
     */
    public GetSceneMapInfoScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>repeated .MazeMapData map_list = 5;</code>
     * @return whether the mapList field is set
     */
    public boolean hasMapList() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>repeated .MazeMapData map_list = 5;</code>
     * @return this
     */
    public GetSceneMapInfoScRsp clearMapList() {
      bitField0_ &= ~0x00000002;
      mapList.clear();
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>repeated .MazeMapData map_list = 5;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableMapList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<MazeMapDataOuterClass.MazeMapData> getMapList() {
      return mapList;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>repeated .MazeMapData map_list = 5;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<MazeMapDataOuterClass.MazeMapData> getMutableMapList() {
      bitField0_ |= 0x00000002;
      return mapList;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>repeated .MazeMapData map_list = 5;</code>
     * @param value the mapList to add
     * @return this
     */
    public GetSceneMapInfoScRsp addMapList(final MazeMapDataOuterClass.MazeMapData value) {
      bitField0_ |= 0x00000002;
      mapList.add(value);
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>repeated .MazeMapData map_list = 5;</code>
     * @param values the mapList to add
     * @return this
     */
    public GetSceneMapInfoScRsp addAllMapList(final MazeMapDataOuterClass.MazeMapData... values) {
      bitField0_ |= 0x00000002;
      mapList.addAll(values);
      return this;
    }

    @Override
    public GetSceneMapInfoScRsp copyFrom(final GetSceneMapInfoScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        mapList.copyFrom(other.mapList);
      }
      return this;
    }

    @Override
    public GetSceneMapInfoScRsp mergeFrom(final GetSceneMapInfoScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasMapList()) {
        getMutableMapList().addAll(other.mapList);
      }
      return this;
    }

    @Override
    public GetSceneMapInfoScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      mapList.clear();
      return this;
    }

    @Override
    public GetSceneMapInfoScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      mapList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof GetSceneMapInfoScRsp)) {
        return false;
      }
      GetSceneMapInfoScRsp other = (GetSceneMapInfoScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasMapList() || mapList.equals(other.mapList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 72);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        for (int i = 0; i < mapList.length(); i++) {
          output.writeRawByte((byte) 42);
          output.writeMessageNoTag(mapList.get(i));
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
        size += (1 * mapList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(mapList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public GetSceneMapInfoScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 72: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 42) {
              break;
            }
          }
          case 42: {
            // mapList
            tag = input.readRepeatedMessage(mapList, tag);
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
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRepeatedMessage(FieldNames.mapList, mapList);
      }
      output.endObject();
    }

    @Override
    public GetSceneMapInfoScRsp mergeFrom(final JsonSource input) throws IOException {
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
          case 836484122:
          case 178830753: {
            if (input.isAtField(FieldNames.mapList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(mapList);
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
    public GetSceneMapInfoScRsp clone() {
      return new GetSceneMapInfoScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static GetSceneMapInfoScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new GetSceneMapInfoScRsp(), data).checkInitialized();
    }

    public static GetSceneMapInfoScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetSceneMapInfoScRsp(), input).checkInitialized();
    }

    public static GetSceneMapInfoScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetSceneMapInfoScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating GetSceneMapInfoScRsp messages
     */
    public static MessageFactory<GetSceneMapInfoScRsp> getFactory() {
      return GetSceneMapInfoScRspFactory.INSTANCE;
    }

    private enum GetSceneMapInfoScRspFactory implements MessageFactory<GetSceneMapInfoScRsp> {
      INSTANCE;

      @Override
      public GetSceneMapInfoScRsp create() {
        return GetSceneMapInfoScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName mapList = FieldName.forField("mapList", "map_list");
    }
  }
}
