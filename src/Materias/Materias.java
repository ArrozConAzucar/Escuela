package Materias;

import javax.persistence.*;

import org.openxava.annotations.*;

@Entity
public class Materias {
	
	@Id @Column (length = 30) @Required
	private String materia;

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

}
