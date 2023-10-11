package com.javaSpring.KidBlock.Applications.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaSpring.KidBlock.Applications.DTO.UsedInsertDTO;
import com.javaSpring.KidBlock.Applications.DTO.UsedUpdateDTO;
import com.javaSpring.KidBlock.Applications.Interface.UsedService;
import com.javaSpring.KidBlock.Applications.Mapper.UsedMapper;
import com.javaSpring.KidBlock.Domain.Entity.KidDevice;
import com.javaSpring.KidBlock.Domain.Entity.Used;
import com.javaSpring.KidBlock.Domain.Exception.ConflictException;
import com.javaSpring.KidBlock.Domain.Interface.IUsedRepository;
import com.javaSpring.KidBlock.Domain.Model.UsedModel;

@Service
public class UsedServiceImpl implements UsedService {


    @Autowired 
    IUsedRepository usedRepository;
    @Autowired UsedMapper usedMapper;


    @Override
    public List<UsedModel> getUsedByKidDevice(String kidDeviceId) {
        KidDevice kidDevice = usedRepository.getBlockByKidDevice(kidDeviceId);
        List<Used> useds = kidDevice.getUseds();
        List<UsedModel> result = new ArrayList<>();
        for ( Used used : useds ) {
            result.add(usedMapper.mapToUsedModel(used));
        }
        return result;
    }

    @Override
    public void insertUsed(UsedInsertDTO usedInsertDTO) throws ConflictException {
        usedRepository.save(usedMapper.mapToUsed(usedInsertDTO));
    }

    @Override
    public void updateUsed(UsedUpdateDTO usedUpdateDTO) throws ConflictException {
        Used used = usedRepository.findByUsedId(usedUpdateDTO.getUsedId());
        if(used != null ) {
            usedRepository.save(usedMapper.mapToUsedFromUsedUpdate(used, usedUpdateDTO));
        }
        
    }

    @Override
    public void deleteUsed(List<String> ids) {
       usedRepository.deleteAllById(ids);
    }
    
}
