package com.Proyecto.MinTic;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
public class MinTicApplication {

	public static void main(String[] args)  {
		SpringApplication.run(MinTicApplication.class, args);
		System.out.println("Hola Mundo");
		/*System.out.println("Pruebas de instancia de clases");

		//Creación de empresa//
		Empresa empresa = new Empresa();
		String resumenEmpresa = (empresa.getNombreEmpresa()+ "-" + empresa.getDireccion() + "-" + empresa.getTelefono()
				+ "-" + empresa.getNit());
		System.out.println(resumenEmpresa);

		//Modificación de empresa//
		empresa.setId(14859);
		empresa.setNombreEmpresa("Lugon");
		empresa.setDireccion("Cra 65a 99-158");
		empresa.setTelefono("3218888895");
		empresa.setNit("103.526.896");
		String resumenEmpresaCambios = (empresa.getNombreEmpresa()+ "-" + empresa.getDireccion() + "-" + empresa.getTelefono()
				+ "-" + empresa.getNit());
		System.out.println(resumenEmpresaCambios);

		//Creación de empleado//
		Empleado empleado = new Empleado();
		String resumenEmpleado = (empleado.getNombreEmpleado() + "-" + empleado.getCorreo());
		System.out.println(resumenEmpleado);


		//Modificación de empleado//
		empleado.setId(1253);
		empleado.setNombreEmpleado("Santiago Gonzalez");
		empleado.setCorreo("asd@hotmail.com");
		String resumenEmpleadoCambios = (empleado.getNombreEmpleado() + "-" + empleado.getCorreo());
		System.out.println(resumenEmpleadoCambios);


        Transaccion Movimiento = new Transaccion();
        Movimiento.setCantidad(-155000);
        Movimiento.setConcepto("Recibo de Luz");


        String resumenMovimiento = (Movimiento.getCantidad() + "-" + Movimiento.getConcepto());
*/

	}

}
