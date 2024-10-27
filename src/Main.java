
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.time.chrono.MinguoEra;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite rečenicu:");
        String recenica = scanner.nextLine();
        String[] rijeci = recenica.split(" ");

        ArrayList<String> dugeRijeci = new ArrayList<>();
        String najduzaRijec = "";
        int ukupnaDuzina = 0;

        for (int i = 0; i < rijeci.length; i++) {
            String rijec = rijeci[i];
            ukupnaDuzina += rijec.length();
            if (rijec.length() > 5) {
                dugeRijeci.add(rijec);
            }

            if (rijec.length() > najduzaRijec.length()) {
                najduzaRijec = rijec;
            }
        }

        double prosjecnaDuzina = (double) ukupnaDuzina / rijeci.length;

        System.out.println("Riječi dulje od 5 slova: " + dugeRijeci);
        System.out.println("Najduža riječ: " + najduzaRijec);
        System.out.printf("Prosječna duljina riječi: %.2f%n", prosjecnaDuzina);
    }
}