package com.example.demo.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.data.model.Plant;

@Repository
public interface PlantRepo extends JpaRepository <Plant, Integer> {

}
