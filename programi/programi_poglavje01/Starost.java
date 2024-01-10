
/*
 * Program prebere uporabnikovo leto rojstva in izpiše njegovo starost v letu
 * 2022.
 */

import java.util.Scanner;

public class Starost {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Vnesite leto rojstva: ");
        int letoRojstva = sc.nextInt();

        int starost = 2022 - letoRojstva;
        System.out.println("Letos praznujete " + starost + ". rojstni dan.");
    }
}
