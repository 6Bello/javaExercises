package università;

import java.time.LocalDate;

public class Persona {
	private String cognome;
	private String nome;
	private LocalDate dataDiNascita;
	private String indirizzo;
	private String citta;
	private String matricola;
	Persona(String newCognome, String newNome, String newDataDiNascita, String newIndirizzo, String newCitta) {
		cognome = newCognome;
		nome = newNome;
		takeFromString takeDate = new takeFromString();
		dataDiNascita = LocalDate.of(takeDate.takeYearFromString(newDataDiNascita), takeDate.takeMonthFromString(newDataDiNascita), takeDate.takeDayFromString(newDataDiNascita));
		indirizzo = newIndirizzo;
		citta = newCitta;
		matricola = cognome.substring(0, 1) + nome.substring(1, 2) + cognome.substring(cognome.length() - 1) + dataDiNascita.getMonthValue() + citta.substring(0, 2);
	}
	void printPersona(){
		System.out.println("Cognome: " + cognome);
		System.out.println("Nome: " + nome);
		System.out.println("Data di nascita: " + dataDiNascita);
		System.out.println("Indirizzo: " + indirizzo);
		System.out.println("Città: " + citta);
		System.out.println("Matricola: " + matricola);
	}
}