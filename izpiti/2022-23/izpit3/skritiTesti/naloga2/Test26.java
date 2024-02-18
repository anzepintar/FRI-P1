
import java.util.*;

public class Test26 {

    public static void main(String[] args) {
        final boolean T = true;
        final boolean F = false;

        boolean[][] t = {
            {T, T, T, T, T, T, T, T, T, T, F, T, T, T, T, T, T, T, T, T, T, T, T, T, T, F, T, T, T, F, F, T, T, T, F, T, T, T, T, T, T, T, T, T, T},
        };

        int[] statistika = Druga.manhattan(t);
        System.out.println(Arrays.toString(statistika));
    }
}
