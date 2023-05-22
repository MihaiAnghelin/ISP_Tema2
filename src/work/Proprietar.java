package work;

import java.util.ArrayList;
import java.util.List;

public class Proprietar {
    private String nume;
    private String telefon;

    public Proprietar(String nume, String telefon) {
        this.nume = nume;
        this.telefon = telefon;
    }

    public Proprietar() {
        this.nume = "Necunoscut";
        this.telefon = "Necunoscut";
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public void afisare() {
        System.out.println("Proprietar: ");
        System.out.println("Nume: " + nume);
        System.out.println("Telefon: " + telefon);
    }
}
