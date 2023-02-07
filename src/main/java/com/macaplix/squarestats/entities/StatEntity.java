package com.macaplix.squarestats.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class StatEntity {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Integer id;
    private int playerID;
    private int score;
    private Date creation;

    public StatEntity() {

    }

    public StatEntity(int playerID, int score, Date creation) {
        this.playerID = playerID;
        this.score = score;
        this.creation = creation;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getPlayerID() {
        return playerID;
    }

    public void setPlayerID(int playerID) {
        this.playerID = playerID;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public Date getCreation() {
        return creation;
    }

    public void setCreation(Date creation) {
        this.creation = creation;
    }
}
