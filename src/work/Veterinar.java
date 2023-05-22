package work;

import java.util.ArrayList;
import java.util.List;

public class Veterinar {
    private String nume;
    private String telefon;

    public List<FisaMedicala> fiseMedicale = new ArrayList<FisaMedicala>();
    public List<Consultatie> consultatii = new ArrayList<Consultatie>();

    public Veterinar() {
        this.nume = "Necunoscut";
        this.telefon = "Necunoscut";
    }

    public Veterinar(String nume, String telefon) {
        this.nume = nume;
        this.telefon = telefon;
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
        System.out.println("Veterinar: ");
        System.out.println("Nume: " + nume);
        System.out.println("Telefon: " + telefon);
    }

    public void creareFisaMedicala(FisaMedicala fisaMedicala) {
        fiseMedicale.add(fisaMedicala);
    }

    public void afisareFiseMedicale() {
        for (FisaMedicala fisaMedicala : fiseMedicale) {
            fisaMedicala.afisare();
            System.out.println();
        }
    }

    public void actualizeazaFisaMedicala(FisaMedicala fisaMedicala, Consultatie consultatie) {
        fisaMedicala.adaugaConsultatie(consultatie);
    }

    public void inregistrareConsultatie(Consultatie consultatie) {
        consultatii.add(consultatie);
    }

    public void afisareConsultatii() {
        for (Consultatie consultatie : consultatii) {
            consultatie.afisare();
        }
    }


}
