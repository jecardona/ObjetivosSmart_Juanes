package clasesJava;

public abstract class Cargo {

	private int id;
	private String descripcion;
	
	public Cargo() {
		
	}
	
	public Cargo(int id, String descripcion) {
		this.id = id;
		this.descripcion = descripcion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public abstract int getSalario();
}
