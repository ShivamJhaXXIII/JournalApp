package com.Shivam.journalApp.repository;

import com.Shivam.journalApp.entity.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.stereotype.Component;


public interface JournalEntryRepo extends MongoRepository<JournalEntry, ObjectId> {
}
