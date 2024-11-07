import java.math.BigDecimal;

public class StedniRacun extends Racun {

    private BigDecimal kamatnaStopaStedni = 0.015;

    public StedniRacun(String brojRacuna, BigDecimal stanje, String vlasnik) {
        super(brojRacuna, stanje, vlasnik);
    }
    public void obracunKamate() {
        BigDecimal kamata = getStanje().multiply(kamatnaStopaStedni);
        System.out.println("Kamata (Stedni Racun): " + kamata + ". Novo stanje: " + getStanje());
    }
}
