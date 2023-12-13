package Classe;

import java.time.LocalDate;

public class Studente extends Persona {
    int matricola;
    String classe;

    Studente(String cognome, String nome, LocalDate dataNascita, int telefono, int matricola, String classe){
        this.cognome= cognome;
        this.nome = nome;
        this.dataNascita = dataNascita;
        this.telefono = telefono;
        this.matricola = matricola;
        this.classe = classe;
    }
}
