package com.example.RelacionTablas.IntService;

import com.example.RelacionTablas.Model.Elemento;

import java.util.List;
import java.util.Optional;

public interface IElementoService {

    public List<Elemento> Listar();
    List<Elemento> Lista ();

    public Optional <Elemento> editar (int id);
    public void guardar (Elemento elem);
    public void eliminar (int id);
}
