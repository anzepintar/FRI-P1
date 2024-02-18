
import java.util.*;

public class Test05 {

    private static final boolean[][] M = {
        {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false},
        {false,  true, false,  true,  true,  true, false,  true,  true,  true, false,  true,  true,  true, false,  true,  true,  true, false,  true,  true,  true, false},
        {false,  true, false,  true, false,  true, false,  true, false,  true, false,  true, false,  true, false,  true, false,  true, false,  true, false,  true, false},
        {false,  true,  true,  true, false,  true,  true,  true, false,  true,  true,  true, false,  true,  true,  true, false,  true,  true,  true, false,  true, false},
        {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false},
    };

    public static void main(String[] args) {
        System.out.println(Arrays.toString(Druga.poLomljenki(M)));
    }
}
