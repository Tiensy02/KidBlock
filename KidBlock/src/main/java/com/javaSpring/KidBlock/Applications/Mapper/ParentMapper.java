package com.javaSpring.KidBlock.Applications.Mapper;

import com.javaSpring.KidBlock.Applications.DTO.ParentInsertDTO;
import com.javaSpring.KidBlock.Applications.DTO.ParentUpdateDTO;
import com.javaSpring.KidBlock.Domain.Entity.AccountParent;
import org.springframework.stereotype.Component;

@Component
public class ParentMapper {

    public ParentInsertDTO mapToParentInsertDTO(AccountParent accountParent) {
        ParentInsertDTO parentInsertDTO = new ParentInsertDTO();
        parentInsertDTO.setParentPassword(accountParent.getParentPassword());
        parentInsertDTO.setParentPassPIN(accountParent.getParentPassPin());
        parentInsertDTO.setParentEmail(accountParent.getParentEmail());
        parentInsertDTO.setParentName(accountParent.getParentName());
        parentInsertDTO.setParentAvatar(accountParent.getParentAvatar());
        return parentInsertDTO;
    }
    public AccountParent mapToAccountParent(ParentInsertDTO parentInsertDTO) {
        AccountParent accountParent = new AccountParent();
        accountParent.setParentPassword(parentInsertDTO.getParentPassword());
        accountParent.setParentPassPin(parentInsertDTO.getParentPassPIN());
        accountParent.setParentEmail(parentInsertDTO.getParentEmail());
        accountParent.setParentName(parentInsertDTO.getParentName());
        accountParent.setParentAvatar(parentInsertDTO.getParentAvatar());
        return accountParent;
    }
    public AccountParent mapToAccountParentFromParentUpdate(AccountParent accountParent, ParentUpdateDTO parentUpdateDTO) {
        if(parentUpdateDTO.getNewParentPassword() != null ) accountParent.setParentPassword(parentUpdateDTO.getNewParentPassword());
        if (parentUpdateDTO.getParentPin() != 0) accountParent.setParentPassPin(parentUpdateDTO.getParentPin());
        if ( parentUpdateDTO.getNewParentName() != null)accountParent.setParentName(parentUpdateDTO.getNewParentName());
        if(parentUpdateDTO.getNewParentAvatar() != null ) accountParent.setParentAvatar(parentUpdateDTO.getNewParentAvatar());
        return accountParent;
    }
}
