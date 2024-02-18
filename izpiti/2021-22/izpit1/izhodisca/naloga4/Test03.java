
import java.util.*;

public class Test03 {

    public static void main(String[] args) {
        Random random = new Random(12345);
        Iterator<Integer> iterator = new Iterator<>(){
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return random.nextInt(100000);
            }
        };
        System.out.println(Cetrta.odsek(iterator, 90000, 90100));
    }
}
