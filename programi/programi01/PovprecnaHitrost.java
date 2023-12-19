
/*
 * Program prebere prevoženo pot (v kilometrih) in porabljen čas (v minutah)
 * ter izpiše povprečno hitrost (v km/h).
 */

import java.util.Scanner;

public class PovprecnaHitrost {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Vnesite prevoženo pot v km: ");
        double pot = sc.nextDouble();

        System.out.print("Vnesite porabljen čas v min: ");
        double cas = sc.nextDouble();

        // hitrost v km/h
        double hitrost = 60 * pot / cas;
        System.out.println("Povprečna hitrost znaša " + hitrost + " km/h");
    }
}
