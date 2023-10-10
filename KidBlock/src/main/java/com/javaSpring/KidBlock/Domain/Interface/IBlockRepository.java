package com.javaSpring.KidBlock.Domain.Interface;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.javaSpring.KidBlock.Domain.Entity.Block;

public interface IBlockRepository extends CrudRepository<Block,UUID>,PagingAndSortingRepository<Block,UUID> {
    
}
