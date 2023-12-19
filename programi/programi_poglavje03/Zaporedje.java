
/*
 * Izpis zaporedja števil od <a> do <b>
 */

import java.util.Scanner;

public class Zaporedje {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int stevilo = a;
        while (stevilo <= b) {
            System.out.println(stevilo);
            stevilo = stevilo + 1;
        }

    }
}
