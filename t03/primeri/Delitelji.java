import java.util.Scanner;

public class Delitelji {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stevilo = sc.nextInt();
        sc.close();
        int stDeliteljev = 0;

        for (int kandidat = 1; kandidat <= stevilo; kandidat++) {
            if (stevilo % kandidat == 0) {
                System.out.println(kandidat);
                stDeliteljev++;
            }
        }
        System.out.println("Število deljiteljev: " + stDeliteljev);
    }
}
