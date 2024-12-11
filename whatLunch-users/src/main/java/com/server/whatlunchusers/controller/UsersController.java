package com.server.whatlunchusers.controller;

import com.server.whatlunchusers.repo.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UsersController {

    private final UsersRepository usersRepository;

    @GetMapping
    public void getUsers() {
        usersRepository.findAll();
    }
}
