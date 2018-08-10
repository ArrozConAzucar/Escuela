package Aula;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

@Entity
public class Teoría {
	
	@Id @Column (length = 20) @Required
	private String materia; 
	
	@Id @Column (length = 20) @Required
	private String curso; 
	
	@Id @Column (length = 20) @Required
	private Calendar horario;
	
	@Id @Column (length = 20) @Required
	private int aula;

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

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

	public int getAula() {
		return aula;
	}

	public void setAula(int aula) {
		this.aula = aula;
	}
	

}
