package pruebasUnitarias;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import baseDatosMySQL.MySQL;
import clasesJava.Cargo;
import clasesJava.Empleado;
import clasesJava.Nomina;
import java.sql.SQLException;

public class PagoNominaTest {
	
	private Nomina nomina = Nomina.getSingletonInstance(1, null, "");	
	private Cargo gerente = new Cargo(1, "Gerente", 10000000);
	private Cargo jefe = new Cargo(2, "Jefe", 6000000);
	private Cargo analista = new Cargo(3, "Analista", 3000000);
	
	@Before
	 public void antes(){
		System.out.println("Inicia test");
	 } 
	
	 @After
	 public void despues(){
	  System.out.println("Finaliza test");
	 }

	@Test
	public void debeCalcularPagoNominaCuandoTengaSeisEmpleados() {
		
		//Asignaci�n de datos
						
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
				
				//N�mina
				String fechaNomina = "30/08/2018";
				
				nomina.setId(1);
				nomina.setEmpleados(empleados);
				nomina.setFecha(fechaNomina);
				
				int valorNominaEsperado = 28000000;
		
		//Ejecuci�n de acci�n
		
				int valorNominaObtenido = nomina.calcularNomina();
				System.out.println("\nEl valor total de la n�mina en la fecha " + 
						fechaNomina + " es: " + valorNominaObtenido);
		
		//Validaci�n de resultado
				assertEquals(valorNominaEsperado, valorNominaObtenido);
	}
	
	@Test
	public void debeCalcularPagoNominaCuandoTengaOchoEmpleados() {
		
		//Asignaci�n de datos

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
				
				//N�mina
				String fechaNomina = "30/08/2018";
				
				nomina.setId(1);
				nomina.setEmpleados(empleados);
				nomina.setFecha(fechaNomina);
				int valorNominaEsperado = 34000000;
		
		//Ejecuci�n de acci�n
		
				int valorNominaObtenido = nomina.calcularNomina();
				System.out.println("\nEl valor total de la n�mina en la fecha " + 
						fechaNomina + " es: " + valorNominaObtenido);
		
		//Validaci�n de resultado
				assertEquals(valorNominaEsperado, valorNominaObtenido);
	}
	
	@Test
	public void debeCalcularPagoNominaCuandoTengaDiezEmpleados() {
		
		//Asignaci�n de datos
		
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
				
				//N�mina
				String fechaNomina = "30/08/2018";

				nomina.setId(1);
				nomina.setEmpleados(empleados);
				nomina.setFecha(fechaNomina);
				
				int valorNominaEsperado = 40000000;
		
		//Ejecuci�n de acci�n
		
				int valorNominaObtenido = nomina.calcularNomina();
				System.out.println("\nEl valor total de la n�mina en la fecha " + 
						fechaNomina + " es: " + valorNominaObtenido);
		
		//Validaci�n de resultado
				assertEquals(valorNominaEsperado, valorNominaObtenido);
	}
	
	
	@Test
	public void debeCalcularPagoNominaConsultandoBaseDatosMySQL() throws SQLException {
		
		//Asignaci�n de datos
		
				//Conexi�n Base de datos
				MySQL db = new MySQL();
		        db.MySQLConnect();
		        
		        //Nombre base de datos y tabla
		        String tablaCargo = "empresa.cargo";
		       
		        //Query para consultar la tabla cargo       
		        String queryCargos = "SELECT * FROM " + tablaCargo;
		       
		        /* Se crea una declaraci�n y se establece el Query que se
		        *  desea ejecutar
		        */
		       
		        db.comando = db.conexion.createStatement();
		        db.registro = db.comando.executeQuery(queryCargos);
		       
		        /* Recorrer resultado de la consulta para mapear los datos de
		        * la base de datos e instanciar la clase java Cargo
		        */
		       
		        Cargo cargo = null;
		        //HashMap para almacenar los cargos que est�n en la base de datos
		        HashMap<Integer, Cargo> cargos = new HashMap<Integer, Cargo>();
		        
		        while (db.registro.next()) {
		        	
		        	int idCargo = Integer.parseInt(db.registro.getString(1));
		        	cargo = new Cargo(idCargo, db.registro.getString(2), 
	           				Integer.parseInt(db.registro.getString(3)));
		        	//Almacenar cada uno de los empleados en el hashMap
		           	cargos.put(cargo.getId(), cargo);
		        }
		        
		        // Nombre base de datos y tabla
		        String tablaEmpleado = "empresa.empleado";
		      
		        //Query para consultar la tabla empleado 
		        String queryEmpleados = "SELECT * FROM " + tablaEmpleado;
		      
		        /* Se crea una declaraci�n y se establece el Query que se
		      	*	desea ejecutar
		        */
		      
		        db.comando = db.conexion.createStatement();
		        db.registro = db.comando.executeQuery(queryEmpleados);
		
		        //HashMap para almacenar los empleados que est�n en la base de datos
		        HashMap<Integer, Empleado> empleados = new HashMap<Integer, Empleado>();
		      
		        Empleado empleado = null;
		        
		        /* Recorrer resultado de la consulta para mapear los datos de
		         * la base de datos e instanciar la clase java Empleado
		         */
		        
		        while (db.registro.next()) {
		        	int idCargoEmpleado = Integer.parseInt(db.registro.getString(3));
		            
		        	//Recorre el hashmap de cargos hasta obtener el Cargo de cada uno de los empleados
					for(Map.Entry<Integer, Cargo> entry : cargos.entrySet()) {
						
						if(entry.getValue().getId() == idCargoEmpleado) {
							empleado = new Empleado (Integer.parseInt(db.registro.getString(1)), 
    								db.registro.getString(2), entry.getValue());
							break;
						}
						
					}
		        	
		           	//Almacenar cada uno de los empleados en el hashMap
		           	empleados.put(empleado.getId(), empleado);
		        }
		        
		        //Cerrar conexi�n de la base de datos
		        db.MySQLConnect().close();
		        
				//N�mina
				String fechaNomina = "30/09/2018";
				
				nomina.setId(1);
				nomina.setEmpleados(empleados);
				nomina.setFecha(fechaNomina);
				
				int valorNominaEsperado = 28000000;
		
		//Ejecuci�n de acci�n
		
				int valorNominaObtenido = nomina.calcularNomina();
				System.out.println("\nEl valor total de la n�mina en la fecha " + 
						fechaNomina + " es: " + valorNominaObtenido);
		
		//Validaci�n de resultado
				assertEquals(valorNominaEsperado, valorNominaObtenido);
	}

}
