package com.practicaswrest.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practicaswrest.entity.Empleado;
import com.practicaswrest.repository.EmpleadoRepository;

@Service
public class EmpleadoService  {
	
	@Autowired
	 private EmpleadoRepository emrepo;
	
	public Empleado insertar(Empleado emp) {
		return emrepo.save(emp);
	}
	public Empleado actualizar(Empleado emp) {
		return emrepo.save(emp);
	}
	public List<Empleado> listar(){
		return emrepo.findAll();
	}
	public  void eliminar(Empleado emp) {
		emrepo.delete(emp);
	}
}
