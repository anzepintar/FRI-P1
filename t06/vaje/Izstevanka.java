import java.util.Arrays;
import java.util.Scanner;

public class Izstevanka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stOtrok = sc.nextInt();
        int stBesed = sc.nextInt();
        String[] imena = new String[stOtrok];
        for (int i = 0; i < imena.length; i++) {
            imena[i] = sc.next();
        }
        sc.close();
        Arrays.toString(imena);
        while (stOtrok > 1) {
            System.out.println(imena[(stBesed - 1) % stOtrok]);
            imena[(stBesed - 1) % stOtrok] = null;
            stOtrok--;
            Arrays.toString(imena);
        }
    } // moraš še dodati skrajšanje tabele
}
