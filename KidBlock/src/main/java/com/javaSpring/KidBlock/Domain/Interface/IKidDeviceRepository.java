package com.javaSpring.KidBlock.Domain.Interface;

import org.springframework.data.jpa.repository.JpaRepository;
import com.javaSpring.KidBlock.Domain.Entity.KidDevice;

public interface IKidDeviceRepository extends JpaRepository<KidDevice,String> {

    

}
