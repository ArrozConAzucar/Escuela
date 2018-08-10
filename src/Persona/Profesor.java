package Persona;

import javax.persistence.*;

import org.openxava.annotations.*;

@Entity
public class Profesor {
	
	@Id @Column (length = 20) @Required
	private String nombre;
	
	@Id @Column (length = 20) @Required
	private String apellido;
	
	@Id @Column (length = 15) @Required
	private String telefono;
	
	@Id @Column (length = 10) @Required
	private String dni;
	
	@Id @Column (length = 15) @Required
	private String materia;
	
	@Id @Column (length = 5) @Required
	private boolean ausencia;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public boolean isAusencia() {
		return ausencia;
	}

	public void setAusencia(boolean ausencia) {
		this.ausencia = ausencia;
	}
	

}
