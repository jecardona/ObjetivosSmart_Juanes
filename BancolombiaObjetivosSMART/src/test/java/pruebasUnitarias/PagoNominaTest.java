package pruebasUnitarias;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

import clasesJava.Cargo;
import clasesJava.Empleado;
import clasesJava.Nomina;

public class PagoNominaTest {

	@Test
	public void debeCalcularPagoNominaCuandoTengaSeisEmpleados() {
		
		//Asignaci�n de datos
		
				//Cargos
				Cargo gerente = new Cargo(1, "Gerente", 10000000);
				Cargo jefe = new Cargo(2, "Jefe", 6000000);
				Cargo analista = new Cargo(3, "Analista", 3000000);
				
				// Empleados

				Empleado david = new Empleado("David", "1", 1, analista);
				Empleado juan = new Empleado("Juan", "2", 2, analista);
				Empleado gloria = new Empleado("Gloria", "3", 3, jefe);
				Empleado mauro = new Empleado("Mauro", "4", 4, analista);
				Empleado mari = new Empleado("Mari", "5", 5, analista);
				Empleado edison = new Empleado("Edison", "6", 6, gerente);
				
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
				Nomina nominaAgosto = new Nomina(1, empleados, fechaNomina);
				
				int valorNominaEsperado = 28000000;
		
		//Ejecuci�n de acci�n
		
				int valorNominaObtenido = nominaAgosto.calcularNomina();
				System.out.println("El valor total de la n�mina en la fecha " + 
						fechaNomina + " es: " + valorNominaObtenido);
		
		//Validaci�n de resultado
				assertEquals(valorNominaEsperado, valorNominaObtenido);
	}
	
	@Test
	public void debeCalcularPagoNominaCuandoTengaOchoEmpleados() {
		
		//Asignaci�n de datos
		
				//Cargos
				Cargo gerente = new Cargo(1, "Gerente", 10000000);
				Cargo jefe = new Cargo(2, "Jefe", 6000000);
				Cargo analista = new Cargo(3, "Analista", 3000000);
				
				// Empleados

				Empleado david = new Empleado("David", "1", 1, analista);
				Empleado juan = new Empleado("Juan", "2", 2, analista);
				Empleado gloria = new Empleado("Gloria", "3", 3, jefe);
				Empleado mauro = new Empleado("Mauro", "4", 4, analista);
				Empleado mari = new Empleado("Mari", "5", 5, analista);
				Empleado edison = new Empleado("Edison", "6", 6, gerente);
				Empleado wil = new Empleado("Wil", "7", 7, analista);
				Empleado gio = new Empleado("Gio", "8", 8, analista);
				
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
				Nomina nominaAgosto = new Nomina(1, empleados, fechaNomina);
				
				int valorNominaEsperado = 34000000;
		
		//Ejecuci�n de acci�n
		
				int valorNominaObtenido = nominaAgosto.calcularNomina();
				System.out.println("El valor total de la n�mina en la fecha " + 
						fechaNomina + " es: " + valorNominaObtenido);
		
		//Validaci�n de resultado
				assertEquals(valorNominaEsperado, valorNominaObtenido);
	}
	
	@Test
	public void debeCalcularPagoNominaCuandoTengaDiezEmpleados() {
		
		//Asignaci�n de datos
		
				//Cargos
				Cargo gerente = new Cargo(1, "Gerente", 10000000);
				Cargo jefe = new Cargo(2, "Jefe", 6000000);
				Cargo analista = new Cargo(3, "Analista", 3000000);
				
				// Empleados

				Empleado david = new Empleado("David", "1", 1, analista);
				Empleado juan = new Empleado("Juan", "2", 2, analista);
				Empleado gloria = new Empleado("Gloria", "3", 3, jefe);
				Empleado mauro = new Empleado("Mauro", "4", 4, analista);
				Empleado mari = new Empleado("Mari", "5", 5, analista);
				Empleado edison = new Empleado("Edison", "6", 6, gerente);
				Empleado wil = new Empleado("Wil", "7", 7, analista);
				Empleado gio = new Empleado("Gio", "8", 8, analista);
				Empleado edwin = new Empleado("Edwin", "9", 9, analista);
				Empleado angela = new Empleado("Angela", "10", 10, analista);
				
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
				Nomina nominaAgosto = new Nomina(1, empleados, fechaNomina);
				
				int valorNominaEsperado = 40000000;
		
		//Ejecuci�n de acci�n
		
				int valorNominaObtenido = nominaAgosto.calcularNomina();
				System.out.println("El valor total de la n�mina en la fecha " + 
						fechaNomina + " es: " + valorNominaObtenido);
		
		//Validaci�n de resultado
				assertEquals(valorNominaEsperado, valorNominaObtenido);
	}
	
	/*
	@Test
	public void debeCalcularPagoNominaCuandoTengaOchoEmpleadosFail() {
		
		//Asignaci�n de datos
		
				//Cargos
				Cargo gerente = new Cargo(1, "Gerente", 10000000);
				Cargo jefe = new Cargo(2, "Jefe", 6000000);
				Cargo analista = new Cargo(3, "Analista", 3000000);
				
				// Empleados

				Empleado david = new Empleado("David", "1", 1, analista);
				Empleado juan = new Empleado("Juan", "2", 2, analista);
				Empleado gloria = new Empleado("Gloria", "3", 3, jefe);
				Empleado mauro = new Empleado("Mauro", "4", 4, analista);
				Empleado mari = new Empleado("Mari", "5", 5, analista);
				Empleado edison = new Empleado("Edison", "6", 6, gerente);
				Empleado wil = new Empleado("Wil", "7", 7, analista);
				Empleado gio = new Empleado("Gio", "8", 8, analista);
				
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
				Nomina nominaAgosto = new Nomina(1, empleados, fechaNomina);
				
				int valorNominaEsperado = 32000000;
		
		//Ejecuci�n de acci�n
		
				int valorNominaObtenido = nominaAgosto.calcularNomina();
				System.out.println("El valor total de la n�mina en la fecha " + 
						fechaNomina + " es: " + valorNominaObtenido);
		
		//Validaci�n de resultado
				assertEquals(valorNominaEsperado, valorNominaObtenido);
	}

	*/

}
