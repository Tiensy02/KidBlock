package com.javaSpring.KidBlock.Domain.Interface;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.javaSpring.KidBlock.Domain.Entity.Block;
import com.javaSpring.KidBlock.Domain.Entity.KidDevice;

public interface IBlockRepository extends JpaRepository<Block,String> {
    @Query("SELECT DISTINCT c FROM KidDevice c JOIN FETCH c.blocks where c.kidDeviceId = :kidDeviceId")
    KidDevice getBlockByKidDevice(@Param("kidDeviceId") String kiDdeviceId );

    Block findByAccountParentParentIdAndKidDeviceKidDeviceId(String parent_Id, String kid_device_id);
    Block findByBlockId(String blockId);
    List<Block> findByAccountParentParentId(String parent_Id);

}
