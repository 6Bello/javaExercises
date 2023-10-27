package università;
import java.util.Random;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
	
	public static void main(String[] args) {
		Random random = new Random();
		Libretto libretto1 = new Libretto();
		for(int i=0; i<25; i+=2) {
			int codiceCorso = random.nextInt(9000) + 1000;
			int creditiRandom = random.nextInt(11) + 1;
			libretto1.setEsame(i, dataRandom(), codiceCorso, "corso " + i, creditiRandom);
			codiceCorso = random.nextInt(9000) + 1000;
			creditiRandom = random.nextInt(11) + 1;
			int votoRandom = random.nextInt(30);
			libretto1.setEsame(i+1, dataRandom(), codiceCorso, "corso " + (i+1), creditiRandom, votoRandom, false);
		}
		libretto1.printEsame();
		
	}
	
	public static String dataRandom() {
		Random random = new Random();
		int annoCorso = random.nextInt(23) + 2000;
		int meseCorso = random.nextInt(11) + 1;
		int giornoCorso = random.nextInt(30) + 1;
		if(giornoCorso>=29 && meseCorso==2) giornoCorso = 28;
		String dataRandom = annoCorso + "/" + meseCorso + "/" + giornoCorso;
		return dataRandom;
	}
}
