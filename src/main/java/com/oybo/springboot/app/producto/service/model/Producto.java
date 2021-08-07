package com.oybo.springboot.app.producto.service.model;

import java.io.Serializable;

/**
 * Clase modelo de producto, contiene los atributos 
 * del Producto asi como getters y setters.
 * 
 * @author oscar
 *
 */
public class Producto implements Serializable{

	/**
	 * Serial Version UID para Modelo
	 */
	private static final long serialVersionUID = -2673646918262507424L;
	
	/**
	 * Atributo ID de producto
	 */
	private Long id;
	
	/**
	 * Atributo nombre del producto
	 */
	private String nombre;
	
	/**
	 * Atributo Descripcion del producto
	 */
	private String descripcion;
	
	/**
	 * Atributo precio del producto
	 */
	private Double precio;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precio=" + precio
				+ "]";
	}

}
