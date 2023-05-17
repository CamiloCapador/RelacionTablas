package com.example.RelacionTablas.Service;

import com.example.RelacionTablas.IntService.ITipoElementoService;
import com.example.RelacionTablas.Interfaces.ITipoElemento;
import com.example.RelacionTablas.Model.TipoElemento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class TipoElementoService implements ITipoElementoService {

    @Autowired
    public ITipoElemento data;

    @Override
    public List<TipoElemento> Listar() {
        return data.findAll();
    }

    @Override
    public List<TipoElemento> lista() {
        return null;
    }

    @Override
    public Optional<TipoElemento> editar(int id) {
        return data.findById(id);
    }

    @Override
    public void guardar(TipoElemento tipoelem) {
        data.save(tipoelem);
    }

    @Override
    public void eliminar(int id) {
        data.deleteById(id);
    }
}
