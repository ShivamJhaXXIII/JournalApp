package com.Shivam.journalApp.repository;

import com.Shivam.journalApp.entity.users;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserEntryRepo extends MongoRepository<users, ObjectId>{
    users findByUsername(String username);
}
