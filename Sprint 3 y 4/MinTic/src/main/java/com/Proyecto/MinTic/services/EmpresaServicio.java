package com.Proyecto.MinTic.services;

import com.Proyecto.MinTic.entities.Empresa;
import com.Proyecto.MinTic.repositories.IRepositorioEmpresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmpresaServicio implements IEmpresaServicio{

    //DEPENDENCIAS//
    @Autowired
    private IRepositorioEmpresa repositorioEmpresa;

    @Override
    public List<Empresa> findAll() {
        return (List<Empresa>) repositorioEmpresa.findAll();
    }

    @Override
    public Empresa create(Empresa empresa) {
        return (repositorioEmpresa.save(empresa));
    }

    @Override
    public Empresa findById(long id) {
        return (repositorioEmpresa.findById(id).orElse(null));
    }

    @Override
    public Empresa update(long id, Empresa empresa) {
        Empresa auxEmpresa = this.findById(id);
        auxEmpresa.setNombreEmpresa(empresa.getNombreEmpresa());
        auxEmpresa.setNit(empresa.getNit());
        auxEmpresa.setDireccion(empresa.getDireccion());
        auxEmpresa.setTelefono(empresa.getTelefono());
        auxEmpresa.setUsuarios(empresa.getUsuarios());
        auxEmpresa.setTransacciones(empresa.getTransacciones());
        auxEmpresa.setCreaAt(empresa.getCreaAt());
        auxEmpresa.setActualizaAt(empresa.getActualizaAt());
        repositorioEmpresa.save(auxEmpresa);
        return (auxEmpresa);
    }

    @Override
    public void deleteById(long id) {
        repositorioEmpresa.deleteById(id);
    }
}
