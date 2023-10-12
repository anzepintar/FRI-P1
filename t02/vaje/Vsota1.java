import java.util.Scanner;

public class Vsota1 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    sc.close();
    String[] tab = str.split(" ");
    System.out.println(Integer.parseInt(tab[0])+Integer.parseInt(tab[1]));

  }
}
