package com.javaSpring.KidBlock.Applications.Interface;

import java.util.List;
import java.util.UUID;


import com.javaSpring.KidBlock.Applications.DTO.ParentInsertDTO;
import com.javaSpring.KidBlock.Applications.DTO.ParentUpdateDTO;
import com.javaSpring.KidBlock.Domain.Entity.AccountParent;
import com.javaSpring.KidBlock.Domain.Exception.ConflictException;
import com.javaSpring.KidBlock.Domain.Exception.NotFoundException;
public interface ParentService {

    ParentInsertDTO insertParent(ParentInsertDTO parentInseryDto) throws ConflictException;
    void updateParent(ParentUpdateDTO parentUpdateDto) throws ConflictException;
    void deleteParent(List<UUID> ids) throws NotFoundException;
    AccountParent loginParent(String parentEmail, String parentPassword) throws ConflictException;

}
