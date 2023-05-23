package com.example.RelacionTablas.IntService;

import com.example.RelacionTablas.Model.EstadoElemento;

import java.util.List;
import java.util.Optional;

public interface IEstadoElementoService {

    public List<EstadoElemento> Listar();
    List<EstadoElemento> lista();

    public Optional<EstadoElemento> editar(int id);
    public void guardar(EstadoElemento estelem);
    public void eliminar(int id);

}
