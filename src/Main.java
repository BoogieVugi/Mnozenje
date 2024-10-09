import java.io.PrintStream;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesi prvi broj: ");
        int prviBroj = scanner.nextInt();

        System.out.print("Unesi drugi broj: ");
        int drugiBroj = scanner.nextInt();

        int umnozak = prviBroj * drugiBroj;

        System.out.println("Umnožak je: " + umnozak);
        }
    }