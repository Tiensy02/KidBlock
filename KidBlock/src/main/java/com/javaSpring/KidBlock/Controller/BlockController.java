package com.javaSpring.KidBlock.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javaSpring.KidBlock.Applications.DTO.BlockInsertDTO;
import com.javaSpring.KidBlock.Applications.DTO.BlockUpdateDTO;
import com.javaSpring.KidBlock.Applications.Interface.BlockService;
import com.javaSpring.KidBlock.Domain.Exception.ConflictException;
import com.javaSpring.KidBlock.Domain.Model.BlockModel;

import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class BlockController {
    @Autowired
    BlockService blockService;

    @GetMapping("/Block")
    public List<BlockModel> getBlocksByKidDevice(@RequestParam String kidDeviceId) {
        List<BlockModel> result = blockService.getBlockByKidDevice(kidDeviceId);
        return result;
    }

    @PostMapping("/Block")
    public ResponseEntity<Integer> insertBlock(@RequestBody BlockInsertDTO blockInsertDTO) throws ConflictException {
        blockService.insertBlock(blockInsertDTO);
        return new ResponseEntity<Integer>(HttpStatus.CREATED.value(), HttpStatus.CREATED);
    }

    @PutMapping("/Block")
    public ResponseEntity<Integer> updateBlock(@RequestBody BlockUpdateDTO blockUpdateDTO) throws ConflictException {
        blockService.updateBlock(blockUpdateDTO);
        return new ResponseEntity<Integer>(HttpStatus.OK.value(), HttpStatus.OK);
    }

    @DeleteMapping("/Block")
    public ResponseEntity<Integer> deleteBlock(@RequestParam List<String> ids) {
        blockService.deleteBlock(ids);
        return new ResponseEntity<Integer>(HttpStatus.OK.value(), HttpStatus.OK);

    }

}
