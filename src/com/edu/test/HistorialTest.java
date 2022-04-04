package com.edu.test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

import com.edu.model.Historial;
import com.edu.model.HistorialException;
import com.edu.model.PaginaWeb;

class HistorialTest {

	@Test
	void testListaNoVacia() {
		Historial hi =  new Historial();
		
		hi.addPaginaWeb(new PaginaWeb("google",LocalDateTime.of(2022, 1, 1, 10, 35)));
	    assertEquals(hi.getHistorial().size(),1); 
				
	}

	@Test
	void testFalloAnadir() {
		Historial hi =  new Historial();
		
		try {
			hi.addPaginaWeb(new PaginaWeb("google",LocalDateTime.of(2022, 1, 1, 10, 35)));
			hi.addPaginaWeb(new PaginaWeb("google",LocalDateTime.of(2021, 1, 1, 10, 35)));
			assert(false);
		} catch (HistorialException he) {
			assert(true);
		}
		
				
	}
	
	@Test
	void testBorradoList() {
		Historial hi =  new Historial();
		
		hi.addPaginaWeb(new PaginaWeb("google",LocalDateTime.of(2022, 1, 1, 10, 35)));
	    hi.borrarHistorial();
	    assertEquals(hi.getHistorial().size(),0); 
	  		
	}

	@Test
	void testBorradoFalloList() {
		Historial hi =  new Historial();
	    hi.borrarHistorial();
	    assertEquals(hi.getHistorial().size(),0); 
	  		
	}
	
	

	@Test
	void testConsultarListVacia() {
		Historial hi =  new Historial();
	    assertEquals(hi.consultarHistorial(),""); 
	  		
	}
	
	
	@Test
	void testConsultarListNoVacia() {
		Historial hi =  new Historial();
		hi.addPaginaWeb(new PaginaWeb("google",LocalDateTime.of(2022, 1, 1, 10, 35)));
	    assertNotEquals(hi.consultarHistorial(),""); 
	  		
	}
	
	@Test
	void testConsultarListMes() {
		Historial hi =  new Historial();
		hi.addPaginaWeb(new PaginaWeb("google",LocalDateTime.of(2022, 1, 2, 10, 35)));
		hi.addPaginaWeb(new PaginaWeb("reddit",LocalDateTime.of(2022, 1, 3, 12, 40)));
	    assertTrue(hi.consultarHistorialDia(2, 1).contains("google") && !hi.consultarHistorialDia(2, 1).contains("reddit")); 
	  		
	}
	
	
}
