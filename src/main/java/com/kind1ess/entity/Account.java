package com.kind1ess.entity;


import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

@Data
public class Account implements Serializable {

    private String username;
    private String password;
    private Double money;
//    private User user;
    private List<User> users;
    private Map<String,User> userMap;
}
