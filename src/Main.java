import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static BigDecimal izracunajFaktorijel(int broj) throws IllegalArgumentException {
        if (broj < 0) {
            throw new IllegalArgumentException("Faktorijel nije definiran za negativne brojeve.");
        }

        BigDecimal rezultat = BigDecimal.ONE;
        for (int i = 1; i <= broj; i++) {
            rezultat = rezultat.multiply(BigDecimal.valueOf(i));
        }
        return rezultat;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Unesite cijeli broj za izračun faktorijela: ");
                int broj = scanner.nextInt();

                BigDecimal rezultat = izracunajFaktorijel(broj);
                System.out.println("Faktorijel broja je: " + rezultat);
                break;

            } catch (NumberFormatException e) {
                System.out.println("Pogreška: Unos niej broj. Molimo unesite cijeli broj.");

            } catch (IllegalArgumentException e) {
                System.out.println("Pogreška: " + e.getMessage());
            }
        }
        
    }
}
