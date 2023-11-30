package Libreria;

import java.util.ArrayList;

public class Libreria {
    private int nScaffli=0;
    private ArrayList<Scaffale> scaffali = new ArrayList<Scaffale>();

    public void spostaLibro(int idLibro, int newScaffale){
    	int pScaffale = Integer.parseInt(Integer.toString(idLibro).substring(0, 0));
    	Libro libro = scaffali.get(pScaffale-1).getLibro(idLibro);
    	scaffali.get(pScaffale-1).eliminaLibro(idLibro);
    	scaffali.get(newScaffale).aggiungiLibro(libro);
    }

    public void aggiungiLibro(int nScaffale, String titolo, String autore, String editore, float larghezza_cm){
    	scaffali.get(nScaffale-1).aggiungiLibro(scaffali.size(), titolo, autore, editore, larghezza_cm);
    }
    public void aggiungiScaffale(float lunghezza_cm){
    	scaffali.add(new Scaffale(scaffali.size(), lunghezza_cm));
    }
}
