import java.util.Scanner;

public class Najboljsi {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Koliko atletov tekmuje: ");
    int stAtletov = sc.nextInt();

    int najDolzina = 0;
    for (int atlet = 1; atlet <= stAtletov; atlet++) {
      System.out.println("Vnesite dolžino skoka za " + atlet + ". atleta: ");
      int dolzina = sc.nextInt();
      if (dolzina > najDolzina) {
        najDolzina = dolzina;
      }
    }
    System.out.println("Najboljša dolžina je: " + najDolzina);
    sc.close();
  }
}