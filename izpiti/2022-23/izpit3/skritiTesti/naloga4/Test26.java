
import java.util.*;

public class Test26 {

    public static void main(String[] args) {
        List<String> seznam = new ArrayList<>(List.of("6hz9", "w6", "kMG5", "clYv9", "tRL", "j2jQ", "XiXr", "OVh", "uoU0", "Oa_DM", "tJ", "4p2Hr", "caWOA", "G", "gK", "JN0x_", "rFqg", "OjXsM", "fK1mp", "g5KT", "Cr", "vbAl", "j_7y", "e", "Yb3", "Jla", "Nxvx", "YVWw", "vDlgh", "VezE", "so_8", "kUPk", "NuN", "WJv", "VJ", "q9oC", "R", "aCFqY", "WM", "1T", "NWSyZ", "DepyV", "mfQdg", "NipA", "Hg", "F", "mFLh", "m", "nN", "1vny"));
        Set<String> mnozica = new TreeSet<>(List.of("SSVI", "QE", "DwE", "7R7hZ", "Mv4", "2", "MjZb", "FkLrt", "a", "N", "2_AG0", "5J", "Rq", "CzeSE", "Eo", "v5", "sAAo", "MPH", "ykVRz"));

        Cetrta.Miks<String> miks = new Cetrta.Miks<>(seznam, mnozica);
        List<String> skupaj = new ArrayList<>();
        for (String element: miks) {
            skupaj.add(element);
        }
        System.out.println(skupaj);
    }
}
