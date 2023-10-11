package com.javaSpring.KidBlock.Applications.Interface;

import java.util.List;

import com.javaSpring.KidBlock.Applications.DTO.UsedInsertDTO;
import com.javaSpring.KidBlock.Applications.DTO.UsedUpdateDTO;
import com.javaSpring.KidBlock.Domain.Exception.ConflictException;
import com.javaSpring.KidBlock.Domain.Model.UsedModel;

public interface UsedService {
    List<UsedModel> getUsedByKidDevice(String kidDeviceId);
    void insertUsed(UsedInsertDTO usedInsertDTO) throws ConflictException;
    void updateUsed(UsedUpdateDTO usedUpdateDTO) throws ConflictException;
    void deleteUsed(List<String> ids);
}
