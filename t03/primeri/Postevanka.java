import java.util.Scanner;

public class Postevanka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.println("");
            }
            for (int j = 1; j <= n; j++) {
                int zmonzek = i * j;
                System.out.print("    ");
            }

            for (int j = i; j <= n; j++) {
                int zmozek = i * n;
            }
        }
        System.out.println();
    }
}
