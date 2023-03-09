package com.event.management.dao;

import com.event.management.model.User;

import java.util.HashMap;
import java.util.Map;

public class UserDao {
    private UserDao userDao;
    private  Map<String,User> userMap;

    public UserDao() {
        this.userMap = new HashMap<String,User>();
    }

    public User getUserDetails(String userId) {
        if(!userMap.containsKey(userId)){
           throw new RuntimeException("User doesn't exists");
        }
        return userMap.get(userId);
    }
    public void addUser(User user){
        if(userMap.containsKey(user.getId())){
            throw new RuntimeException("user already exists with same name: "+user.getName());
        }
        this.userMap.put(user.getId(),user);
    }

}
