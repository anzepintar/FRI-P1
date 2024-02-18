
import java.util.*;

public class Test01 {

    public static void main(String[] args) {
        final char[][] B1 = {
            {'p', 'e', 's'},
            {'e', 'n'},
            {'o', 'n', 'o'},
            {'s', 'o', 'l'},
            {'p', 'o', 't'},
            {'s', 'o'}
        };

        final char[][] P1 = {
            {'0', '0', 'v'},
            {'0', '1', 'n'},
            {'1', '0', 'v'},
            {'0', '2', 'n'},
            {'0', '0', 'n'},
            {'0', '2', 'n'}
        };

        System.out.println(Druga.krizankaOK(B1, P1));

        // pes -> pas (konflikt z /en/)

        final char[][] B2 = {
            {'p', 'a', 's'},
            {'e', 'n'},
            {'o', 'n', 'o'},
            {'s', 'o', 'l'},
            {'p', 'o', 't'},
            {'s', 'o'}
        };

        final char[][] P2 = {
            {'0', '0', 'v'},
            {'0', '1', 'n'},
            {'1', '0', 'v'},
            {'0', '2', 'n'},
            {'0', '0', 'n'},
            {'0', '2', 'n'}
        };

        System.out.println(Druga.krizankaOK(B2, P2));
    }
}
