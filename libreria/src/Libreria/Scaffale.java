package Libreria;

import java.util.ArrayList;

public class Scaffale {
    private int nLibri = 0;
    private float lunghezza_cm = 0;
    private ArrayList<Libro> libri = new ArrayList<Libro>();

    Scaffale(float lunghezza_cm){
        this.lunghezza_cm = lunghezza_cm;
    }

    public float getLunghezza(){
        return lunghezza_cm;
    }
    public void aggiungiLibro(int id, String titolo, String autore, String editore, float larghezza_cm){
        libri.add(new Libro(id, titolo, autore, editore, larghezza_cm));
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
    }

    private void ordinamentoScaffale(){
        int sizeLibri = libri.size();
        for(int i = 0; i<sizeLibri; i++)  {
            Libro libro = libri.get(i);
            int idLibro = libro.getIdLibro()
            int idLibroSenzaNScaffale = Integer.parseInt(Integer.toString(idLibro.substring(1)));
            if(idLibroSenzaNScaffale>sizeLibri){
                libro.setIdLibro(idLibro++);
            }
        }
    }
}
