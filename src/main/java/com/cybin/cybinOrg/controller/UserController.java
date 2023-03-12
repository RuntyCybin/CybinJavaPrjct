package com.cybin.cybinOrg.controller;

import com.cybin.cybinOrg.service.UserService;
import com.cybin.cybinOrg.dto.UserRequestDTO;
import com.cybin.cybinOrg.entity.User;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/add")
    public ResponseEntity<User> addUser(
            @RequestBody @Valid UserRequestDTO newUser) {
        return new ResponseEntity<>(
                userService.createUser(newUser),
                HttpStatus.CREATED);
    }
}
