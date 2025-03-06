package com.Shivam.journalApp.service;

import com.Shivam.journalApp.entity.users;
import com.Shivam.journalApp.repository.UserEntryRepo;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserService {

    @Autowired
    private UserEntryRepo userEntryRepo;

    public void saveEntry(users user) {
        userEntryRepo.save(user);
    }

    public List<users> getAll() {
        return userEntryRepo.findAll();
    }

    public Optional<users> findById(ObjectId id) {
        return userEntryRepo.findById(id);
    }

    public void deleteById(ObjectId id) {
        userEntryRepo.deleteById(id);
    }

    public users findUserName(String username) {
        return userEntryRepo.findByUsername(username);
    }

}
