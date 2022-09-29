package com.Proyecto.MinTic.services;

import com.Proyecto.MinTic.entities.Transaccion;
import com.Proyecto.MinTic.repositories.IRepositorioTransaccion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TransaccionServicio implements ITransaccionServicio {

    @Autowired
    IRepositorioTransaccion repositorioTransaccion;

    @Override
    public List<Transaccion> findAll() {
        return (List<Transaccion>) repositorioTransaccion.findAll();
    }

    @Override
    public List<Transaccion> findByEmpresa(long id) {
        List<Transaccion> auxTransaccion = new ArrayList<>();
        repositorioTransaccion.findByEmpresa(id).forEach(auxTransaccion::add);
        //auxTransaccion.addAll(repositorioTransaccion.findByEmpresa(id));
        return auxTransaccion;

    }

    @Override
    public float totalCantidad(long id) {
        return repositorioTransaccion.totalCantidad(id);
    }

    @Override
    public Transaccion findById(long id) {
        return (repositorioTransaccion.findById(id).orElse(null));
    }

    @Override
    public Transaccion create(Transaccion transaccion) {
        return repositorioTransaccion.save(transaccion);
    }

    @Override
    public Transaccion update(long id, Transaccion transaccion) {
        Transaccion auxTransaccion = this.findById(id);
        auxTransaccion.setCantidad(transaccion.getCantidad());
        auxTransaccion.setConcepto(transaccion.getConcepto());
        repositorioTransaccion.save(auxTransaccion);
        return auxTransaccion;
    }

    @Override
    public void deleteById(long id) {
        repositorioTransaccion.deleteById(id);
    }
}
