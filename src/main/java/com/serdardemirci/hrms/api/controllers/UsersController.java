package com.serdardemirci.hrms.api.controllers;

import com.serdardemirci.hrms.business.abstracts.UserService;
import com.serdardemirci.hrms.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UsersController {

    @Autowired
    private UserService userService;

    @GetMapping("/getall")
    User getAll(int id){
        return this.userService.getById(id);
    }
}
