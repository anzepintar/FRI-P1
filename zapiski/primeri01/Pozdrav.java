import java.util.Scanner;

class Pozdrav {
    public static void main(String[] args) {
        System.out.println("Pozdravljen, svet");
        int a = 59;
        System.out.println(a + " let");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vpisi leto rojstva: ");
        int letoRojstva = scanner.nextInt();
        System.out.println("Tvoja starost je " + (2023 - letoRojstva));
        scanner.close();
    }
}