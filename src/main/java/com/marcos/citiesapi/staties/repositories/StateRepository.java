package com.marcos.citiesapi.staties.repositories;

import com.marcos.citiesapi.staties.entities.State;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepository extends JpaRepository<State, Long> {
  
}
