package com.javaSpring.KidBlock.Applications.Interface;

import java.util.List;

import com.javaSpring.KidBlock.Applications.DTO.KidDeviceInsertDTO;
import com.javaSpring.KidBlock.Applications.DTO.KidDeviceUpdateDTO;
import com.javaSpring.KidBlock.Domain.Exception.ConflictException;
import com.javaSpring.KidBlock.Domain.Model.KidDeciveModel;

public interface KidDeviceService {
   List<KidDeciveModel> getKidDeviceByParent(String ParentId); 
   void insertKidDevice(KidDeviceInsertDTO KidDeviceInsertDTO) throws ConflictException;
   void deleteKidDevice(List<String> ids) throws ConflictException;
   void putKidDevice(KidDeviceUpdateDTO kidDeviceUpdateDTO);
}
