
public class HemijskiProizvodi extends Proizvod {
	
	private float temperatura;
	private boolean zapaljiv;
	
	
	

	public HemijskiProizvodi(String opisProizvoda, String barKod, String zemljaUvoza, int godinaProizvodnje,
			float uvoznaCijena, float temperatura, boolean zapaljiv) {
		super(opisProizvoda, barKod, zemljaUvoza, godinaProizvodnje, uvoznaCijena);
		this.temperatura = temperatura;
		this.zapaljiv = zapaljiv;
	}




	public float getTemperatura() {
		return temperatura;
	}




	public void setTemperatura(float temperatura) {
		this.temperatura = temperatura;
	}




	public boolean isZapaljiv() {
		return zapaljiv;
	}




	public void setZapaljiv(boolean zapaljiv) {
		this.zapaljiv = zapaljiv;
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	
	
	public void izracunajCijenu() {
		if (this.zapaljiv) {
			this.setUvoznaCijena(this.getUvoznaCijena()*1.125);
		} else {
			this.setUvoznaCijena(this.getUvoznaCijena()*1.1);
		}
	}




	@Override
	public String toString() {
		return "HemijskiProizvodi [temperatura=" + temperatura + ", zapaljiv=" + zapaljiv + ", uvoznaCijena="
				+ uvoznaCijena + ", getTemperatura()=" + getTemperatura() + ", isZapaljiv()=" + isZapaljiv()
				+ ", getOpisProizvoda()=" + getOpisProizvoda() + ", getBarKod()=" + getBarKod() + ", getZemljaUvoza()="
				+ getZemljaUvoza() + ", getGodinaProizvodnje()=" + getGodinaProizvodnje() + ", getUvoznaCijena()="
				+ getUvoznaCijena() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
