package ejemplo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySQLEjemplo {
	private static final String HOST = "jdbc:mysql://localhost:3306/proyectofinal";
	private static final String CONFIG = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	private static final String USER = "admin";
	private static final String PASS = "Nij2991159.";

	public static void main(String args[]) {
		select();
	}

	private static void insert() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(HOST + CONFIG, USER, PASS);

			String insert = "insert into camion (patente, tara, modelo, num_chasis, KM_recorridos) values (?, ?, ?, ?, ?)";

			PreparedStatement statement = connection.prepareStatement(insert);
			statement.setString(1, "patent2");
			statement.setString(2, "tara2");
			statement.setString(3, "modelo2");
			statement.setString(4, "chasis2");
			statement.setDouble(5, 12345);

			statement.execute();
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		} finally {
			try {
				connection.close();
			} catch (Exception e) {
			}
		}

	}

	private static void select() {
		Connection connection = null;
		ResultSet resultSet = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(HOST + CONFIG, USER, PASS);

			Statement statment = connection.createStatement();

			String query = "select patente from camion";
			resultSet = statment.executeQuery(query);

			while (resultSet.next()) {
				String patente = resultSet.getString("patente");
				System.out.println("Camion: " + patente);
			}

		} catch (Exception e) {
			System.err.println(e.getMessage());
		} finally {
			try {
				resultSet.close();
			} catch (Exception e) {
			}
			try {
				connection.close();
			} catch (Exception e) {
			}
		}

	}
}
