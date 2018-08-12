package clasesJava;

import java.util.HashMap;

public class Nomina {

	protected int id;
	protected HashMap<Integer, Empleado> empleados;
	protected String fecha;
	
	public Nomina(int id, HashMap<Integer, Empleado> empleados, String fecha) {
		this.id = id;
		this.empleados = empleados;
		this.fecha = fecha;
	}
	
	public int calcularNomina() {
		int valorNomina= 0;
		return valorNomina;
	}
}
