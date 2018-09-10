package Cursos;

import javax.persistence.*;

import org.openxava.annotations.*;

import Aula.*;

@Entity
public class Cursos {
	
	@OneToMany
	private Taller taller;
	
	public Taller getTaller() {
		return taller;
	}
	
	public void setTaller(Taller taller) {
		this.taller = taller;
	}

	@Id @Column (length = 100) @Required
	private String curso;

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

}