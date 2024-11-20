public class Proizvod {
    private String naziv;
    private double cijena;
    private int kolicina;

    // Konstruktor
    public Proizvod(String naziv, double cijena, int kolicina) {
        this.naziv = naziv;
        this.cijena = cijena;
        this.kolicina = kolicina;
    }

    // Metoda toString
    @Override
    public String toString() {
        return "Proizvod: " + naziv + ", Cijena: " + cijena + " EUR, Količina: " + kolicina;
    }

    // Getteri i Setteri (opcionalno, ako su potrebni)
    public String getNaziv() {
        return naziv;
    }

    public double getCijena() {
        return cijena;
    }

    public int getKolicina() {
        return kolicina;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setCijena(double cijena) {
        this.cijena = cijena;
    }

    public void setKolicina(int kolicina) {
        this.kolicina = kolicina;
    }
}