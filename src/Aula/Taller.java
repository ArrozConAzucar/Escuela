package Aula;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import Aulas.*;
import Cursos.*;

@Entity
public class Taller {

	@Id @Column (length = 20) @Required
	private String materia;

	@Column (length = 10) @Required
	private Cursos curso;
	
	@Column (length = 10) @Required
	private Calendar horario;

	@Column (length = 2) @Required
	private Aulas aula;

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public Cursos getCurso() {
		return curso;
	}

	public void setCurso(Cursos curso) {
		this.curso = curso;
	}

	public Calendar getHorario() {
		return horario;
	}

	public void setHorario(Calendar horario) {
		this.horario = horario;
	}

	public Aulas getAula() {
		return aula;
	}

	public void setAula(Aulas aula) {
		this.aula = aula;
	}


}
