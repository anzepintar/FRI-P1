import java.util.Arrays;
import java.util.Scanner;

// ta program deluje idealno -> po vrsti polni datoteke,
// da prihrani čim več prostora
// ni čisto po navodilih, torej preverjanje z tj ne deluje
public class Zgoscenke2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] prazneZgoscenke = new int[n];
        while (sc.hasNextInt()) {
            int datoteka = sc.nextInt();
            for (int i = 0; i < prazneZgoscenke.length; i++) {
                if (prazneZgoscenke[i] + datoteka <= k) {
                    prazneZgoscenke[i] += datoteka;
                    System.out.printf("%s EP -> zgoscenka %s %s\n", datoteka, i, Arrays.toString(prazneZgoscenke));
                    break;
                }
            }
        }
        sc.close();
    }
}
