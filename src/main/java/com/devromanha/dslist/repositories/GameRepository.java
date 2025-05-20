package com.devromanha.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devromanha.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
