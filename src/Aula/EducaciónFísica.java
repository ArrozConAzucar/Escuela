package Aula;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

@Entity
public class EducaciónFísica {
	
	@Id @Column (length = 15) @Required
	private Calendar horario;
	
	@Id @Column (length = 15) @Required
	private String curso;

	public Calendar getHorario() {
		return horario;
	}

	public void setHorario(Calendar horario) {
		this.horario = horario;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

}
