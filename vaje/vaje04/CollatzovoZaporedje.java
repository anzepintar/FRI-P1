import java.util.Scanner;

public class CallatzovoZaporedje {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int max = a;
        int maxStevec = 1;
        for (int i = a; i <= b; i++) {
            if (zaporedje(i) > zaporedje(max)) {
                max = i;
            }
            maxStevec = zaporedje(max);
        }
        System.out.println(max + "\n" + maxStevec);
    }

    public static int zaporedje(int n) {
        int stevec = 1;
        while (n != 1) {
            if (n % 2 == 1)
                n = 3 * n + 1;
            else
                n = n / 2;
            stevec++;
        }
        return stevec;
    }
}
