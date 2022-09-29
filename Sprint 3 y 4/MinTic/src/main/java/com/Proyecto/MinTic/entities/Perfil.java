package com.Proyecto.MinTic.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Perfil")
public class Perfil {

    //ATRIBUTOS//
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name="imagen")
    private String imagen;
    @Column(name="telefono")
    private String telefono;

    private Date crearAt;
    private Date actualizarAt;

    //CONSTRUCTORES//
    public Perfil(){
    }

    public Perfil(long id, String imagen, String telefono, Date crearAt, Date actualizarAt) {
        this.id = id;
        this.imagen = imagen;
        this.telefono = telefono;
        this.crearAt = crearAt;
        this.actualizarAt = actualizarAt;
    }

    //GETTERS Y SETTERS//

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getCrearAt() {
        return crearAt;
    }

    public void setCrearAt(Date crearAt) {
        this.crearAt = crearAt;
    }

    public Date getActualizarAt() {
        return actualizarAt;
    }

    public void setActualizarAt(Date actualizarAt) {
        this.actualizarAt = actualizarAt;
    }
}

