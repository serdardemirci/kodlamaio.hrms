package com.serdardemirci.hrms.business.concretes;

import com.serdardemirci.hrms.business.abstracts.UserService;
import com.serdardemirci.hrms.dataAccess.abstracts.UserDao;
import com.serdardemirci.hrms.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserManager implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User getById(int id) {
        return this.userDao.findById(id).orElse(null);
    }
}
