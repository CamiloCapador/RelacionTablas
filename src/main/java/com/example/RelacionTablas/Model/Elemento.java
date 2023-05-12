package com.example.RelacionTablas.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "elemento")
public class Elemento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idelemen;
    private Date fechaasignacion;
    private String marca;
    private String modelo;
    private String sn;
    private String placa;

    @ManyToOne
    @JoinColumn(name = "idempl")
    private Empleado empleado;


    @ManyToOne
    @JoinColumn(name = "idtipo")
    private TipoElemento tipoelemento;

    @ManyToOne
    @JoinColumn(name = "idestado")
    private EstadoElemento estadoelemento;
}
