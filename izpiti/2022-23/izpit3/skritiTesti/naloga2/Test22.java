
import java.util.*;

public class Test22 {

    public static void main(String[] args) {
        final boolean T = true;
        final boolean F = false;

        boolean[][] t = {
            {T, F, F, T, F, F, T, T, T, F, T, F, T, T, F, T, T, T, F, F, T, T, F, T, F, F, T, F, T, F, T, F},
        };

        int[] statistika = Druga.manhattan(t);
        System.out.println(Arrays.toString(statistika));
    }
}
