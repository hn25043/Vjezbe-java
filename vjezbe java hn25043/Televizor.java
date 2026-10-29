
public class Televizor {
	
	// Enkapsulacija je skrivanje atributa ili javno dostupni atributi (private/public)
	// Geteri i Seteri -> Geteri se koriste za pristup atributima koji su privatni
	private int brojKanala;
	private String nazivKanala;
	private int jacinaZvuka;
	
	public Televizor(int brojKanala, String nazivKanala, int jacinaZvuka) {
		// this. -> Pomocu nje pristupamo vidljivim atributima u klasi u kojoj se nalazimo
		this.brojKanala = brojKanala;
		this.nazivKanala = nazivKanala;
		this.jacinaZvuka = jacinaZvuka;
	}
	
	
	
	public int getBrojKanala() {
		return brojKanala;
	}



	public void setBrojKanala(int brojKanala) {
		if (brojKanala >= 1) {
			this.brojKanala = brojKanala;
		} else {
			System.out.print("Greska, broj kanala mora biti bar 1");
		}
	}



	public String getNazivKanala() {
		return nazivKanala;
	}



	public void setNazivKanala(String nazivKanala) {
		this.nazivKanala = nazivKanala;
	}



	public int getJacinaZvuka() {
		return jacinaZvuka;
	}



	public void setJacinaZvuka(int jacinaZvuka) {
		if (jacinaZvuka >= 0 && jacinaZvuka <=10) {
			this.jacinaZvuka = jacinaZvuka;
		} else {
			System.out.println("Greska, jacina zvuka mora biti izmedju 0 i 10. Trenutna jacina: " + this.jacinaZvuka);
		}
	}

	public void pojacajTon() {
		this.jacinaZvuka = getJacinaZvuka();
		if (this.jacinaZvuka <= 10 && this.jacinaZvuka >= 0) {
			setJacinaZvuka(getJacinaZvuka() + 1);
		}
	}
	
	public void stampa() {
		System.out.println("\nINFO");
		System.out.println("Broj kanala " + this.brojKanala);
		System.out.println("Naziv trenutnog kanala " + this.nazivKanala);
		System.out.println("Jacina zvuka " + this.jacinaZvuka);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Televizor televizor1 = new Televizor(10, "Prvi kanala", 5); // Ime_klase, ime_varijable = new ime_konstruktora(parametri)
//		System.out.print(televizor1.brojKanala); // Geter
		// televizor1.brojKanala = 2 -> Seter
		
//		System.out.println(televizor1.getBrojKanala());
//		televizor1.setBrojKanala(5);
//		System.out.println(televizor1.getBrojKanala());
		for (int i = 0; i < 8; i++) {
			televizor1.pojacajTon();
			System.out.println("Trenutna jacina zvuka: " + televizor1.getJacinaZvuka());
		}
		
		System.out.println();
		televizor1.stampa();
		

		
	}

}
