package pruebasUnitarias;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import baseDatosMySQL.MySQL;
import clasesJava.Cargo;
import clasesJava.Empleado;
import clasesJava.FactoriaCargos;
import clasesJava.Nomina;
import java.sql.SQLException;

public class PagoNominaTest {
	
	private Nomina nomina = Nomina.getSingletonInstance(1, null, "");	
	private Cargo analista = FactoriaCargos.getCargo("Analista");
	private Cargo jefe = FactoriaCargos.getCargo("Jefe");
	private Cargo gerente = FactoriaCargos.getCargo("Gerente");
	
	@Before
	 public void antes(){
		System.out.println("Inicia test");
		gerente.setId(1);
		gerente.setDescripcion("Gerente");
		analista.setId(3);
		analista.setDescripcion("Analista");
		jefe.setId(2);
		jefe.setDescripcion("Jefe");
	 } 
	
	 @After
	 public void despues(){
	  System.out.println("Finaliza test");
	 }

	@Test
	public void debeCalcularPagoNominaCuandoTengaSeisEmpleados() {
		
		//Asignación de datos
						
				// Empleados

				Empleado david = new Empleado(1, "David", analista);
				Empleado juan = new Empleado(2, "Juan", analista);
				Empleado gloria = new Empleado(3, "Gloria", jefe);
				Empleado mauro = new Empleado(4, "Mauro", analista);
				Empleado mari = new Empleado(5, "Mari", analista);
				Empleado edison = new Empleado(6, "Edison", gerente);
				
				//Ingreso de empleados a un HashMap
				HashMap<Integer, Empleado> empleados = new HashMap<Integer, Empleado>();
				
				empleados.put(david.getId(), david);
				empleados.put(juan.getId(), juan);
				empleados.put(gloria.getId(), gloria);
				empleados.put(mauro.getId(), mauro);
				empleados.put(mari.getId(), mari);
				empleados.put(edison.getId(), edison);
				
				//Nómina
				String fechaNomina = "30/08/2018";
				
				nomina.setId(1);
				nomina.setEmpleados(empleados);
				nomina.setFecha(fechaNomina);
				
				int valorNominaEsperado = 28000000;
		
		//Ejecución de acción
		
				int valorNominaObtenido = nomina.calcularNomina();
				System.out.println("\nEl valor total de la nómina en la fecha " + 
						fechaNomina + " es: " + valorNominaObtenido);
		
		//Validación de resultado
				assertEquals(valorNominaEsperado, valorNominaObtenido);
	}
	
	@Test
	public void debeCalcularPagoNominaCuandoTengaOchoEmpleados() {
		
		//Asignación de datos

				// Empleados

				Empleado david = new Empleado(1, "David", analista);
				Empleado juan = new Empleado(2, "Juan", analista);
				Empleado gloria = new Empleado(3, "Gloria", jefe);
				Empleado mauro = new Empleado(4, "Mauro", analista);
				Empleado mari = new Empleado(5, "Mari", analista);
				Empleado edison = new Empleado(6, "Edison", gerente);
				Empleado wil = new Empleado(7, "Wil", analista);
				Empleado gio = new Empleado(8, "Gio", analista);
				
				//Ingreso de empleados a un HashMap
				HashMap<Integer, Empleado> empleados = new HashMap<Integer, Empleado>();				
				empleados.put(david.getId(), david);
				empleados.put(juan.getId(), juan);
				empleados.put(gloria.getId(), gloria);
				empleados.put(mauro.getId(), mauro);
				empleados.put(mari.getId(), mari);
				empleados.put(edison.getId(), edison);
				empleados.put(wil.getId(), wil);
				empleados.put(gio.getId(), gio);
				
				//Nómina
				String fechaNomina = "30/08/2018";
				
				nomina.setId(1);
				nomina.setEmpleados(empleados);
				nomina.setFecha(fechaNomina);
				int valorNominaEsperado = 34000000;
		
		//Ejecución de acción
		
				int valorNominaObtenido = nomina.calcularNomina();
				System.out.println("\nEl valor total de la nómina en la fecha " + 
						fechaNomina + " es: " + valorNominaObtenido);
		
		//Validación de resultado
				assertEquals(valorNominaEsperado, valorNominaObtenido);
	}
	
	@Test
	public void debeCalcularPagoNominaCuandoTengaDiezEmpleados() {
		
		//Asignación de datos
		
				// Empleados

				Empleado david = new Empleado(1, "David", analista);
				Empleado juan = new Empleado(2, "Juan", analista);
				Empleado gloria = new Empleado(3, "Gloria", jefe);
				Empleado mauro = new Empleado(4, "Mauro", analista);
				Empleado mari = new Empleado(5, "Mari", analista);
				Empleado edison = new Empleado(6, "Edison", gerente);
				Empleado wil = new Empleado(7, "Wil", analista);
				Empleado gio = new Empleado(8, "Gio", analista);
				Empleado edwin = new Empleado(9, "Edwin", analista);
				Empleado angela = new Empleado(10, "Angela", analista);
				
				//Ingreso de empleados a un HashMap
				HashMap<Integer, Empleado> empleados = new HashMap<Integer, Empleado>();
				
				empleados.put(david.getId(), david);
				empleados.put(juan.getId(), juan);
				empleados.put(gloria.getId(), gloria);
				empleados.put(mauro.getId(), mauro);
				empleados.put(mari.getId(), mari);
				empleados.put(edison.getId(), edison);
				empleados.put(wil.getId(), wil);
				empleados.put(gio.getId(), gio);
				empleados.put(edwin.getId(), edwin);
				empleados.put(angela.getId(), angela);
				
				//Nómina
				String fechaNomina = "30/08/2018";

				nomina.setId(1);
				nomina.setEmpleados(empleados);
				nomina.setFecha(fechaNomina);
				
				int valorNominaEsperado = 40000000;
		
		//Ejecución de acción
		
				int valorNominaObtenido = nomina.calcularNomina();
				System.out.println("\nEl valor total de la nómina en la fecha " + 
						fechaNomina + " es: " + valorNominaObtenido);
		
		//Validación de resultado
				assertEquals(valorNominaEsperado, valorNominaObtenido);
	}
	
	
	@Test
	public void debeCalcularPagoNominaConsultandoBaseDatosMySQL() throws SQLException {
		
		//Asignación de datos
		
				//Conexión Base de datos
				MySQL db = new MySQL();
		        db.MySQLConnect();
		        
		        // Nombre base de datos y tabla
		        String tablaCargo = "empresa.cargo";
		       
		        //Query para consultar la tabla cargo       
		        String queryCargos = "SELECT * FROM " + tablaCargo;
		       
		        /* Se crea una declaración y se establece el Query que se
		        *  desea ejecutar
		        */
		       
		        db.comando = db.conexion.createStatement();
		        db.registro = db.comando.executeQuery(queryCargos);
		       
		        /* Recorrer resultado de la consulta para mapear los datos de
		        * la base de datos e instanciar la clase java Cargo
		        */
		       
		        while (db.registro.next()) {
		        	
		        	int idCargo = Integer.parseInt(db.registro.getString(1));
		          
		        	switch (idCargo) {
		        		case 1: gerente = FactoriaCargos.getCargo(db.registro.getString(2));
								gerente.setId(idCargo);
								gerente.setDescripcion(db.registro.getString(2));
		           				break;
		           		case 2: jefe = FactoriaCargos.getCargo(db.registro.getString(2));
		           				jefe.setId(idCargo);
		           				jefe.setDescripcion(db.registro.getString(2));
		           				break;
		           		case 3: analista = FactoriaCargos.getCargo(db.registro.getString(2));
           						analista.setId(idCargo);
           						analista.setDescripcion(db.registro.getString(2));
		           				break;
		           		default: break;
		        	}           
		        }
		       
		        // Nombre base de datos y tabla
		        String tablaEmpleado = "empresa.empleado";
		      
		        //Query para consultar la tabla empleado 
		        String queryEmpleados = "SELECT * FROM " + tablaEmpleado;
		      
		        /* Se crea una declaración y se establece el Query que se
		      	*	desea ejecutar
		        */
		      
		        db.comando = db.conexion.createStatement();
		        db.registro = db.comando.executeQuery(queryEmpleados);
		
		        //HashMap para almacenar los empleados que están en la base de datos
		        HashMap<Integer, Empleado> empleados = new HashMap<Integer, Empleado>();
		      
		        Empleado empleado = null;
		        
		        /* Recorrer resultado de la consulta para mapear los datos de
		         * la base de datos e instanciar la clase java Empleado
		         */
		        while (db.registro.next()) {
		        	int idCargo = Integer.parseInt(db.registro.getString(3));
		            
		        	switch (idCargo) {
		        		case 1: empleado = new Empleado (Integer.parseInt(db.registro.getString(1)), 
		        								db.registro.getString(2), gerente);
		           				break;
		           		case 2: empleado = new Empleado (Integer.parseInt(db.registro.getString(1)), 
		           								db.registro.getString(2), jefe);
		           				break;
		           		case 3: empleado = new Empleado (Integer.parseInt(db.registro.getString(1)), 
												db.registro.getString(2), analista);
		           				break;
		           		default: break;
		        	}
		           	//Almacenar cada uno de los empleados en el hashMap
		           	empleados.put(empleado.getId(), empleado);
		        }
		        
		        //Cerrar conexión de la base de datos
		        db.MySQLConnect().close();
				
				//Nómina
				String fechaNomina = "30/09/2018";
				
				nomina.setId(1);
				nomina.setEmpleados(empleados);
				nomina.setFecha(fechaNomina);
				
				int valorNominaEsperado = 28000000;
		
		//Ejecución de acción
		
				int valorNominaObtenido = nomina.calcularNomina();
				System.out.println("\nEl valor total de la nómina en la fecha " + 
						fechaNomina + " es: " + valorNominaObtenido);
		
		//Validación de resultado
				assertEquals(valorNominaEsperado, valorNominaObtenido);
	}

}
