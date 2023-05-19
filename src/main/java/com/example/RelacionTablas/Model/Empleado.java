package com.example.RelacionTablas.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Value;
import org.springframework.boot.autoconfigure.web.WebProperties;
import org.springframework.boot.context.properties.bind.DefaultValue;
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
    @PrePersist
    public void prePersist(){
        estado = true;
    }
    @ManyToOne
    @JoinColumn(name = "idcargo")
    private Cargo cargo;

    @ManyToOne
    @JoinColumn(name = "idcentro")
    private Centro centro;

    @OneToMany(mappedBy = "empleado", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    private List<Elemento> elementos;
}
