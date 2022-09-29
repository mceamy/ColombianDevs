package com.Proyecto.MinTic.controllers;

import com.Proyecto.MinTic.entities.Empleado;
import com.Proyecto.MinTic.services.EmpleadoServicio;
import com.Proyecto.MinTic.services.IEmpleadoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users") //http://localhost:8080/users
public class EmpleadoControlador {
    @Autowired
    private IEmpleadoServicio empleadoServicio;

    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = "MinTicApplication/json")
    @ResponseBody
    public Empleado findById(@PathVariable long id){
        return empleadoServicio.findById(id);
    }
    @RequestMapping(method = RequestMethod.GET, produces = "MinTicApplication/json")
    @ResponseBody
    public List<Empleado> findAll(){
        return (List<Empleado>) empleadoServicio.findAll();
    }


    @RequestMapping(method = RequestMethod.POST, produces = "MinTicApplication/json")
    @ResponseBody
    public Empleado create(@RequestBody Empleado empleado){
        return empleadoServicio.create(empleado);
    }


    @RequestMapping(value = "{id}", method = RequestMethod.PATCH, produces= "MinTicApplication/json")
    @ResponseBody
    public Empleado update(@RequestBody Empleado empleado, @PathVariable long id) {
        return empleadoServicio.update(id, empleado);
    }


    @RequestMapping(value = "{id}", method = RequestMethod.DELETE, produces = "MinTicApplication/json")
    @ResponseBody
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable long id) {
        empleadoServicio.deleteById(id);
    }
}
