import java.util.Scanner;

public class Prijatelj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stevilo = sc.nextInt();
        sc.close();

        int kandidat = vsotaDeliteljev(stevilo);

        if (kandidat != stevilo && vsotaDeliteljev(kandidat) == stevilo) {
            System.out.println(kandidat);
        } else {
            System.out.println("Nima prijatelja");
        }

    }

    public static int vsotaDeliteljev(int stevilo) {
        int vsota = 0;
        for (int d = 1; d < stevilo; d++) {
            if (stevilo % d == 0) {
                vsota += d;
            }
        }
        return vsota;
    }
}
