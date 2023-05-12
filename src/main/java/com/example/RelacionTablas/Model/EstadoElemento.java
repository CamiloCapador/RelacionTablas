package com.example.RelacionTablas.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "estadoelemento")
public class EstadoElemento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idestado;
    private String nombreestado;

    @OneToMany(mappedBy = "estadoelemento", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    private List<Elemento> elementos;

}
