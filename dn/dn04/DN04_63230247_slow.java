import java.util.Scanner;

public class DN04_63230247_slow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] tab = new int[n];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = sc.nextInt();
        }
        sc.close();
        long pari = 0L;
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                if (tab[i] + tab[j] == k)
                    pari++;
            }
        }
        System.out.println(pari);
    }
}
