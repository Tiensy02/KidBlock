package com.javaSpring.KidBlock.Applications.Interface;

import java.util.List;

import com.javaSpring.KidBlock.Applications.DTO.BlockInsertDTO;
import com.javaSpring.KidBlock.Applications.DTO.BlockUpdateDTO;
import com.javaSpring.KidBlock.Domain.Entity.Block;
import com.javaSpring.KidBlock.Domain.Exception.ConflictException;
import com.javaSpring.KidBlock.Domain.Model.BlockModel;

public interface BlockService {
    List<BlockModel> getBlockByKidDevice(String kidDeviceId);
    List<Block> getTopBlockByParent(String parentId);
    void insertBlock(BlockInsertDTO blockInsertDTO) throws ConflictException;
    void updateBlock(BlockUpdateDTO blockUpdateDTO) throws ConflictException;
    void deleteBlock(List<String> ids);
    void updateDateAllBlock();

}
