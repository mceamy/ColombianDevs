package com.Proyecto.MinTic.services;

import com.Proyecto.MinTic.entities.Empleado;
import com.Proyecto.MinTic.repositories.IRepositorioEmpleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoServicio implements IEmpleadoServicio{

    //DEPENDENCIAS//
    @Autowired
    private IRepositorioEmpleado repositorioEmpleado;

    @Override
    public List<Empleado> findAll() {
        return ((List<Empleado>) repositorioEmpleado.findAll());
    }

    @Override
    public Empleado create(Empleado empleado) {
        return (repositorioEmpleado.save(empleado));
    }

    @Override
    public Empleado findById(long id) {
        return (repositorioEmpleado.findById(id).orElse(null));
    }

    @Override
    public Empleado findByCorreo(String correo) throws Exception {
        Optional<Empleado> empleadoOptional = Optional.ofNullable(repositorioEmpleado.findByCorreo(correo));
        if (empleadoOptional.isPresent()) {
            return empleadoOptional.get();
        } else {
            throw new Exception("El empleado no existe");
        }
    }

    @Override
    public Empleado update(long id, Empleado empleado) {
        Empleado auxEmpleado = this.findById(id);
        auxEmpleado.setNombreEmpleado(empleado.getNombreEmpleado());
        auxEmpleado.setCorreo(empleado.getCorreo());
        auxEmpleado.setRol(empleado.getRol());
        auxEmpleado.setCreaAt(empleado.getCreaAt());
        auxEmpleado.setActualizaAt(empleado.getActualizaAt());
        repositorioEmpleado.save(auxEmpleado);
        return (auxEmpleado);
    }

    @Override
    public void deleteById(long id) {
        repositorioEmpleado.deleteById(id);
    }
}
