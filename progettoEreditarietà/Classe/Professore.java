package Classe;
import java.time.*;

public class Professore extends Persona {
    String materia;
    Professore(String cognome, String nome, LocalDate dataNascita, int telefono, String materia){
        this.cognome= cognome;
        this.nome = nome;
        this.dataNascita = dataNascita;
        this.telefono = telefono;
        this.materia = materia;
    }
}
