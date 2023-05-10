package com.example.RelacionTablas.Interfaces;

import com.example.RelacionTablas.Model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmpleado extends JpaRepository <Empleado, Integer>{
}
