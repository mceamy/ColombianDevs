package com.Proyecto.MinTic.entities;

public class Transaccion {

    private long id;
    private String concepto;
    private float cantidad;
    private String nombreEmpleado;

    //CONSTRUCTOR//
    public Transaccion(long id, String concepto, float cantidad, String nombreEmpleado) {
        this.id = id;
        this.concepto = concepto;
        this.cantidad = cantidad;
        this.nombreEmpleado = nombreEmpleado;
    }

    //GETTERS Y SETTERS//
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }
}
