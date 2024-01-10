import java.util.Scanner;

public class FibonacciMemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int[] memo = new int[n + 1];
        System.out.println(f(n, memo));
    }

    public static int f(int n, int[] memo) {
        if (n <= 1)
            return n;
        if (memo[n] > 0)
            return memo[n];

        int pp = f(n - 2, memo); // predprejšnji člen
        int p = f(n - 1, memo); // prejšnji člen
        memo[n] = pp + p;
        return memo[n];
    }
}
