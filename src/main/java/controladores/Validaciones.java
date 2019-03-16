package controladores;

import exceptions.PatenteInvalidaException;

public class Validaciones {

	public static void validarPatente(String patente) throws PatenteInvalidaException {
		if (patente == null) {
			throw new PatenteInvalidaException("la patente es nula");
		}
		
		if (patente.isEmpty()) {
			
		}
		
	}
	
	
}
