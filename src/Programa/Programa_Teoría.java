package Programa;

import javax.persistence.*;

import org.openxava.annotations.*;

import Materias.*;
import Persona.*;

@Entity
public class Programa_Teor�a {

	@Column (length = 2) @Required
	private int cant_unidades;
	
	@Column (length = 4) @Required
	private int a�o;
	
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

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
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
