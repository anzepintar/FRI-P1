import java.util.Scanner;

public class Prastevila1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int meja = sc.nextInt();
        sc.close();

        for (int kandidat = 2; kandidat <= meja; kandidat++) {
            int stDeliteljev = 0;
            for (int d = 1; d <= kandidat; d++) {
                if (kandidat % d == 0) {
                    stDeliteljev++;
                }
            }

            if (stDeliteljev == 2) {
                System.out.println(kandidat);
            }
        }
    }
}
