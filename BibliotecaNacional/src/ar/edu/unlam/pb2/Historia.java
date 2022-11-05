package ar.edu.unlam.pb2;

public class Historia extends Libro implements Fotocopiable{

	public Historia(Integer codigo, String nombre, String autor) {
		super(codigo, nombre, autor);
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public String fotocopiable() {
		
		return this.nombre;
	}
	

}
