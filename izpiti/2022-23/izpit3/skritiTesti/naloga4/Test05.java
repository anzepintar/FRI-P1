
import java.util.*;

public class Test05 {

    public static void main(String[] args) {
        List<String> seznam = new ArrayList<>(List.of("Wyba", "K", "o4cP", "O", "q", "d", "Az", "efA", "8J", "_bP0", "7ndv", "mrTl3", "b", "RCxt", "2V", "uvBG", "OOqMd", "RcFI", "wQB", "Gwqy", "iD_l", "bPn", "N", "8bu7S", "5Zg5", "WX"));
        Set<String> mnozica = new TreeSet<>(List.of("NTAM7", "bZxis", "kf3y", "OU4", "yZGk", "K2_", "aqwk", "an1m", "p", "6", "o1nm", "H9zu", "mwq", "1", "t", "2", "q", "iuyc0", "ejt", "v", "Zu", "AgwVE", "C", "rIC3G", "2", "3gB", "fO3O", "ePcC", "q2e", "3yw3u", "6Tw8O", "c7WWN", "te", "ax", "2NN2", "w4", "F", "QddF", "zlA9F", "tW3X", "M", "9", "Y"));

        Cetrta.Miks<String> miks = new Cetrta.Miks<>(seznam, mnozica);
        miks.zamenjaj();

        List<String> noviSeznam = new ArrayList<>(miks.vrniSeznam());
        noviSeznam.sort(null);

        List<String> lstNovaMnozica = new ArrayList<>(miks.vrniMnozico());
        lstNovaMnozica.sort(null);

        System.out.println(noviSeznam);
        System.out.println(lstNovaMnozica);
    }
}
