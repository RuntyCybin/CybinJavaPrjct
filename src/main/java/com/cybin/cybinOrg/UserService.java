package com.cybin.cybinOrg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepo userRepo;

    @Autowired
    public UserService(UserRepo repoUser) {
        this.userRepo = repoUser;
    }


    public User createUser(User usr) {
        return userRepo.save(usr);
    }

}
