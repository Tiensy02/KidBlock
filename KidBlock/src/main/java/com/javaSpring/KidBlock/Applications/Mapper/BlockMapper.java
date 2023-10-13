package com.javaSpring.KidBlock.Applications.Mapper;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import org.springframework.stereotype.Component;

import com.javaSpring.KidBlock.Applications.DTO.BlockInsertDTO;
import com.javaSpring.KidBlock.Applications.DTO.BlockUpdateDTO;
import com.javaSpring.KidBlock.Domain.Entity.AccountParent;
import com.javaSpring.KidBlock.Domain.Entity.Block;
import com.javaSpring.KidBlock.Domain.Entity.KidDevice;
import com.javaSpring.KidBlock.Domain.Model.BlockModel;
@Component
public class BlockMapper {

    public  BlockModel mapToBlockModelFromBlock(Block block) {
        BlockModel blockModel = new BlockModel();
        blockModel.setBlockID(block.getBlockId());
        blockModel.setBlockName(block.getBlockName());
        blockModel.setBlockCode(block.getBlockCode());
        blockModel.setBlockTimeBlock(block.getBlockTimeBlock());
        blockModel.setCreateDate(block.getCreateDate());
        blockModel.setKidDeviceKidAvatar(block.getKidDevice().getKidDeviceKidAvatar());
        blockModel.setKidDeviceName(block.getKidDevice().getKidDeviceName());
        LocalDate blockDate = block.getBlockTimeBlock();
        LocalDate blockModifyDate = block.getModifyDate();
        blockModel.setBlockTimeremain(0 - ChronoUnit.DAYS.between(blockDate,blockModifyDate));

        return blockModel;
    }
    
    public Block mapToBlockFromBlockInsert(BlockInsertDTO dto) {
       Block block = new Block();
        block.setBlockName(dto.getBlockName());
        block.setBlockCode(dto.getBlockCode());
        block.setBlockTimeEdit(dto.getBlockTimeEdit());

        if(dto.getBlockTimeBlock() != null ) {
            block.setBlockTimeBlock(dto.getBlockTimeBlock()); 
        }else {
            LocalDate day = LocalDate.now();
            block.setBlockTimeBlock(day);
        }

        if (dto.getKidDeviceID() != null) {
            KidDevice kidDevice = new KidDevice();
            kidDevice.setKidDeviceId(dto.getKidDeviceID());
            block.setKidDevice(kidDevice);
        }
        if(dto.getParentID() != null) {
            AccountParent accountParent = new AccountParent();
            accountParent.setParentID(dto.getParentID());
            block.setAccountParent(accountParent);
        }

        return block;
    }

    public Block mapToBlockFromBlockUpdate(Block block, BlockUpdateDTO blockUpdateDTO) {
        if(blockUpdateDTO.getBlockTimeBlock() != null ) {
            block.setBlockTimeEdit(blockUpdateDTO.getBlockTimeBlock());
        }
        if(blockUpdateDTO.getBlockTimeEdit() != null ) block.setBlockTimeEdit(blockUpdateDTO.getBlockTimeEdit());
        return block;
    }
}