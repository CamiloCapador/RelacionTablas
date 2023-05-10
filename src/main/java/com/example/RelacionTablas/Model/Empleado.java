package com.example.RelacionTablas.Model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Data
@Entity
@Table(name = "empleado")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idempl;
    private String nombreempl;
    private String apellidoempl;
    private int cedula;
    private String emailempl;
    @ManyToOne
    @JoinColumn(name = "idcargo")
    private Cargo cargo;
}
