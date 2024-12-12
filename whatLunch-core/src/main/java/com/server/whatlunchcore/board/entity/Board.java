package com.server.whatlunchcore.board.entity;

import com.server.whatlunchcore.common.entity.CommonDate;
import com.server.whatlunchcore.users.entity.Users;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Table(name = "board")
@Getter
public class Board extends CommonDate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long boardId;
    private String title;
    private String content;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private Users users;
}
