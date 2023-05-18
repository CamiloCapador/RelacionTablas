package com.example.RelacionTablas.IntService;

import com.example.RelacionTablas.Model.Centro;

import java.util.List;
import java.util.Optional;

public interface ICentroService {

    public List<Centro> Listar();
    List<Centro> lista();

    public Optional<Centro> editar (int id);
    public void guardar (Centro cen);
    public void eliminar (int id);
}
