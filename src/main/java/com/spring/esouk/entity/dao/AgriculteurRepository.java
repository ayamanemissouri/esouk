package com.spring.esouk.entity.dao;

import com.spring.esouk.entity.Agriculteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgriculteurRepository extends JpaRepository<Agriculteur, Integer> {

    Agriculteur findById(int id);
}