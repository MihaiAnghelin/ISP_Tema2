package work;

import java.util.ArrayList;
import java.util.List;

public class FisaMedicala {
    private String dataIntocmire;
    private List<Consultatie> consultatii = new ArrayList<Consultatie>();
    private Animal animal;

    public FisaMedicala(String dataIntocmire, Animal animal) {
        this.dataIntocmire = dataIntocmire;
        this.animal = animal;

    }

    public String getDataIntocmire() {
        return dataIntocmire;
    }

    public void setDataIntocmire(String dataIntocmire) {
        this.dataIntocmire = dataIntocmire;
    }

    public void afisare() {
        System.out.println("Data intocmire: " + dataIntocmire);
        afisareConsultatii();
    }

    public void adaugaConsultatie(Consultatie consultatie) {
        consultatii.add(consultatie);
    }

    public void afisareConsultatii() {
        for (Consultatie consultatie : consultatii) {
            consultatie.afisare();
        }
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}
