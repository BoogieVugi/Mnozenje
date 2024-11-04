import java.math.BigDecimal;
import java.math.RoundingMode;

public class Proizvod {

    private String naziv;
    private BigDecimal cijena;
    private BigDecimal popust;

    public Proizvod(String ime, BigDecimal cijena, BigDecimal popust){
        this.naziv = naziv;
        this.cijena = cijena;
        this.popust = popust;
    }
   public void setPopust (BigDecimal popust){
        this.popust = popust;
   }
   public BigDecimal izracunajCijenu(){
        BigDecimal formulaZaPopust= cijena.multiply(popust).divide(new BigDecimal("100"),2, RoundingMode.HALF_UP);
        return cijena.subtract(formulaZaPopust);
   }

   public String getNaziv(){
        return naziv;
   }
    public BigDecimal getCijena(){
        return cijena;
    }
}
