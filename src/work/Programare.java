package work;

public class Programare {
    private String data;
    private Serviciu serviciu;
    private Proprietar proprietar;
    private Veterinar veterinar;

    public Programare(String dataProgramare, Serviciu serviciu, Proprietar proprietar, Veterinar veterinar) {
        this.data = dataProgramare;
        this.serviciu = serviciu;
        this.proprietar = proprietar;
        this.veterinar = veterinar;
    }

    public Programare() {
        this.data = "Necunoscut";
        this.serviciu = new Serviciu();
        this.proprietar = new Proprietar();
        this.veterinar = new Veterinar();
    }

    public String getData() {
        return data;
    }

    public void setData(String dataProgramare) {
        this.data = dataProgramare;
    }

    public void selectareServiciuPrincipal(Serviciu serviciu) {
        this.serviciu = serviciu;
    }

    public Serviciu getServiciu() {
        return serviciu;
    }

    public Proprietar getProprietar() {
        return proprietar;
    }

    public Veterinar getVeterinar() {
        return veterinar;
    }

    public void afisare() {
        System.out.println("Data programare: " + data);
        proprietar.afisare();
        System.out.println();
        veterinar.afisare();
        System.out.println();
        serviciu.afisare();
        System.out.println();
    }


}
