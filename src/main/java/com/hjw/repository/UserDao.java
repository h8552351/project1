package com.hjw.repository;

import com.hjw.domain.User;

import java.util.List;

/**
 * Created by 黄毅 on 2017/6/21.
 */
public interface UserDao {
    public List<User> selectUser();
}
