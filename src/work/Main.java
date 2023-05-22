package work;

public class Main {
    public static void main(String[] args) {
        Proprietar proprietarIon = new Proprietar("Ion", "0740123456");
        Proprietar proprietarVasile = new Proprietar("Vasile", "0736123456");

        Veterinar veterinar = new Veterinar("Marcel", "0722123456");

        Cabinet cabinet = new Cabinet();
        cabinet.creareServiciu(new Serviciu("Analize", 100));
        cabinet.creareServiciu(new Serviciu("Vaccin", 50));
        cabinet.creareServiciu(new Serviciu("Deparazitare", 30));
        cabinet.creareServiciu(new Serviciu("Verificare", 150));

        Animal animal1 = new Animal(
                Specie.Canidae,
                "Golden Retriever",
                Sex.Feminin,
                2,
                10000,
                "Rex",
                proprietarIon
        );
        Animal animal2 = new Animal(
                Specie.Felina,
                "British Short-hair",
                Sex.Feminin,
                1,
                5000,
                "Miau",
                proprietarVasile
        );

        cabinet.inregistrareAnimal(animal1);
        cabinet.inregistrareAnimal(animal2);

        Programare programare1 = new Programare(
                "01.01.2021",
                cabinet.getServiciu("Analize"),
                proprietarIon,
                veterinar
        );

        Programare programare2 = new Programare(
                "02.01.2021",
                cabinet.getServiciu("Vaccin"),
                proprietarVasile,
                veterinar
        );

        cabinet.programareOnline(programare1);
        cabinet.programareOnline(programare2);

        System.out.println("Afisare programari:");
        cabinet.afisareProgramari();

        System.out.println("Afisare programari dupa veterinar:");
        cabinet.afisareProgramari(veterinar);

        System.out.println("Afisare programari dupa proprietar Ion:");
        cabinet.afisareProgramari(proprietarIon);

        System.out.println("Afisare programari dupa data:");
        cabinet.afisareProgramari("01.01.2021");


        Consultatie consultatie1 = new Consultatie("01.01.2021");
        consultatie1.adaugaServiciu(cabinet.getServiciu("Analize"));
        consultatie1.adaugaServiciu(cabinet.getServiciu("Vaccin"));

        float pretConsultatie1 = consultatie1.calcularePret();
        System.out.println("Pret consultatie 1: " + pretConsultatie1);

        FisaMedicala fisaMedicala1 = new FisaMedicala("01.01.2021", animal1);
        fisaMedicala1.adaugaConsultatie(consultatie1);
        veterinar.creareFisaMedicala(fisaMedicala1);


        Consultatie consultatie2 = new Consultatie("02.01.2021");
        consultatie2.adaugaServiciu(cabinet.getServiciu("Analize"));
        consultatie2.adaugaServiciu(cabinet.getServiciu("Vaccin"));
        consultatie2.adaugaServiciu(cabinet.getServiciu("Deparazitare"));

        float pretConsultatie2 = consultatie2.calcularePret();
        System.out.println("Pret consultatie 2: " + pretConsultatie2);

        System.out.println();

        FisaMedicala fisaMedicala2 = new FisaMedicala("02.01.2021", animal2);
        fisaMedicala2.adaugaConsultatie(consultatie2);
        veterinar.creareFisaMedicala(fisaMedicala2);

        System.out.println("Afisare fise medicale:");
        veterinar.afisareFiseMedicale();
    }

}