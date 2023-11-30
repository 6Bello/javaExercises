package Libreria;

public class Libro {
    private int idLibro;
    public int getIdLibro(){
        return idLibro;
    }
    void setIdLibro(int idLibro){
        this.idLibro = idLibro;
    }
    private int nScaffale;
    private String titolo;

    public String getTitolo(){
        return titolo;
    }
    private float larghezza_cm;
    private String autore;
    private String editore;

    Libro(int idLibro, String titolo, String autore, String editore, float larghezza_cm){
        this.idLibro = idLibro;
        while (nScaffale>=10){
            this.nScaffale = idLibro/10;
        }
        this.titolo = titolo;
        this.autore = autore;
        this.editore = editore;
        this.larghezza_cm = larghezza_cm;
    }
}
