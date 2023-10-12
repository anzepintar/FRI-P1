package t02.primeri;

import java.util.Scanner;

public class Sestevanje2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int steviloVnosov = 0;
    int skupaj = 0;
    while (steviloVnosov < 5) {
      System.out.println("Vnesite število: ");
      int stevilo = sc.nextInt();
      skupaj += stevilo;
      System.out.println("Skupaj: " + skupaj);
      steviloVnosov++;
    }
    sc.close();
  }
}