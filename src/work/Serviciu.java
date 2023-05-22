package work;

public class Serviciu {
    private String nume;
    private float pret;


    public Serviciu() {
        this.nume = "Necunoscut";
        this.pret = 0;
    }

    public Serviciu(String numeServiciu, int pretServiciu) {
        this.nume = numeServiciu;
        this.pret = pretServiciu;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public float getPret() {
        return pret;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }

    public void afisare() {
        System.out.println("Nume serviciu: " + nume);
        System.out.println("Pret serviciu: " + pret);
    }
}
