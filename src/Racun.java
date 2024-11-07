import java.math.BigDecimal;

public class Racun {
    private String brojRacuna;
    private BigDecimal stanje;
    private String vlasnik;

    public Racun (String brojRacuna, BigDecimal stanje, String vlasnik) {
        this.brojRacuna = brojRacuna;
        this.stanje = stanje;
        this.vlasnik = vlasnik;
    }
    public void isplata(BigDecimal iznos) {
        stanje = stanje.subtract(iznos);
    }
    public BigDecimal getStanje() {
        return stanje;
    }
    public void obracunKamate(){

    }
}
