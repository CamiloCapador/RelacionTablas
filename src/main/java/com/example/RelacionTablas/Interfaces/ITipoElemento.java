package com.example.RelacionTablas.Interfaces;

import com.example.RelacionTablas.Model.TipoElemento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITipoElemento extends JpaRepository <TipoElemento, Integer> {
}
