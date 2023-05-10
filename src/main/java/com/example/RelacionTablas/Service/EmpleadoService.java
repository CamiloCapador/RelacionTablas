package com.example.RelacionTablas.Service;

import com.example.RelacionTablas.IntService.IEmpleadoService;
import com.example.RelacionTablas.Interfaces.IEmpleado;
import com.example.RelacionTablas.Model.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoService implements IEmpleadoService {
    @Autowired
    public IEmpleado data;

    @Override
    public List<Empleado> Listar() {
        return data.findAll();
    }

    @Override
    public List<Empleado> Lista() {
        return null;
    }

    @Override
    public Optional<Empleado> editar(int id) {
        return data.findById(id);
    }

    @Override
    public void guardar(Empleado empl) {
        data.save(empl);
    }

    @Override
    public void eliminar(int id) {
        data.deleteById(id);
    }
}
