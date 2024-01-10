import java.util.Scanner;

public class Romanje {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt(); // dolzina poti
		int p = sc.nextInt(); // dolzina na dan
		int z = sc.nextInt(); // manjsa dolzina zaradi utrujenosti
		sc.close();
		int dan = 1;

		while (p > 0 && d > 0) {
			System.out.printf("%s: %s -> %s%n", dan, d, (d - p > 0) ? (d - p) : 0);
			d = d - p;
			p = p - z;
			dan++;
		}

	}
}
