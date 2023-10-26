import java.util.Scanner;

public class Ocene {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ocena = sc.nextInt();
        switch (ocena) {
            case 10:
                System.out.println("odlično");
                break;
            case 9:
            case 8:
                System.out.println("prav dobro");
                break;           
            case 7:
                System.out.println("dobro");
                break;           
            case 6:
                System.out.println("zadostno");
                break;
            default:
                System.out.println("nezadostno");
                break;
        }
    }
}
