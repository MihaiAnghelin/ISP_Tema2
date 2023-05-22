package work;

import java.util.ArrayList;
import java.util.List;

public class Cabinet {
    private List<Programare> programari = new ArrayList<Programare>();
    public List<Serviciu> servicii = new ArrayList<Serviciu>();
    public List<Animal> animale = new ArrayList<Animal>();


    public void programareOnline(Programare programare) {
        programari.add(programare);
    }

    public void afisareProgramari() {
        for (Programare programare : programari) {
            programare.afisare();
        }
    }

    public void afisareProgramari(Veterinar veterinar) {
        for (Programare programare : programari) {
            if (programare.getVeterinar().equals(veterinar)) {
                programare.afisare();
            }
        }
    }

    public void afisareProgramari(Proprietar proprietar) {
        for (Programare programare : programari) {
            if (programare.getProprietar().equals(proprietar)) {
                programare.afisare();
            }
        }
    }

    public void afisareProgramari(String data) {
        for (Programare programare : programari) {
            if (programare.getData().equals(data)) {
                programare.afisare();
            }
        }
    }

    public void creareServiciu(Serviciu serviciu) {
        servicii.add(serviciu);
    }

    public void afisareServicii() {
        for (Serviciu serviciu : servicii) {
            serviciu.afisare();
        }
    }

    public void inregistrareAnimal(Animal animal) {
        animale.add(animal);
    }

    public void afisareAnimale() {
        for (Animal animal : animale) {
            animal.afisare();
        }
    }

    public Serviciu getServiciu(String numeServiciu) {
        for (Serviciu serviciu : servicii) {
            if (serviciu.getNume().equals(numeServiciu)) {
                return serviciu;
            }
        }
        return null;
    }
}
