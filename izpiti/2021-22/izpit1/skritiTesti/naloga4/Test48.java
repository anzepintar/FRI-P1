
import java.util.*;

public class Test48 {

    public static void main(String[] args) {
        final int ZACETEK = 768449;
        final int ST_BREZ_IZPISA = 98231;
        final int ST_IZPISOV = 68;

        Iterator<Integer> iterator = new Iterator<>() {
            Random random = new Random(100048);
            int n = ZACETEK;

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return this.n += random.nextInt(5) + 1;
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
