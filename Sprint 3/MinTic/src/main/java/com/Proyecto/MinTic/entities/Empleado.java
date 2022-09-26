package com.Proyecto.MinTic.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="Empleado")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "correo", unique = true)
    private String correo;
    private String password;

    @JsonIgnore
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idPerfil")
    private Perfil perfil;

    @Enumerated(EnumType.STRING)
    @ElementCollection(targetClass = rolEmpleado.class, fetch = FetchType.EAGER)
    private List<rolEmpleado> rol;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idEmpresa")
    private Empresa empresa;

    @JsonIgnore
    @OneToMany(mappedBy = "Empleado")
    private List<Transaccion> transaccion;

    @Column(name = "nombreEmpleado")
    private String nombreEmpleado;

    private Date creaAt;
    private Date actualizaAt;


    //CONSTRUCTOR//
    public Empleado() {
    }

    public Empleado(long id, String correo, String password, Perfil perfil,
                    List<rolEmpleado> rol, Empresa empresa,
                    List<Transaccion> transaccion, String nombreEmpleado,
                    Date creaAt, Date actualizaAt) {
        this.id = id;
        this.correo = correo;
        this.password = password;
        this.perfil = perfil;
        this.rol = rol;
        this.empresa = empresa;
        this.transaccion = transaccion;
        this.nombreEmpleado = nombreEmpleado;
        this.creaAt = creaAt;
        this.actualizaAt = actualizaAt;
    }
    //GETTERS Y SETTERS//

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    public List<rolEmpleado> getRol() {
        return rol;
    }

    public void setRol(List<rolEmpleado> rol) {
        this.rol = rol;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public List<Transaccion> getTransaccion() {
        return transaccion;
    }

    public void setTransaccion(List<Transaccion> transaccion) {
        this.transaccion = transaccion;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
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
