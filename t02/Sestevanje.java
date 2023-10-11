package t02;

import java.util.Scanner;

public class Sestevanje {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int skupaj = 0;
    while (skupaj < 42) {
      System.out.println("Vnesite število: ");
      int stevilo = sc.nextInt();
      skupaj += stevilo;
      System.out.println("Skupaj: " + skupaj);
    }
    sc.close();
  }
}