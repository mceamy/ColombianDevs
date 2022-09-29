package com.Proyecto.MinTic.repositories;

import com.Proyecto.MinTic.entities.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface IRepositorioEmpresa extends CrudRepository<Empresa,Long> {


}
