package com.server.whatlunchusers.controller;

import com.server.whatlunchusers.service.GetUsersService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UsersController {

    private final GetUsersService getUsersService;

    @GetMapping
    public void getUsers() {
        getUsersService.execute();
    }


}
