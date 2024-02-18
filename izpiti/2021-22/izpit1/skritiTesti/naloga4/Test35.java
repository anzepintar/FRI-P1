
import java.util.*;

public class Test35 {

    public static void main(String[] args) {
        final int ZACETEK = 585852;
        final int ST_BREZ_IZPISA = 3069;
        final int ST_IZPISOV = 73;

        Iterator<Integer> iterator = new Iterator<>() {
            Random random = new Random(100035);
            int n = ZACETEK;

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return this.n += random.nextInt(10) + 1;
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
