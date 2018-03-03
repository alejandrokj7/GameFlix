package es.urjc.etsii;

import java.util.List;

import javax.persistence.*;

/**
 * Clase simplificada que representa un Juego.
 * 
 * @author J. M. Colmenar
 *
 */
@Entity
public class Juego {
	private int id;
	private String nombre;
	private String version;
	private String anio;
	private String estudio;
	private String nacionalidad;
	private String edadmin;
	private String descripcion;
	private String enlaceVideo;
	private List<Partida> partidas;
	
	
	public Juego() {
	}
	public Juego(String nombre, String version, String anio, String estudio, String nacionalidad, String edadmin, String descripcion,  String enlaceVideo) {
		this.nombre = nombre;
		this.version = version;
		this.anio = anio;
		this.estudio = estudio;
		this.nacionalidad = nacionalidad;
		this.edadmin = edadmin;
		this.descripcion = descripcion;
		this.enlaceVideo = enlaceVideo;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getid() {
		return id;
	}

	public void setid(int id) {
		this.id = id;
	}
	@OneToMany(mappedBy = "juego", cascade=CascadeType.ALL)
	public List<Partida> getPartidas() {
		return partidas;
	}
	public void setPartidas(List<Partida> partidas) {
		this.partidas = partidas;
	}
		
	// Getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getversion() {
		return version;
	}

	public void setversion(String version) {
		this.version = version;
	}
	
	public String getEdadmin() {
		return edadmin;
	}

	public void setEdadmin(String edadmin) {
		this.edadmin = edadmin;
	}

	
	public String getestudio() {
		return estudio;
	}

	public void setestudio(String estudio) {
		this.estudio = estudio;
	}
	public String getAnio() {
		return anio;
	}

	public void setAnio(String anio) {
		this.anio = anio;
	}

	
	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
		
}
