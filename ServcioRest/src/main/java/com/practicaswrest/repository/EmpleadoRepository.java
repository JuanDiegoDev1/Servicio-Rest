package com.practicaswrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practicaswrest.entity.Empleado;


public interface EmpleadoRepository extends JpaRepository<Empleado, Integer> {

}
