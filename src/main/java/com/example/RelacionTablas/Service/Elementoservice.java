package com.example.RelacionTablas.Service;

import com.example.RelacionTablas.IntService.IElementoService;
import com.example.RelacionTablas.Interfaces.IElemento;
import com.example.RelacionTablas.Model.Elemento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Elementoservice implements IElementoService {

    @Autowired
    public IElemento data;

    @Override
    public List<Elemento> Listar() {
        return data.findAll();
    }

    @Override
    public List<Elemento> Lista() {
        return null;
    }

    @Override
    public Optional<Elemento> editar(int id) {
        return data.findById(id);
    }

    @Override
    public void guardar(Elemento elem) {
        data.save(elem);
    }

    @Override
    public void eliminar(int id) {
        data.deleteById(id);

    }
}
