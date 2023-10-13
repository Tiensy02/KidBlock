package com.javaSpring.KidBlock;


import com.javaSpring.KidBlock.Applications.Service.KidDeviceServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import com.javaSpring.KidBlock.Applications.DTO.KidDeviceInsertDTO;
import com.javaSpring.KidBlock.Applications.Interface.KidDeviceService;
import com.javaSpring.KidBlock.Domain.Entity.AccountParent;
import com.javaSpring.KidBlock.Domain.Entity.KidDevice;
import com.javaSpring.KidBlock.Domain.Exception.ConflictException;
import com.javaSpring.KidBlock.Domain.Interface.IKidDeviceRepository;
import com.javaSpring.KidBlock.Domain.Model.KidDeciveModel;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class KidDeviceTest {

    @InjectMocks
    private KidDeviceService kidDeviceService;

    @Mock
    private IKidDeviceRepository kidDeviceRepository;

    @Test
    public void testGetKidDeviceByParent() {
        String parentId = "parent123";
        AccountParent accountParent = new AccountParent();
        List<KidDevice> kidDevices = new ArrayList<>();
        KidDevice kidDevice1 = new KidDevice();
        KidDevice kidDevice2 = new KidDevice();
        kidDevice1.setKidDeviceId("kid1");
        kidDevice2.setKidDeviceId("kid2");
        kidDevices.add(kidDevice1);
        kidDevices.add(kidDevice2);
        accountParent.setKidDevices(kidDevices);
        
        Mockito.when(kidDeviceRepository.findKidDeviceByAccountParent(parentId)).thenReturn(accountParent);
        
        List<KidDeciveModel> result = kidDeviceService.getKidDeviceByParent(parentId);
        
        assertEquals(2, result.size());
    }

    @Test
    public void testInsertKidDevice() throws ConflictException {
        KidDeviceInsertDTO kidDeviceInsertDTO = new KidDeviceInsertDTO();
        kidDeviceInsertDTO.setKidDeviceCode(123);
        KidDevice existingKidDevice = new KidDevice();
        
        Mockito.when(kidDeviceRepository.findKidDeviceByKidDeviceCode(kidDeviceInsertDTO.getKidDeviceCode())).thenReturn(existingKidDevice);
        
        kidDeviceService.insertKidDevice(kidDeviceInsertDTO);
        
    }

    @Test
    public void testDeleteKidDevice() throws ConflictException {

        List<String> ids = new ArrayList<>();
        ids.add("kid1");
        ids.add("kid2");
        
        Mockito.when(kidDeviceRepository.findKidDeviceByKidDeviceId("kid1")).thenReturn(new KidDevice());
        Mockito.when(kidDeviceRepository.findKidDeviceByKidDeviceId("kid2")).thenReturn(null);
        
        kidDeviceService.deleteKidDevice(ids);
        
    }
    
}

