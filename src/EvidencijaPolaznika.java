import java.util.HashMap;

public class EvidencijaPolaznika {
    private HashMap<String, Polaznik> polaznici = new HashMap<>();

    public boolean dodajPolaznika(String ime, String prezime, String email) {
        if (polaznici.containsKey(email)) {
            return false; // E-mail postoji
        }
        Polaznik polaznik = new Polaznik(ime, prezime, email);
        polaznici.put(email, polaznik);
        return true; // Uspješno dodano
    }

    public void prikaziPolaznike() {
        if (polaznici.isEmpty()) {
            System.out.println("Nema unesenih polaznika.");
        } else {
            System.out.println("Popis polaznika:");
            for (Polaznik polaznik : polaznici.values()) {
                System.out.println(polaznik);
            }
        }
    }
}
