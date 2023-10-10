package com.javaSpring.KidBlock.Domain.Interface;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.javaSpring.KidBlock.Domain.Entity.Used;

public interface IUsedRepository extends CrudRepository<Used,UUID>, PagingAndSortingRepository<Used,UUID> {
    
}
