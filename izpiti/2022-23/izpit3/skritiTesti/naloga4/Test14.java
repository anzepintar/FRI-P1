
import java.util.*;

public class Test14 {

    public static void main(String[] args) {
        List<String> seznam = new ArrayList<>(List.of("DC", "2Ii", "8Steo", "hwX", "0", "4Q3", "OEz", "BKY", "b", "7", "c", "Kzocz", "jF", "y", "i_5GA"));
        Set<String> mnozica = new TreeSet<>(List.of("4D3", "i", "G8dV9", "1H", "b8", "jbpnq", "w", "1QQ6", "j4mQc", "g", "Fh", "RAC", "_Iu5", "hp", "ctZBs", "o", "2fF", "w", "84pn", "_", "EJqy", "nRViw", "HLef", "kmyc5", "YT", "LBD4T", "2", "Ub", "nJ7DR", "fTO", "1hp", "NXq", "BCC", "CuruZ", "evD3", "KdAza", "RPX5M", "gM", "R", "p", "q", "WqqYt", "Jbr", "VP", "kBJP", "Z0A", "NPjX", "YYzoC", "dHI"));

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
