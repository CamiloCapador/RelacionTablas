package com.example.RelacionTablas.IntService;

import com.example.RelacionTablas.Model.TipoElemento;

import java.util.List;
import java.util.Optional;

public interface ITipoElementoService {

    public List<TipoElemento> Listar();
    List<TipoElemento> lista();

    public Optional <TipoElemento> editar (int id);
    public void guardar (TipoElemento tipoelem);
    public void eliminar (int id);
}
