import java.util.Scanner;

public class Nadlegovanje {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vnos = 0;
        do {
            System.out.print("Vnesite odgovor na vprašanje: ");
            vnos = sc.nextInt();
        } while (vnos != 42);
        sc.close();
    }
}
