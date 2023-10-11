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

import com.javaSpring.KidBlock.Applications.DTO.KidDeviceInsertDTO;
import com.javaSpring.KidBlock.Applications.DTO.KidDeviceUpdateDTO;
import com.javaSpring.KidBlock.Applications.Interface.KidDeviceService;
import com.javaSpring.KidBlock.Domain.Exception.ConflictException;
import com.javaSpring.KidBlock.Domain.Model.KidDeciveModel;

@RestController
public class KidDeviceController {
    @Autowired 
    KidDeviceService kidDeviceService;


    @GetMapping("/KidDevice")
    public List<KidDeciveModel> getKidDeviceByParent(@RequestParam String parentId) {
        List<KidDeciveModel> result = kidDeviceService.getKidDeviceByParent(parentId);
        return result;
    }

    @PutMapping("/KidDevice") 
    public  ResponseEntity<Integer> putKidDevice(@RequestBody KidDeviceUpdateDTO kidDeviceUpdateDTO) {
        kidDeviceService.putKidDevice(kidDeviceUpdateDTO);
        return new ResponseEntity<Integer>(HttpStatus.OK.value(),HttpStatus.OK);
    }

    @PostMapping("/KidDevice")
    public ResponseEntity<Integer> insertKidDevice(@RequestBody KidDeviceInsertDTO kidDeviceInsertDTO) throws ConflictException {
        kidDeviceService.insertKidDevice(kidDeviceInsertDTO);
        return new ResponseEntity<Integer>(HttpStatus.CREATED.value(),HttpStatus.CREATED);
    }

    @DeleteMapping("/KidDevice")
    public ResponseEntity<Integer> deleteKidDevice(@RequestParam List<String> ids) throws ConflictException {
        kidDeviceService.deleteKidDevice(ids);
        return new ResponseEntity<Integer>(HttpStatus.OK.value(),HttpStatus.OK); 
    }
}

