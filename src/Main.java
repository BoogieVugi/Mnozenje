
import java.util.Scanner;
import java.util.ArrayList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] listaBrojeva = new int[5];

        System.out.println("Unesite 5 brojeva:");
        for (int i = 0; i < 5; i++) {
            listaBrojeva[i] = scanner.nextInt();
        }

        // Provjera da li je lista uzlazno sortirana
        boolean sortiranost = rastuća (listaBrojeva);

        // Ispis rezultata
        if (sortiranost) {
            System.out.println("Lista je sortirana uzlazno.");
        } else {
            System.out.println("Lista nije sortirana uzlazno.");
        }
    }

    public static boolean rastuća(int[] broj) {
        for (int i = 0; i < broj.length - 1; i++) {
            if (broj[i] > broj[i + 1]) {
                return false;
        }
        return true;
    }
}