import java.util.ArrayList;

public class TestnaKlasa {
	
	public static void sortiranje(ArrayList<Destinacija> destinacije) {
		destinacije.sort((d1, d2) -> Integer.compare(d2.getOcjena(), d1.getOcjena()));
	}
	
	
	// Kada vracamo 1 listu ne mora ArrayList<>
	public static Destinacija najvisePosjeta(ArrayList<Destinacija> destinacije) {
		Destinacija max = destinacije.get(0);
		for (int i=1; i < destinacije.size(); i++) {
			if(destinacije.get(i).getBrojPosjeta() > max.getBrojPosjeta()) {
				max = destinacije.get(i);
			}
		}
		
		return max;
	}
	
 	public static ArrayList<Destinacija> filtriraj(ArrayList<Destinacija> destinacije) {
 		
 		ArrayList<Destinacija> rezultat = new ArrayList<Destinacija>();
 		
 		for(Destinacija a: destinacije) {
 			if(a.getOcjena() >= 8 && a.getUdaljenostKm() <= 1000) {
 				rezultat.add(a);
 			}
 		}
 		
 		return rezultat;
 		
 	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		ArrayList<Destinacija> destinacije = new ArrayList <Destinacija>();
		Destinacija d1 = new Destinacija("Barcelona", "Spanija", 10, 2500, 20000000);
		Destinacija d2 = new Destinacija("Pariz", "Francuska", 9, 500, 20000);
		Destinacija d3 = new Destinacija();
		destinacije.add(d1); // dodajemo destinaciju u listi destinacije
		destinacije.add(d2);
		destinacije.add(d3);
		
		
		ArrayList<Destinacija> rez = new ArrayList<Destinacija>();
		
		rez = filtriraj(destinacije);
		
		for(Destinacija a: rez) {
			System.out.println(a.getNaziv());
		}
		
		System.out.println(najvisePosjeta(destinacije).getNaziv());
		
		sortiranje(destinacije);
		
		for(Destinacija a: sortiranje) {
			System.out.println(a.getNaziv());
		}

	}

}
