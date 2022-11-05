package ar.edu.unlam.pb2;

public class Geografia extends Libro implements Fotocopiable{

	public Geografia(Integer codigo, String nombre, String autor) {
		super(codigo, nombre, autor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String fotocopiable() {
		// TODO Auto-generated method stub
		return this.nombre;
	}

	
}
