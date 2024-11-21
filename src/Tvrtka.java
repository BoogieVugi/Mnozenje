import java.util.ArrayList;
import java.util.List;

public class Tvrtka {

    private List<Zaposlenik> zaposlenici;

    public Tvrtka() {
        this.zaposlenici = new ArrayList<>();
    }

    public void dodajZaposlenika(Zaposlenik zaposlenik) {
        zaposlenici.add(zaposlenik);
    }

    public void ispisiZaposlenike() {
        if (zaposlenici.isEmpty()) {
            System.out.println("Nema zaposlenika u evidenciji.");
        } else {
            for (Zaposlenik zaposlenik : zaposlenici) {
                System.out.println(zaposlenik);
            }
        }
    }

    public Zaposlenik pronadjiNajvecuPlacu() {
        if (zaposlenici.isEmpty()) {
            return null;
        }

        Zaposlenik najbolji = zaposlenici.get(0);
        for (Zaposlenik zaposlenik : zaposlenici) {
            if (zaposlenik.getPlaca() > najbolji.getPlaca()) {
                najbolji = zaposlenik;
            }
        }
        return najbolji;
    }
}

