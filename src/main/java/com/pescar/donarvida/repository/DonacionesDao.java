package com.pescar.donarvida.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pescar.donarvida.models.Donaciones;

@Repository
public interface DonacionesDao extends CrudRepository<Donaciones, Long> {
    
}
