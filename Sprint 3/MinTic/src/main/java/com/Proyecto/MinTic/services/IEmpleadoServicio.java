package com.Proyecto.MinTic.services;

import com.Proyecto.MinTic.entities.Empleado;

import java.util.List;


public interface IEmpleadoServicio {

    //GET
    public List<Empleado> findAll();

    //POST
    public Empleado create (Empleado empleado);

    //GET por id
    public Empleado findById (long id);

    //GET por email
    public Empleado findByCorreo(String correo)throws Exception;

    //PATCH
    public Empleado update (long id, Empleado empleado);

    //DELETE
    public void deleteById (long id);

}
