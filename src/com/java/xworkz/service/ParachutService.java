package com.java.xworkz.service;

import com.java.xworkz.dto.ParachutDto;

import java.util.Optional;

public interface ParachutService {
    boolean save(ParachutDto parachutDto);
    default Optional<ParachutDto> findById(int n_id)
    {

        return  Optional.empty();
    }

}
