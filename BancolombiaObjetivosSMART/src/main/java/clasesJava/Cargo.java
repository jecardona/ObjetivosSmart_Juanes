package clasesJava;

public class Cargo {

	protected int id;
	protected String descripcion;
	protected double salario;
	
	public Cargo(int id, String descripcion, double salario) {
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

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}
