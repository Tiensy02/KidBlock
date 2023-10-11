package com.javaSpring.KidBlock.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javaSpring.KidBlock.Applications.DTO.UsedInsertDTO;
import com.javaSpring.KidBlock.Applications.DTO.UsedUpdateDTO;
import com.javaSpring.KidBlock.Applications.Interface.UsedService;
import com.javaSpring.KidBlock.Domain.Exception.ConflictException;
import com.javaSpring.KidBlock.Domain.Model.UsedModel;

@RestController
public class UsedControler {
    @Autowired
    UsedService usedService;
    
    @GetMapping("/Used")
    public List<UsedModel> getUsedByKidDevice(@RequestParam String kidDeviceId){
        return usedService.getUsedByKidDevice(kidDeviceId);
    }

    @PostMapping("/Used")
     public ResponseEntity<Integer>  insertUsed( @RequestBody UsedInsertDTO usedInsertDTO) throws ConflictException {
        usedService.insertUsed(usedInsertDTO);
      return new ResponseEntity<Integer>(HttpStatus.CREATED.value(),HttpStatus.CREATED);
    }

    @PutMapping("/Used")
    public ResponseEntity<Integer> updateUsed(@RequestBody UsedUpdateDTO usedUpdateDTO) throws ConflictException{
        usedService.updateUsed(usedUpdateDTO);
        return new ResponseEntity<Integer>(HttpStatus.OK.value(),HttpStatus.OK);
    }

    @DeleteMapping("/Used")
    public ResponseEntity<Integer> deleteUsed(@RequestParam List<String> ids) {
        usedService.deleteUsed(ids);
       return new ResponseEntity<Integer>(HttpStatus.OK.value(),HttpStatus.OK);
    }
    

}
