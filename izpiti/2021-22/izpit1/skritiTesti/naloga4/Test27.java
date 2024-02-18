
import java.util.*;

public class Test27 {

    public static void main(String[] args) {
        final int ZACETEK = 205708;
        final int ST_BREZ_IZPISA = 8864486;
        final int ST_IZPISOV = 65;

        Iterator<Integer> iterator = new Iterator<>() {
            Random random = new Random(100027);
            int n = ZACETEK;

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return this.n += random.nextInt(4) + 1;
            }
        };

        Iterator<Integer> manjkajoci = Cetrta.manjkajoci(iterator, ZACETEK);

        for (int i = 0;  i < ST_BREZ_IZPISA;  i++) {
            manjkajoci.next();
        }
        for (int i = 0;  i < ST_IZPISOV;  i++) {
            System.out.println(manjkajoci.next());
        }
    }
}
