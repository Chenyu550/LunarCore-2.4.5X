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
import us.hebi.quickbuf.RepeatedInt;

public final class ChessRogueNousStoryInfoOuterClass {
  /**
   * Protobuf type {@code ChessRogueNousStoryInfo}
   */
  public static final class ChessRogueNousStoryInfo extends ProtoMessage<ChessRogueNousStoryInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 story_id = 12;</code>
     */
    private int storyId;

    /**
     * <code>optional uint32 sub_story_id = 13;</code>
     */
    private int subStoryId;

    /**
     * <code>optional uint32 ACLGLHEFFON = 14;</code>
     */
    private int aCLGLHEFFON;

    /**
     * <code>optional bool CKEKKMGIHKJ = 8;</code>
     */
    private boolean cKEKKMGIHKJ;

    /**
     * <code>optional bool AHOJIDMLFPE = 18;</code>
     */
    private boolean aHOJIDMLFPE;

    /**
     * <code>repeated uint32 HCPCJBDBBGC = 1;</code>
     */
    private final RepeatedInt hCPCJBDBBGC = RepeatedInt.newEmptyInstance();

    /**
     * <code>repeated uint32 CMHLEEKNFKH = 4;</code>
     */
    private final RepeatedInt cMHLEEKNFKH = RepeatedInt.newEmptyInstance();

    /**
     * <code>repeated uint32 INPDLILFOCO = 9;</code>
     */
    private final RepeatedInt iNPDLILFOCO = RepeatedInt.newEmptyInstance();

    private ChessRogueNousStoryInfo() {
    }

    /**
     * @return a new empty instance of {@code ChessRogueNousStoryInfo}
     */
    public static ChessRogueNousStoryInfo newInstance() {
      return new ChessRogueNousStoryInfo();
    }

    /**
     * <code>optional uint32 story_id = 12;</code>
     * @return whether the storyId field is set
     */
    public boolean hasStoryId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 story_id = 12;</code>
     * @return this
     */
    public ChessRogueNousStoryInfo clearStoryId() {
      bitField0_ &= ~0x00000001;
      storyId = 0;
      return this;
    }

    /**
     * <code>optional uint32 story_id = 12;</code>
     * @return the storyId
     */
    public int getStoryId() {
      return storyId;
    }

    /**
     * <code>optional uint32 story_id = 12;</code>
     * @param value the storyId to set
     * @return this
     */
    public ChessRogueNousStoryInfo setStoryId(final int value) {
      bitField0_ |= 0x00000001;
      storyId = value;
      return this;
    }

    /**
     * <code>optional uint32 sub_story_id = 13;</code>
     * @return whether the subStoryId field is set
     */
    public boolean hasSubStoryId() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 sub_story_id = 13;</code>
     * @return this
     */
    public ChessRogueNousStoryInfo clearSubStoryId() {
      bitField0_ &= ~0x00000002;
      subStoryId = 0;
      return this;
    }

    /**
     * <code>optional uint32 sub_story_id = 13;</code>
     * @return the subStoryId
     */
    public int getSubStoryId() {
      return subStoryId;
    }

    /**
     * <code>optional uint32 sub_story_id = 13;</code>
     * @param value the subStoryId to set
     * @return this
     */
    public ChessRogueNousStoryInfo setSubStoryId(final int value) {
      bitField0_ |= 0x00000002;
      subStoryId = value;
      return this;
    }

    /**
     * <code>optional uint32 ACLGLHEFFON = 14;</code>
     * @return whether the aCLGLHEFFON field is set
     */
    public boolean hasACLGLHEFFON() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 ACLGLHEFFON = 14;</code>
     * @return this
     */
    public ChessRogueNousStoryInfo clearACLGLHEFFON() {
      bitField0_ &= ~0x00000004;
      aCLGLHEFFON = 0;
      return this;
    }

    /**
     * <code>optional uint32 ACLGLHEFFON = 14;</code>
     * @return the aCLGLHEFFON
     */
    public int getACLGLHEFFON() {
      return aCLGLHEFFON;
    }

    /**
     * <code>optional uint32 ACLGLHEFFON = 14;</code>
     * @param value the aCLGLHEFFON to set
     * @return this
     */
    public ChessRogueNousStoryInfo setACLGLHEFFON(final int value) {
      bitField0_ |= 0x00000004;
      aCLGLHEFFON = value;
      return this;
    }

    /**
     * <code>optional bool CKEKKMGIHKJ = 8;</code>
     * @return whether the cKEKKMGIHKJ field is set
     */
    public boolean hasCKEKKMGIHKJ() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional bool CKEKKMGIHKJ = 8;</code>
     * @return this
     */
    public ChessRogueNousStoryInfo clearCKEKKMGIHKJ() {
      bitField0_ &= ~0x00000008;
      cKEKKMGIHKJ = false;
      return this;
    }

    /**
     * <code>optional bool CKEKKMGIHKJ = 8;</code>
     * @return the cKEKKMGIHKJ
     */
    public boolean getCKEKKMGIHKJ() {
      return cKEKKMGIHKJ;
    }

    /**
     * <code>optional bool CKEKKMGIHKJ = 8;</code>
     * @param value the cKEKKMGIHKJ to set
     * @return this
     */
    public ChessRogueNousStoryInfo setCKEKKMGIHKJ(final boolean value) {
      bitField0_ |= 0x00000008;
      cKEKKMGIHKJ = value;
      return this;
    }

    /**
     * <code>optional bool AHOJIDMLFPE = 18;</code>
     * @return whether the aHOJIDMLFPE field is set
     */
    public boolean hasAHOJIDMLFPE() {
      return (bitField0_ & 0x00000010) != 0;
    }

    /**
     * <code>optional bool AHOJIDMLFPE = 18;</code>
     * @return this
     */
    public ChessRogueNousStoryInfo clearAHOJIDMLFPE() {
      bitField0_ &= ~0x00000010;
      aHOJIDMLFPE = false;
      return this;
    }

    /**
     * <code>optional bool AHOJIDMLFPE = 18;</code>
     * @return the aHOJIDMLFPE
     */
    public boolean getAHOJIDMLFPE() {
      return aHOJIDMLFPE;
    }

    /**
     * <code>optional bool AHOJIDMLFPE = 18;</code>
     * @param value the aHOJIDMLFPE to set
     * @return this
     */
    public ChessRogueNousStoryInfo setAHOJIDMLFPE(final boolean value) {
      bitField0_ |= 0x00000010;
      aHOJIDMLFPE = value;
      return this;
    }

    /**
     * <code>repeated uint32 HCPCJBDBBGC = 1;</code>
     * @return whether the hCPCJBDBBGC field is set
     */
    public boolean hasHCPCJBDBBGC() {
      return (bitField0_ & 0x00000020) != 0;
    }

    /**
     * <code>repeated uint32 HCPCJBDBBGC = 1;</code>
     * @return this
     */
    public ChessRogueNousStoryInfo clearHCPCJBDBBGC() {
      bitField0_ &= ~0x00000020;
      hCPCJBDBBGC.clear();
      return this;
    }

    /**
     * <code>repeated uint32 HCPCJBDBBGC = 1;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableHCPCJBDBBGC()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedInt getHCPCJBDBBGC() {
      return hCPCJBDBBGC;
    }

    /**
     * <code>repeated uint32 HCPCJBDBBGC = 1;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedInt getMutableHCPCJBDBBGC() {
      bitField0_ |= 0x00000020;
      return hCPCJBDBBGC;
    }

    /**
     * <code>repeated uint32 HCPCJBDBBGC = 1;</code>
     * @param value the hCPCJBDBBGC to add
     * @return this
     */
    public ChessRogueNousStoryInfo addHCPCJBDBBGC(final int value) {
      bitField0_ |= 0x00000020;
      hCPCJBDBBGC.add(value);
      return this;
    }

    /**
     * <code>repeated uint32 HCPCJBDBBGC = 1;</code>
     * @param values the hCPCJBDBBGC to add
     * @return this
     */
    public ChessRogueNousStoryInfo addAllHCPCJBDBBGC(final int... values) {
      bitField0_ |= 0x00000020;
      hCPCJBDBBGC.addAll(values);
      return this;
    }

    /**
     * <code>repeated uint32 CMHLEEKNFKH = 4;</code>
     * @return whether the cMHLEEKNFKH field is set
     */
    public boolean hasCMHLEEKNFKH() {
      return (bitField0_ & 0x00000040) != 0;
    }

    /**
     * <code>repeated uint32 CMHLEEKNFKH = 4;</code>
     * @return this
     */
    public ChessRogueNousStoryInfo clearCMHLEEKNFKH() {
      bitField0_ &= ~0x00000040;
      cMHLEEKNFKH.clear();
      return this;
    }

    /**
     * <code>repeated uint32 CMHLEEKNFKH = 4;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableCMHLEEKNFKH()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedInt getCMHLEEKNFKH() {
      return cMHLEEKNFKH;
    }

    /**
     * <code>repeated uint32 CMHLEEKNFKH = 4;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedInt getMutableCMHLEEKNFKH() {
      bitField0_ |= 0x00000040;
      return cMHLEEKNFKH;
    }

    /**
     * <code>repeated uint32 CMHLEEKNFKH = 4;</code>
     * @param value the cMHLEEKNFKH to add
     * @return this
     */
    public ChessRogueNousStoryInfo addCMHLEEKNFKH(final int value) {
      bitField0_ |= 0x00000040;
      cMHLEEKNFKH.add(value);
      return this;
    }

    /**
     * <code>repeated uint32 CMHLEEKNFKH = 4;</code>
     * @param values the cMHLEEKNFKH to add
     * @return this
     */
    public ChessRogueNousStoryInfo addAllCMHLEEKNFKH(final int... values) {
      bitField0_ |= 0x00000040;
      cMHLEEKNFKH.addAll(values);
      return this;
    }

    /**
     * <code>repeated uint32 INPDLILFOCO = 9;</code>
     * @return whether the iNPDLILFOCO field is set
     */
    public boolean hasINPDLILFOCO() {
      return (bitField0_ & 0x00000080) != 0;
    }

    /**
     * <code>repeated uint32 INPDLILFOCO = 9;</code>
     * @return this
     */
    public ChessRogueNousStoryInfo clearINPDLILFOCO() {
      bitField0_ &= ~0x00000080;
      iNPDLILFOCO.clear();
      return this;
    }

    /**
     * <code>repeated uint32 INPDLILFOCO = 9;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableINPDLILFOCO()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedInt getINPDLILFOCO() {
      return iNPDLILFOCO;
    }

    /**
     * <code>repeated uint32 INPDLILFOCO = 9;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedInt getMutableINPDLILFOCO() {
      bitField0_ |= 0x00000080;
      return iNPDLILFOCO;
    }

    /**
     * <code>repeated uint32 INPDLILFOCO = 9;</code>
     * @param value the iNPDLILFOCO to add
     * @return this
     */
    public ChessRogueNousStoryInfo addINPDLILFOCO(final int value) {
      bitField0_ |= 0x00000080;
      iNPDLILFOCO.add(value);
      return this;
    }

    /**
     * <code>repeated uint32 INPDLILFOCO = 9;</code>
     * @param values the iNPDLILFOCO to add
     * @return this
     */
    public ChessRogueNousStoryInfo addAllINPDLILFOCO(final int... values) {
      bitField0_ |= 0x00000080;
      iNPDLILFOCO.addAll(values);
      return this;
    }

    @Override
    public ChessRogueNousStoryInfo copyFrom(final ChessRogueNousStoryInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        storyId = other.storyId;
        subStoryId = other.subStoryId;
        aCLGLHEFFON = other.aCLGLHEFFON;
        cKEKKMGIHKJ = other.cKEKKMGIHKJ;
        aHOJIDMLFPE = other.aHOJIDMLFPE;
        hCPCJBDBBGC.copyFrom(other.hCPCJBDBBGC);
        cMHLEEKNFKH.copyFrom(other.cMHLEEKNFKH);
        iNPDLILFOCO.copyFrom(other.iNPDLILFOCO);
      }
      return this;
    }

    @Override
    public ChessRogueNousStoryInfo mergeFrom(final ChessRogueNousStoryInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasStoryId()) {
        setStoryId(other.storyId);
      }
      if (other.hasSubStoryId()) {
        setSubStoryId(other.subStoryId);
      }
      if (other.hasACLGLHEFFON()) {
        setACLGLHEFFON(other.aCLGLHEFFON);
      }
      if (other.hasCKEKKMGIHKJ()) {
        setCKEKKMGIHKJ(other.cKEKKMGIHKJ);
      }
      if (other.hasAHOJIDMLFPE()) {
        setAHOJIDMLFPE(other.aHOJIDMLFPE);
      }
      if (other.hasHCPCJBDBBGC()) {
        getMutableHCPCJBDBBGC().addAll(other.hCPCJBDBBGC);
      }
      if (other.hasCMHLEEKNFKH()) {
        getMutableCMHLEEKNFKH().addAll(other.cMHLEEKNFKH);
      }
      if (other.hasINPDLILFOCO()) {
        getMutableINPDLILFOCO().addAll(other.iNPDLILFOCO);
      }
      return this;
    }

    @Override
    public ChessRogueNousStoryInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      storyId = 0;
      subStoryId = 0;
      aCLGLHEFFON = 0;
      cKEKKMGIHKJ = false;
      aHOJIDMLFPE = false;
      hCPCJBDBBGC.clear();
      cMHLEEKNFKH.clear();
      iNPDLILFOCO.clear();
      return this;
    }

    @Override
    public ChessRogueNousStoryInfo clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      hCPCJBDBBGC.clear();
      cMHLEEKNFKH.clear();
      iNPDLILFOCO.clear();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof ChessRogueNousStoryInfo)) {
        return false;
      }
      ChessRogueNousStoryInfo other = (ChessRogueNousStoryInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasStoryId() || storyId == other.storyId)
        && (!hasSubStoryId() || subStoryId == other.subStoryId)
        && (!hasACLGLHEFFON() || aCLGLHEFFON == other.aCLGLHEFFON)
        && (!hasCKEKKMGIHKJ() || cKEKKMGIHKJ == other.cKEKKMGIHKJ)
        && (!hasAHOJIDMLFPE() || aHOJIDMLFPE == other.aHOJIDMLFPE)
        && (!hasHCPCJBDBBGC() || hCPCJBDBBGC.equals(other.hCPCJBDBBGC))
        && (!hasCMHLEEKNFKH() || cMHLEEKNFKH.equals(other.cMHLEEKNFKH))
        && (!hasINPDLILFOCO() || iNPDLILFOCO.equals(other.iNPDLILFOCO));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 96);
        output.writeUInt32NoTag(storyId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 104);
        output.writeUInt32NoTag(subStoryId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 112);
        output.writeUInt32NoTag(aCLGLHEFFON);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 64);
        output.writeBoolNoTag(cKEKKMGIHKJ);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeRawLittleEndian16((short) 400);
        output.writeBoolNoTag(aHOJIDMLFPE);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        for (int i = 0; i < hCPCJBDBBGC.length(); i++) {
          output.writeRawByte((byte) 8);
          output.writeUInt32NoTag(hCPCJBDBBGC.array()[i]);
        }
      }
      if ((bitField0_ & 0x00000040) != 0) {
        for (int i = 0; i < cMHLEEKNFKH.length(); i++) {
          output.writeRawByte((byte) 32);
          output.writeUInt32NoTag(cMHLEEKNFKH.array()[i]);
        }
      }
      if ((bitField0_ & 0x00000080) != 0) {
        for (int i = 0; i < iNPDLILFOCO.length(); i++) {
          output.writeRawByte((byte) 72);
          output.writeUInt32NoTag(iNPDLILFOCO.array()[i]);
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(storyId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(subStoryId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(aCLGLHEFFON);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 2;
      }
      if ((bitField0_ & 0x00000010) != 0) {
        size += 3;
      }
      if ((bitField0_ & 0x00000020) != 0) {
        size += (1 * hCPCJBDBBGC.length()) + ProtoSink.computeRepeatedUInt32SizeNoTag(hCPCJBDBBGC);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        size += (1 * cMHLEEKNFKH.length()) + ProtoSink.computeRepeatedUInt32SizeNoTag(cMHLEEKNFKH);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        size += (1 * iNPDLILFOCO.length()) + ProtoSink.computeRepeatedUInt32SizeNoTag(iNPDLILFOCO);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public ChessRogueNousStoryInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 96: {
            // storyId
            storyId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 104) {
              break;
            }
          }
          case 104: {
            // subStoryId
            subStoryId = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 112) {
              break;
            }
          }
          case 112: {
            // aCLGLHEFFON
            aCLGLHEFFON = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 64) {
              break;
            }
          }
          case 64: {
            // cKEKKMGIHKJ
            cKEKKMGIHKJ = input.readBool();
            bitField0_ |= 0x00000008;
            tag = input.readTag();
            if (tag != 144) {
              break;
            }
          }
          case 144: {
            // aHOJIDMLFPE
            aHOJIDMLFPE = input.readBool();
            bitField0_ |= 0x00000010;
            tag = input.readTag();
            if (tag != 10) {
              break;
            }
          }
          case 10: {
            // hCPCJBDBBGC [packed=true]
            input.readPackedUInt32(hCPCJBDBBGC, tag);
            bitField0_ |= 0x00000020;
            tag = input.readTag();
            if (tag != 34) {
              break;
            }
          }
          case 34: {
            // cMHLEEKNFKH [packed=true]
            input.readPackedUInt32(cMHLEEKNFKH, tag);
            bitField0_ |= 0x00000040;
            tag = input.readTag();
            if (tag != 74) {
              break;
            }
          }
          case 74: {
            // iNPDLILFOCO [packed=true]
            input.readPackedUInt32(iNPDLILFOCO, tag);
            bitField0_ |= 0x00000080;
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
          case 8: {
            // hCPCJBDBBGC [packed=false]
            tag = input.readRepeatedUInt32(hCPCJBDBBGC, tag);
            bitField0_ |= 0x00000020;
            break;
          }
          case 32: {
            // cMHLEEKNFKH [packed=false]
            tag = input.readRepeatedUInt32(cMHLEEKNFKH, tag);
            bitField0_ |= 0x00000040;
            break;
          }
          case 72: {
            // iNPDLILFOCO [packed=false]
            tag = input.readRepeatedUInt32(iNPDLILFOCO, tag);
            bitField0_ |= 0x00000080;
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.storyId, storyId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.subStoryId, subStoryId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.aCLGLHEFFON, aCLGLHEFFON);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeBool(FieldNames.cKEKKMGIHKJ, cKEKKMGIHKJ);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeBool(FieldNames.aHOJIDMLFPE, aHOJIDMLFPE);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeRepeatedUInt32(FieldNames.hCPCJBDBBGC, hCPCJBDBBGC);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        output.writeRepeatedUInt32(FieldNames.cMHLEEKNFKH, cMHLEEKNFKH);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        output.writeRepeatedUInt32(FieldNames.iNPDLILFOCO, iNPDLILFOCO);
      }
      output.endObject();
    }

    @Override
    public ChessRogueNousStoryInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1884251920:
          case 1717754021: {
            if (input.isAtField(FieldNames.storyId)) {
              if (!input.trySkipNullValue()) {
                storyId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 929098384:
          case 1899516868: {
            if (input.isAtField(FieldNames.subStoryId)) {
              if (!input.trySkipNullValue()) {
                subStoryId = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1003347797: {
            if (input.isAtField(FieldNames.aCLGLHEFFON)) {
              if (!input.trySkipNullValue()) {
                aCLGLHEFFON = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -173257579: {
            if (input.isAtField(FieldNames.cKEKKMGIHKJ)) {
              if (!input.trySkipNullValue()) {
                cKEKKMGIHKJ = input.readBool();
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -654341121: {
            if (input.isAtField(FieldNames.aHOJIDMLFPE)) {
              if (!input.trySkipNullValue()) {
                aHOJIDMLFPE = input.readBool();
                bitField0_ |= 0x00000010;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 333875514: {
            if (input.isAtField(FieldNames.hCPCJBDBBGC)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedUInt32(hCPCJBDBBGC);
                bitField0_ |= 0x00000020;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1206117230: {
            if (input.isAtField(FieldNames.cMHLEEKNFKH)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedUInt32(cMHLEEKNFKH);
                bitField0_ |= 0x00000040;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 101017067: {
            if (input.isAtField(FieldNames.iNPDLILFOCO)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedUInt32(iNPDLILFOCO);
                bitField0_ |= 0x00000080;
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
    public ChessRogueNousStoryInfo clone() {
      return new ChessRogueNousStoryInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static ChessRogueNousStoryInfo parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new ChessRogueNousStoryInfo(), data).checkInitialized();
    }

    public static ChessRogueNousStoryInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ChessRogueNousStoryInfo(), input).checkInitialized();
    }

    public static ChessRogueNousStoryInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ChessRogueNousStoryInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating ChessRogueNousStoryInfo messages
     */
    public static MessageFactory<ChessRogueNousStoryInfo> getFactory() {
      return ChessRogueNousStoryInfoFactory.INSTANCE;
    }

    private enum ChessRogueNousStoryInfoFactory implements MessageFactory<ChessRogueNousStoryInfo> {
      INSTANCE;

      @Override
      public ChessRogueNousStoryInfo create() {
        return ChessRogueNousStoryInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName storyId = FieldName.forField("storyId", "story_id");

      static final FieldName subStoryId = FieldName.forField("subStoryId", "sub_story_id");

      static final FieldName aCLGLHEFFON = FieldName.forField("ACLGLHEFFON");

      static final FieldName cKEKKMGIHKJ = FieldName.forField("CKEKKMGIHKJ");

      static final FieldName aHOJIDMLFPE = FieldName.forField("AHOJIDMLFPE");

      static final FieldName hCPCJBDBBGC = FieldName.forField("HCPCJBDBBGC");

      static final FieldName cMHLEEKNFKH = FieldName.forField("CMHLEEKNFKH");

      static final FieldName iNPDLILFOCO = FieldName.forField("INPDLILFOCO");
    }
  }
}
