package clasesJava;

import java.util.HashMap;
import java.util.Map;

public class Nomina {

	private int id;
	private HashMap<Integer, Empleado> empleados;
	private String fecha;
	private static Nomina nominaSingleton;
	
	private Nomina(int id, HashMap<Integer, Empleado> empleados, String fecha) {
		this.id = id;
		this.empleados = empleados;
		this.fecha = fecha;
	}
	
	public static Nomina getSingletonInstance(int id, HashMap<Integer, Empleado> empleados, String fecha) {
		if(nominaSingleton == null) {
			nominaSingleton = new Nomina(id, empleados, fecha);
		}
		else {
			System.out.println("Error, ya existe un objeto de la clase Nomina");
		}
		
		return nominaSingleton;
	}
	
	//Métodos getter y setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public HashMap<Integer, Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(HashMap<Integer, Empleado> empleados) {
		this.empleados = empleados;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	//Método para calcular la nómina de los empleados
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
	
	//Sobreescribimos el método clone, para que no se pueda clonar un objeto de esta clase
	@Override
	public Nomina clone(){
	    try {
	        throw new CloneNotSupportedException();
	    } catch (CloneNotSupportedException ex) {
	        System.out.println("No se puede clonar un objeto de la clase Nomina");
	    }
	    return null; 
	}
}
