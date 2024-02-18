
import java.util.*;

public class Test29 {

    public static void main(String[] args) {
        final int ZACETEK = 729212;
        final int ST_BREZ_IZPISA = 5689;
        final int ST_IZPISOV = 42;

        Iterator<Integer> iterator = new Iterator<>() {
            Random random = new Random(100029);
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
