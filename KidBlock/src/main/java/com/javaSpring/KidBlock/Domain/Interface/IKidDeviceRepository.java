package com.javaSpring.KidBlock.Domain.Interface;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.javaSpring.KidBlock.Domain.Entity.AccountParent;
import com.javaSpring.KidBlock.Domain.Entity.KidDevice;

@Repository
public interface IKidDeviceRepository extends JpaRepository<KidDevice, String> {
   @Query("SELECT DISTINCT c FROM AccountParent c JOIN FETCH c.kidDevices where c.parentId = :parentId")
   AccountParent findKidDeviceByAccountParent(@Param("parentId") String parentId);

   KidDevice findKidDeviceByKidDeviceCode(int kidDeviceCode);
   KidDevice findKidDeviceByKidDeviceId(String kidDeviceId);



}
