package com.macaplix.squarestats.dao;

import com.macaplix.squarestats.entities.StatEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface StatRepository  extends CrudRepository<StatEntity, Integer> {

    List< StatEntity> findByPlayerID(int playerID);

}
