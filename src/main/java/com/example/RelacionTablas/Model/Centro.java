package com.example.RelacionTablas.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "centro")
public class Centro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idcentro;

    private String codigocentro;
    private String nombrecentro;

    @OneToMany(mappedBy = "centro", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    private List<Empleado> empleados;

}
