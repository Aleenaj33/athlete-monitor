package com.ustcapstone.atheleteservice.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustcapstone.atheleteservice.model.Coach;
import com.ustcapstone.atheleteservice.model.Player;
import com.ustcapstone.atheleteservice.repository.AthleteRepository;
import com.ustcapstone.atheleteservice.repository.CoachRepository;

import java.util.List;

@Service
public class AthleteService {

    @Autowired
    private AthleteRepository athleteRepository;

    @Autowired
    private CoachRepository coachRepository;

    // Player CRUD Operations
    public Player createPlayer(Player player) {
        return athleteRepository.save(player);
    }

    public List<Player> getAllPlayers() {
        return athleteRepository.findAll();
    }

    public Player getPlayerById(int id) {
        return athleteRepository.findById(id).orElse(null);
    }

    public Player updatePlayer(Player player) {
        return athleteRepository.save(player);
    }

    public void deletePlayer(int id) {
        athleteRepository.deleteById(id);
    }

    // Coach CRUD Operations
    public Coach createCoach(Coach coach) {
        return coachRepository.save(coach);
    }

    public List<Coach> getAllCoaches() {
        return coachRepository.findAll();
    }

    public Coach getCoachById(int id) {
        return coachRepository.findById(id).orElse(null);
    }

    public Coach updateCoach(Coach coach) {
        return coachRepository.save(coach);
    }

    public void deleteCoach(int id) {
        coachRepository.deleteById(id);
    }
}