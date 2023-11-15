import java.util.Scanner;

public class DN01_63230247 {
    public static void main(String[] args) {
        /*
         * Napisite program, ki prebere stevili a in b in izpise stevilo kvadratov, ki
         * jih tvori mreza a x b enakomerno razmaknjenih tock.
         * Na primer, pri a = 4 in b = 6 imamo skupaj 26 kvadratov.
         */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int min = Math.min(a, b);
        int sum = 0;
        for (int i = 0; i < min; i++) {
            a--;
            b--;
            sum = sum + a * b;
        }
        System.out.println(sum);

    }
}
