import java.util.Scanner;

public class Zgoscenke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int zgoscenka = 1;
        int prosto = k;
        while (sc.hasNextInt() && (zgoscenka <= n)) {
            int m = sc.nextInt();
            if (prosto - m >= 0) {
                prosto -= m;
            } else {
                zgoscenka++;
                prosto = k - m;
            }
            if (zgoscenka <= n)
                System.out.printf("%s EP -> zgoscenka %s (%s EP)\n", m, zgoscenka, k - prosto);
        }
        sc.close();
    }
}
