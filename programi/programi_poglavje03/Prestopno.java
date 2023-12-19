
/*
 * Izpiše DA, če je prebrano leto prestopno, in NE, če ni.
 */

import java.util.Scanner;

public class Prestopno {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int leto = sc.nextInt();

        if (leto % 400 == 0 || leto % 4 == 0 && !(leto % 100 == 0)) {
            System.out.println("DA");
        } else {
            System.out.println("NE");
        }
    }
}
