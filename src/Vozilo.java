public class Vozilo {
    private String registarskiBroj;
    private String marka;
    private int godinaProizvodnje;

    public Vozilo(String registarskiBroj, String marka, int godinaProizvodnje) {
        this.registarskiBroj = registarskiBroj;
        this.marka = marka;
        this.godinaProizvodnje = godinaProizvodnje;
    }

    public String getRegistarskiBroj() {
        return registarskiBroj;
    }

    public void setRegistarskiBroj(String registarskiBroj) {
        this.registarskiBroj = registarskiBroj;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getGodinaProizvodnje() {
        return godinaProizvodnje;
    }

    public void setGodinaProizvodnje(int godinaProizvodnje) {
        this.godinaProizvodnje = godinaProizvodnje;
    }

    public void prikaziPodatke() {
        System.out.println("Registarski broj: " + registarskiBroj);
        System.out.println("Marka: " + marka);
        System.out.println("Godina proizvodnje: " + godinaProizvodnje);
    }

    @Override
    public String toString() {
        return String.format("Vozilo,%s,%s,%d", registarskiBroj, marka, godinaProizvodnje);
    }
}
