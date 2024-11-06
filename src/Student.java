public class Student {

    private String ime;
    private String prezime;
    private String brojIndeksa;
    private double prosjekOcjena;

    public Student(String ime, String prezime, String brojIndeksa, double prosjekOcjena) {
        this.ime = ime;
        this.prezime = prezime;
        this.brojIndeksa = brojIndeksa;
        this.prosjekOcjena = prosjekOcjena;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public String getBrojIndeksa() {
        return brojIndeksa;
    }

    public double getProsjekOcjena() {
        return prosjekOcjena;
    }

    public String toString() {
        return "Student{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", brojIndeksa='" + brojIndeksa + '\'' +
                ", prosjekOcjena=" + prosjekOcjena +
                '}';
    }
}
}
