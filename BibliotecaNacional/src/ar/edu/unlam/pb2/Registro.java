package ar.edu.unlam.pb2;

import java.util.HashSet;
import java.util.Set;

public class Registro {
	private Integer id;
	private Estudiante estudiante;
	private Libro libro;
	private Set<Libro> librosPrestados;
	private final Integer CANTIDAD_MAXIMA_LIBROS=2;
	
	
	public Registro(Integer id, Estudiante estudiante, Libro libro) {
		super();
		this.id = id;
		this.estudiante = estudiante;
		this.libro = libro;
		this.librosPrestados= new HashSet<>();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Estudiante getEstudiante() {
		return estudiante;
	}
	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}
	public Libro getLibro() {
		return libro;
	}
	public void setLibro(Libro libro) {
		this.libro = libro;
	}
	
	
	public Set<Libro> getLibrosPrestados() {
		return librosPrestados;
	}
	public void setLibrosPrestados(Set<Libro> librosPrestados) {
		this.librosPrestados = librosPrestados;
	}
	public void prestarLibro(Libro geografia) throws NoSePudoPrestarException {
		Boolean prestamo=false;
		if(this.librosPrestados.size()<this.CANTIDAD_MAXIMA_LIBROS) {
			if(prestamo == false) {
				this.librosPrestados.add(geografia);
			}
		}
		else {
			throw new NoSePudoPrestarException();
		}
		
	}
	public void devolverLibro(Libro geografia) {
	  this.librosPrestados.remove(geografia);
	}
	
	


}
