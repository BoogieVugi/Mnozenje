import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EvidencijaPolaznika evidencija = new EvidencijaPolaznika();
        Scanner scanner = new Scanner(System.in);
        int izbor;

        do {
            System.out.println("Izbornik:");
            System.out.println("1. Dodaj polaznika");
            System.out.println("2. Prikaži sve polaznike");
            System.out.println("3. Izlaz");
            System.out.print("Odaberi opciju: ");
            izbor = scanner.nextInt();
            scanner.nextLine(); // Čisti newline

            switch (izbor) {
                case 1:
                    System.out.print("Unesite ime: ");
                    String ime = scanner.nextLine();

                    System.out.print("Unesite prezime: ");
                    String prezime = scanner.nextLine();

                    System.out.print("Unesite email: ");
                    String email = scanner.nextLine();

                    if (evidencija.dodajPolaznika(ime, prezime, email)) {
                        System.out.println("Polaznik uspješno dodan.");
                    } else {
                        System.out.println("Greška: Polaznik s ovom e-mail adresom već postoji!");
                    }
                    break;

                case 2:
                    evidencija.prikaziPolaznike();
                    break;

                case 3:
                    System.out.println("Izlaz iz programa.");
                    break;

                default:
                    System.out.println("Nepoznata opcija. Pokušajte ponovno.");
            }
        } while (izbor != 3);

    }
}
