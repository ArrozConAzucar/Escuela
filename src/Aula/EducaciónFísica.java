package Aula;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import Cursos.*;

@Entity
public class EducaciónFísica {
	
	@Column (length = 10) @Required
	private Calendar horario;
	
	@Column (length = 10) @Required
	private Cursos curso;

	public Calendar getHorario() {
		return horario;
	}

	public void setHorario(Calendar horario) {
		this.horario = horario;
	}

	public Cursos getCurso() {
		return curso;
	}

	public void setCurso(Cursos curso) {
		this.curso = curso;
	}

}
