package com.example.RelacionTablas.IntService;

import com.example.RelacionTablas.Model.Cargo;

import java.util.List;
import java.util.Optional;

public interface ICargoService {

    public List<Cargo> Listar();
    List<Cargo> Lista();

    public Optional<Cargo> editar (int id);
    public void guardar (Cargo car);
    public void eliminar (int id);
}
