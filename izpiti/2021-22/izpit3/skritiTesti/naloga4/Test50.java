
import java.util.*;

public class Test50 {

    public static void main(String[] args) {
        Cetrta.Avtomat avtomat = Cetrta.Avtomat.zaBesedo("ajXCVrFqYzPJecZb");

        List<String> besede = List.of(
            "",
            "a",
            "aj",
            "ajX",
            "ajXC",
            "ajXCV",
            "ajXCVr",
            "ajXCVrF",
            "ajXCVrFq",
            "ajXCVrFqY",
            "ajXCVrFqYz",
            "ajXCVrFqYzP",
            "ajXCVrFqYzPJ",
            "ajXCVrFqYzPJe",
            "ajXCVrFqYzPJec",
            "ajXCVrFqYzPJecZ",
            "ajXCVrFqYzPJecZb",
            "jXCVrFqYzPJecZb",
            "XCVrFqYzPJecZb",
            "CVrFqYzPJecZb",
            "VrFqYzPJecZb",
            "rFqYzPJecZb",
            "FqYzPJecZb",
            "qYzPJecZb",
            "YzPJecZb",
            "zPJecZb",
            "PJecZb",
            "JecZb",
            "ecZb",
            "cZb",
            "Zb",
            "b",
            "A",
            "B",
            "C",
            "D",
            "E",
            "F",
            "G",
            "H",
            "I",
            "J",
            "K",
            "L",
            "M",
            "N",
            "O",
            "P",
            "Q",
            "R",
            "S",
            "T",
            "U",
            "V",
            "W",
            "X",
            "Y",
            "Z",
            "a",
            "b",
            "c",
            "d",
            "e",
            "f",
            "g",
            "h",
            "i",
            "j",
            "k",
            "l",
            "m",
            "n",
            "o",
            "p",
            "q",
            "r",
            "s",
            "t",
            "u",
            "v",
            "w",
            "x",
            "y",
            "z"
        );

        for (String beseda: besede) {
            String stanje = null;
            try {
                stanje = kam(avtomat, beseda);
            } catch (RuntimeException ex) {}
            System.out.println(stanje != null && jeSprejemno(avtomat, stanje));
        }
    }

    private static boolean jeSprejemno(Cetrta.Avtomat avtomat, String stanje) {
        return avtomat.vrniSprejemnaStanja().contains(stanje);
    }

    private static String kam(Cetrta.Avtomat avtomat, String beseda) {
        int dolzina = beseda.length();
        String stanje = avtomat.vrniZacetnoStanje();
        Map<String, Map<Character, String>> prehodi = avtomat.vrniPrehode();
        for (int i = 0;  i < dolzina;  i++) {
            char znak = beseda.charAt(i);
            stanje = prehodi.get(stanje).get(znak);
            if (stanje == null) {
                return null;
            }
        }
        return stanje;
    }
}
