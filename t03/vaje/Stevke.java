import java.util.Scanner;

public class Stevke {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.close();
		String a = sc.nextLine();
		int lenA = a.length();
		for (int i = 0; i < lenA; i++) {
			System.out.println(a.charAt(lenA - 1 - i));

		}
	}
}
