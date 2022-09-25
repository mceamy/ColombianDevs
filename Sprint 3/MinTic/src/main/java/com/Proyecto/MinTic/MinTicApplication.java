package com.Proyecto.MinTic;

import com.Proyecto.MinTic.entities.Empleado;
import com.Proyecto.MinTic.entities.Empresa;
import com.Proyecto.MinTic.entities.Transaccion;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MinTicApplication {

	public static void main(String[] args)  {
		SpringApplication.run(MinTicApplication.class, args);
		System.out.println("Hola Mundo");
		System.out.println("Pruebas de instancia de clases");

		//Creación de empresa//
		Empresa empresa = new Empresa(12563, "105.589.562", "VyR SAS", "Av Poblado",  "8442552");
		String resumenEmpresa = (empresa.getNombreEmpresa()+ "-" + empresa.getDireccion() + "-" + empresa.getTelefono()
				+ "-" + empresa.getNit());
		System.out.println(resumenEmpresa);

		//Modificación de empresa//
		empresa.setIdEmpresa(14859);
		empresa.setNombreEmpresa("Lugon");
		empresa.setDireccion("Cra 65a 99-158");
		empresa.setTelefono("3218888895");
		empresa.setNit("103.526.896");
		String resumenEmpresaCambios = (empresa.getNombreEmpresa()+ "-" + empresa.getDireccion() + "-" + empresa.getTelefono()
				+ "-" + empresa.getNit());
		System.out.println(resumenEmpresaCambios);

		//Creación de empleado//
		Empleado empleado = new Empleado(12568,"Juan Camilo","ghjt@gmail.com","Lugon","Ingeniero");
		String resumenEmpleado = (empleado.getNombreEmpleado() + "-" + empleado.getCorreo() + "-" + empleado.getRolEmpleado()
				+ "-" + empleado.getNombreEmpresa());
		System.out.println(resumenEmpleado);


		//Modificación de empleado//
		empleado.setIdEmpleado(1253);
		empleado.setNombreEmpleado("Santiago Gonzalez");
		empleado.setRolEmpleado("Supervisor");
		empleado.setCorreo("asd@hotmail.com");
		empleado.setNombreEmpresa("VyR");
		String resumenEmpleadoCambios = (empleado.getNombreEmpleado() + "-" + empleado.getCorreo() + "-" + empleado.getRolEmpleado()
				+ "-" + empleado.getNombreEmpresa());
		System.out.println(resumenEmpleadoCambios);


        Transaccion Movimiento = new Transaccion(152, "Agua", 250000, "Juan");
        Movimiento.setCantidad(-155000);
        Movimiento.setConcepto("Recibo de Luz");
        Movimiento.setNombreEmpleado("Santiago Gonzalez");

        String resumenMovimiento = (Movimiento.getCantidad() + "-" + Movimiento.getConcepto() + "-"
                + Movimiento.getNombreEmpleado());


	}

}
