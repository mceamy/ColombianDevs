package com.Proyecto.MinTic.repositories;

import com.Proyecto.MinTic.entities.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IRepositorioEmpleado extends JpaRepository<Empleado, Long> {
    @Query(value = "select * from empleado where correo=?1",nativeQuery = true)
    public Empleado findByCorreo (String correo);
}
