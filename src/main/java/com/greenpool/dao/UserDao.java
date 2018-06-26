package com.greenpool.dao;

import com.greenpool.converter.UserConvertor;
import com.greenpool.domain.UserEntity;
import com.greenpool.model.User;
import com.greenpool.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityNotFoundException;

@Component
public class UserDao {

    @Autowired
    UserRepository userRepository;

    public void saveUser(User user){

        UserEntity userEntity= UserConvertor.convert(user);
        UserEntity searchEntity=userRepository.findByEmail(userEntity.getEmail());


        if(searchEntity==null){
            userRepository.save(userEntity);
        }
    }

    public User getUserInfo(String email){

        UserEntity userEntity=userRepository.findByEmail(email);

        if(userEntity==null){
            throw new EntityNotFoundException("User not found");
        }
        return UserConvertor.convert(userEntity);
    }

    public void deleteUser(String email){
        UserEntity userEntity=userRepository.findByEmail(email);
        if(userEntity==null){
            throw new EntityNotFoundException("User not found");
        }
        userRepository.delete(userEntity);
    }


}
