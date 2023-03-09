package com.event.management.services;

import com.event.management.dao.TeamDao;
import com.event.management.model.Team;
import com.event.management.model.User;

import java.util.ArrayList;
import java.util.List;

public class TeamService {
   private final UserService userService;
   private TeamDao teamDao;
   public TeamService(UserService userService){
       this.userService=userService;
       this.teamDao = new TeamDao();
   }

    public void createTeam(String id, String name, List<String> userIds) {
       Team team = new Team(id,name);
       for(String userId:userIds) {
           User user = userService.getUserDetails(userId);
           user.setTeam(team);
           team.setTeamMembers(user);
       }
       teamDao.createTeam(team);
    }
}
