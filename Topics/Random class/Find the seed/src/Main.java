import java.util.*;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // write your code here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int bestSeed = -1;
        int minOfMaxes = Integer.MAX_VALUE;

        for (int i=a; i<=b; i++) {
            Random random = new Random(i);
            int currentMax = -1;

            for (int j=0; j<n; j++) {
                int val = random.nextInt(k);
                if (val > currentMax) {
                    currentMax = val;
                }
            }

            if (currentMax < minOfMaxes) {
                minOfMaxes = currentMax;
                bestSeed = i;
            }
        }
        System.out.println(bestSeed);
        System.out.print(minOfMaxes);
    }
}