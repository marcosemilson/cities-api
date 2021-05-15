package com.marcos.citiesapi.countries.controllers;

import java.util.Optional;

import com.marcos.citiesapi.countries.entities.Country;
import com.marcos.citiesapi.countries.repositories.CountryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/countries")
public class CountryResource {

  @Autowired
  private CountryRepository repository;

  @GetMapping
  public Page<Country> countries(Pageable page){
    return repository.findAll(page);
  }

  @GetMapping("/{id}")
  public Country getOne(@PathVariable Long id){
    Optional<Country> oprional = repository.findById(id);
    return oprional.get();
  }


  
}
