package com.greenpool.controller;

import com.greenpool.model.User;
import com.greenpool.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;

@RestController
@RequestMapping("/v1/")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "registeruser",method = RequestMethod.POST,produces = {"application/json"})
    public ResponseEntity<?> saveUser(@RequestBody User user){

        userService.saveUser(user);
        return ResponseEntity.ok().body(HttpStatus.CREATED);
    }

    @RequestMapping(value = "login",method = RequestMethod.POST,produces = {"application/json"})
    public ResponseEntity<?> userLogin(@RequestParam(required = true) String username,
                                       @RequestParam(required = true) String password){

        User user=userService.getUserInfo(username);
        if(user==null){
            return ResponseEntity.badRequest().body(HttpStatus.UNAUTHORIZED);
        }
        else {
            if(user.getPassword().equalsIgnoreCase(password)){
                user.setPassword(null);
                return ResponseEntity.ok().body(user);
            }
            else{
                return ResponseEntity.badRequest().body(HttpStatus.UNAUTHORIZED);
            }
        }
    }


    @RequestMapping(value = "user",method = RequestMethod.GET,produces = {"application/json"})
    public ResponseEntity<?> getUser(@RequestParam(required = true) String email){
        return ResponseEntity.ok().body(userService.getUserInfo(email));
    }

    @RequestMapping(value = "deleteuser",method = RequestMethod.DELETE,produces = {"application/json"})
    public ResponseEntity<?> saveUser(@RequestParam(required = true) String email){

        userService.deleteUser(email);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
