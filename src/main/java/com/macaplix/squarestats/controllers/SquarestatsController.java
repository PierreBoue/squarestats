package com.macaplix.squarestats.controllers;

import com.macaplix.squarestats.dto.StatsDTO;
import com.macaplix.squarestats.services.StatServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;

@RestController
public class SquarestatsController {
    @Autowired
    StatServiceImplementation statService;
    @GetMapping("/test")
    String testMethod()
    {
        return "Connection rest ok";
    }
    @PostMapping("/stats/{playerID}")
    private StatsDTO addStat(@PathVariable( value = "playerID") int playerID, @RequestParam int score )
    {
       return statService.addStat( new StatsDTO(playerID, score, new Date()));
    }
    @GetMapping("/stats/{playerID}")
    private ArrayList<StatsDTO> readSatsFromPlayer(@PathVariable( value = "playerID") int playerID )
    {
        return (ArrayList<StatsDTO>) statService.getStatsFromPlayer(playerID);
    }
}
