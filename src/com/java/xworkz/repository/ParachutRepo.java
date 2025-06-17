package com.java.xworkz.repository;

import com.java.xworkz.dto.ParachutDto;

import java.util.Optional;

public interface ParachutRepo {

boolean persist(ParachutDto parachutDto);

    default Optional<ParachutDto> findById(int n_id)
    {

        return  Optional.empty();
    }
}
