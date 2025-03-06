package com.Shivam.journalApp.controller;

import com.Shivam.journalApp.entity.users;
import com.Shivam.journalApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserEntryController {

    @Autowired
    private UserService userService;

    @GetMapping("/{username}")
    public List<users> getAllUsers() {
        return userService.getAll();
    }

    @PostMapping
    public void createUser(@RequestBody users user) {
        userService.saveEntry(user);
    }

    @PutMapping("/{username}")
    public ResponseEntity<?> updateUser(@RequestBody users user, @PathVariable String username) {
        users userInDb = userService.findUserName(username);
        if (userInDb != null) {
            userInDb.setUsername(user.getUsername());
            userInDb.setPassword(user.getPassword());
            userService.saveEntry(userInDb);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    
}
