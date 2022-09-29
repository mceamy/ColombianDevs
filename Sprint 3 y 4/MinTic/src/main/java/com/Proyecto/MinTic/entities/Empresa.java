package com.Proyecto.MinTic.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="Empresa")
public class Empresa {

    //ATRIBUTOS//
    //PRIMARY KEY//
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    //FOREIGN KEYS//
    @OneToMany(mappedBy = "id",fetch = FetchType.LAZY)
    private List<Empleado> usuarios;
    @JsonIgnore
    @OneToMany(mappedBy = "id",fetch = FetchType.LAZY)
    private List<Transaccion> transacciones;

    @Column(name="nit",unique=true)
    private String nit;
    @Column(name="nombreEmpresa",unique=true)
    private String nombreEmpresa;
    @Column(name="direccion")
    private String direccion;
    @Column(name="telefono")
    private String telefono;

    private Date creaAt;
    private Date actualizaAt;

    //CONSTRUCTOR//
    public Empresa() {
    }

    public Empresa(long id, List<Empleado> usuarios, List<Transaccion> transacciones,
                   String nit, String nombreEmpresa, String direccion, String telefono,
                   Date creaAt, Date actualizaAt) {
        this.id = id;
        this.usuarios = usuarios;
        this.transacciones = transacciones;
        this.nit = nit;
        this.nombreEmpresa = nombreEmpresa;
        this.direccion = direccion;
        this.telefono = telefono;
        this.creaAt = creaAt;
        this.actualizaAt = actualizaAt;
    }

    //GETTERS Y SETTERS//
    //id
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    //NIT
    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNit() {
        return nit;
    }

    //nombre
    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    //direccion
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    //telefono
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    //usuarios
    public List<Empleado> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Empleado> usuarios) {
        this.usuarios = usuarios;
    }

    //transacciones
    public List<Transaccion> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(List<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }

    public Date getCreaAt() {
        return creaAt;
    }

    public void setCreaAt(Date creaAt) {
        this.creaAt = creaAt;
    }

    public Date getActualizaAt() {
        return actualizaAt;
    }

    public void setActualizaAt(Date actualizaAt) {
        this.actualizaAt = actualizaAt;
    }

}
