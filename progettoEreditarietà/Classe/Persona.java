package Classe;
import java.time.*;

public class Persona {
    String cognome;
    String nome;
    LocalDate dataNascita;
    int telefono;

    public Period getEta(){
        return Period.between(dataNascita, LocalDate.now());
    }

    public void String(){
        System.out.println("nome: "+nome+"+cognome: "+cognome+"+data di nascita: "+dataNascita+"+telefono: "+telefono);
    }
}
