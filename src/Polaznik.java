
public class Polaznik {
    //varijable
    private String ime;
    private String prezime;
    private int dob;
    private String spol;
    //konstruktor za ime i prezime
    public Polaznik(String ime, String prezime){
        this.ime=ime;
        this.prezime=prezime;
    }
    //konstruktor za primanje svih vrijednosti
    public Polaznik(String ime, String prezime, int dob, String spol){
        this.ime=ime;
        this.prezime=prezime;
        this.dob=dob;
        this.spol=spol;
    }
    //konstruktor bez vrijednosti
    public Polaznik(){
    }

    // metoda pstavljanje imena
    public void setIme(String ime){
    this.ime = ime;
    }
    //metoda za postavljanje prezimena
    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }
    // metoda za postavljanje dobi
    public void setDob(int dob){
        this.dob= dob;
    }
    // metoda za postavljanje spola
    public void setSpol(String spol) {
        this.spol = spol;
    }
    // metoda za dohvaćanje imena i prezimena
    public String getImePrezime(){
        return ime + " " + prezime;
    }
}
