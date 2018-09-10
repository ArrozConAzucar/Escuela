package Programa;

import javax.persistence.*;

import org.openxava.annotations.*;

import Materias.*;
import Persona.*;

@Entity
public class Programa_Teoría {

	@Column (length = 2) @Required
	private int cant_unidades;
	
	@Column (length = 4) @Required
	private int año;
	
	@Column (length = 15) @Required
	private Profesor nombre;
	
	@Column (length = 15) @Required
	private Profesor apellido;

	@Id @Column (length = 10) @Required
	private Materias materia;

	public int getCant_unidades() {
		return cant_unidades;
	}

	public void setCant_unidades(int cant_unidades) {
		this.cant_unidades = cant_unidades;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public Profesor getNombre() {
		return nombre;
	}

	public void setNombre(Profesor nombre) {
		this.nombre = nombre;
	}

	public Profesor getApellido() {
		return apellido;
	}

	public void setApellido(Profesor apellido) {
		this.apellido = apellido;
	}

	public Materias getMateria() {
		return materia;
	}

	public void setMateria(Materias materia) {
		this.materia = materia;
	}
	
}
