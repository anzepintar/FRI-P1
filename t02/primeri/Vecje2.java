import java.util.Scanner;

public class Vecje2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Vnesite število točk: ");
    int tocke = sc.nextInt();
    int ocena = 0;
    if (tocke >= 0 && tocke <= 100) {
      if (tocke >= 90) {
        ocena = 10;
      } else if (tocke >= 80) {
        ocena = 9;
      } else if (tocke >= 70) {
        ocena = 8;
      } else if (tocke >= 60) {
        ocena = 7;
      } else if (tocke >= 50) {
        ocena = 6;
      } else {
        ocena = 5;
      }
      System.out.println(ocena);
    } else {
      System.out.println("Neveljaven vnos.");
    }
    sc.close();
  }
}
