package com.example.RelacionTablas.Interfaces;

import com.example.RelacionTablas.Model.Centro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICentro extends JpaRepository <Centro, Integer> {
}
