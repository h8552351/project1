package com.hjw.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by 黄毅 on 2017/6/21.
 */
@Data
@Entity
@Table(name = "t_manager")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "username")
    private String userName;
    @Column(name = "password")
    private String passWord;
}
