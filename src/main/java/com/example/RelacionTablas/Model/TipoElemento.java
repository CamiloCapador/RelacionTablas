package com.example.RelacionTablas.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "tipoelemento")
public class TipoElemento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idtipo;
    private String tipoelemen;

    @OneToMany(mappedBy = "tipoelemento", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    private List<Elemento> elementos;



}
