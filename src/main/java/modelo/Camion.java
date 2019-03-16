package modelo;

public class Camion {

	String patente;
	String tara;
	String modelo;
	String chasis;
	double kilometraje;

	public Camion(String patente, String tara, String modelo, String chasis, double kilometraje) {
		this.patente = patente;
		this.tara = tara;
		this.modelo = modelo;
		this.chasis = chasis;
		this.kilometraje = kilometraje;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public String getTara() {
		return tara;
	}

	public void setTara(String tara) {
		this.tara = tara;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getChasis() {
		return chasis;
	}

	public void setChasis(String chasis) {
		this.chasis = chasis;
	}

	public double getKilometraje() {
		return kilometraje;
	}

	public void setKilometraje(double kilometraje) {
		this.kilometraje = kilometraje;
	}

}
