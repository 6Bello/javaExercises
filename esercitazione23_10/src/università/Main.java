package università;

public class Main {
	
	public static void main(String[] args) {
		
		Persona p1 = new Persona("Rossi", "Mario", "1990/12/2", "Via del corso", "Roma");
		p1.printPersona();
		Esame esame1 = new Esame("190/1/1", 1221, "primo esame", 10);
		Esame esame2 = new Esame("191/1/1", 2112, "secondo esame", 10, 10);
		esame1.printEsame();
		esame2.printEsame();		
	}
}
