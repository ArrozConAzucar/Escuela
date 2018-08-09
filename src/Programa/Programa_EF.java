package Programa;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

@Entity
public class Programa_EF {

	@Id @Column (length = 15) @Required
	private String curso;
	
	@Id @Column (length = 15) @Required
	private Calendar horario;
	
	@Id @Column (length = 15) @Required
	private String nombre_profesor;
	
	@Id @Column (length = 15) @Required
	private String apellido_profesor;

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public Calendar getHorario() {
		return horario;
	}

	public void setHorario(Calendar horario) {
		this.horario = horario;
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
}
