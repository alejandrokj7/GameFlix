package es.urjc.etsii;

import javax.persistence.*;


/**
 * Clase simplificada que representa un Juego.
 * 
 * @author J. M. Colmenar
 *
 */
@Entity
public class Partidas {
	private int id;	
	private String duracion;
	private String fecha;
	private String hora;
	private Juegos juego;	
	private Usuarios usuario;	
	
	
	public Partidas() {
	}
	public Partidas( String duracion, String fecha,	String hora) {
		this.duracion = duracion;
		this.fecha = fecha;
		this.hora = hora;
	}

	
	// Getters y setters
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	@ManyToOne
	@JoinColumn(name="juegoid")	
	public Juegos getJuego() {
		return juego;
	}

	public void setJuego(Juegos juego) {
		this.juego = juego;
	}
	
	@ManyToOne
	@JoinColumn(name="usuarioid")	
	public Usuarios getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuarios usuario) {
		this.usuario = usuario;
	}
	
	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}
	
	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}
	
	


	
		
}
