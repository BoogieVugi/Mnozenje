
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("unesite broj elemenata: ");
        int brojElemenata = scanner.nextInt();

        ArrayList<Integer> Lista = new ArrayList<>();

        System.out.println("Unesite elemente liste: ");
        for (int i = 0; i < brojElemenata; i++){
            Lista.add(scanner.nextInt());
        }
        // OVO DALJE SAM UZ POMOĆ INTERNETA RIJEŠIO

        boolean duplikatPostoji = false;

        for (int i = 0; i < Lista.size(); i++) {
            for (int j = i + 1; j < Lista.size(); j++) {
                if (Lista.get(i).equals(Lista.get(j))) {
                    duplikatPostoji = true;
                    break;
                }
            }
            if (duplikatPostoji) {
                break;
            }
        }

        // Ispisi rezultat
        if (duplikatPostoji) {
            System.out.println("True - Duplikat postoji");
        } else {
            System.out.println("False - Nema duplikata");
        }
        scanner.close();

    }
}
