package es.urjc.etsii;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Clase simplificada que representa un Juego.
 * 
 * @author J. M. Colmenar
 *
 */
@Entity
public class Usuarios {
	private int id;
	private String nombre_usuario;
	private String nombre;
	private String contrasena;
	private String apellidos;
	private String correo;
	private String fecha;
	private String pais;
	private String residencia;
	private String perfil;
	private List<Partidas> partidas;
	
	
	public Usuarios() {
	}
	public Usuarios(String nombre, String apellidos, String correo, String fecha, String pais, String residencia, String perfil) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.correo = correo;
		this.fecha = fecha;
		this.pais = pais;
		this.residencia = residencia;
		this.perfil = perfil;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre_usuario() {
		return nombre_usuario;
	}
	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	@OneToMany(mappedBy = "usuario", cascade=CascadeType.ALL)
	public List<Partidas> getPartidas() {
		return partidas;
	}
	public void setPartidas(List<Partidas> partidas) {
		this.partidas = partidas;
	}
		
	// Getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public String getResidencia() {
		return residencia;
	}

	public void setResidencia(String residencia) {
		this.residencia = residencia;
	}

	
	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	
	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}
	
		
}
