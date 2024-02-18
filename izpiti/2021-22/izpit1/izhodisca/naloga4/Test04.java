
import java.util.*;

public class Test04 {

    public static void main(String[] args) {
        List<Integer> seznam = List.of(
            43, 44, 46, 49, 53
        );

        Iterator<Integer> iterator = new Iterator<>() {
            int i = 0;
            int n = 0;

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                if (this.i >= seznam.size()) {
                    return ++this.n;
                }
                return this.n = seznam.get(this.i++);
            }
        };

        Iterator<Integer> manjkajoci = Cetrta.manjkajoci(iterator, 42);
        for (int i = 0;  i < 7;  i++) {
            System.out.println(manjkajoci.next());
        }
    }
}
