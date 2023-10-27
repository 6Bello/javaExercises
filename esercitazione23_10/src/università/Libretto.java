package università;

public class Libretto {
	Persona studente1 = new Persona("Rossi", "Mario", "1990/12/2", "Via del corso", "Roma");
	Esame[] esami = new Esame[20];
	float mediaPonderata = 0;
	
	public int setEsame(int indiceEsame, String newDataEsame, int newCodiceCorso, String newNomeCorso, int newCrediti) {
		if (indiceEsame >= 20) {
			return 0;
		} else {
			esami[indiceEsame] = new Esame(newDataEsame, newCodiceCorso, newNomeCorso, newCrediti);
			setMediaPonderataConUltimoIndice(indiceEsame);
			return 1;
		}
	}
	
	public int setEsame(int indiceEsame, String newDataEsame, int newCodiceCorso, String newNomeCorso, int newCrediti, int newVoto) {
		if (indiceEsame >= 20) {
			return 0;
		} else {
			esami[indiceEsame] = new Esame(newDataEsame, newCodiceCorso, newNomeCorso, newCrediti, newVoto);
			setMediaPonderataConUltimoIndice(indiceEsame);
			return 1;
		}
	}
	
	public int setEsame(int indiceEsame, String newDataEsame, int newCodiceCorso, String newNomeCorso, int newCrediti, int newVoto, boolean newLode) {
		if (indiceEsame >= 20) {
			return 0;
		} else {
			esami[indiceEsame] = new Esame(newDataEsame, newCodiceCorso, newNomeCorso, newCrediti, newVoto, newLode);
			setMediaPonderataConUltimoIndice(indiceEsame);
			return 1;
		}
	}
	
	private void setMediaPonderata() {
		int totaleCrediti = 0;
		int votiPerCrediti = 0;
		for(int i=0; i<20; i++) {
			if(esami[i]!=null) {
				if(esami[i].getTipo()=='V') {
					totaleCrediti+=esami[i].getCrediti();
					votiPerCrediti+=(esami[i].getVoto() * esami[i].getCrediti());
				}
			}
		}
		mediaPonderata = votiPerCrediti / totaleCrediti;
	}
	
	private void setMediaPonderataConUltimoIndice(int indice) {
		int totaleCrediti = 1;
		int votiPerCrediti = 0;
		for(int i=0; i<indice; i++) {
			if(esami[i]!=null) {
				if(esami[i].getTipo()=='V') {
					totaleCrediti+=esami[i].getCrediti();
					votiPerCrediti+=(esami[i].getVoto() * esami[i].getCrediti());
				}
			}
		}
		mediaPonderata = votiPerCrediti / totaleCrediti;
	}

	public void printEsame() {
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Nome Corso | Codice Corso | Data Esame | Tipo | Crediti | Voto | Lode");
		System.out.println("----------------------------------------------------------------------");
		for (int i = 0; i < 20; i++) {
			// Formatta ogni attributo con larghezza specifica
			String nomeCorsoFormatted = String.format("%-10s", esami[i].getNomeCorso());
			String codiceCorsoFormatted = String.format("%-12s", esami[i].getCodiceCorso());
			String dataEsameFormatted = String.format("%-10s", esami[i].getDataEsame());
			String tipoFormatted = String.format("%-4s", esami[i].getTipo());
			String creditiFormatted = String.format("%-7s", esami[i].getCrediti());
			String votoFormatted = String.format("%-4s", esami[i].getVoto());
			String lodeFormatted = String.format("%-4s", esami[i].getLode());

			// Combina gli attributi formattati in una stringa
			String stringaEsame = nomeCorsoFormatted + " | " +	codiceCorsoFormatted + " | " + dataEsameFormatted + " | " +	tipoFormatted + " | " + creditiFormatted + " | " + votoFormatted + " | " + lodeFormatted;

			// Stampa la stringa formattata
			System.out.println(stringaEsame);
			System.out.println("----------------------------------------------------------------------");
		}
		System.out.println("media ponderata degli esami con voto: " + mediaPonderata);
	}
}
