package clasesJava;

public class Empleado {

	protected String nombre;
	protected int id;
	protected Cargo cargo;
	
	public Empleado(int id, String nombre, Cargo cargo) {
		this.nombre = nombre;
		this.id = id;
		this.cargo = cargo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}	
}
