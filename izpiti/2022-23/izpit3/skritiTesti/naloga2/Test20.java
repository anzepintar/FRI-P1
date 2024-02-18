
import java.util.*;

public class Test20 {

    public static void main(String[] args) {
        final boolean T = true;
        final boolean F = false;

        boolean[][] t = {
            {T, F, F, T, F, F, F, F, F, F, F, F, F},
        };

        int[] statistika = Druga.manhattan(t);
        System.out.println(Arrays.toString(statistika));
    }
}
