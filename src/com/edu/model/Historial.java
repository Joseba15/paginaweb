package com.edu.model;

import java.util.ArrayList;
import java.util.List;

public class Historial {

	private List<PaginaWeb> historial;
	
	public Historial() {
		historial=new ArrayList<>();
	}

	public List<PaginaWeb> getHistorial() {
		return historial;
	}
	
	public void addPaginaWeb(PaginaWeb pag){
		
		if (historial.isEmpty()) {
			
			historial.add(pag);
		}else if(historial.get(historial.size()-1).getVisita().isBefore(pag.getVisita())) {
			historial.add(pag);
		}else {
			throw new HistorialException("No se puede añadir la pagina al historial");
		}
		
		
	}
	
	public String consultarHistorial() {
		String result="";
		if (!historial.isEmpty()) {
			result=historial.toString();
		}
		return result;
	}
	
	public String consultarHistorialDia(int dia,int mes) {
		
		StringBuilder sb= new StringBuilder();
		for (int i = 0; i < historial.size(); i++) {
			if (historial.get(i).getVisita().getDayOfMonth()==dia && 
					historial.get(i).getVisita().getMonthValue()==mes){
					sb.append(historial.get(i));
			}
		}
		return sb.toString();
	}
	
	public void borrarHistorial() {
		if (!historial.isEmpty()) {
			historial.clear();
			
	}
	
	}
	
}
