
import java.util.*;

public class Urejanje {

    // S pomo"cjo navadnega vstavljanja uredi podani seznam glede na podani
    // primerjalnik.
    public static <T> void uredi(List<T> seznam, Comparator<T> primerjalnik) {
        int stElementov = seznam.size();

        for (int i = 1;  i < stElementov;  i++) {
            T element = seznam.get(i);
            int j = i - 1;

            while (j >= 0 && primerjalnik.compare(seznam.get(j), element) > 0) {
                seznam.set(j + 1, seznam.get(j));
                j--;
            }
            seznam.set(j + 1, element);
        }
    }
}
