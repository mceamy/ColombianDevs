package com.Proyecto.MinTic.services;

import com.Proyecto.MinTic.entities.Empresa;

import java.util.List;


public interface IEmpresaServicio {

    //GET A TODAS LAS EMPRESAS
    public List<Empresa> findAll();

    //POST
    public Empresa create (Empresa empresa);

    //GET por id
    public Empresa findById (long id);

    //PATCH
    public Empresa update (long id, Empresa empresa);

    //DELETE
    public void deleteById (long id);

}
