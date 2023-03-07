package com.practicaswrest.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practicaswrest.Service.EmpleadoService;
import com.practicaswrest.entity.Empleado;

@RestController
@RequestMapping("/empleados")
public class EmpleadoControlador {
	
	@Autowired
	private EmpleadoService emser;
	
	@GetMapping
	public List<Empleado>listar(){
		return emser.listar();
	}
	
	@PostMapping
	public Empleado insertar(@RequestBody Empleado emp) {
		return emser.insertar(emp);
	}
	@PutMapping
	public Empleado actuazizar(@RequestBody Empleado emp) {
		return emser.actualizar(emp);
	}
	
	@DeleteMapping
	public void eliminar(@RequestBody Empleado emp) {
        emser.eliminar(emp);
	}
}
