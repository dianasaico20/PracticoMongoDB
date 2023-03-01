package com.ista.web.ista.modelo;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "Profesor")
@Data
public class Profesor {
	@Id
	private Long profe_id;
	private String nombre;
	private String telefono;
	private String direccion;
	private Curso curso; //One to one 
	private List listadecursos;
	
	private Depto deptor; //One to one 
	private List listadedepto;
	
	
	public Long getProfe_id() {
		return profe_id;
	}
	public void setProfe_id(Long profe_id) {
		this.profe_id = profe_id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public List getListadecursos() {
		return listadecursos;
	}
	public void setListadecursos(List listadecursos) {
		this.listadecursos = listadecursos;
	}
	public Depto getDeptor() {
		return deptor;
	}
	public void setDeptor(Depto deptor) {
		this.deptor = deptor;
	}
	public List getListadedepto() {
		return listadedepto;
	}
	public void setListadedepto(List listadedepto) {
		this.listadedepto = listadedepto;
	}
	
	
	
	
}
