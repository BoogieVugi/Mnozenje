import com.sun.source.tree.SwitchExpressionTree;

import java.lang.runtime.SwitchBootstraps;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

        public class Main {
            public static void main(String[] args) {

                List<Integer> numbers = new ArrayList<>();
                Scanner scanner = new Scanner(System.in);


                System.out.println("Unesite brojeve (za kraj unesite 'kraj'):");

                while (scanner.hasNextInt()) {
                    numbers.add(scanner.nextInt());
                }


                scanner.close();


                if (numbers.isEmpty()) {
                    System.out.println("Lista je prazna.");
                    return;
                }

                int min = numbers.get(0);
                int max = numbers.get(0);
                int minIndex = 0;
                int maxIndex = 0;

                for (int i = 1; i < numbers.size(); i++) {
                    if (numbers.get(i) < min) {
                        min = numbers.get(i);
                        minIndex = i;
                    }
                    if (numbers.get(i) > max) {
                        max = numbers.get(i);
                        maxIndex = i;
                    }
                }

                numbers.set(minIndex, max);
                numbers.set(maxIndex, min);
                
                System.out.println("Nova lista nakon zamjene: " + numbers);
            }
        }


