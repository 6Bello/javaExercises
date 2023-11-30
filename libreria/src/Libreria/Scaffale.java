package Libreria;

import java.util.ArrayList;

public class Scaffale {
    private int nLibri = 0;
    private float lunghezza_cm = 0;
    int nScaffale;
    private ArrayList<Libro> libri = new ArrayList<Libro>();
    public Libro getLibro(int idLibro) {
    	for(int i = 0; i<libri.size(); i++) {
    		if(libri.get(i).getIdLibro()==idLibro) {
    			return libri.get(nLibri);    			
    		}
    	}
    	return null;
    }

    Scaffale(int nScaffale, float lunghezza_cm){
    	this.nScaffale = nScaffale;
        this.lunghezza_cm = lunghezza_cm;
    }

    public float getLunghezza(){
        return lunghezza_cm;
    }
    
    public void aggiungiLibro(int id, String titolo, String autore, String editore, float larghezza_cm){
    	int idLibro = Integer.parseInt(nScaffale + id + "");
        libri.add(new Libro(idLibro, titolo, autore, editore, larghezza_cm));
    }
    public void aggiungiLibro(Libro libro){
        libri.add(libro);
    }

    public void eliminaLibro(String nomeLibro){
        for(int i = 0; i<libri.size(); i++){
            if(libri.get(i).getTitolo()==nomeLibro) {
                libri.remove(i);
                return;
            }
        }
    }
    public void eliminaLibro(int idLibro){
        for(int i = 0; i<libri.size(); i++){
            if(libri.get(i).getIdLibro()==idLibro) {
                libri.remove(i);
                return;
            }
        }
        ordinamentoScaffale();
    }

    private void ordinamentoScaffale(){
        int sizeLibri = libri.size();
        for(int i = 0; i<sizeLibri; i++)  {
            Libro libro = libri.get(i);
            int idLibro = libro.getIdLibro();
            int idLibroSenzaNScaffale = Integer.parseInt(Integer.toString(idLibro).substring(1));
            if(idLibroSenzaNScaffale>sizeLibri){
                libro.setIdLibro(idLibro--);
            }
        }
    }
}
