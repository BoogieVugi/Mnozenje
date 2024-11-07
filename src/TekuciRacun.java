import java.math.BigDecimal;

public class TekuciRacun extends Racun {
    private BigDecimal kamatnaStopaTekuci = 0.001;

    public TekuciRacun(String brojRacuna, BigDecimal stanje, String vlasnik) {
        super(brojRacuna, stanje, vlasnik);
    }


    public void obracunKamate() {
        BigDecimal kamata = getStanje().multiply(kamatnaStopaTekuci);
        System.out.println("Kamata (Tekuci Racun): " + kamata + ". Novo stanje: " + getStanje());
    }
}
