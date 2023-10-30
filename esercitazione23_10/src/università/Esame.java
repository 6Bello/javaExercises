package università;
import java.time.LocalDate;
import java.util.Scanner;
public class Esame {
	private LocalDate dataEsame;
	public LocalDate getDataEsame() {
		return dataEsame;
	}
	private int codiceCorso;
	public int getCodiceCorso() {
		return codiceCorso;
	}
	private String nomeCorso;
	public String getNomeCorso() {
		return nomeCorso;
	}
	private int crediti;
	public int getCrediti() {
		return crediti;
	}
	private char tipo;
	public char getTipo() {
		return tipo;
	}
	private int voto;
	public int getVoto() {
		return voto;
	}
	private boolean lode;
	public boolean getLode() {
		return lode;
	}
	
	//esame di tipo non voto
	Esame(String newDataEsame, int newCodiceCorso, String newNomeCorso, int newCrediti ){
		tipo = 'I';
		takeFromString takeDate = new takeFromString();
		dataEsame = LocalDate.of(takeDate.takeYearFromString(newDataEsame), takeDate.takeMonthFromString(newDataEsame), takeDate.takeDayFromString(newDataEsame));
		codiceCorso = newCodiceCorso;
		nomeCorso = newNomeCorso;
		crediti = newCrediti;
	}
	
	//esame di tipo voto
	Esame(String newDataEsame, int newCodiceCorso, String newNomeCorso, int newCrediti, int newVoto ){
		tipo = 'V';
		takeFromString takeDate = new takeFromString();
		dataEsame = LocalDate.of(takeDate.takeYearFromString(newDataEsame), takeDate.takeMonthFromString(newDataEsame), takeDate.takeDayFromString(newDataEsame));
		codiceCorso = newCodiceCorso;
		nomeCorso = newNomeCorso;
		crediti = newCrediti;
		voto = newVoto;		
		verificaLode();
	}
	
	//esame di tipo voto con lode aggiunta subito
	Esame(String newDataEsame, int newCodiceCorso, String newNomeCorso, int newCrediti, int newVoto, boolean newLode ){
		tipo = 'V';
		takeFromString takeDate = new takeFromString();
		dataEsame = LocalDate.of(takeDate.takeYearFromString(newDataEsame), takeDate.takeMonthFromString(newDataEsame), takeDate.takeDayFromString(newDataEsame));
		codiceCorso = newCodiceCorso;
		nomeCorso = newNomeCorso;
		crediti = newCrediti;
		voto = newVoto;	
		if(voto==18) lode = newLode;
		else lode = false;
	}
	
	void verificaLode() {
		if(voto==18) {
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
