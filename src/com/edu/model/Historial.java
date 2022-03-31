package com.edu.model;

import java.util.ArrayList;

public class Historial {

	private ArrayList<PaginaWeb> historial;
	
	public Historial() {
		historial=new ArrayList<>();
	}

	public ArrayList<PaginaWeb> getHistorial() {
		return historial;
	}
	
	public void addPaginaWeb(PaginaWeb pag){
	/*
		if (historial.indexOf(historial.size()-1)) {
			
		}
		*/
		
		historial.add(pag);
	}
	
	public void consultarHistorial() {
		System.out.println(historial);
	}
	
	public void consultarHistorialDia(int dia,int mes) {
		for (int i = 0; i < historial.size(); i++) {
			if (historial.get(i).getVisita().getDayOfMonth()==dia && 
					historial.get(i).getVisita().getMonthValue()==mes){
				System.out.println(historial.get(i));
			}
		}
	}
	
	public void borrarHistorial() {
		if (!historial.isEmpty()) {
			historial.clear();
			
	}
	
	}
	
}
