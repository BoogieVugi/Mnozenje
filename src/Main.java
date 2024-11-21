import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tvrtka tvrtka = new Tvrtka();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite podatke za 3 zaposlenika:");
        for (int i = 0; i < 3; i++) {
            try {
                System.out.print("Ime: ");
                String ime = scanner.nextLine();

                System.out.print("Prezime: ");
                String prezime = scanner.nextLine();

                System.out.print("Plaća: ");
                double placa = Double.parseDouble(scanner.nextLine());

                Zaposlenik zaposlenik = new Zaposlenik(ime, prezime, placa);
                tvrtka.dodajZaposlenika(zaposlenik);
            } catch (InvalidInputException e) {
                System.out.println("Greška: " + e.getMessage());
                i--; // Omogućuje ponovno unos u slučaju greške
            } catch (NumberFormatException e) {
                System.out.println("Greška: Plaća mora biti broj.");
                i--;
            }
        }

        System.out.println("\nPopis svih zaposlenika:");
        tvrtka.ispisiZaposlenike();

        Zaposlenik najbolji = tvrtka.pronadjiNajvecuPlacu();
        if (najbolji != null) {
            System.out.println("\nZaposlenik s najvećom plaćom:");
            System.out.println(najbolji);
        } else {
            System.out.println("\nNema zaposlenika s najvećom plaćom.");
        }
    }
}
