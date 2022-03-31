package com.edu.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.edu.model.Historial;
import com.edu.model.PaginaWeb;

class HistorialTest {

	@Test
	void testBorrarVacia() {
		Historial hi =  new Historial();
		
		hi=hi.borrarHistorial();
		
	     assertEquals(hi.borrarHistorial(), hi.s);  
		
		
		//hi.addPaginaWeb(new PaginaWeb("Google"));
		
	}

}
