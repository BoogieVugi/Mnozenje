public class Automobil extends Vozilo {
    private int brojVrata;

    public Automobil(String registarskiBroj, String marka, int godinaProizvodnje, int brojVrata) {
        super(registarskiBroj, marka, godinaProizvodnje);
        this.brojVrata = brojVrata;
    }

    public int getBrojVrata() {
        return brojVrata;
    }

    public void setBrojVrata(int brojVrata) {
        this.brojVrata = brojVrata;
    }

    @Override
    public void prikaziPodatke() {
        super.prikaziPodatke();
        System.out.println("Broj vrata: " + brojVrata);
    }

    @Override
    public String toString() {
        return String.format("Automobil,%s,%s,%d,%d",
                getRegistarskiBroj(), getMarka(), getGodinaProizvodnje(), brojVrata);
    }
}
