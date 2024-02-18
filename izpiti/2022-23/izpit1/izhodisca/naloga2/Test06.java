
import java.util.*;

public class Test06 {

    public static void main(String[] args) {
        final char[][] B1 = {
            {'a', 'b', 'c'},
            {'b', 'c', 'd'},
            {'b', 'c', 'd'},
            {'a', 'b', 'c'},
        };

        final char[][] P1 = {
            {'9', '8', 'v'},
            {'9', '9', 'v'},
            {'8', '9', 'n'},
            {'7', '9', 'n'},
        };

        final char[][] B2 = {
            {'a', 'b', 'c'},
        };

        final char[][] P2 = {
            {'9', '9', 'v'},
        };

        final char[][] B3 = {
            {'a', 'b', 'a', 'b'},
            {'a', 'b', 'a', 'b'},
        };

        final char[][] P3 = {
            {'5', '3', 'n'},
            {'5', '1', 'n'},
        };

        final char[][] B4 = {
            {'a', 'b', 'a', 'b', 'b'},
            {'a', 'b', 'a', 'b', 'b'},
        };

        final char[][] P4 = {
            {'5', '3', 'v'},
            {'5', '1', 'v'},
        };

        System.out.println(Druga.krizankaOK(B1, P1));
        System.out.println(Druga.krizankaOK(B2, P2));
        System.out.println(Druga.krizankaOK(B3, P3));
        System.out.println(Druga.krizankaOK(B4, P4));
    }
}
