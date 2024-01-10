import java.util.Scanner;

public class EratostenovoSito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        boolean[] sestavljeno = new boolean[n + 1];
        int p = 2;
        while (p <= (int) Math.round(Math.sqrt(n))) {
            // nastavimo sestavljeno od i na true
            for (int i = 2 * p; i <= n; i += p) {
                sestavljeno[i] = true;

            }
            // poiščemo naslednji p, tako da bo sestavljeno[] == false
            do {
                p++;
            } while (p <= (int) Math.round(Math.sqrt(n)) && sestavljeno[p]);

        }
        for (int i = 2; i <= n; i++) {
            if (!sestavljeno[i])
                System.out.println(i);
        }
    }
}
