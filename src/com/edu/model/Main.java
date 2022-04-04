package com.edu.model;

import java.time.LocalDateTime;

public class Main {

	public static void main(String[] args) {
			
		Historial h1= new Historial();
		h1.addPaginaWeb(new PaginaWeb("google",LocalDateTime.of(2022, 1, 2, 10, 35)));
		
		System.out.println(h1.getHistorial());
	}

}
