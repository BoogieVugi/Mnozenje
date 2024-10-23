import com.sun.source.tree.SwitchExpressionTree;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        
        System.out.println("Unesite 10 brojeva:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }
