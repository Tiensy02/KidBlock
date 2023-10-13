package com.javaSpring.KidBlock.Applications.DTO;

import java.time.LocalDate;

public class BlockInsertDTO {
    
    private String kidDeviceID;
	
	private LocalDate  blockTimeBlock;
	
	private String parentID;
	
	private String blockName;
	
	private String blockCode;

    private LocalDate blockTimeEdit;

    public String getKidDeviceID() {
        return kidDeviceID;
    }

    public void setKidDeviceID(String kidDeviceID) {
        this.kidDeviceID = kidDeviceID;
    }

    public LocalDate getBlockTimeBlock() {
        return blockTimeBlock;
    }

    public void setBlockTimeBlock(LocalDate blockTimeBlock) {
        this.blockTimeBlock = blockTimeBlock;
    }

    public String getParentID() {
        return parentID;
    }

    public void setParentID(String parentID) {
        this.parentID = parentID;
    }

    public String getBlockName() {
        return blockName;
    }

    public void setBlockName(String blockName) {
        this.blockName = blockName;
    }

    public String getBlockCode() {
        return blockCode;
    }

    public void setBlockCode(String blockCode) {
        this.blockCode = blockCode;
    }

    public LocalDate getBlockTimeEdit() {
        return blockTimeEdit;
    }

    public void setBlockTimeEdit(LocalDate blockTimeEdit) {
        this.blockTimeEdit = blockTimeEdit;
    }

    
    
}
