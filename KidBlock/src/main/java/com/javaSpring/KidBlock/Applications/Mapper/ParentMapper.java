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
        parentInsertDTO.setParentPassPIN(accountParent.getParentPassPIN());
        parentInsertDTO.setParentEmail(accountParent.getParentEmail());
        parentInsertDTO.setParentName(accountParent.getParentName());
        parentInsertDTO.setParentAvatar(accountParent.getParentAvatar());
        return parentInsertDTO;
    }
    public AccountParent mapToAccountParent(ParentInsertDTO parentInsertDTO) {
        AccountParent accountParent = new AccountParent();
        accountParent.setParentPassword(parentInsertDTO.getParentPassword());
        accountParent.setParentPassPIN(parentInsertDTO.getParentPassPIN());
        accountParent.setParentEmail(parentInsertDTO.getParentEmail());
        accountParent.setParentName(parentInsertDTO.getParentName());
        accountParent.setParentAvatar(parentInsertDTO.getParentAvatar());
        return accountParent;
    }
    public AccountParent mapToAccountParentFromParentUpdate(ParentUpdateDTO parentUpdateDTO) {
        AccountParent accountParent = new AccountParent();
        accountParent.setParentPassword(parentUpdateDTO.getNewParentPassword());
        accountParent.setParentPassPIN(parentUpdateDTO.getParentPIN());
        accountParent.setParentName(parentUpdateDTO.getNewParentName());
        accountParent.setParentAvatar(parentUpdateDTO.getNewParentAvatar());
        return accountParent;
    }
}
