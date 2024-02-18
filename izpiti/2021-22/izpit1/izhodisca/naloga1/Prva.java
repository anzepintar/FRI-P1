
/*
 * tj.exe Prva.java . .
 */

import java.util.*;

public class Prva {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int stevilo = 0;
        for (int i = a; i <= b; i++) {
            if (prastevilo(i)) {
                if (manjKot4(i + 2)) {
                    stevilo++;
                }
            }
        }
        System.out.println(stevilo);

    }

    private static boolean prastevilo(int n) {
        int steviloDel = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                steviloDel++;
        }
        return steviloDel <= 2;
    }

    public static boolean manjKot4(int n) {
        int steviloDeljiteljev = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                steviloDeljiteljev++;
            }
        }
        return steviloDeljiteljev <= 4;
    }

}
