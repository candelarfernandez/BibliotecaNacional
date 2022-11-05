package ar.edu.unlam.pb2;

public class Libro {
	protected Integer codigo;
	protected String nombre;
	protected String autor;
	
	public Libro(Integer codigo, String nombre, String autor) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.autor = autor;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	

}
