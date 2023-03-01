package com.ista.web.ista.modelo;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "Depto")
@Data
public class Depto {
	@Id
	private Long depto_id;
	private String nombre;
	private String dirrector;
	private String descripcion;

	/*
	private Profesor  profeso; //One to one 
	private List listadeprofesores;*/

	public Long getDepto_id() {
		return depto_id;
	}
	public void setDepto_id(Long depto_id) {
		this.depto_id = depto_id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDirrector() {
		return dirrector;
	}
	public void setDirrector(String dirrector) {
		this.dirrector = dirrector;
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
	}
*/
	

	
	
	
}
