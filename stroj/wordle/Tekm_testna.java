import java.nio.charset.Charset;
import java.util.*;

public class Tekm_testna implements Stroj {
    // seznam vseh besed - z vsako uganjeno besedo se zmanjša
    private Set<String> slovar;

    // seznam možnih besed za potezo
    // npr ne vsebuje besed s črkami, ki se niso pojavile v prejšnji potezi
    private Set<String> mozneBesede;
    // nazadnje preverjena beseda
    private String prejsnjaBeseda;

    // ----- inicializacija
    @Override
    public void inicializiraj(Set<String> slovar) {
        this.slovar = new HashSet<>(slovar);
    }

    // ----- preverjanje, če je pravilna beseda
    private static <T> boolean vseEnako(List<T> odziv, T plus) {
        return odziv.stream().allMatch(e -> e.equals(plus));
    }

    @Override
    public String poteza(List<Character> odziv) {
        if (odziv == null) {
            this.mozneBesede = new HashSet<>(slovar);
        } else {
            if (vseEnako(odziv, '+')) {
                this.slovar.remove(prejsnjaBeseda);
                return null;
            }
            odstraniNemozneBesede(odziv, prejsnjaBeseda);
        }
        return null;
    }

    private String najboljsaPrvaBeseda(Set<String> slovar) {
        for (int i = 0; i < 6; i++) {
            for (String string : slovar) {

            }
        }
        return "aeiou";
    }

    // po poskusu odstrani vse besede, ki vsebujejo katero koli črko, ki je vrnila
    // "-"
    private void odstraniNemozneBesede(List<Character> odziv, String beseda) {
        int i = 0;
        String seznamCrk = "";
        for (Character c : odziv) {
            if (c == '-') {
                seznamCrk += beseda.charAt(i);
            }
            i++;
        }
        odstraniBesedeSCrkami(seznamCrk);
    }

    private void odstraniBesedeSCrkami(String nizCrk) {
        Set<String> result = new HashSet<>();
        for (String str : slovar) {
            if (!containsAnyCharacter(str, nizCrk)) {
                result.add(str);
            }
        }
        // besede trenutnega ugibanja
        this.mozneBesede = result;
    }

    private boolean containsAnyCharacter(String str, String characters) {
        for (char c : characters.toCharArray()) {
            if (str.contains(String.valueOf(c))) {
                return true;
            }
        }
        return false;
    }
}
