import java.util.Scanner;

public class Kriz1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        navpicniKrak(n);
        sredinskaLinija(n);
        navpicniKrak(n);
    }

    public static void navpicniKrak(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" ");
            }
            System.out.println("+");
        }

    }

    public static void sredinskaLinija(int n) {
        for (int i = 1; i < 2 * n + 2; i++) {
            System.out.print("+");
        }
        System.out.println();
    }
}
