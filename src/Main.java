

import com.sun.jdi.IntegerValue;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] apoeni = {500, 200, 100, 50, 20, 10, 5, 2, 1, 0.5, 0.2, 0.1};

        System.out.print("Unesite iznos novca za povrat: ");
        double iznosZaPovrat = scanner.nextDouble();


        for (int i = 0; i < apoeni.length; i++) {
            double apoen = apoeni[i];
            int brojNovcanica = (int)(iznosZaPovrat / apoen);

            if (brojNovcanica > 0) {
                for (int j = 0; j < brojNovcanica; j++) {

                    System.out.println("Povrat u apoenima:" + apoen + " ");
                }
                iznosZaPovrat -= brojNovcanica * apoen;
                iznosZaPovrat = Math.round(iznosZaPovrat * 100.0) / 100.0;
            }
        }
    }
}

