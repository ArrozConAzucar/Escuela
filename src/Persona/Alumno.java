package Persona;

import javax.persistence.*;

import org.openxava.annotations.*;

@Entity
public class Alumno {

	@Id @Column (length = 20) @Required
	private String nombre;
	
	@Id @Column (length = 20) @Required
	private String apellido;
	
	@Id @Column (length = 15) @Required
	private String telefono;
	
	@Id @Column (length = 10) @Required
	private String dni;
	
	@Id @Column (length = 30) @Required
	private String mail;
	
	@Id @Column (length = 20) @Required
	private String direcci�n;

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

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getDirecci�n() {
		return direcci�n;
	}

	public void setDirecci�n(String direcci�n) {
		this.direcci�n = direcci�n;
	}

}
