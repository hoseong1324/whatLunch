package com.server.whatlunchcore.users.entity;

import com.server.whatlunchcore.common.entity.CommonDate;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
@Table(name = "users")
public class Users extends CommonDate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;
    private String name;
    private String telNo;
    private String birthdate;
    @Enumerated(EnumType.STRING)
    private Gender gender;

    private enum Gender {
        M,F
    }
}
