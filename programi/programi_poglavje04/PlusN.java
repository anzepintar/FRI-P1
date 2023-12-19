
/*
 * Izpis "plusa" s krakom dolžine <n>
 */

import java.util.Scanner;

public class PlusN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // dolžina kraka

        // zgornji krak
        for (int i = 1;  i <= n;  i++) {
            for (int j = 1;  j <= n;  j++) {
                System.out.print(" ");
            }
            System.out.println("+");
        }

        // sredina
        for (int i = 1;  i <= 2 * n + 1;  i++) {
            System.out.print("+");
        }
        System.out.println();

        // spodnji krak
        for (int i = 1;  i <= n;  i++) {
            for (int j = 1;  j <= n;  j++) {
                System.out.print(" ");
            }
            System.out.println("+");
        }
    }
}
