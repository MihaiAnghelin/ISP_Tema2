package work;

public class Animal {
    private Specie specie;
    private String rasa;
    private Sex sex;
    private Integer varsta; // ani
    private Integer greutate; // in grame
    private String nume;

    private Proprietar proprietar;

    public Animal(Specie specie, String rasa, Sex sex, Integer varsta, Integer greutate, String nume, Proprietar proprietar) {
        this.specie = specie;
        this.rasa = rasa;
        this.sex = sex;
        this.varsta = varsta;
        this.greutate = greutate;
        this.nume = nume;
        this.proprietar = proprietar;
    }

    public Animal() {
        specie = Specie.Canidae;
        rasa = "Necunoscut";
        sex = Sex.Masculin;
        varsta = 0;
        greutate = 0;
        nume = "Necunoscut";
        proprietar = new Proprietar();
    }

    public void afisare() {
        // print all to console
        System.out.println("Nume animal: " + nume);
        System.out.println("Specie: " + specie);
        System.out.println("Rasa: " + rasa);
        System.out.println("Sex: " + sex);
        System.out.println("Varsta: " + varsta);
        System.out.println("Greutate: " + greutate);
    }

    public Specie getSpecie() {
        return specie;
    }

    public void setSpecie(Specie specie) {
        this.specie = specie;
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Integer getVarsta() {
        return varsta;
    }

    public void setVarsta(Integer varsta) {
        this.varsta = varsta;
    }

    public Integer getGreutate() {
        return greutate;
    }

    public void setGreutate(Integer greutate) {
        this.greutate = greutate;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Proprietar getProprietar() {
        return proprietar;
    }

    public void setProprietar(Proprietar proprietar) {
        this.proprietar = proprietar;
    }
}
