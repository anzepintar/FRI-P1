
import java.util.*;

public class Test05 {

    public static void main(String[] args) {
        Iterator<Integer> iterator = new Iterator<>() {
            int n = -10;

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                int nPrej = this.n;
                this.n += 2;
                return nPrej;
            }
        };

        Iterator<Integer> manjkajoci = Cetrta.manjkajoci(iterator, -10);
        for (int i = 0;  i < 10;  i++) {
            System.out.println(manjkajoci.next());
        }
    }
}
