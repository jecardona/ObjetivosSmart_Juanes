package clasesJava;

public class FactoriaCargos {
	
	public static Cargo getCargo(String cargo){
		switch (cargo) {
			case "Analista":
				return new CargoAnalista();
			case "Jefe":
				return new CargoJefe();
			case "Gerente":
				return new CargoGerente();
			default:
	             throw new IllegalArgumentException("No es válido el cargo: " + cargo);
		}
	}

}
