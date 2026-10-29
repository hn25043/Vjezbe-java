import java.util.ArrayList;

public class Restoran {
	
	private String naziv;
	private String adresa;
	private int pib;
	private ArrayList<Zaposleni> zaposleni = new ArrayList<>();
	
	

	public Restoran(String naziv, String adresa, int pib, ArrayList<Zaposleni> zaposleni) {
		this.naziv = naziv;
		this.adresa = adresa;
		this.pib = pib;
		this.zaposleni = zaposleni;
	}



	public String getNaziv() {
		return naziv;
	}




	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}




	public String getAdresa() {
		return adresa;
	}




	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}




	public int getPib() {
		return pib;
	}




	public void setPib(int pib) {
		this.pib = pib;
	}




	public ArrayList<Zaposleni> getZaposleni() {
		return zaposleni;
	}




	public void setZaposleni(ArrayList<Zaposleni> zaposleni) {
		this.zaposleni = zaposleni;
	}


	public void dodajZaposlenog(Zaposleni z) {
		zaposleni.add(z);
	}
	
	public void brisiZaposlenog(Zaposleni z) {
		zaposleni.remove(z.getID());
	}
	
	public void nadjiZaposlenog(int id) {
		for(Zaposleni z: this.zaposleni) {
			if(z.getID() == id) {
				System.out.println(z.getIme());
			}
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Zaposleni> zaposleni = new ArrayList<>();
		
		Konobar konobar1 = new Konobar(1, "Marko", "Markovic", 40, 40, 0, 15);
		Kuvar kuvar1 = new Kuvar(2, "Marko", "Ivanovic", 40, 40, 0, 1500);
		
		Restoran r1 = new Restoran("Astoria", "City Kvart", 123, zaposleni);
		r1.dodajZaposlenog(kuvar1);
		r1.dodajZaposlenog(konobar1);
	}

}
