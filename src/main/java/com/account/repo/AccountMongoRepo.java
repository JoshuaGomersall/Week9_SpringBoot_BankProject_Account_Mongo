package com.account.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.account.entities.AccountEntity;




@Repository
public interface AccountMongoRepo extends MongoRepository<AccountEntity, Long>{
	
	public AccountEntity findByforeName(String firstName);
    public List<AccountEntity> findByfamilyName(String lastName);
}
