package com.server.whatlunchusers.dto;

import lombok.Builder;

import java.time.LocalDateTime;

public class UsersDto {

    @Builder
    public static class UserInfo{
        private long userId;
        private String name;
        private String telNo;
        private String birthdate;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;
    }
}
