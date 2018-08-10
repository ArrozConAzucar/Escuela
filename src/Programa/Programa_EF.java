package Programa;

import javax.persistence.*;

import org.openxava.annotations.*;

@Entity
public class Programa_EF {

	@Id @Column (length = 2) @Required
	private int cant_unidades;
	
	@Id @Column (length = 4) @Required
	private int a�o;
	
	@Id @Column (length = 15) @Required
	private String nombre_profesor;
	
	@Id @Column (length = 15) @Required
	private String apellido_profesor;

	@Id @Column (length = 15) @Required
	private String materia;

	public int getCant_unidades() {
		return cant_unidades;
	}

	public void setCant_unidades(int cant_unidades) {
		this.cant_unidades = cant_unidades;
	}

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	public String getNombre_profesor() {
		return nombre_profesor;
	}

	public void setNombre_profesor(String nombre_profesor) {
		this.nombre_profesor = nombre_profesor;
	}

	public String getApellido_profesor() {
		return apellido_profesor;
	}

	public void setApellido_profesor(String apellido_profesor) {
		this.apellido_profesor = apellido_profesor;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	}