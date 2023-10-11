package com.javaSpring.KidBlock.Applications.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaSpring.KidBlock.Applications.DTO.KidDeviceInsertDTO;
import com.javaSpring.KidBlock.Applications.DTO.KidDeviceUpdateDTO;
import com.javaSpring.KidBlock.Applications.Interface.KidDeviceService;
import com.javaSpring.KidBlock.Applications.Mapper.KidDeviceMapper;
import com.javaSpring.KidBlock.Domain.Entity.AccountParent;
import com.javaSpring.KidBlock.Domain.Entity.KidDevice;
import com.javaSpring.KidBlock.Domain.Exception.ConflictException;
import com.javaSpring.KidBlock.Domain.Interface.IKidDeviceRepository;
import com.javaSpring.KidBlock.Domain.Model.KidDeciveModel;



@Service
public class KidDeviceServiceImpl implements KidDeviceService {
    // cấu hình bean
    @Autowired
    IKidDeviceRepository kidDeviceRepository;

    @Autowired
    KidDeviceMapper kidDeviceMapper;
    // các hàm thực thi 
    @Override
    public List<KidDeciveModel> getKidDeviceByParent(String parentId) {
        
        AccountParent accountParentResult =  kidDeviceRepository.findKidDeviceByAccountParent(parentId);
        List<KidDevice> kidDevices =  accountParentResult.getKidDevices();
        List<KidDeciveModel> result = new ArrayList<>();
        for(KidDevice  kidDevice : kidDevices) {
            result.add(kidDeviceMapper.mapKidDeviceToModel(kidDevice));
        }
        return result;
    }

    @Override
    public void insertKidDevice(KidDeviceInsertDTO kidDeviceInsertDTO) throws ConflictException {
        KidDevice kidDevice = kidDeviceRepository.findKidDeviceByKidDeviceCode(kidDeviceInsertDTO.getKidDeviceCode());
        if(kidDevice != null ) {
            throw new ConflictException("Device adready register",409);
        }else {
            kidDeviceRepository.save(kidDeviceMapper.mapToKidDevice(kidDeviceInsertDTO));
        }
    }

    @Override
    public void deleteKidDevice(List<String> ids) throws ConflictException {
        for( String id : ids ) {
            KidDevice kidDevice = kidDeviceRepository.findKidDeviceByKidDeviceId(id);
            if(kidDevice == null ) {
                throw new ConflictException("Exist ID Is InCorrect",409);
            }
        }
        kidDeviceRepository.deleteAllById(ids);
    }


    @Override
    public void putKidDevice(KidDeviceUpdateDTO kidDeviceUpdateDTO) {
        KidDevice kidDevice = kidDeviceRepository.findKidDeviceByKidDeviceId(kidDeviceUpdateDTO.getKidDeviceId());
        kidDevice = kidDeviceMapper.mapToKidDeviceFromKidDeviceUpdateDTO(kidDevice, kidDeviceUpdateDTO);
        kidDeviceRepository.save(kidDevice);
    }

}
