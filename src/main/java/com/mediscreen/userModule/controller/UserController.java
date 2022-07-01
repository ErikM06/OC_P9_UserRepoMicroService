package com.mediscreen.userModule.controller;

import com.mediscreen.userModule.customExceptions.UserNotFoundException;
import com.mediscreen.userModule.model.User;
import com.mediscreen.userModule.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/getUser")
    public ResponseEntity<User> getUserByUsernameAndPassword (@RequestParam String username){
        User user = null;
        try {
            user = userService.getUser(username);
        } catch (UserNotFoundException e) {
            e.getMessage();

        }
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
}
