import java.util.Scanner;

public class Ocene {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] stevci = new int[5];

        while (sc.hasNextInt()) {
            int ocena = sc.nextInt();
            stevci[ocena - 1]++;
        }
        for (int i = 0; i < stevci.length; i++) {
            System.out.printf("%d x %d\n", stevci[i], i + 1);
        }

        sc.close();
    }
}
