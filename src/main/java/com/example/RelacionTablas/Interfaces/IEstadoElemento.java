package com.example.RelacionTablas.Interfaces;

import com.example.RelacionTablas.Model.EstadoElemento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEstadoElemento extends JpaRepository <EstadoElemento, Integer> {

}
