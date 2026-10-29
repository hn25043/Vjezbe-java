import java.time.LocalDate;

public class Hrana extends Proizvod {
	
	private double brojKalorija;
	private LocalDate rokUpotrebe;

	public double getBrojKalorija() {
		return brojKalorija;
	}

	public void setBrojKalorija(double brojKalorija) {
		this.brojKalorija = brojKalorija;
	}

	public LocalDate getRokUpotrebe() {
		return rokUpotrebe;
	}

	public void setRokUpotrebe(LocalDate rokUpotrebe) {
		this.rokUpotrebe = rokUpotrebe;
	}

	public Hrana(String opisProizvoda, String barKod, String zemljaUvoza, int godinaProizvodnje, float uvoznaCijena,
			double brojKalorija, LocalDate rokUpotrebe) {
		super(opisProizvoda, barKod, zemljaUvoza, godinaProizvodnje, uvoznaCijena);
		this.brojKalorija = brojKalorija;
		this.rokUpotrebe = rokUpotrebe;
	}
	
	public void izracunajCijenu() {
		if (rokUpotrebe.isBefore(LocalDate.now().plusMonths(6))) {
			this.setUvoznaCijena(this.getUvoznaCijena()*1.05);
		} else {
			this.setUvoznaCijena(this.getUvoznaCijena()*1.1);
		}
	}

	@Override
	public String toString() {
		return "Hrana [brojKalorija=" + brojKalorija + ", rokUpotrebe=" + rokUpotrebe + ", uvoznaCijena=" + uvoznaCijena
				+ ", getBrojKalorija()=" + getBrojKalorija() + ", getRokUpotrebe()=" + getRokUpotrebe()
				+ ", getOpisProizvoda()=" + getOpisProizvoda() + ", getBarKod()=" + getBarKod() + ", getZemljaUvoza()="
				+ getZemljaUvoza() + ", getGodinaProizvodnje()=" + getGodinaProizvodnje() + ", getUvoznaCijena()="
				+ getUvoznaCijena() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
