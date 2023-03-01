package com.ista.web.ista.modelo;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "Curso")
@Data
public class Curso {
	@Id
	private Long curso_id;
	private String nombre;
	private String nivel;
	private String descripcion;
	
	/*private Profesor  profeso; //One to one 
	private List listadeprofesores;*/
	
	public Long getCurso_id() {
		return curso_id;
	}
	public void setCurso_id(Long curso_id) {
		this.curso_id = curso_id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	/*
	public Profesor getProfeso() {
		return profeso;
	}
	public void setProfeso(Profesor profeso) {
		this.profeso = profeso;
	}
	public List getListadeprofesores() {
		return listadeprofesores;
	}
	public void setListadeprofesores(List listadeprofesores) {
		this.listadeprofesores = listadeprofesores;
	}*/
	
}
