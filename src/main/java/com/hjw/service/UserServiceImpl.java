package com.hjw.service;

import com.hjw.domain.User;
import com.hjw.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by 黄毅 on 2017/6/21.
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getUser() {
        return userDao.selectUser();
    }
}
