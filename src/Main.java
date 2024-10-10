import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int tajnibroj = 9;
        int a;
        do {
            System.out.println("pogodi tajni broj");
            a = scanner.nextInt();

            if (a != tajnibroj) {
                System.out.println("Pogrešan broj");
            }
        } while (a != tajnibroj);

        System.out.println("Čestitam! Pogodio si tajni broj.");
        scanner.close();
    }
}