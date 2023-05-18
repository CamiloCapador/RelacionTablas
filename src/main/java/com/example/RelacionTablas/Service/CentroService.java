package com.example.RelacionTablas.Service;

import com.example.RelacionTablas.IntService.ICentroService;
import com.example.RelacionTablas.Interfaces.ICentro;
import com.example.RelacionTablas.Model.Centro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CentroService implements ICentroService {

    @Autowired
    public ICentro data;

    @Override
    public List<Centro> Listar() {
        return data.findAll();
    }

    @Override
    public List<Centro> lista() {
        return null;
    }

    @Override
    public Optional<Centro> editar(int id) {
        return data.findById(id);
    }

    @Override
    public void guardar(Centro cen) {
        data.save(cen);
    }

    @Override
    public void eliminar(int id) {
        data.deleteById(id);
    }
}
