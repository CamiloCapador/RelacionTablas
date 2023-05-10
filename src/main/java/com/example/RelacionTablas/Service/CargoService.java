package com.example.RelacionTablas.Service;

import com.example.RelacionTablas.IntService.ICargoService;
import com.example.RelacionTablas.Interfaces.ICargo;
import com.example.RelacionTablas.Model.Cargo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CargoService implements ICargoService {

    @Autowired
    public ICargo data;

    @Override
    public List<Cargo> Listar() {
        return data.findAll();
    }

    @Override
    public List<Cargo> Lista() {
        return null;
    }

    @Override
    public Optional<Cargo> editar(int id) {
        return data.findById(id);
    }

    @Override
    public void guardar(Cargo car) {
        data.save(car);
    }

    @Override
    public void eliminar(int id) {
        data.deleteById(id);
    }
}
