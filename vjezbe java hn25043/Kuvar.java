
public class Kuvar extends Zaposleni {
	
	public int iznos;

	public Kuvar(int iD, String ime, String prezime, int plataPoSatu, int ukupanBrojSati, double plata,
			double prekovremeniSati, int iznos) {
		super(iD, ime, prezime, plataPoSatu, ukupanBrojSati, plata, prekovremeniSati);
		this.iznos = 1500;
	}

	public int getIznos() {
		return iznos;
	}

	public void setIznos(int iznos) {
		this.iznos = iznos;
	}
	
	public void izracunajPlatu() {
		this.setPlata(this.iznos + 4 * this.getUkupanBrojSati() * this.getPlataPoSatu());
	}
	
	

}
