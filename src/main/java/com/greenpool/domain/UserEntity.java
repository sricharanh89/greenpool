package com.greenpool.domain;

import javax.persistence.*;

@Entity(name="user")
public class UserEntity {


@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="id",nullable = false,unique = true)
private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    @Column(name="mobile",nullable = false)
    private String mobile;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name="password",nullable = false)
    private String password;


    @Column(name="firstname",nullable = false)
    private String firstname;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Column(name="lastname",nullable = false)
    private String lastname;


    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Column(name="gender",nullable = false)
    private String gender;

    @Column(name="email",nullable = false)
    private String email;


    @Column(name="age",nullable = false)
    private int age;

}
