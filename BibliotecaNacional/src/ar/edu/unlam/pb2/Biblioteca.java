package ar.edu.unlam.pb2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Biblioteca {
	private Set<Libro> libros;
	private Set<Registro> registrosPrestamos;
	
	

	public Biblioteca() {
		super();
		this.libros = new HashSet<>();
		this.registrosPrestamos= new HashSet<>();
	}



	public Set<Libro> getLibros() {
		return libros;
	}



	public void setLibros(Set<Libro> libros) {
		this.libros = libros;
	}

	


	public Set<Registro> getRegistrosPrestamos() {
		return registrosPrestamos;
	}



	public void setRegistrosPrestamos(Set<Registro> registrosPrestamos) {
		this.registrosPrestamos = registrosPrestamos;
	}



	public void agregarLibro(Libro libro) {
			this.libros.add(libro);
		
	}



	public void prestarLibro(Registro registro) {
		this.registrosPrestamos.add(registro);
		
	}

	
	
}
