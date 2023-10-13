package com.javaSpring.KidBlock.Applications.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaSpring.KidBlock.Applications.DTO.BlockInsertDTO;
import com.javaSpring.KidBlock.Applications.DTO.BlockUpdateDTO;
import com.javaSpring.KidBlock.Applications.Interface.BlockService;
import com.javaSpring.KidBlock.Applications.Mapper.BlockMapper;
import com.javaSpring.KidBlock.Domain.Entity.Block;
import com.javaSpring.KidBlock.Domain.Entity.KidDevice;
import com.javaSpring.KidBlock.Domain.Exception.ConflictException;
import com.javaSpring.KidBlock.Domain.Interface.IBlockRepository;
import com.javaSpring.KidBlock.Domain.Model.BlockModel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;


@Service
public class BlockServiceImpl implements BlockService {


    @Autowired
    IBlockRepository blockRepository;
    @Autowired
    BlockMapper blockMapper;
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<BlockModel> getBlockByKidDevice(String kidDeviceId) {
       KidDevice kidDevice =  blockRepository.getBlockByKidDevice(kidDeviceId);
       List<Block> blocks = kidDevice.getBlocks();
       List<BlockModel> result = new ArrayList<>();
       for( Block block : blocks ) {
        result.add(blockMapper.mapToBlockModelFromBlock(block));
       }
       
       return result;
    }

    @Override
    public List<Block> getTopBlockByParent(String parent_Id) {
       return blockRepository.findByAccountParentParentId(parent_Id);
    }

    @Override
    public void insertBlock(BlockInsertDTO blockInsertDTO) throws ConflictException {
        Block block = blockRepository.findByAccountParentParentIdAndKidDeviceKidDeviceId(blockInsertDTO.getParentID(),blockInsertDTO.getParentID() );
        if(block != null ) {
            String errMess = block.getBlockCode() + " Adready Exist";
            throw new ConflictException(errMess, 409);
        }
        else {
            blockRepository.save(blockMapper.mapToBlockFromBlockInsert(blockInsertDTO));
        }
    }

    @Override
    public void updateBlock(BlockUpdateDTO blockUpdateDTO) throws ConflictException {
        Block block = blockRepository.findByBlockId(blockUpdateDTO.getBlockId());
        String str1 = blockUpdateDTO.getParentId();
        String str2 = blockUpdateDTO.getKidDeviceId();
        String str3 = block.getAccountParent().getParentID();
        String str4 = block.getKidDevice().getKidDeviceId() ;
        if( (!str3.equals(str1))  || (!str2.equals(str4)) ) {
            throw new ConflictException("Error",409);
        }else {
            blockRepository.save(blockMapper.mapToBlockFromBlockUpdate(block, blockUpdateDTO));
        }
    }

    @Override
    public void deleteBlock(List<String> ids) {
        blockRepository.deleteAllById(ids);
    }

    @Override
    public void updateDateAllBlock() {
       blockRepository.updateDateAllBlock();
    }
    

    
}
