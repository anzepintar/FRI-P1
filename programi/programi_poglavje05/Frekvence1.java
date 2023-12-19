
/*
 * Frekvence ocen s petimi ločenimi števci
 */

import java.util.Scanner;

public class Frekvence1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vnesite število učencev: ");
        int stUcencev = sc.nextInt();

        // števec enic, dvojk, ...
        int st1 = 0;
        int st2 = 0;
        int st3 = 0;
        int st4 = 0;
        int st5 = 0;

        for (int i = 1;  i <= stUcencev;  i++) {
            System.out.print("Vnesite oceno: ");
            int ocena = sc.nextInt();

            switch (ocena) {
                case 1:
                    st1++;
                    break;

                case 2:
                    st2++;
                    break;

                case 3:
                    st3++;
                    break;

                case 4:
                    st4++;
                    break;

                case 5:
                    st5++;
                    break;
            }
        }

        System.out.printf("1: %d%n", st1);
        System.out.printf("2: %d%n", st2);
        System.out.printf("3: %d%n", st3);
        System.out.printf("4: %d%n", st4);
        System.out.printf("5: %d%n", st5);
    }
}
