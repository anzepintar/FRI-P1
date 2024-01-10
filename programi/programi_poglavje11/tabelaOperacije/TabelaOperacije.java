
import java.util.*;
import java.util.function.*;

public class TabelaOperacije {

    private static class Plus implements IntBinaryOperator {
        @Override
        public int applyAsInt(int a, int b) {
            return a + b;
        }
    }

    public static void main(String[] args) {
        // operacijo predstavimo kot objekt stati"cnega notranjega razreda
        // Plus
        tabelaOperacije(5, new Plus());
        System.out.println();

        // operacijo predstavimo kot objekt anonimnega notranjega razreda 
        tabelaOperacije(5, new IntBinaryOperator() {
            @Override
            public int applyAsInt(int a, int b) {
                return a - b;
            }
        });
        System.out.println();

        // operacijo predstavimo kot lambdo
        tabelaOperacije(5, (a, b) -> a * b);
        System.out.println();
    }

    public static void tabelaOperacije(int n, IntBinaryOperator op) {
        for (int i = 1;  i <= n;  i++) {
            for (int j = 1;  j <= n;  j++) {
                System.out.printf(" %3d", op.applyAsInt(i, j));
            }
            System.out.println();
        }
    }
}
