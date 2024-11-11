

import com.sun.jdi.IntegerValue;

import java.math.BigDecimal;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


                System.out.println("Unesite iznos za plaćanje: ");
                double iznos = scanner.nextDouble();


                System.out.println("Odaberite metodu plaćanja: ");
                String metoda = scanner.nextLine();

                Placanje placanje;


                switch (metoda) {
                    case "kartica":
                        placanje = new KreditnaKartica();
                        break;
                    case "gotovina":
                        placanje = new Gotovina();
                        break;
                    case "paypal":
                        placanje = new PayPal();
                        break;
                    default:
                        System.out.println("Nepoznata metoda plaćanja.");
                        scanner.close();
                        return;
                }

                placanje.platiti(iznos);
                System.out.println(placanje.getDetalje());
            }
        }