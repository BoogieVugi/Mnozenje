

import com.sun.jdi.IntegerValue;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Polaznik polaznik1 = new Polaznik("Ivica", "Ivić");
        Polaznik polaznik2 = new Polaznik ("Tomsislav", "Vugrnec", 29, "mušk");
        Polaznik polaznik3 = new Polaznik();

        System.out.println("Ime i prezime prvog polaznika je: " + polaznik1.getImePrezime());

        polaznik2.setDob(30);

        polaznik3.setIme("Branko");
        polaznik3.setPrezime("Brankić");




    }
}

