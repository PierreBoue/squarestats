package com.macaplix.squarestats.services;

import com.macaplix.squarestats.dto.StatsDTO;

import java.util.List;

public interface StatService {
    public StatsDTO addStat(StatsDTO nstat );
    public List<StatsDTO> getStatsFromPlayer(int playerID );
}
