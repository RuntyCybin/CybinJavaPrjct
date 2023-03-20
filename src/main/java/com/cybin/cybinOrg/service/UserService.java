package com.cybin.cybinOrg.service;

import com.cybin.cybinOrg.dto.UserRequestDTO;
import com.cybin.cybinOrg.entity.Role;
import com.cybin.cybinOrg.entity.User;
import com.cybin.cybinOrg.repository.RoleRepo;
import com.cybin.cybinOrg.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private UserRepo userRepo;
    private RoleRepo roleRepo;

    @Autowired
    public UserService(UserRepo repoUser, RoleRepo repoRol) {
        this.userRepo = repoUser;
        this.roleRepo = repoRol;
    }

    public User createUser(UserRequestDTO usr) {
        User user = new User();
        Role role = roleRepo.findById(usr.getRoleId()).get();
        user.setRoleId(role);

        user.setUserName(usr.getUsername());

        return userRepo.save(user);
    }

}
