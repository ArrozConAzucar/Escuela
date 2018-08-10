package Persona;

import javax.persistence.*;

import org.openxava.annotations.*;

@Entity
public class Alumno {

	@Column (length = 15) @Required
	private String nombre;
	
	@Column (length = 15) @Required
	private String apellido;
	
	@Column (length = 15) @Required
	private String telefono;
	
	@Id @Column (length = 10) @Required
	private String dni;
	
	@Column (length = 30) @Required
	private String mail;
	
	@Column (length = 10) @Required
	private String dirección;
	
	@Column (length = 5) @Required
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

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getDirección() {
		return dirección;
	}

	public void setDirección(String dirección) {
		this.dirección = dirección;
	}

	public boolean isAusencia() {
		return ausencia;
	}

	public void setAusencia(boolean ausencia) {
		this.ausencia = ausencia;
	}

}
