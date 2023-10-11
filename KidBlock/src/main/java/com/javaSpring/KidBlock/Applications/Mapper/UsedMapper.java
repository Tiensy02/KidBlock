package com.javaSpring.KidBlock.Applications.Mapper;

import org.springframework.stereotype.Component;

import com.javaSpring.KidBlock.Applications.DTO.UsedInsertDTO;
import com.javaSpring.KidBlock.Applications.DTO.UsedUpdateDTO;
import com.javaSpring.KidBlock.Domain.Entity.KidDevice;
import com.javaSpring.KidBlock.Domain.Entity.Used;
import com.javaSpring.KidBlock.Domain.Model.UsedModel;

@Component
public class UsedMapper {
    public UsedModel mapToUsedModel(Used used) {
        UsedModel usedModel = new UsedModel();
        usedModel.setUsedId(used.getUsedId());
        usedModel.setUsedTimeStart(used.getUsedTimeStart());
        usedModel.setUsedTimeEnd(used.getUsedTimeEnd());
        usedModel.setUsedCode(used.getUsedCode());
        usedModel.setUsedName(used.getUsedName());
        return usedModel;
    }

    public Used mapToUsed(UsedInsertDTO usedInsertDTO) {
        Used used = new Used();
        used.setUsedTimeStart(usedInsertDTO.getUsedTimeStart());
        used.setUsedCode(usedInsertDTO.getUsedCode());
        used.setUsedName(usedInsertDTO.getUsedName());
        if (usedInsertDTO.getKidDeviceID() != null) {
            KidDevice kidDevice = new KidDevice();
            kidDevice.setKidDeviceId(usedInsertDTO.getKidDeviceID());
            used.setKidDevice(kidDevice);
        }
        return used;
    }

    public Used mapToUsedFromUsedUpdate(Used used, UsedUpdateDTO usedUpdateDTO){
        if(usedUpdateDTO.getUsedTimeEnd() != null ) used.setUsedTimeEnd(usedUpdateDTO.getUsedTimeEnd());
        return used;
    }
}
