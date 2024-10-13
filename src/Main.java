import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);


       System.out.println (" Upiši cijeli broj: ");
       int broj = unos.nextInt();

       broj = Math.abs(broj);

       int brojZnamenki = String.valueOf(broj).length();
       if (broj == 0) {
           brojZnamenki = 1;
       }

       System.out.println("Broj znamenki cijelog broja je: " + brojZnamenki);


    }
}
