package com.marcos.citiesapi.countries.repositories;

import com.marcos.citiesapi.countries.entities.Country;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {
  
}
