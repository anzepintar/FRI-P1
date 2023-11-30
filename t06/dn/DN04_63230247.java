import java.util.Scanner;

public class DN04_63230247 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        int k = sc.nextInt();
        int[] oznake = new int[1001];
        while (sc.hasNextInt()) {
            oznake[sc.nextInt()]++;
        }
        sc.close();
        long pari = 0L;
        for (int i = 0; i < oznake.length; i++) {
            for (int j = 0; j < oznake.length; j++) {
                if (i + j == k)
                    pari += oznake[i] * oznake[j];
            }
        }
        System.out.println(pari);
    }
}
