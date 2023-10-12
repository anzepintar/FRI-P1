import java.util.Scanner;

public class Vsota2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    sc.close();
    String[] tab = str.split(" ");
    int a = Integer.parseInt(tab[0]); 
    int b = Integer.parseInt(tab[1]);
    int c = a + b;
    System.out.println(a + " + " + b + " = " + c);
  }
}
