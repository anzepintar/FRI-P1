
import java.util.*;

public class Test26 {

    public static void main(String[] args) {
        final int ZACETEK = -126563;
        final int ST_BREZ_IZPISA = 967;
        final int ST_IZPISOV = 71;

        Iterator<Integer> iterator = new Iterator<>() {
            Random random = new Random(100026);
            int n = ZACETEK;

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return this.n += random.nextInt(8) + 1;
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
