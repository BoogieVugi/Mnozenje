

import com.sun.jdi.IntegerValue;

import java.math.BigDecimal;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Student> studenti = new ArrayList<>();

        System.out.print("Unesite ime studenta: ");
        String ime = scanner.nextLine();

        System.out.print("Unesite prezime studenta: ");
        String prezime = scanner.nextLine();

        System.out.print("Unesite broj indeksa studenta: ");
        String brojIndeksa = scanner.nextLine();

        System.out.print("Unesite prosjek ocjena studenta: ");
        double prosjekOcjena = scanner.nextDouble();
        scanner.nextLine();

        // Kreiranje i dodavanje novog studenta u listu
        Student student = new Student(ime, prezime, brojIndeksa, prosjekOcjena);
        studenti.add(student);

        // Ispis svih studenata
        System.out.println("\nPopis svih studenata:");
        for (Student student : studenti) {
            System.out.println(student);
    }
}

