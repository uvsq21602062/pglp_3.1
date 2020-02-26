import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeTest {

	@Test
	public void testGetSalaire() {
		Employe e = new Employe("Dupont", "45 avenue des Etats Unis, Versailles");
		e.calculSalaire();
		assertTrue(e.getSalaire() == 1000.0);
	}
	
	@Test
	public void testGetNom() {
		Employe e = new Employe("Dupont", "45 avenue des Etats Unis, Versailles");
		assertEquals(e.getNom(), "Dupont");
	}
	
	@Test
	public void testGetAdresse() {
		Employe e = new Employe("Dupont", "45 avenue des Etats Unis, Versailles");
		assertEquals(e.getAdresse(), "45 avenue des Etats Unis, Versailles");
		
	}

	
}
