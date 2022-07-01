package com.mediscreen.userModule.services;


import com.mediscreen.userModule.customExceptions.UserNotFoundException;
import com.mediscreen.userModule.model.User;
import com.mediscreen.userModule.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService  {

    @Autowired
    UserRepo userRepo;

    @Transactional
    public User getUser(String username) throws UserNotFoundException {
        return userRepo.findByUsername(username);
    }





}
