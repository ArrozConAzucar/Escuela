package Cursos;

import javax.persistence.*;

import org.openxava.annotations.*;

@Entity
public class Cursos {

	@Id @Column (length = 10) @Required
	private String curso;

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

}
