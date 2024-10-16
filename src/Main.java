import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesite veličinu polja: ");
        int size = scanner.nextInt();

        // Kreiranje polja prema unesenoj veličini
        int[] array = new int[size];

        // Unos elemenata u polje
        System.out.println("Unesite " + size + " elemenata polja:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Pronalaženje maksimalne vrijednosti
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        // Ispis maksimalne vrijednosti
        System.out.println("Maksimalna vrijednost u polju je: " + max);
    }
}
