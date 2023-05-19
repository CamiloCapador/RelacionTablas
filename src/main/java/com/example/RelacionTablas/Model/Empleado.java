package com.example.RelacionTablas.Model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Data
@Entity
@Table(name = "empleado")
@Configuration
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idempl;
    private String nombreempl;
    private String apellidoempl;
    private int cedula;
    private String emailempl;
    private boolean estado;
    @ManyToOne
    @JoinColumn(name = "idcargo")
    private Cargo cargo;

    @ManyToOne
    @JoinColumn(name = "idcentro")
    private Centro centro;

    @OneToMany(mappedBy = "empleado", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    private List<Elemento> elementos;
}
