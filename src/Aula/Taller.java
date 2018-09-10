package Aula;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import Aulas.*;
import Cursos.*;

@Entity
@View
public class Taller {
	@ManyToOne
	
	private Collection<Cursos> listaCursos;
	
	public Collection<Cursos> getCursos(){
		return listaCursos;
	}
	public void setCursos(Collection<Cursos> listaCursos) {
		this.listaCursos = listaCursos;
	}	
	
	@Id @Column (length = 20) @Required @Hidden
	private String materia;
	
	@Column (length = 10) @Required
	private Calendar horario;

	@Column (length = 20) @Required
	private Aulas aula;

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

//	public Cursos getCurso() {
//		return curso;
//	}
//
//	public void setCurso(Cursos curso) {
//		this.curso = curso;
//	}

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
