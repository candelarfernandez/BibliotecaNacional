package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class test {

	@Test
	public void crearBibblioteca() {
		Biblioteca biblioteca = new Biblioteca();
		assertNotNull(biblioteca);
	}
	
	@Test
	public void agregarLibrosALaBiblioteca() {
		Biblioteca biblioteca = new Biblioteca();
		Libro geografia = new Geografia(1, "java", "candela");
		Libro matematicas = new Matematicas(2, "c++", "rocio");
		Libro historia = new Historia(3, "phyton", "candela");
		
		biblioteca.agregarLibro(geografia);
		biblioteca.agregarLibro(matematicas);
		biblioteca.agregarLibro(historia);
		
		assertEquals((Integer)3, (Integer)biblioteca.getLibros().size());
	}
	
	@Test
	public void queLosLibrosSePuedanPrestarAUnEstudiante() {
		Biblioteca biblioteca = new Biblioteca();
		Libro geografia = new Geografia(1, "java", "candela");
		Libro matematicas = new Matematicas(2, "c++", "rocio");
		Libro historia = new Historia(3, "phyton", "candela");
		Estudiante estudiante = new Estudiante(44424896, "fernandez", "candela");
		Registro registro = new Registro(1, estudiante, historia);
	
		
		biblioteca.prestarLibro(registro);
		
		assertEquals((Integer)1, (Integer)biblioteca.getRegistrosPrestamos().size());
		
	}
	
	@Test
	public void queLosLibrosDeHistoriaEGeografiaSeanFotocopiables() {
		Biblioteca biblioteca = new Biblioteca();
		Libro geografia = new Geografia(1, "java", "candela");
		Libro historia = new Historia(3, "phyton", "rocio");
		biblioteca.agregarLibro(geografia);
		biblioteca.agregarLibro(historia);
		
	    assertEquals("java",((Geografia) geografia).fotocopiable());
	    assertEquals("phyton",((Historia) historia).fotocopiable());
		
	}
	
	@Test (expected = NoSePudoPrestarException.class)
	public void queSePuedanPrestarHastaDosLibrosAUnEstudiante() throws NoSePudoPrestarException {
		Biblioteca biblioteca = new Biblioteca();
		Libro geografia = new Geografia(1, "java", "candela");
		Libro matematicas = new Matematicas(2, "c++", "rocio");
		Libro historia = new Historia(3, "phyton", "rocio");
		Estudiante estudiante = new Estudiante(44424896, "fernandez", "candela");
		Registro registro = new Registro(1, estudiante, geografia);		
		
		biblioteca.prestarLibro(registro);
		registro.prestarLibro(geografia);
		registro.prestarLibro(matematicas);
		registro.prestarLibro(historia);
		
	}
	
	@Test 
	public void queSeSepaAQueAlumnoSePrestoElLibro() throws NoSePudoPrestarException {
		Biblioteca biblioteca = new Biblioteca();
		Libro geografia = new Geografia(1, "java", "candela");
		Libro matematicas = new Matematicas(2, "c++", "rocio");
		Libro historia = new Historia(3, "phyton", "rocio");
		Estudiante estudiante = new Estudiante(44424896, "fernandez", "candela");
		Registro registro = new Registro(1, estudiante, geografia);	
		
		registro.prestarLibro(geografia);
		
		assertEquals(estudiante, registro.getEstudiante());
	}
	
	@Test
	public void queUnEstudiantePuedaDevolverUnLibro() throws NoSePudoPrestarException {
		Biblioteca biblioteca = new Biblioteca();
		Libro geografia = new Geografia(1, "java", "candela");
		Libro matematicas = new Matematicas(2, "c++", "rocio");
		Libro historia = new Historia(3, "phyton", "rocio");
		Estudiante estudiante = new Estudiante(44424896, "fernandez", "candela");
		Registro registro = new Registro(1, estudiante, geografia);	
		
		registro.prestarLibro(geografia);
		
		registro.devolverLibro(geografia);
		assertEquals((Integer)0, (Integer)registro.getLibrosPrestados().size());
	}

}
