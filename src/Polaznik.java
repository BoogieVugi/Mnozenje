public class Polaznik {
    private String ime;
    private String prezime;
    private String email;

    public Polaznik(String ime, String prezime, String email) {
        this.ime = ime;
        this.prezime = prezime;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Ime: " + ime + ", Prezime: " + prezime + ", Email: " + email;
    }
}