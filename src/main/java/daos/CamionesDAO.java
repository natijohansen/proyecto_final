package daos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import exceptions.BaseDeDatosException;
import modelo.Camion;

public class CamionesDAO {

	public Camion getCamion(String patente) throws BaseDeDatosException {
		String query = "select tara, modelo, num_chasis, KM_recorridos from camion where patente = ?";
		PreparedStatement statement = null;

		
		try {
			statement = createStatement(query);
			statement.setString(1, patente);

			ResultSet resultadoQuery = statement.executeQuery();

			boolean hayCamiones = resultadoQuery.next();

			// patron guard
			if (!hayCamiones) {
				throw new IllegalArgumentException("el camion no existe");
			}

			// te traes los attr --> puedo hacer esto porque llame al next arriba
			String tara = resultadoQuery.getString("tara");
			String modelo = resultadoQuery.getString("modelo");
			String chasis = resultadoQuery.getString("num_chasis");
			double kilometraje = resultadoQuery.getDouble("KM_recorridos");
			
			// creas camion y devolves
			return new Camion(patente, tara, modelo, chasis, kilometraje);
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			throw new BaseDeDatosException(e);
		} 
		
	}
	
	 // API REST (JSON)
	 // Servlets & JSP
	
	
//	public void la() {
//		try {
//			getCamion("");
//		} catch (BaseDeDatosException e) {
//			
//		} catch (CamionNoEncontradoException e) {
//			
//		}
//	}
//	
	public void saveCamion(Camion camion) {

	}

	public void updateCamion(Camion camion) {

	}

	public List<Camion> getAllCamiones() {

		return null;
	}

	public void deleteCamion(String patente) {

	}

	private PreparedStatement createStatement(String sql) {
		return null;
	}
}
