package com.example.RelacionTablas.IntService;

import com.example.RelacionTablas.Model.Empleado;

import java.util.List;
import java.util.Optional;

public interface IEmpleadoService {

    public List<Empleado> Listar();
    List<Empleado> Lista();

    public Optional<Empleado> editar(int id);
    public void guardar(Empleado empl);
    public void eliminar(int id);
}
