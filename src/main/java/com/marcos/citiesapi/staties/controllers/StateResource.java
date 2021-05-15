package com.marcos.citiesapi.staties.controllers;

import java.util.Optional;

import com.marcos.citiesapi.staties.entities.State;
import com.marcos.citiesapi.staties.repositories.StateRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/staties")
public class StateResource {

  @Autowired
  private StateRepository repository;

  @GetMapping
  public Page<State> staties(Pageable page){
    return repository.findAll(page);
  }

  @GetMapping("/{id}")
  public State getOne(@PathVariable Long id){
    Optional<State> oprional = repository.findById(id);
    return oprional.get();
  }


  
}
