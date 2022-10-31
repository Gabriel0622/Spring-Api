package com.gestion.empleado.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Empleados")
public class Empleado {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nombre", length = 60, nullable = false , columnDefinition = "varchar(60) default 'John Snoww'")
	private String nombre;

	@Column(name = "apellido", length = 60, nullable = false, columnDefinition = "varchar(60) default 'John Snoww'")
	private String apellido;

	@Column(name = "email", length = 60, nullable = false, unique = true,columnDefinition = "varchar(60) default 'John Snoww'")
	private String email;

	public Empleado(Long id, String nombre, String apellido, String email) {

		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
	}

	public Empleado() {

	}

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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
