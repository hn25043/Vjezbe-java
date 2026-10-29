import java.util.ArrayList;

public class Destinacija {
	
	private String naziv, draza;
	private int ocjena, udaljenostKm, brojPosjeta;

	public Destinacija(String naziv, String draza, int ocjena, int udaljenostKm, int brojPosjeta) {
		this.naziv = naziv;
		this.draza = draza;
		this.ocjena = ocjena;
		this.udaljenostKm = udaljenostKm;
		this.brojPosjeta = brojPosjeta;
	}
	
	public Destinacija() { // Defaultni parametri
		this.naziv = "default";
		this.draza = "default";
		this.ocjena = 5;
		this.udaljenostKm = 1000;
		this.brojPosjeta = 100;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getDraza() {
		return draza;
	}

	public void setDraza(String draza) {
		this.draza = draza;
	}

	public int getOcjena() {
		return ocjena;
	}

	public void setOcjena(int ocjena) {
		this.ocjena = ocjena;
	}

	public int getUdaljenostKm() {
		return udaljenostKm;
	}

	public void setUdaljenostKm(int udaljenostKm) {
		this.udaljenostKm = udaljenostKm;
	}

	public int getBrojPosjeta() {
		return brojPosjeta;
	}

	public void setBrojPosjeta(int brojPosjeta) {
		this.brojPosjeta = brojPosjeta;
	}
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		
		
		

	}

}
