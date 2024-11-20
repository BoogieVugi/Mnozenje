import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Proizvod> proizvodi = new ArrayList<>();

        // Dodavanje proizvoda putem korisničkog unosa
        System.out.println("Unesite informacije o 5 proizvoda:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Proizvod " + (i + 1) + ":");
            System.out.print("Naziv: ");
            String naziv = scanner.nextLine();

            System.out.print("Cijena: ");
            double cijena = scanner.nextDouble();

            System.out.print("Količina: ");
            int kolicina = scanner.nextInt();
            scanner.nextLine(); // Potroši preostali newline

            proizvodi.add(new Proizvod(naziv, cijena, kolicina));
        }

        // Prikaz svih proizvoda
        System.out.println("\nPopis proizvoda:");
        for (Proizvod proizvod : proizvodi) {
            System.out.println(proizvod);
        }

        // Spremanje u datoteku
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("proizvodi.txt"))) {
            for (Proizvod proizvod : proizvodi) {
                writer.write(proizvod.toString());
                writer.newLine();
            }
            System.out.println("\nProizvodi su uspješno zapisani u datoteku 'proizvodi.txt'.");
        } catch (IOException e) {
            System.err.println("Došlo je do greške prilikom zapisivanja u datoteku: " + e.getMessage());
        }

    }
}