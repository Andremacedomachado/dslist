package com.andremacedomachado.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andremacedomachado.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
