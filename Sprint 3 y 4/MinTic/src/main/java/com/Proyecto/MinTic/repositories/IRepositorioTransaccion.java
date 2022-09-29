package com.Proyecto.MinTic.repositories;

import com.Proyecto.MinTic.entities.Transaccion;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IRepositorioTransaccion extends CrudRepository<Transaccion, Long> {

    //Lista movimientos empresa
    @Query(value = "select * from Transaccion where idEmpresa= ?1", nativeQuery = true)
    public abstract
    List<Transaccion> findByEmpresa(long id);

    //Total cantidad de movimientos de una empresa especifica
    @Query(value = "select sum(cantidad) from Transaccion where idEmpresa= ?1",nativeQuery = true)
    public abstract float totalCantidad(long id);

    //Guardar un movimiento de una empresa
    @Query(value = "select * from Transaccion where idEmpresa = ?1 and id = ?2", nativeQuery = true)
    public abstract  Transaccion saveTransaccionEmpresa(long idEnterprise, long idTransaction, Transaccion Transaccion);

    //Consultar existencia de una transacción en una empresa
    @Query(value = "delete from Transaccion where idEmpresa = ?1 and id = ?2", nativeQuery = true)
    public abstract  boolean deleteTransaccionEmpresa(long idEnterprise, long idTransaction);
}