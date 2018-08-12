package clasesJava;

public class Empleado {

	protected String nombre;
	protected String documento;
	protected int id;
	protected Cargo cargo;
	
	public Empleado(String nombre, String documento, int id, Cargo cargo) {
		this.nombre = nombre;
		this.documento = documento;
		this.id = id;
		this.cargo = cargo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
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
