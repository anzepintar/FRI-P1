
import java.util.*;

public class Test24 {

    public static void main(String[] args) {
        final boolean T = true;
        final boolean F = false;

        boolean[][] t = {
            {T, T, T, F, T, F, T, T, F, T, T, F, F, F, T, F, F, F, T, F, T, T},
        };

        int[] statistika = Druga.manhattan(t);
        System.out.println(Arrays.toString(statistika));
    }
}
