package com.greenpool.converter;

import com.greenpool.domain.AddressEntity;
import com.greenpool.domain.UserEntity;
import com.greenpool.model.User;

public class UserConvertor {


    public static UserEntity convert(User user){

        UserEntity userEntity= new UserEntity();
    //    userEntity.setAge(user.getAge());
        userEntity.setEmail(user.getEmail());
        userEntity.setId(user.getId());
        userEntity.setFirstname(user.getFirstname());
        userEntity.setLastname(user.getLastname());
        userEntity.setGender(user.getGender());
        userEntity.setMobile(user.getMobile());
        userEntity.setPassword(user.getPassword());
        return userEntity;
    }

    public static User convert(UserEntity userEntity){

        User user= new User();
  //      user.setAge(userEntity.getAge());
        user.setEmail(userEntity.getEmail());
        user.setId(userEntity.getId());
        user.setFirstname(userEntity.getFirstname());
        user.setLastname(userEntity.getLastname());
        user.setGender(userEntity.getGender());
        user.setMobile(userEntity.getMobile());
        user.setPassword(userEntity.getPassword());
        return user;
    }

    public static AddressEntity convert(){

        AddressEntity addressEntity= new AddressEntity();
        return addressEntity;

    }



}
