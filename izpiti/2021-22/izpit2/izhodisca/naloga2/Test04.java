
import java.util.*;

public class Test04 {

    private static final int[][][] SLIKA = {
        {{10, 20, 30}, {50, 50, 50}, {40, 20, 60}, {70, 30, 10}},
        {{30, 50, 40}, {90, 60, 90}, {40, 10, 50}, {30, 50, 20}},
        {{50, 60, 60}, {20, 50, 40}, {70, 30, 70}, {50, 80, 90}},
        {{30, 40, 20}, {50, 80, 70}, {50, 70, 60}, {90, 40, 50}},
        {{70, 30, 70}, {20, 90, 70}, {30, 80, 80}, {60, 90, 60}},
    };

    public static void main(String[] args) {
        System.out.println(Druga.stolpecZNajvecPrevladujoceZelenimi(SLIKA));
    }
}
