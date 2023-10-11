package com.javaSpring.KidBlock.Domain.Interface;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.javaSpring.KidBlock.Domain.Entity.AccountParent;

@Repository
public interface IParentRepository extends JpaRepository<AccountParent, UUID> {

    List<AccountParent> findAllByParentEmail(String parentEmail);

    AccountParent findByParentEmail(String parentEmail);
    
    AccountParent findByParentEmailAndParentPassword(String parentEmail, String parentPassword);

}
