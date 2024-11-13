public class Roman implements Knjiga {
    private String naslov;
    private String autor;
    private int godinaIzdavanja;
    private int brojStranica;
    private String stanje;

    public Roman(String naslov, String autor, int godinaIzdavanja, int brojStranica) {
        this.naslov = naslov;
        this.autor = autor;
        this.godinaIzdavanja = godinaIzdavanja;

        // Provjera broja stranica
        if (brojStranica <= 0) {
            throw new IllegalArgumentException("Broj stranica mora biti pozitivan broj.");
        }
        this.brojStranica = brojStranica;

        this.stanje = "Dostupno"; // Početno stanje je "Dostupno"
    }

    public String getNaslov() {
        return naslov;
    }

    public String getAutor() {
        return autor;
    }

    public int getGodinaIzdavanja() {
        return godinaIzdavanja;
    }

    public int getBrojStranica() {
        return brojStranica;
    }

    public String getStanje() {
        return stanje;
    }

    public void posudi() {
        if (stanje.equals("Dostupno")) {
            stanje = "Posuđeno";
        } else {
            System.out.println("Knjiga je već posuđena.");
        }
    }

    public void vrati() {
        if (stanje.equals("Posuđeno")) {
            stanje = "Dostupno";
        } else {
            System.out.println("Knjiga je već dostupna.");
        }
    }

}
