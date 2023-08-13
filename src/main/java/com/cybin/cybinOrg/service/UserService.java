package com.cybin.cybinOrg.service;

import com.cybin.cybinOrg.dto.UserRequestDTO;
import com.cybin.cybinOrg.entity.Role;
import com.cybin.cybinOrg.entity.User;
import com.cybin.cybinOrg.repository.RoleRepo;
import com.cybin.cybinOrg.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.function.Predicate;

@Service
public class UserService {

    private UserRepo userRepo;
    private RoleRepo roleRepo;

    private CheckForNull checkForNull;

    @Autowired
    public UserService(UserRepo repoUser, RoleRepo repoRol) {
        this.userRepo = repoUser;
        this.roleRepo = repoRol;
    }

    /**
     * A service to create a new User by DTO params.
     *
     * @param userRequestDTO a DTO with User necessary params
     * @return User object.
     */
    public User createUser(UserRequestDTO userRequestDTO) {
        User user = new User();
        try {
            if (!checkForNull.test(userRequestDTO)) {
                Role role = roleRepo.findById(userRequestDTO.getRoleId()).get();
                user.setRoleId(role);
                user.setUserName(userRequestDTO.getUsername());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return userRepo.save(user);
        }
    }

    /**
     * My implementation of the Predicate to check for null any object.
     */
    private class CheckForNull implements Predicate<Object> {
        @Override
        public boolean test(Object o) {
            return o != null;
        }
    }


}
