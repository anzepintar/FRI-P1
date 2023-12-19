
/*
 * Iskanje praštevil z Eratostenovim sitom
 */

import java.util.Scanner;

public class PrastevilaEratosten {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // na koncu bo veljalo:
        // sestavljeno[i] == true <==> število i je sestavljeno
        boolean[] sestavljeno = new boolean[n + 1];
        int meja = (int) Math.round(Math.sqrt(n));

        int p = 2;
        while (p <= meja) {
            // vse elemente tabele, ki ustrezajo večkratnikom števila 
            // p, nastavimo na true
            for (int i = 2 * p;  i <= n;  i += p) {
                sestavljeno[i] = true;
            }

            // poiščemo prvi indeks i, ki je večji od p in pri katerem
            // velja sestavljeno[i] == false
            do {
                p++;
            } while (p <= meja && sestavljeno[p]);
        }

        // izpišemo indekse i, pri katerih je sestavljeno[i] == false
        for (int i = 2;  i <= n;  i++) {
            if (!sestavljeno[i]) {
                System.out.println(i);
            }
        }
    }
}
