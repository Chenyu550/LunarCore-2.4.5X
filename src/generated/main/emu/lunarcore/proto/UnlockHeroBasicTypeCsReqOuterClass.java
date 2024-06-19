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

public final class UnlockHeroBasicTypeCsReqOuterClass {
  /**
   * Protobuf type {@code UnlockHeroBasicTypeCsReq}
   */
  public static final class UnlockHeroBasicTypeCsReq extends ProtoMessage<UnlockHeroBasicTypeCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional .HeroBasicType basic_type = 10;</code>
     */
    private int basicType;

    private UnlockHeroBasicTypeCsReq() {
    }

    /**
     * @return a new empty instance of {@code UnlockHeroBasicTypeCsReq}
     */
    public static UnlockHeroBasicTypeCsReq newInstance() {
      return new UnlockHeroBasicTypeCsReq();
    }

    /**
     * <code>optional .HeroBasicType basic_type = 10;</code>
     * @return whether the basicType field is set
     */
    public boolean hasBasicType() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional .HeroBasicType basic_type = 10;</code>
     * @return this
     */
    public UnlockHeroBasicTypeCsReq clearBasicType() {
      bitField0_ &= ~0x00000001;
      basicType = 0;
      return this;
    }

    /**
     * <code>optional .HeroBasicType basic_type = 10;</code>
     * @return the basicType
     */
    public HeroBasicTypeOuterClass.HeroBasicType getBasicType() {
      return HeroBasicTypeOuterClass.HeroBasicType.forNumber(basicType);
    }

    /**
     * Gets the value of the internal enum store. The result is
     * equivalent to {@link UnlockHeroBasicTypeCsReq#getBasicType()}.getNumber().
     *
     * @return numeric wire representation
     */
    public int getBasicTypeValue() {
      return basicType;
    }

    /**
     * Sets the value of the internal enum store. This does not
     * do any validity checks, so be sure to use appropriate value
     * constants from {@link HeroBasicTypeOuterClass.HeroBasicType}. Setting an invalid value
     * can cause {@link UnlockHeroBasicTypeCsReq#getBasicType()} to return null
     *
     * @param value the numeric wire value to set
     * @return this
     */
    public UnlockHeroBasicTypeCsReq setBasicTypeValue(final int value) {
      bitField0_ |= 0x00000001;
      basicType = value;
      return this;
    }

    /**
     * <code>optional .HeroBasicType basic_type = 10;</code>
     * @param value the basicType to set
     * @return this
     */
    public UnlockHeroBasicTypeCsReq setBasicType(
        final HeroBasicTypeOuterClass.HeroBasicType value) {
      bitField0_ |= 0x00000001;
      basicType = value.getNumber();
      return this;
    }

    @Override
    public UnlockHeroBasicTypeCsReq copyFrom(final UnlockHeroBasicTypeCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        basicType = other.basicType;
      }
      return this;
    }

    @Override
    public UnlockHeroBasicTypeCsReq mergeFrom(final UnlockHeroBasicTypeCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasBasicType()) {
        setBasicTypeValue(other.basicType);
      }
      return this;
    }

    @Override
    public UnlockHeroBasicTypeCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      basicType = 0;
      return this;
    }

    @Override
    public UnlockHeroBasicTypeCsReq clearQuick() {
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
      if (!(o instanceof UnlockHeroBasicTypeCsReq)) {
        return false;
      }
      UnlockHeroBasicTypeCsReq other = (UnlockHeroBasicTypeCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasBasicType() || basicType == other.basicType);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 80);
        output.writeEnumNoTag(basicType);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeEnumSizeNoTag(basicType);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public UnlockHeroBasicTypeCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 80: {
            // basicType
            final int value = input.readInt32();
            if (HeroBasicTypeOuterClass.HeroBasicType.forNumber(value) != null) {
              basicType = value;
              bitField0_ |= 0x00000001;
            }
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
        output.writeEnum(FieldNames.basicType, basicType, HeroBasicTypeOuterClass.HeroBasicType.converter());
      }
      output.endObject();
    }

    @Override
    public UnlockHeroBasicTypeCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1699147640:
          case -1123950421: {
            if (input.isAtField(FieldNames.basicType)) {
              if (!input.trySkipNullValue()) {
                final HeroBasicTypeOuterClass.HeroBasicType value = input.readEnum(HeroBasicTypeOuterClass.HeroBasicType.converter());
                if (value != null) {
                  basicType = value.getNumber();
                  bitField0_ |= 0x00000001;
                } else {
                  input.skipUnknownEnumValue();
                }
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
    public UnlockHeroBasicTypeCsReq clone() {
      return new UnlockHeroBasicTypeCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static UnlockHeroBasicTypeCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new UnlockHeroBasicTypeCsReq(), data).checkInitialized();
    }

    public static UnlockHeroBasicTypeCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new UnlockHeroBasicTypeCsReq(), input).checkInitialized();
    }

    public static UnlockHeroBasicTypeCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new UnlockHeroBasicTypeCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating UnlockHeroBasicTypeCsReq messages
     */
    public static MessageFactory<UnlockHeroBasicTypeCsReq> getFactory() {
      return UnlockHeroBasicTypeCsReqFactory.INSTANCE;
    }

    private enum UnlockHeroBasicTypeCsReqFactory implements MessageFactory<UnlockHeroBasicTypeCsReq> {
      INSTANCE;

      @Override
      public UnlockHeroBasicTypeCsReq create() {
        return UnlockHeroBasicTypeCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName basicType = FieldName.forField("basicType", "basic_type");
    }
  }
}
