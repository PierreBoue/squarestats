package com.macaplix.squarestats.services;

import com.macaplix.squarestats.dao.StatRepository;
import com.macaplix.squarestats.dto.StatsDTO;
import com.macaplix.squarestats.entities.StatEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StatServiceImplementation implements StatService
{
  @Autowired
  private StatRepository statRepository;
  public StatsDTO addStat(StatsDTO nstat )
  {
    StatEntity state = new StatEntity(nstat.playerID(), nstat.score(), nstat.recordDate());
    statRepository.save(state);
    return nstat;
  }
  public List<StatsDTO> getStatsFromPlayer( int playerID )
  {
    ArrayList<StatsDTO> stats = new ArrayList<StatsDTO>();
    List<StatEntity> entities = statRepository.findByPlayerID(playerID);
    for ( StatEntity ste: entities)
    {
      StatsDTO stat= new StatsDTO(playerID, ste.getScore(), ste.getCreation());
      addStat(stat);
      stats.add(stat);
    }
    return stats;
  }
}
