import java.util.Scanner;

public class Vecje {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Vnesite 1. število: ");
    int prvo = sc.nextInt();
    System.out.println("Vnesite 2. število: ");
    int drugo = sc.nextInt();
    if (prvo > drugo) {
      System.out.println("Prvo je večje");
    } else if (prvo < drugo) {
      System.out.println("Drugo je večje");
    } else {
      System.out.println("Števili sta enaki");
    }
    sc.close();
  }
}