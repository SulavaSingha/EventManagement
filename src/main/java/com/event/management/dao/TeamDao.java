package com.event.management.dao;

import com.event.management.model.Team;

import java.util.HashMap;
import java.util.Map;

public class TeamDao {
    private final Map<String, Team> teamMap;

    public TeamDao() {
        this.teamMap = new HashMap<String, Team>();
    }
    public void createTeam(Team team){
        if(teamMap.containsKey(team.getId())){
            throw new RuntimeException("Team already exists: "+team.getName());
        }
        teamMap.put(team.getId(),team);
    }
    public Team getTeam(String teamId){
        if(!teamMap.containsKey(teamId)){
            throw new RuntimeException("Team doesn't exists");
        }
        return teamMap.get(teamId);
    }
}
