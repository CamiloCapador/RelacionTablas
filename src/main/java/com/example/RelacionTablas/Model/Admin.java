/*package com.example.RelacionTablas.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "cargo")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAdmin;
    private String usuario ;
    private String password ;
    private boolean sesion;

    @PrePersist
    public void prePersist(){
         sesion = false;
    }

}

*/