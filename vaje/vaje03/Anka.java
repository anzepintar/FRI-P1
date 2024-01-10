import java.util.Scanner;

public class Anka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();
        sc.close();
        int stevilo = 0;
        for (int i = 0; i <= 999; i++) {
            int s1 = i / 100;
            int s2 = (i % 100 - i % 10) / 10;
            int s3 = i % 10;
            if (s1 % 2 == 1 && s2 > m && (s3 % d == 0)) {
                System.out.printf("%s-%s-%s\n", s1, s2, s3);
                stevilo++;
            }
        }
        System.out.println(stevilo);
    }
}
