package Persona;

import javax.persistence.*;

import org.openxava.annotations.*;

@Entity 
public class Preceptor {

	@Column (length = 15) @Required
	private String nombre;
	
	@Column (length = 15) @Required
	private String apellido;
	
	@Id @Column (length = 10) @Required
	private String dni;
	
	@Column (length = 15) @Required
	private String telefono;

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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
}
