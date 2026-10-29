
public class Proizvod {
	
	
	private String opisProizvoda;
	private String barKod;
	private String zemljaUvoza;
	private int godinaProizvodnje;
	protected double uvoznaCijena;
	
	public String getOpisProizvoda() {
		return opisProizvoda;
	}

	public void setOpisProizvoda(String opisProizvoda) {
		this.opisProizvoda = opisProizvoda;
	}

	public String getBarKod() {
		return barKod;
	}

	public void setBarKod(String barKod) {
		this.barKod = barKod;
	}

	public String getZemljaUvoza() {
		return zemljaUvoza;
	}

	public void setZemljaUvoza(String zemljaUvoza) {
		this.zemljaUvoza = zemljaUvoza;
	}

	public int getGodinaProizvodnje() {
		return godinaProizvodnje;
	}

	public void setGodinaProizvodnje(int godinaProizvodnje) {
		this.godinaProizvodnje = godinaProizvodnje;
	}

	public double getUvoznaCijena() {
		return uvoznaCijena;
	}

	public void setUvoznaCijena(double uvoznaCijena) {
		this.uvoznaCijena = uvoznaCijena;
	}

	@Override
	public String toString() {
		return "Proizvod [opisProizvoda=" + opisProizvoda + ", barKod=" + barKod + ", zemljaUvoza=" + zemljaUvoza
				+ ", godinaProizvodnje=" + godinaProizvodnje + ", uvoznaCijena=" + uvoznaCijena
				+ ", getOpisProizvoda()=" + getOpisProizvoda() + ", getBarKod()=" + getBarKod() + ", getZemljaUvoza()="
				+ getZemljaUvoza() + ", getGodinaProizvodnje()=" + getGodinaProizvodnje() + ", getUvoznaCijena()="
				+ getUvoznaCijena() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	public Proizvod(String opisProizvoda, String barKod, String zemljaUvoza, int godinaProizvodnje,
			float uvoznaCijena) {
		this.opisProizvoda = opisProizvoda;
		this.barKod = barKod;
		this.zemljaUvoza = zemljaUvoza;
		this.godinaProizvodnje = godinaProizvodnje;
		this.uvoznaCijena = uvoznaCijena;
	}
	
	
	public Proizvod() {
		this.opisProizvoda = "Default";
	}
	
	public void izracunajCijenu() { // placeholder -> Mora da postoji zbog preklapanje sa drugim klasama
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
