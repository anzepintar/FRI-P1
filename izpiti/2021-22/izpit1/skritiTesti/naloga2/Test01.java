
import java.util.*;

public class Test01 {

    private static final boolean T = true;
    private static final boolean F = false;

    private static final boolean[][] MATRIKA1 = {
        {F, F, F, F, F, F, F, F},
        {F, F, F, F, F, F, F, F},
        {F, F, F, F, F, F, F, F},
        {F, F, F, F, F, F, F, F},
        {F, F, F, F, F, F, F, F},
        {F, F, F, F, F, F, F, F},
        {F, F, F, F, F, F, F, F},
        {F, F, F, F, F, F, T, F},
        {F, F, F, F, F, F, F, F},
        {F, F, F, F, F, F, F, F},
        {F, F, F, F, F, F, F, F},
        {F, F, F, F, F, F, F, F},
        {F, F, F, F, F, F, F, F},
        {F, F, F, F, F, F, F, F},
        {F, F, T, F, F, F, F, F},
        {F, F, F, F, F, F, F, F},
        {F, F, F, F, F, F, F, F},
        {F, F, F, F, F, F, F, F},
        {F, F, F, F, F, F, F, F},
        {F, F, F, F, F, F, F, F},
        {F, F, F, F, F, F, F, F},
    };

    private static final boolean[][] MATRIKA2 = {
        {F, F, F, F, F, F, F, F},
        {F, F, F, F, F, F, F, F},
        {F, F, F, F, F, F, F, F},
        {F, F, F, F, F, F, F, F},
        {F, T, F, F, T, F, F, F},
        {F, F, T, F, F, F, F, F},
        {F, F, F, F, F, F, F, F},
        {F, F, F, F, T, F, F, F},
        {F, F, F, F, F, F, F, F},
        {F, F, F, F, F, F, F, F},
        {F, F, F, F, F, F, F, F},
        {F, F, T, F, F, F, F, F},
        {F, F, F, T, F, F, F, F},
        {F, F, F, F, F, F, F, F},
        {F, F, F, F, F, F, F, F},
        {F, F, F, F, F, T, F, F},
        {F, F, F, F, F, F, F, F},
        {F, F, F, F, F, F, F, F},
        {F, F, F, F, F, T, F, F},
        {F, F, F, F, F, F, F, F},
        {F, F, F, T, F, F, F, F},
    };

    private static final boolean[][] MATRIKA3 = {
        {F, F, F, F, F, F, F, F},
        {F, F, F, F, F, F, F, F},
        {F, F, F, F, F, F, F, F},
        {F, F, F, F, F, F, F, F},
        {F, F, F, F, F, F, F, F},
        {F, F, F, F, F, F, F, F},
        {F, F, F, F, F, F, F, F},
        {F, F, F, F, F, F, F, F},
        {F, F, F, F, F, F, F, F},
        {F, F, F, F, F, F, T, F},
        {F, F, F, F, F, F, F, F},
        {F, F, F, F, F, F, F, F},
        {F, F, F, F, F, F, F, F},
        {F, F, F, F, F, F, F, F},
        {F, F, F, F, F, F, F, F},
        {F, F, F, F, F, F, F, F},
        {F, F, F, F, F, F, F, F},
        {F, F, F, F, F, F, F, F},
        {F, F, F, F, F, T, F, F},
        {F, F, F, F, F, F, F, F},
        {F, F, F, F, T, F, F, F},
    };

    public static void main(String[] args) {
        System.out.println(Druga.potZoge(5, MATRIKA1, 1));
        System.out.println(Druga.potZoge(6, MATRIKA2, 1));
        System.out.println(Druga.potZoge(3, MATRIKA3, 1));
    }
}
