package com.Proyecto.MinTic.services;

import com.Proyecto.MinTic.entities.Transaccion;

import java.util.List;


public interface ITransaccionServicio {

    //GET transacciones totales
    public List<Transaccion> findAll();

    //GET transacciones empresa
    public List<Transaccion> findByEmpresa(long id);

    //GET movimientos empresa
    public float totalCantidad (long id);

    //GET transacciones por Id
    public Transaccion findById(long id);

    //POST
    public Transaccion create (Transaccion transaccion);

    //PATCH
    public Transaccion update (long id, Transaccion transaccion);

    //DELETE
    public void deleteById (long id);

}
