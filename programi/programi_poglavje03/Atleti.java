
/*
 * Branje rezultatov tekmovanja v skokih v daljino; izpis najboljšega
 * tekmovalca in njegovega rezultata
 */

import java.util.Scanner;

public class Atleti {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Koliko atletov tekmuje? ");
        int stAtletov = sc.nextInt();

        // doslej največja dolžina (dosedanji rekord)
        int najDolzina = 0;

        // zaporedna številka doslej najboljšega atleta 
        // (dosedanji rekorder)
        int najStevec = 0;

        for (int stevec = 1;  stevec <= stAtletov;  stevec++) {
            System.out.print("Vnesite dolžino skoka za " + stevec +
                    ". atleta: ");
            int dolzina = sc.nextInt();

            if (dolzina > najDolzina) {
                // super, imamo nov rekord!
                najDolzina = dolzina;

                // ... in rekorderja!
                najStevec = stevec;
            }
        }
        System.out.println("Najboljši je " + najStevec + ". atlet (" + najDolzina + ")");
    }
}
