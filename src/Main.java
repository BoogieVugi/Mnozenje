
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] listaBrojeva = new int[5];

        System.out.println("Unesite 5 brojeva:");
        for (int i = 0; i < 5; i++) {
            listaBrojeva[i] = scanner.nextInt();
        }

        boolean rastuca = rastuca(listaBrojeva);

        if (rastuca) {
            System.out.println("Lista je sortirana uzlazno.");
        } else {
            System.out.println("Lista nije sortirana uzlazno.");
        }
    }

    public static boolean rastuca(int[] lista) {
        for (int i = 0; i < lista.length ; i++) {

        }
        return true;
    }
}