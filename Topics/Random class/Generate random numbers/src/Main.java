import java.util.*;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // write your code here

        if (scanner.hasNext()) {
            int n = scanner.nextInt();
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int seed = a + b;
            Random random = new Random(seed);

            long sum = 0;
            for (int i=0; i<n; i++) {
                int randomNumber = random.nextInt(b - a + 1) + a;
                sum += randomNumber;
            }
            System.out.println(sum);
        }
        scanner.close();
    }
}