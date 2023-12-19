
/*
 * Izračun n-tega Fibonaccijevega števila z uporabo memoizacije
 */

import java.util.Scanner;

public class FibonacciMemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // memoizacijska tabela;
        // če je memo[i] == 0, to pomeni, da vrednosti f(i, memo)
        // še nismo izračunali;
        // sicer pa memo[i] hrani že izračunano vrednost f(i, memo)
        int[] memo = new int[n + 1];

        System.out.println(f(n, memo));
    }

    public static int f(int n, int[] memo) {
        if (n <= 1) {
            return n;
        }
        if (memo[n] > 0) {
            // n-to Fibonaccijevo število smo že izračunali (in shranili)
            return memo[n];
        }

        int pp = f(n - 2, memo);
        int p = f(n - 1, memo);

        // rezultat shranimo v tabelo memo
        memo[n] = pp + p;
        return memo[n];
    }
}
