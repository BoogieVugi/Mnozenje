import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" 1 označava zbrajanje");
        System.out.println(" 2 označava oduzimanje");
        System.out.println(" 3 označava množenje");
        System.out.println(" 4 označava djeljenje");

        System.out.print("Unesi broj od 1 do 4: ");
        int a = scanner.nextInt();

        if (a==1){
            System.out.println("Zbrajanje je osnovna računska operacija, kojom se, dva ili više broja skupe zajedno.");
        }
        if (a == 2){
            System.out.println("oduzimanje je matematička operacija kojom se određuje koliko se razlikuju dva broja");
        }
        if (a == 3){
            System.out.println("Množenje prirodnih brojeva možemo shvatiti kao uzastopno zbrajanje jednakih pribrojnika.");
        }
        if (a == 4){
            System.out.println("dijeljenje je osnovna matematička operacija kojom se određuje broj, polinom, varijabla");
        }
        }
    }