package clasesJava;

import java.util.HashMap;
import java.util.Map;

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
		//Recorre el hashmap de empleados para obtener el salario de cada empleado e irlo sumando en la nómina
				for(Map.Entry<Integer, Empleado> entry : empleados.entrySet()) {
					valorNomina += entry.getValue().getCargo().getSalario();
					
					System.out.println("id Empleado = " + entry.getKey() + 
							", Nombre Empleado = " + entry.getValue().getNombre() + 
							", Salario Empleado = " + entry.getValue().getCargo().getSalario());
				}
		return valorNomina;
	}
}
