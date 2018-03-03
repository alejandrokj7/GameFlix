package es.urjc.etsii;

import javax.persistence.*;


/**
 * Clase simplificada que representa un Juego.
 * 
 * @author J. M. Colmenar
 *
 */
@Entity
public class Partida {
	private int id;	
	private String duracion;
	private String fecha;
	private String hora;
	private Juego juego;	
	private Usuario usuario;	
	
	
	public Partida() {
	}
	public Partida( String duracion, String fecha,	String hora) {
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
	@JoinColumn(name="juego_id")	
	public Juego getJuego() {
		return juego;
	}

	public void setJuego(Juego juego) {
		this.juego = juego;
	}
	
	@ManyToOne
	@JoinColumn(name="usuario_id")	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
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
