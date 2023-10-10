package com.javaSpring.KidBlock.Applications.Service;

import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.javaSpring.KidBlock.Applications.DTO.ParentInsertDTO;
import com.javaSpring.KidBlock.Applications.DTO.ParentUpdateDTO;
import com.javaSpring.KidBlock.Applications.Interface.IParentService;
import com.javaSpring.KidBlock.Applications.Mapper.ParentMapper;
import com.javaSpring.KidBlock.Domain.Entity.AccountParent;
import com.javaSpring.KidBlock.Domain.Exception.ConflictException;
import com.javaSpring.KidBlock.Domain.Exception.NotFoundException;
import com.javaSpring.KidBlock.Domain.Interface.IParentRepository;
@Service
public class ParentService implements IParentService {
    @Autowired
    private IParentRepository parentRepository;
    @Autowired
    private ParentMapper parentMapper;
    
    @Override
   
    public ParentInsertDTO insertParent(ParentInsertDTO parentInseryDto) throws ConflictException  {
        List<AccountParent> acc = parentRepository.findAllByParentEmail(parentInseryDto.getParentEmail());

         if(!acc.isEmpty()) {
            throw new ConflictException("Email adready exist", 409);
         }
         else {
            AccountParent accountParentInsert = parentMapper.mapToAccountParent(parentInseryDto);
            ParentInsertDTO parentInsertDTOResult = parentMapper.mapToParentInsertDTO(parentRepository.save(accountParentInsert));
            return parentInsertDTOResult;
         }
    }

    @Override
    public ParentUpdateDTO updateParent(ParentUpdateDTO parentUpdateDto) throws ConflictException {
        int statusUpdate = 0;
        parentRepository.updateParent(parentUpdateDto.getParentEmail(), parentUpdateDto.getParentPassword(),parentUpdateDto.getNewParentPassword(), parentUpdateDto.getNewParentName(),parentUpdateDto.getNewParentAvatar(),parentUpdateDto.getParentPIN(), statusUpdate);
        if(statusUpdate == 0) {
            throw new ConflictException("Your Password Is Wrong", 409);
        } else {
            return parentUpdateDto;
        }
    }

    @Override
    public void deleteParent(List<UUID> ids)  throws NotFoundException{
        try{
            parentRepository.deleteAllById(ids);
        } catch(Exception e){
            throw new NotFoundException("Not Found Account", 404);
        }
    }

    @Override
    public int loginParent(String parentEmail, String parentPassword) throws ConflictException {
        int loginStatus = 0;
        parentRepository.parentLogin(parentEmail, parentPassword, loginStatus);
        if(loginStatus == 0 ) {
            throw new ConflictException("Email Or PassWord Is Incorrect", 401);
        }else {
            return loginStatus;
        }
        
    }
}
