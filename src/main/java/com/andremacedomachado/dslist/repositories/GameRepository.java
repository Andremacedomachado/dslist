package com.andremacedomachado.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andremacedomachado.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
}
