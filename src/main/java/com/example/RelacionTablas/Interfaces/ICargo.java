package com.example.RelacionTablas.Interfaces;

import com.example.RelacionTablas.Model.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ICargo extends JpaRepository <Cargo, Integer> {
}
