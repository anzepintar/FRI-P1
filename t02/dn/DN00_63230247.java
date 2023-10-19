import java.util.Scanner;

public class DN00_63230247 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a / b;
        System.out.println(c);
        System.out.print(a - c * b);
        sc.close();
    }
}
