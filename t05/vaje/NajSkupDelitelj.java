import java.util.Scanner;

public class NajSkupDelitelj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int g = sc.nextInt();
        sc.close();
        // zanka gre preko manj indeksev, kot če bi šla čez oba indeksa
        for (int i = g; i <= n; i += g) {
            for (int j = i; j <= n; j += g) {
                if (gcd(i, j) == g)
                    System.out.printf("(%d, %d)\n", i, j);
            }
        }
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static int gcd2(int a, int b) {
        int i;
        if (a < b)
            i = a;
        else
            i = b;
        for (i = i; i > 1; i--) {
            if (a % i == 0 && b % i == 0)
                return i;
        }
        return 1;
    }

    public static int gcd3(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, Math.abs(a - b));
    }

    public static int gcd4(int p, int q) {
        if (q == 0)
            return p;
        if (p == 0)
            return q;

        if ((p & 1) == 0 && (q & 1) == 0)
            return gcd(p >> 1, q >> 1) << 1;

        else if ((p & 1) == 0)
            return gcd(p >> 1, q);

        else if ((q & 1) == 0)
            return gcd(p, q >> 1);

        else if (p >= q)
            return gcd((p - q) >> 1, q);

        else
            return gcd(p, (q - p) >> 1);
    }
}
