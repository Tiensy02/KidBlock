package com.javaSpring.KidBlock.Domain.Model;

import java.time.LocalDate;

public class BlockModel {
    private String blockID;
    private String blockName;
    private String blockCode;
    private LocalDate createDate;
    private LocalDate blockTimeBlock; 
    private String kidDeviceName;
    private String kidDeviceKidAvatar;
    private long blockTimeremain; 
    public String getBlockID() {
        return blockID;
    }
    public String getBlockName() {
        return blockName;
    }
    public String getBlockCode() {
        return blockCode;
    }
    public LocalDate getCreateDate() {
        return createDate;
    }
    public LocalDate getBlockTimeBlock() {
        return blockTimeBlock;
    }
    public String getKidDeviceName() {
        return kidDeviceName;
    }
    public String getKidDeviceKidAvatar() {
        return kidDeviceKidAvatar;
    }
    public void setBlockID(String blockID) {
        this.blockID = blockID;
    }
    public void setBlockName(String blockName) {
        this.blockName = blockName;
    }
    public void setBlockCode(String blockCode) {
        this.blockCode = blockCode;
    }
    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }
    public void setBlockTimeBlock(LocalDate blockTimeBlock) {
        this.blockTimeBlock = blockTimeBlock;
    }
    public void setKidDeviceName(String kidDeviceName) {
        this.kidDeviceName = kidDeviceName;
    }
    public void setKidDeviceKidAvatar(String kidDeviceKidAvatar) {
        this.kidDeviceKidAvatar = kidDeviceKidAvatar;
    }
    public long getBlockTimeremain( ) {
        return blockTimeremain;
    }
    public void setBlockTimeremain(long date) {
        this.blockTimeremain = date;
    }
}
