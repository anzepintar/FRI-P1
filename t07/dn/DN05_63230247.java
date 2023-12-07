import java.util.Scanner;

public class DN05_63230247 {
    static int[][] liki = {
            { 0, 0, 0, 0, 1, 1, 1, 1 }, // 0
            { 0, 4 }, // 1
            { 0, 0, 2, 2 }, // 2
            { 0, 0, 0, 1, 2, 1 }, // 3
            { 1, 0, 1, 3 }, // 4
            { 1, 0, 1, 1, 2, 1 }, // 5
            { 0, 1, 3, 1 }, // 6
            { 0, 0, 3, 1 }, // 7
            { 0, 0, 0, 1, 1, 2 }, // 8
            { 2, 0, 1, 3 }, // 9
            { 0, 1, 1, 2, 1, 1 }, // 10
            { 0, 0, 1, 3 }, // 11
            { 1, 1, 0, 1, 1, 2 }, // 12
            { 0, 2, 3, 1 }, // 13
            { 0, 0, 0, 2, 1, 1 }, // 14
            { 1, 0, 0, 1, 2, 1 }, // 15
            { 0, 1, 2, 2 }, // 16
            { 0, 0, 1, 1, 2, 1 }, // 17
            { 1, 0, 2, 2 }, // 18
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] tab = new int[2001 + 3];
        for (int i = 0; i < n; i++) {
            int[] t = liki[sc.nextInt()];
            int pol = t.length / 2;
            int x = sc.nextInt();
            int maxY = 0;
            for (int j = 0; j < pol; j++) {
                maxY = Math.max(tab[x + 1000 + j] - t[j], maxY);
            }
            for (int j = 0; j < pol; j++) {
                tab[x + 1000 + j] = maxY + t[j] + t[j + pol];
            }
        }
        sc.close();
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] != 0)
                System.out.println(i - 1000 + ": " + tab[i]);
        }
    }
}
