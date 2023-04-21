package co.edu.uco.publiuco.crosscutting;

public class Validaciones {
	public boolean esVaciaONulaLaCadena (String cadena) {
		return cadena == null || "".equals(cadena.trim().intern());
	}
}
