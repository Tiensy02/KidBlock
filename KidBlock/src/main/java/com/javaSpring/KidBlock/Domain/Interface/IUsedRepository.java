package com.javaSpring.KidBlock.Domain.Interface;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.javaSpring.KidBlock.Domain.Entity.KidDevice;
import com.javaSpring.KidBlock.Domain.Entity.Used;

public interface IUsedRepository extends JpaRepository<Used, String> {
    @Query("SELECT DISTINCT c FROM KidDevice c JOIN FETCH c.useds where c.kidDeviceId = :kidDeviceId ")
    KidDevice getBlockByKidDevice(@Param("kidDeviceId") String kiDdeviceId );
    Used findByUsedId(String usedId);

}
