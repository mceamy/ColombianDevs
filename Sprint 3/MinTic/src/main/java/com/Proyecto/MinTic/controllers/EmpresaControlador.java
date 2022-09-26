package com.Proyecto.MinTic.controllers;

import com.Proyecto.MinTic.entities.Empresa;
import com.Proyecto.MinTic.services.IEmpresaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("enterprises/") //http://localhost:8080/enterprises
public class EmpresaControlador {

    @Autowired
    private IEmpresaServicio empresaServicio;

    @RequestMapping(method = RequestMethod.GET, produces = "MinTicApplication/json")
    @ResponseBody
    public List<Empresa> findAll(){
        return (List<Empresa>) empresaServicio.findAll();
    }


    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = "MinTicApplication/json")
    @ResponseBody
    public Empresa  findById(@PathVariable long id){
        return empresaServicio.findById(id);
    }


    @RequestMapping(method = RequestMethod.POST, produces = "MinTicApplication/json")
    @ResponseBody
    public Empresa create(@RequestBody Empresa empresa){
        return empresaServicio.create(empresa);
    }


    @RequestMapping(value = "{id}", method = RequestMethod.PATCH, produces= "MinTicApplication/json")
    @ResponseBody
    public Empresa update(@RequestBody Empresa empresa, @PathVariable long id) {
        return empresaServicio.update(id, empresa);
    }


    @RequestMapping(value = "{id}", method = RequestMethod.DELETE, produces = "MinTicApplication/json")
    @ResponseBody
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable long id) {
        empresaServicio.deleteById(id);
    }
}
