package com.example.RelacionTablas.Interfaces;

import com.example.RelacionTablas.Model.Elemento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IElemento extends JpaRepository <Elemento, Integer> {
}
