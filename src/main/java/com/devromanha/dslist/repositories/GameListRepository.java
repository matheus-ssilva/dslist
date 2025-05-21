package com.devromanha.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devromanha.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
