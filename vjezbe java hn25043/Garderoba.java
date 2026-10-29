
public class Garderoba extends Proizvod {
	
	private String materijalProizvodnje;
	private String sezona;
	public String getMaterijalProizvodnje() {
		return materijalProizvodnje;
	}
	public void setMaterijalProizvodnje(String materijalProizvodnje) {
		this.materijalProizvodnje = materijalProizvodnje;
	}
	public String getSezona() {
		return sezona;
	}
	public void setSezona(String sezona) {
		this.sezona = sezona;
	}
	public Garderoba(String opisProizvoda, String barKod, String zemljaUvoza, int godinaProizvodnje, float uvoznaCijena,
			String materijalProizvodnje, String sezona) {
		super(opisProizvoda, barKod, zemljaUvoza, godinaProizvodnje, uvoznaCijena);
		this.materijalProizvodnje = materijalProizvodnje;
		this.sezona = sezona;
	}
	
	
	@Override
	public String toString() {
		return "Garderoba [materijalProizvodnje=" + materijalProizvodnje + ", sezona=" + sezona + ", uvoznaCijena="
				+ uvoznaCijena + ", getMaterijalProizvodnje()=" + getMaterijalProizvodnje() + ", getSezona()="
				+ getSezona() + ", getOpisProizvoda()=" + getOpisProizvoda() + ", getBarKod()=" + getBarKod()
				+ ", getZemljaUvoza()=" + getZemljaUvoza() + ", getGodinaProizvodnje()=" + getGodinaProizvodnje()
				+ ", getUvoznaCijena()=" + getUvoznaCijena() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	public void izracunajCijenu() {
		this.setUvoznaCijena(this.getUvoznaCijena() * 1.05); // 2 razlicita nacina 1 dok su atributi private u superklasi
		this.uvoznaCijena = this.getUvoznaCijena() * 1.05; // dok su atributi protected u superklasi
	}

}
