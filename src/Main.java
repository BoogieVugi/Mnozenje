import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        EvidencijaVozila evidencija = new EvidencijaVozila();

        Automobil automobil1 = new Automobil("ZG1256BA", "BMW", 2015, 2);
        Automobil automobil2 = new Automobil("MA5467ED", "Ford", 2018, 4);
        Motocikl motocikl1 = new Motocikl("PU9965EF", "Tomos", 2020, "moped");

        evidencija.dodajVozilo(automobil1);
        evidencija.dodajVozilo(automobil2);
        evidencija.dodajVozilo(motocikl1);

        System.out.println("Prikaz svih vozila:");
        evidencija.prikaziSvaVozila();

        String datoteka = "vozila.txt";

        try {
            evidencija.spremiPodatkeUDatoteku(datoteka);
            System.out.println("Podaci su spremjleni u datoteku.");

            EvidencijaVozila novaEvidencija = new EvidencijaVozila();
            novaEvidencija.ucitajPodatkeIzDatoteke(datoteka);
            System.out.println("Podaci su ucitani iz datoteke.");
            novaEvidencija.prikaziSvaVozila();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
