package com.javaSpring.KidBlock.Applications.Mapper;

import org.springframework.stereotype.Component;

import com.javaSpring.KidBlock.Applications.DTO.KidDeviceInsertDTO;
import com.javaSpring.KidBlock.Applications.DTO.KidDeviceUpdateDTO;
import com.javaSpring.KidBlock.Domain.Entity.AccountParent;
import com.javaSpring.KidBlock.Domain.Entity.KidDevice;
import com.javaSpring.KidBlock.Domain.Model.KidDeciveModel;

@Component
public class KidDeviceMapper {

    public KidDeciveModel mapKidDeviceToModel(KidDevice kidDevice) {
        KidDeciveModel kidDeviceModel = new KidDeciveModel();
        kidDeviceModel.setKidDeviceID(kidDevice.getKidDeviceId());
        kidDeviceModel.setKidDeviceName(kidDevice.getKidDeviceName());
        kidDeviceModel.setKidDeviceKidAge(kidDevice.getKidDeviceKidAge());
        kidDeviceModel.setKidDeviceKidAvatar(kidDevice.getKidDeviceKidAvatar());
        kidDeviceModel.setKidDeviceAction(kidDevice.getKidDeviceAction());
        kidDeviceModel.setKidDeviceParentMode(kidDevice.getKidDeviceParentMode());
        return kidDeviceModel;
    }

    public  KidDeviceInsertDTO mapToKidDeviceInsertDTO(KidDevice kidDevice) {
        KidDeviceInsertDTO dto = new KidDeviceInsertDTO();
        dto.setKidDeviceName(kidDevice.getKidDeviceName());
        dto.setKidDeviceKidAge(kidDevice.getKidDeviceKidAge());
        dto.setKidDeviceKidAvatar(kidDevice.getKidDeviceKidAvatar());
        dto.setKidDeviceParentMode(kidDevice.getKidDeviceParentMode());
        dto.setKidDeviceAction(kidDevice.getKidDeviceAction());
        dto.setKidDeviceCode(kidDevice.getKidDeviceCode());
        if (kidDevice.getAccountParent() != null) {
            dto.setParentId(kidDevice.getAccountParent().getParentID());
        }
        return dto;
    }

     public  KidDevice mapToKidDevice(KidDeviceInsertDTO dto) {
        KidDevice kidDevice = new KidDevice();
        kidDevice.setKidDeviceName(dto.getKidDeviceName());
        kidDevice.setKidDeviceKidAge(dto.getKidDeviceKidAge());
        kidDevice.setKidDeviceKidAvatar(dto.getKidDeviceKidAvatar());
        kidDevice.setKidDeviceParentMode(dto.getKidDeviceParentMode());
        kidDevice.setKidDeviceAction(dto.getKidDeviceAction());
        kidDevice.setKidDeviceCode(dto.getKidDeviceCode());
        
        if (dto.getParentId() != null) {
            AccountParent accountParent = new AccountParent();
            accountParent.setParentID(dto.getParentId());
            kidDevice.setAccountParent(accountParent);
        }

        return kidDevice;
    }
    
    public KidDevice mapToKidDeviceFromKidDeviceUpdateDTO(KidDevice kidDevice, KidDeviceUpdateDTO kidDeviceUpdateDTO) {
        if(kidDeviceUpdateDTO.getKidDeviceName() != null ) kidDevice.setKidDeviceName(kidDeviceUpdateDTO.getKidDeviceName());
        if ( kidDeviceUpdateDTO.getKidDeviceAction() != null)kidDevice.setKidDeviceAction(kidDeviceUpdateDTO.getKidDeviceAction());
        if(kidDeviceUpdateDTO.getKidDeviceKidAvatar() != null ) kidDevice.setKidDeviceKidAvatar(kidDeviceUpdateDTO.getKidDeviceKidAvatar());
        if(kidDeviceUpdateDTO.getKidDeviceParentMode() != null ) kidDevice.setKidDeviceParentMode(kidDeviceUpdateDTO.getKidDeviceParentMode());
        return kidDevice;
    }

}
   
    


