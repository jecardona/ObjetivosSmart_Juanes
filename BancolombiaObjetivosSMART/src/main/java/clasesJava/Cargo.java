package clasesJava;

public class Cargo {

	private int id;
	private String descripcion;
	private int salario;
	
	public Cargo() {
		
	}
	
	public Cargo(int id, String descripcion, int salario) {
		this.id = id;
		this.descripcion = descripcion;
		this.salario = salario;
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
	
	public int getSalario() {
		return salario;
	}
 	public void setSalario(int salario) {
		this.salario = salario;
	}
}
