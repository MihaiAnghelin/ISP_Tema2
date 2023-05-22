package work;

import java.util.ArrayList;
import java.util.List;

public class Consultatie {
    private String dataConsultatie;
    private List<Serviciu> servicii = new ArrayList<Serviciu>();

    public Consultatie() {
        this.dataConsultatie = "Necunoscut";
    }

    public Consultatie(String dataConsultatie) {
        this.dataConsultatie = dataConsultatie;
    }

    public String getDataConsultatie() {
        return dataConsultatie;
    }

    public void setDataConsultatie(String dataConsultatie) {
        this.dataConsultatie = dataConsultatie;
    }

    public void afisare() {
        System.out.println("Data consultatie: " + dataConsultatie);
        afisareServicii();
    }

    public void adaugaServiciu(Serviciu serviciu) {
        servicii.add(serviciu);
    }

    public void afisareServicii() {
        for (Serviciu serviciu : servicii) {
            serviciu.afisare();
        }
    }

    public float calcularePret() {
        float costTotal = 0;
        for (Serviciu serviciu : servicii) {
            costTotal += serviciu.getPret();
        }
        return costTotal;
    }
}
