import java.time.LocalDate;
import java.util.ArrayList;

public class proizvodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Garderoba g1 = new Garderoba("majca", "2424232", "Crna Gora", 2026, 15.8f, "Kasmir" ,"zimska");
		HemijskiProizvodi hp1 = new HemijskiProizvodi("prasak","232323232","Spanija", 2026, 13.5f, 24.2f, true);
		Hrana h1 = new Hrana("Pica", "231231231", "Njemacka", 2026, 11, 600, LocalDate.of(2026, 10, 22));
		
		
		ArrayList<Proizvod> lista = new ArrayList<Proizvod>();
		lista.add(g1);
		lista.add(hp1);
		lista.add(h1);
		
		for(Proizvod p:lista) { // Stavis @Override (toString()) u svakoj klasi
			System.out.println(p); // ovo je polimorfizam
		}
		
		// Ne obracunavaju se metode izracunajCijenu
		
		for(Proizvod p:lista) {
			p.izracunajCijenu();
		}
		
		System.out.println();
		
		for(Proizvod p:lista) {
			System.out.println(p);
		}
	}


}
