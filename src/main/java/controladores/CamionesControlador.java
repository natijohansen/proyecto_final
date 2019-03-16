package controladores;

import daos.CamionesDAO;
import exceptions.PatenteInvalidaException;
import modelo.Camion;

public class CamionesControlador {

	private CamionesDAO dao;

	public String crearCamion(String patente, String tara, String modelo, String chasis, double km) {
		try {
			Validaciones.validarPatente(patente);
			Camion nuevoCamion = new Camion(patente, tara, modelo, chasis, km);
			dao.saveCamion(nuevoCamion);

			return "camion creado exitosamente";
		} catch (PatenteInvalidaException e) {
			return "error " + e.getMessage();
		}
	}

}
