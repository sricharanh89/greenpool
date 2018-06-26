package com.greenpool.service;

import com.greenpool.dao.UserDao;
import com.greenpool.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserDao userDao;

    public void saveUser(User user){userDao.saveUser(user);}

    public User getUserInfo(String email){

        User user= userDao.getUserInfo(email);
        return user;

    }

    public void deleteUser(String email){
        userDao.deleteUser(email);
    }


}
