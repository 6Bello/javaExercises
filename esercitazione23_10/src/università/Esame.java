package università;
import java.time.LocalDate;
import java.util.Scanner;
public class Esame {
	private LocalDate dataEsame;
	private int codiceCorso;
	private String nomeCorso;
	private int crediti;
	private char tipo;
	private int voto;
	private boolean lode;
	
	private int takeYearFromString(String data){
		int year = 0;
		System.out.println(data);
		for(int i=1; i<5; i++) {
			System.out.println(data.substring(i, i+1));
			if(data.substring(i, i+1).equals("/")){
				year = Integer.parseInt(data.substring(0, i));
				System.out.println("anno: " + year);
				break;
			}
		}
		return year;
	}
	
	private int takeMonthFromString(String data){
		int month = 0;
		System.out.println(data);
		int yearPassed = -1;
		for(int i=2; i<8; i++) {
			System.out.println(data.substring(i, i+1));
			if(data.substring(i, i+1).equals("/")){
				if(yearPassed==-1) yearPassed= i;
				else {
					month = Integer.parseInt(data.substring(yearPassed + 1, i));
					System.out.println("mese: " + month);
					break;
				}
			}
		}
		return month;
	}
	
	private int takeDayFromString(String data){
		int day = 0;
		System.out.println(data);
		for(int i=data.length()-2; i>3; i--) {
			System.out.println(data.substring(i, i+1));
			if(data.substring(i, i+1).equals("/")){
				day = Integer.parseInt(data.substring(i+1), data.length());
				System.out.println("giorno: " + day);
				break;
			}
		}
		return day;
	}
	
	//esame di tipo non voto
	Esame(String newDataEsame, int newCodiceCorso, String newNomeCorso, int newCrediti ){
		tipo = 'I';
		dataEsame = LocalDate.of(takeYearFromString(newDataEsame), takeMonthFromString(newDataEsame), takeDayFromString(newDataEsame));
		codiceCorso = newCodiceCorso;
		nomeCorso = newNomeCorso;
		crediti = newCrediti;
	}
	
	//esame di tipo voto
	Esame(String newDataEsame, int newCodiceCorso, String newNomeCorso, int newCrediti, int newVoto ){
		tipo = 'V';
		dataEsame = LocalDate.of(takeYearFromString(newDataEsame), takeMonthFromString(newDataEsame), takeDayFromString(newDataEsame));
		codiceCorso = newCodiceCorso;
		nomeCorso = newNomeCorso;
		crediti = newCrediti;
		voto = newVoto;		
		verificaLode();
	}
	
	void verificaLode() {
		if(voto==30) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("metti V se hai ricevuto la lode");
			if(scanner.next().charAt(0) == 'V') {
				scanner.close();
				lode = true;
				return;
			}else scanner.close();
		}
		lode = false;
	}
	
	void printEsame() {
		String esito;
		if(tipo=='V') {
			String messLode = "";
			if(lode) messLode = " con lode";
			esito = "esame del " + dataEsame + " codiceCorso(" + codiceCorso + ")" + " tipo: con voto, terminato con " + voto + messLode;
			System.out.println(esito);
			return;
		}else {
			esito = "esame del " + dataEsame + " codiceCorso(" + codiceCorso + ")" + " tipo: senza voto";
			System.out.println(esito);
			return;
		}
	}
}
