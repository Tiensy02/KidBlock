package com.javaSpring.KidBlock.Domain.Model;

import java.time.LocalDate;
import java.util.UUID;

public class BlockModel {
    private UUID blockID;
    private String blockName;
    private String blockCode;
    private LocalDate createDate;
    private LocalDate blockTimeBlock; // thời gian khoá
    private String kidDeviceName;
    private String kidDeviceKidAvatar;
    private LocalDate blockTimeremain; // thời gian còn lại
    public UUID getBlockID() {
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
    public void setBlockID(UUID blockID) {
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
    public LocalDate getBlockTimeremain( ) {
        return blockTimeremain;
    }
    public void setBlockTimeremain(LocalDate date) {
        this.blockTimeremain = date;
    }
}
