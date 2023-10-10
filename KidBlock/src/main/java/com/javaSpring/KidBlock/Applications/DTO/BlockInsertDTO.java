package com.javaSpring.KidBlock.Applications.DTO;

import java.time.LocalDate;
import java.util.UUID;


public class BlockInsertDTO {
    private UUID KidDeviceID;
	
	private LocalDate  BlockTimeBlock;
	
	private LocalDate BlockTimeEdit;
	
	private UUID ParentID;
	
	private String BlockName;
	
	private String BlockCode;

    public UUID getKidDeviceID() {
        return KidDeviceID;
    }

    public LocalDate getBlockTimeBlock() {
        return BlockTimeBlock;
    }

    public LocalDate getBlockTimeEdit() {
        return BlockTimeEdit;
    }

    public UUID getParentID() {
        return ParentID;
    }

    public String getBlockName() {
        return BlockName;
    }

    public String getBlockCode() {
        return BlockCode;
    }

    public void setKidDeviceID(UUID kidDeviceID) {
        KidDeviceID = kidDeviceID;
    }

    public void setBlockTimeBlock(LocalDate blockTimeBlock) {
        BlockTimeBlock = blockTimeBlock;
    }

    public void setBlockTimeEdit(LocalDate blockTimeEdit) {
        BlockTimeEdit = blockTimeEdit;
    }

    public void setParentID(UUID parentID) {
        ParentID = parentID;
    }

    public void setBlockName(String blockName) {
        BlockName = blockName;
    }

    public void setBlockCode(String blockCode) {
        BlockCode = blockCode;
    }
    
}
