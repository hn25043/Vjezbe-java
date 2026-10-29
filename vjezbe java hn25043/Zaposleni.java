
public class Zaposleni {

	private int ID;
	private String ime;
	private String prezime;
	protected int plataPoSatu;
	protected int ukupanBrojSati;
	protected double plata;
	private double prekovremeniSati;
	
	
	public double getPlata() {
		return plata;
	}


	public void setPlata(double plata) {
		this.plata = plata;
	}


	public int getID() {
		return ID;
	}


	public void setID(int iD) {
		ID = iD;
	}


	public String getIme() {
		return ime;
	}


	public void setIme(String ime) {
		this.ime = ime;
	}


	public String getPrezime() {
		return prezime;
	}


	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}


	public int getPlataPoSatu() {
		return plataPoSatu;
	}


	public void setPlataPoSatu(int plataPoSatu) {
		this.plataPoSatu = plataPoSatu;
	}


	public int getUkupanBrojSati() {
		return ukupanBrojSati;
	}


	public void setUkupanBrojSati(int ukupanBrojSati) {
		this.ukupanBrojSati = ukupanBrojSati;
	}
	


	public double getPrekovremeniSati() {
		return prekovremeniSati;
	}


	public void setPrekovremeniSati(double prekovremeniSati) {
		this.prekovremeniSati = prekovremeniSati;
	}


	public Zaposleni(int iD, String ime, String prezime, int plataPoSatu, int ukupanBrojSati, double plata, double prekovremeniSati) {
		super();
		ID = iD;
		this.ime = ime;
		this.prezime = prezime;
		this.plataPoSatu = plataPoSatu;
		this.ukupanBrojSati = ukupanBrojSati;
		this.plata = plata;
		this.prekovremeniSati = prekovremeniSati;
	}

	
	public void Izracunajplata() { // Ovo stavi u konobare
		this.setPlata(this.getPlataPoSatu() * this.getUkupanBrojSati() + this.getPlataPoSatu() + this.getPrekovremeniSati() * 1.2);
	}

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
