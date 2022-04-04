package com.edu.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class PaginaWeb {

	private String nombre;
	private LocalDateTime visita;
	
	
	public PaginaWeb(String nombre,LocalDateTime visita) {
		this.nombre = nombre;
		this.visita =visita;
	}


	public String getNombre() {
		return nombre;
	}


	public LocalDateTime getVisita() {
		return visita;
	}


	@Override
	public String toString() {
		return "Pagina Web "+ nombre + " visitada " + visita+"\n";
	}


	@Override
	public int hashCode() {
		return Objects.hash(visita);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PaginaWeb other = (PaginaWeb) obj;
		return Objects.equals(visita, other.visita);
	}
	
	
	
	
	
	
	
	
	
	
}
