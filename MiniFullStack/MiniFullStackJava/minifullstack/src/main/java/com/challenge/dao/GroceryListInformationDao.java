package com.challenge.dao;

import com.challenge.model.GroceryListInformation;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface GroceryListInformationDao extends CrudRepository<GroceryListInformation, Integer> {

    
}