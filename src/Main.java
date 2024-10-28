

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> imena = new ArrayList<>();
        ArrayList<String> brojevi = new ArrayList<>();

        while (true) {
            System.out.println("Odaberite opciju:");
            System.out.println("1 - Dodaj novi kontakt");
            System.out.println("2 - Prikaz svih kontakata");
            System.out.println("3 - Pretraži kontakt");
            System.out.println("4 - Izbriši kontakt");
            System.out.println("5 - Izlaz");
            int opcija = scanner.nextInt();

            switch (opcija) {
                case 1:// Dodavanje novog kontakta
                    System.out.print("Unesite ime: ");
                    String ime = scanner.nextLine();
                    System.out.print("Unesite broj telefona: ");
                    String broj = scanner.nextLine();
                    imena.add(ime);
                    brojevi.add(broj);
                    System.out.println("Kontakt uspješno dodan.");
                    break;

                case 2:// Prikaz svih kontakata
                    if (imena.isEmpty()) {
                        System.out.println("Telefonski imenik je prazan.");
                    } else {
                        System.out.println("Telefonski imenik:");
                        for (int i = 0; i < imena.size(); i++) {
                            System.out.println((i + 1) + ". " + imena.get(i) + " - " + brojevi.get(i));
                        }
                    }
                    break;

                case 3:// Pretraga kontakta
                    System.out.print("Unesite ime za pretragu: ");
                    String trazenoIme = scanner.nextLine();
                    boolean pronaden = false;
                    for (int i = 0; i < imena.size(); i++) {
                        if (imena.get(i).equalsIgnoreCase(trazenoIme)) {
                            System.out.println("Pronađen kontakt: " + imena.get(i) + " - " + brojevi.get(i));
                            pronaden = true;
                            break;
                        }
                    }
                    if (!pronaden) {
                        System.out.println("Kontakt nije pronađen.");
                    }
                    break;

                case 4:// Brisanje kontakta
                    System.out.print("Unesite ime kontakta za brisanje: ");
                    String imeZaBrisanje = scanner.nextLine();
                    pronaden = false;
                    for (int i = 0; i < imena.size(); i++) {
                        if (imena.get(i).equalsIgnoreCase(imeZaBrisanje)) {
                            imena.remove(i);
                            brojevi.remove(i);
                            System.out.println("Kontakt je uspješno obrisan.");
                            pronaden = true;
                            break;
                        }
                    }
                    if (!pronaden) {
                        System.out.println("Kontakt nije pronađen.");
                    }
                    break;

                case 5:// Izlaz iz programa
                    System.out.println("Izlaz iz programa.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Nepoznata opcija. Molimo pokušajte ponovno.");
                    break;
            }
        }
    }
}
