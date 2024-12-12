package com.server.whatlunchusers.service;

import com.server.whatlunchcore.users.repo.UsersRepository;
import com.server.whatlunchusers.dto.UsersDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class GetUsersService {

    private final UsersRepository usersRepository;

    public List<UsersDto.UserInfo> execute(){
        return usersRepository.findAll().stream().map(
                user -> UsersDto.UserInfo.builder()
                        .userId(user.getUserId())
                        .name(user.getName())
                        .telNo(user.getTelNo())
                        .birthdate(user.getBirthdate())
                        .createdAt(user.getCreatedAt())
                        .updatedAt(user.getUpdatedAt())
                        .build()
        ).collect(Collectors.toList());
    }

}
