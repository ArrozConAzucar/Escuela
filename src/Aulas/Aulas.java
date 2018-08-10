package Aulas;

import javax.persistence.*;

import org.openxava.annotations.*;

@Entity
public class Aulas {
	
	@Id @Column (length = 20) @Required
	private int aula;

	public int getAula() {
		return aula;
	}

	public void setAula(int aula) {
		this.aula = aula;
	}

}
