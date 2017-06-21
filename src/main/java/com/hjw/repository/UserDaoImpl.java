package com.hjw.repository;

import com.hjw.domain.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by 黄毅 on 2017/6/21.
 */
@Repository
public class UserDaoImpl implements UserDao {

    private SessionFactory sessionFactory;
    @Autowired
    private Session getSession(){
        return sessionFactory.getCurrentSession();
    }

    @Override
    public List<User> selectUser() {
        return this.getSession().createQuery("from User").list();
    }
}
