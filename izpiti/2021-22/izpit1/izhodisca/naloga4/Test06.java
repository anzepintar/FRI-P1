
import java.util.*;

public class Test06 {

    public static void main(String[] args) {

        Iterator<Integer> iterator = new Iterator<>() {
            Random random = new Random(12345);
            int n = 0;

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return this.n += random.nextInt(5) + 1;
            }
        };

        Iterator<Integer> manjkajoci = Cetrta.manjkajoci(iterator, 0);
        for (int i = 0;  i < 20;  i++) {
            System.out.println(manjkajoci.next());
        }
    }
}
