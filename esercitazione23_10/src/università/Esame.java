package università;

import java.util.Date;
import java.util.Scanner;
public class Esame {
	private Date dataEsame;
	private int codiceCorso;
	private String nomeCorso;
	private int crediti;
	private char tipo;
	private int voto;
	private boolean lode;
	
	//esame di tipo non voto
	Esame(String newDataEsame, int newCodiceCorso, String newNomeCorso, int newCrediti, char newTipo ){
		if(newTipo == 'I') {
			System.out.println("se l'esame è con voto inserire anceh il voto e se la lode c'è");
			return;
		}
		dataEsame = new Date(newDataEsame);
		codiceCorso = newCodiceCorso;
		nomeCorso = newNomeCorso;
		crediti = newCrediti;
		tipo = newTipo;
	}
	
	//esame di tipo voto
	Esame(String newDataEsame, int newCodiceCorso, String newNomeCorso, int newCrediti, char newTipo, int newVoto ){
		dataEsame = new Date(newDataEsame);
		codiceCorso = newCodiceCorso;
		nomeCorso = newNomeCorso;
		crediti = newCrediti;
		tipo = newTipo;
		voto = newVoto;
		if(voto==30) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("metti V se hai ricevuto la lode");
			if(scanner.next().charAt(0) == 'V') {
				lode = true;
			}else lode = false;
		}else lode = false;
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

