package com.distribuida;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.distribuida.dao.ServicioEmpleadoJDBC;

@SpringBootApplication
public class PruebaEmpleadoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(PruebaEmpleadoApplication.class, args);
		ServicioEmpleadoJDBC jdbcEmployeeDAO = (ServicioEmpleadoJDBC) ctx.getBean("servicioEmpleadosCliente");
		Empleado emplNew1 = new Empleado(23, "John", 23);
		Empleado emplNew2 = new Empleado(223, "Mark", 43);
		List<Empleado> employeesN = new ArrayList<Empleado>();
		employeesN.add(emplNew1);
        employeesN.add(emplNew2);
        jdbcEmployeeDAO.insertarBatch1(employeesN);
        System.out.println(" INSERTANDO FILAS:  " + employeesN);
        System.out.println(" LISTAR TODOS : " + jdbcEmployeeDAO.listar());
        jdbcEmployeeDAO.insertarBatch2("UPDATE EMPLEADO SET NOMBRE ='Mary'");
        
        List<Empleado> empleados = jdbcEmployeeDAO.listar();
        System.out.println("Nombre de columna actualizado de la tabla: " + empleados);	
        
        System.out.println(" LISTAR TODOS : " + jdbcEmployeeDAO.listar());
        System.out.println("estoy aqui");
        
	}
}
