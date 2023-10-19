import java.util.Scanner;

public class Prestopno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("vnesite leto:");
        int leto = sc.nextInt();

        if (leto % 400 == 0 || leto % 4 == 0 && leto % 100 != 0) {
            System.out.println("leto je prestopno");
        } else {
            System.out.println("leto ni prestopno");
        }
        sc.close();
    }
}