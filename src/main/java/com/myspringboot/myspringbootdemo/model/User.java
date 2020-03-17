package com.myspringboot.myspringbootdemo.model;

import lombok.Data;

@Data
public class User {
    private int id;
    private String username;
    private String password;
    private String phoneNum;
    private String emileAddr;
}
