package com.javaSpring.KidBlock.Applications.DTO;

import java.time.LocalDate;


public class BlockUpdateDTO {

    private String blockId;

	private LocalDate  blockTimeBlock;
    private LocalDate blockTimeEdit;
    private String parentId;
    private String kidDeviceId;
    

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getKidDeviceId() {
        return kidDeviceId;
    }

    public void setKidDeviceId(String kidDeviceId) {
        this.kidDeviceId = kidDeviceId;
    }

    public String getBlockId() {
        return blockId;
    }

    public void setBlockId(String blockId) {
        this.blockId = blockId;
    }

    public LocalDate getBlockTimeBlock() {
        return blockTimeBlock;
    }

    public void setBlockTimeBlock(LocalDate blockTimeBlock) {
        this.blockTimeBlock = blockTimeBlock;
    }

    public LocalDate getBlockTimeEdit() {
        return blockTimeEdit;
    }

    public void setBlockTimeEdit(LocalDate blockTimeEdit) {
        this.blockTimeEdit = blockTimeEdit;
    }
    
}
