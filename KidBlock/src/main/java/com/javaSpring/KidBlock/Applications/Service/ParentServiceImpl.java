package com.javaSpring.KidBlock.Applications.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.javaSpring.KidBlock.Applications.DTO.ParentInsertDTO;
import com.javaSpring.KidBlock.Applications.DTO.ParentUpdateDTO;
import com.javaSpring.KidBlock.Applications.Interface.ParentService;
import com.javaSpring.KidBlock.Applications.Mapper.ParentMapper;
import com.javaSpring.KidBlock.Domain.Entity.AccountParent;
import com.javaSpring.KidBlock.Domain.Exception.ConflictException;
import com.javaSpring.KidBlock.Domain.Exception.NotFoundException;
import com.javaSpring.KidBlock.Domain.Interface.IParentRepository;
@Service
public class ParentServiceImpl implements ParentService {
    @Autowired
    private IParentRepository parentRepository;
    @Autowired
    private ParentMapper parentMapper;
    
    @Override
   /**
    * @des: hàm thực hiện thêm mới 1 Parent
    */
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
    /**
     * @des: hàm thực hiện cập nhập parent
     */
    @Override
    public void updateParent(ParentUpdateDTO parentUpdateDto) throws ConflictException {
        AccountParent accountParent = parentRepository.findByParentEmailAndParentPassword(parentUpdateDto.getParentEmail(),parentUpdateDto.getParentPassword() );
        if(accountParent == null) {
            throw new ConflictException("Your Password Is Wrong", 409);
        } else {
           accountParent = parentMapper.mapToAccountParentFromParentUpdate(accountParent, parentUpdateDto);
           accountParent.setModifyDate(LocalDate.now());
           parentRepository.save(accountParent);
        }
    }

    /**
     * @des: hàm thực hiện xoá 1 parent
     * 
     */
    @Override
    public void deleteParent(List<UUID> ids)  throws NotFoundException{
        try{
            parentRepository.deleteAllById(ids);
        } catch(Exception e){
            throw new NotFoundException("Not Found Account", 404);
        }
    }
    /**
     * @des: hàm thực hiện login
     */
    @Override
    public AccountParent loginParent(String parentEmail, String parentPassword) throws ConflictException {
        AccountParent accountParent = parentRepository.findByParentEmailAndParentPassword(parentEmail, parentPassword);
        if(accountParent == null ) {
            throw new ConflictException("Email Or PassWord Is Incorrect", 401);
        }else {
            return accountParent;
        }
        
    }
}
