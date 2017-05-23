package com.distribuida.dao;

import java.util.List;

import com.distribuida.Empleado;

public interface ServicioEmpleadoJDBC {

	public void insertar(Empleado empleado);
	public Empleado buscarPorId(int id);
	public List<Empleado> listar();
	public String buscarNombrePorId(int id);
	public void insertarBatch1(final List<Empleado> empleados);
	public void insertarBatch2(final String sql);
}
