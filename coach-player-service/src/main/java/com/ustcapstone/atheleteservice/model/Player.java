package com.ustcapstone.atheleteservice.model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;
@Document(collection = "players")
@Data
@AllArgsConstructor
@NoArgsConstructor 
public class Player {
	 @Id
	    private int playerId;
	    private String name;
	    private String sport;
	    private int teamId; // Reference to Team in TeamService
	    private List<String> performanceMetrics;
	

}