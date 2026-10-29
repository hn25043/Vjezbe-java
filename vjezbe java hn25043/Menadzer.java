
public class Menadzer extends Zaposleni {
	
	private double osnovica;
	private double bonus;
	
	
	
	public Menadzer(int iD, String ime, String prezime, int plataPoSatu, int ukupanBrojSati, double plata,
			double prekovremeniSati, double osnovica, double bonus) {
		super(iD, ime, prezime, plataPoSatu, ukupanBrojSati, plata, prekovremeniSati);
		this.osnovica = osnovica;
		this.bonus = bonus;
	}

	


	public double getOsnovica() {
		return osnovica;
	}




	public void setOsnovica(double osnovica) {
		this.osnovica = osnovica;
	}




	public double getBonus() {
		return bonus;
	}




	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	
	public void izracunajPlatu() {
		this.setPlata(4 * this.getOsnovica() * this.getUkupanBrojSati() + this.getPlataPoSatu() + this.bonus);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
