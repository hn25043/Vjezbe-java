import java.util.ArrayList;
import java.util.Scanner;

public class Student {

	private String ime;
	private String prezime;
	private String brojIndeksa;
	private String adresa;
	private float brojBodova;
	private boolean polozioIliNe;
	private static float prolazakNaIspitu;
	
	
	
	
	public Student(String ime, String prezime, String brojIndeksa, String adresa, float brojBodova) {
		this.ime = ime;
		this.prezime = prezime;
		this.brojIndeksa = brojIndeksa;
		this.adresa = adresa;
		this.brojBodova = brojBodova;
		this.polozioIliNe = false;
	}
	
	public Student() {
		this.ime = "";
		this.prezime = "";
		this.brojIndeksa = "";
		this.adresa = "";
		this.brojBodova = 0;
		this.polozioIliNe = false;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getBrojIndeksa() {
		return brojIndeksa;
	}

	public void setBrojIndeksa(String brojIndeksa) {
		this.brojIndeksa = brojIndeksa;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public float getBrojBodova() {
		return brojBodova;
	}

	public void setBrojBodova(float brojBodova) {
		this.brojBodova = brojBodova;
	}

	public boolean isPolozioIliNe() {
		return polozioIliNe;
	}

	public void setPolozioIliNe(boolean polozioIliNe) {
		this.polozioIliNe = polozioIliNe;
	}

	public static float getProlazakNaIspitu() {
		return prolazakNaIspitu;
	}

	public static void setProlazakNaIspitu(float prolazakNaIspitu) {
		Student.prolazakNaIspitu = prolazakNaIspitu;
	}
	
	public void studentInfo() {
		System.out.println(ime + " " + prezime + " " + brojIndeksa + " " + adresa + " " + brojBodova + ".");
	}
	
	public void azurirajPolozioIliNe() {
		if (this.getBrojBodova() >= Student.prolazakNaIspitu) {
			this.setPolozioIliNe(true);
		} else {
			this.setPolozioIliNe(false);
		}
	}
	
	// Pravimo metodu aaaa to je mtoda staticka koja pozivamo u mainu
	public static ArrayList<Student> polozili(ArrayList<Student> a, int b) {
		ArrayList<Student> r = new ArrayList<Student>();
		for (Student student: a) {
			if (student.polozioIliNe && b == 1) {
				r.add(student);
			} else if (student.polozioIliNe == false && b == 0) {
				r.add(student);
			}
		}
		return r;
	}
	
	public static ArrayList<Student> istaUlica(ArrayList<Student> a, String ulica) {
		ArrayList<Student> r = new ArrayList<Student>();
		for (Student student: a) {
			if (student.adresa.startsWith(ulica)) {
				r.add(student);
			}
		}
		return r;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Student> studenti = new ArrayList<Student>();
		
		System.out.println("Unesi bodove za prolazak na ispitu: ");
		Student.setProlazakNaIspitu(sc.nextFloat());
		
		// Napravi for loop za ovo
//		Student student1 = new Student("Aleksandar", "Stanisic", "25/141", "Podgoricka 58", 98);
//		Student student2 = new Student("Petar", "Krgusic", "24/222", "Podgoricka 56", 60);
//		Student student3 = new Student("Nikola", "Belamaric", "25/111", "Podgoricka 80", 45);
//		Student student4 = new Student("Paradigma", "Senzorkol", "25/043", "Kotorska bb", 20);
//		
//		student1.azurirajPolozioIliNe();
//		student2.azurirajPolozioIliNe();
//		student3.azurirajPolozioIliNe();
//		student4.azurirajPolozioIliNe();
//		
//		studenti.add(student1);
//		studenti.add(student2);
//		studenti.add(student3);
//		studenti.add(student4);
		
		System.out.println("Unesi broj studenata: ");
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i ++) {
			System.out.println("Unesi informacije studenta broj" + Math.addExact(i, 1) + "(ime, prezime, broj indeksa, adresa, bodovi)");
			Student student = new Student(sc.next(), sc.next(), sc.next(), sc.next(), sc.nextFloat());
			student.azurirajPolozioIliNe();
			studenti.add(student);
		}
		
		ArrayList<Student> studentiPolozili = Student.polozili(studenti, 1);
		for (Student student: studentiPolozili) {
			student.studentInfo();
		}
		
		System.out.println("Unesi potraga za ulicu: ");
		ArrayList<Student> istaUlicica = Student.istaUlica(studenti, sc.next());
		for(Student student: istaUlicica) {
			student.studentInfo();
		}

	}

}
