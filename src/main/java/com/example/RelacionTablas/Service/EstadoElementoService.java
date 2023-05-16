package com.example.RelacionTablas.Service;

import com.example.RelacionTablas.IntService.IEstadoElementoService;
import com.example.RelacionTablas.Interfaces.IEstadoElemento;
import com.example.RelacionTablas.Model.EstadoElemento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstadoElementoService implements IEstadoElementoService {

    @Autowired
    public IEstadoElemento data;

    @Override
    public List<EstadoElemento> Listar() {
        return data.findAll();
    }

    @Override
    public List<EstadoElemento> lista() {
        return null;
    }

    @Override
    public Optional<EstadoElemento> editar(int id) {
        return data.findById(id);
    }

    @Override
    public void guardar(EstadoElemento estelem) {
        data.save(estelem);
    }

    @Override
    public void eliminar(int id) {
        data.deleteById(id);
    }
}
