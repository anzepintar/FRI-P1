package t02.primeri;

import java.util.Scanner;

public class Sestevanje2For {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int skupaj = 0;
    for (int steviloVnosov = 0; steviloVnosov < 5; steviloVnosov++) {
      System.out.println("Vnesite število: ");
      int stevilo = sc.nextInt();
      skupaj += stevilo;
      System.out.println("Skupaj: " + skupaj);
    }
    sc.close();
  }
}