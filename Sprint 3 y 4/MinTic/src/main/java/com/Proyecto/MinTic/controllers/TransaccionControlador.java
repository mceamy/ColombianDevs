package com.Proyecto.MinTic.controllers;

import com.Proyecto.MinTic.entities.Transaccion;
import com.Proyecto.MinTic.services.ITransaccionServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TransaccionControlador {
    @Autowired
    private ITransaccionServicio transaccionServicio;


    @GetMapping("movements/") //http://localhost:8080/movements
    public List<Transaccion> getAll(){
        return transaccionServicio.findAll();
    }


    @GetMapping("movements/{id}")
    public Transaccion getById(@PathVariable("id") long id){
        return transaccionServicio.findById(id);
    }


    @GetMapping("/enterprises/{id}/movements")
    public List<Transaccion> getAllByEmpresa(@PathVariable("id") long id){
        return transaccionServicio.findByEmpresa(id);
    }


    @RequestMapping(value = "/movements/",method = RequestMethod.POST, produces = "MinTicApplication/json")
    public Transaccion create(@RequestBody Transaccion transaccion){
        return transaccionServicio.create(transaccion);
    }


    @GetMapping("/enterprises/{id}/total")
    public float totalCantidad(@PathVariable long id){
        return transaccionServicio.totalCantidad(id);
    }


    @RequestMapping(value = "enterprises/{id}/movements/{idTransaction}", method = RequestMethod.PATCH, produces= "MinTicApplication/json")
    @ResponseBody
    public Transaccion update(@RequestBody Transaccion transaccion, @PathVariable long id) {
        return transaccionServicio.update(id, transaccion);
    }


    @RequestMapping(value = "movements/{id}", method = RequestMethod.DELETE, produces = "MinTicApplication/json")
    @ResponseBody
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable long id) {
        transaccionServicio.deleteById(id);
    }
}
