

import com.sun.jdi.IntegerValue;

import java.math.BigDecimal;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        public class Main {
            public static void main(String[] args) {
                TekuciRacun tekuci = new TekuciRacun("123-456", new BigDecimal("1000.00"), "Marin");
                StedniRacun stedni = new StedniRacun("789-012", new BigDecimal("2000.00"), "Ana");

                Scanner scanner = new Scanner(System.in);

                System.out.println("Odaberite racun za transakciju: 1 - Tekuci Racun, 2 - Stedni Racun");
                int izborRacuna = scanner.nextInt();

                Racun odabraniRacun;
                if (izborRacuna == 1) {
                    odabraniRacun = tekuci;
                    System.out.println("Odabran je Tekuci Racun.");
                } else if (izborRacuna == 2) {
                    odabraniRacun = stedni;
                    System.out.println("Odabran je Stedni Racun.");
                } else {
                    System.out.println("Nepoznat izbor. Zatvaranje programa.");
                    return;
                }

                System.out.println("Odaberite operaciju: 1 - Uplata, 2 - Isplata");
                int izborOperacije = scanner.nextInt();

                System.out.println("Unesite iznos: ");
                BigDecimal iznos = scanner.nextBigDecimal();

                if (izborOperacije == 1) {
                    odabraniRacun.uplata(iznos);
                } else if (izborOperacije == 2) {
                    odabraniRacun.isplata(iznos);
                } else {
                    System.out.println("Nepoznata operacija.");
                }

                System.out.println("Obracun kamate za odabrani racun.");
                odabraniRacun.obracunKamate();

                scanner.close();
            }
        }