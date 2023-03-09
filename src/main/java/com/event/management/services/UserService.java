package com.event.management.services;

import com.event.management.dao.UserDao;
import com.event.management.model.Team;
import com.event.management.model.TimeSlot;
import com.event.management.model.User;

public class UserService {
    private final UserDao userDao;
    public UserService(){
        this.userDao =new UserDao();
    }
    public void createUsers(){

    }
    public User getUserDetails(String userId){

        return userDao.getUserDetails(userId);
    }
    public Team getTeamDetails(String userId){
        User user = getUserDetails(userId);
        return user.getTeam();
    }

    public void createUsers(String name, String id, TimeSlot timeSlot) {

        userDao.addUser(new User(name,id,timeSlot));
    }
}
