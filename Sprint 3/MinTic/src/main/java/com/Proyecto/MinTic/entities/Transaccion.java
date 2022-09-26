package com.Proyecto.MinTic.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Transaccion")
public class Transaccion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idTransaccion;
    @Column(name = "concepto")
    private String concepto;
    @Column(name = "cantidad")
    private float cantidad;

    @ManyToOne
    @JoinColumn(name = "idEmpresa")
    private Empresa empresa;

    //@JsonIgnore
    @ManyToOne
    @JoinColumn(name = "idEmpleado")
    private Empleado empleado;

    private Date creaAt;
    private Date actualizaAt;


    //CONSTRUCTOR//
    public Transaccion() {
    }

    public Transaccion(long idTransaccion, String concepto, float cantidad, Empresa empresa,
                       Empleado empleado, Date creaAt, Date actualizaAt) {
        this.idTransaccion = idTransaccion;
        this.concepto = concepto;
        this.cantidad = cantidad;
        this.empresa = empresa;
        this.empleado = empleado;
        this.creaAt = creaAt;
        this.actualizaAt = actualizaAt;
    }

    //GETTERS Y SETTERS//
    public long getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(long idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
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
