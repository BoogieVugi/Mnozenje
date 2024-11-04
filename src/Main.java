

import com.sun.jdi.IntegerValue;

import java.math.BigDecimal;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesite naziv proizvoda: ");
        String naziv = scanner.nextLine();

        System.out.print("Unesite cijenu proizvoda: ");
        BigDecimal cijena = scanner.nextBigDecimal();

        System.out.print("Unesite popust (u postotcima): ");
        BigDecimal popust = scanner.nextBigDecimal();

        Proizvod proizvod = new Proizvod(naziv, cijena, popust);

        proizvod.setPopust(popust);

        System.out.println("Konačna cijena proizvoda " + proizvod.getNaziv() + " nakon popusta: " + proizvod.izracunajCijenu());


    }
}

