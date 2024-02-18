
import java.util.*;

public class Test01 {

    private static final boolean T = true;
    private static final boolean F = false;

    private static final boolean[][] MATRIKA = {
        {F, F, F, F, F, F, F, T, F, F, F, F},
        {F, F, F, F, T, F, F, F, F, F, F, F},
        {F, F, F, F, F, T, F, F, F, F, F, F},
        {F, F, F, F, F, F, F, F, F, F, F, F},
        {F, F, F, F, F, F, F, F, F, F, T, F},
        {F, F, F, F, F, F, T, F, F, F, F, F},
        {F, F, F, T, F, F, F, F, F, T, F, F},
    };

    public static void main(String[] args) {
        System.out.println(Druga.potZoge(5, MATRIKA, 1));
    }
}
