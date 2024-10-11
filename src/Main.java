import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Unesite pozitivan cijeli broj N: ");
        int N = scanner.nextInt();

        if (N <= 0) {
            System.out.println("Molimo unesite pozitivan cijeli broj.");
        } else {
            int suma = 0;

            for (int i = 1; i <= N; i++) {
                suma += i;
            }


            System.out.println("Suma brojeva od 1 do " + N + " je: " + suma);
        }
    }
}

