package org.example.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import org.example.aplication.service.PersonaService;
import javax.annotation.processing.Generated;
import java.util.List;
@Entity
@Table(name = "Persona")

public class Persona implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column (nullable = false )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column (nullable = false)
    private String nombre;

    @Column (nullable = false)
    private String contraseña;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}