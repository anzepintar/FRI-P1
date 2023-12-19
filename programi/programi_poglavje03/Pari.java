
/*
 * Izpis parov oblike i:j, kjer je 1 <= i < j <= n
 */

import java.util.Scanner;

public class Pari {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1;  i <= n;  i++) {
            // izpišemo i-to vrstico
            // (vrstica oblike i:j)
            for (int j = i + 1;  j <= n;  j++) {
                System.out.printf("%d:%d ", i, j);
            }
            System.out.println();
        }
    }
}
