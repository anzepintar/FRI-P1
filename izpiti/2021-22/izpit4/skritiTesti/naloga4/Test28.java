
import java.util.*;

public class Test28 {

    public static void main(String[] args) {
        Comparator<String> primerjalnik = (a, b) -> b.compareTo(a);

        Map<String, String> slovar = new HashMap<>();
        slovar.put("YKbF4q29ZUPSxP38y", "NVc5hLu3nWUTlf");
        slovar.put("3ZM43dtcaRlOaUzq", "Hwo10");
        slovar.put("7KQm", "26En");
        slovar.put("GSlVhBFRfHXzVlHwK", "1fUUsyRTAIqqoIY3Z");
        slovar.put("kTIbBX25HC", "sirPPgygedkbrkzfGv");
        slovar.put("EPrxILwXcVHXXzYDfh", "I");
        slovar.put("q8ONA", "3tbm7XDv");
        slovar.put("19bgJ5", "gEdqdraHh");
        slovar.put("teRGNvMORi6tDn5l", "0L");
        slovar.put("yc9QcDuq6YXdpJl6jGy", "KtKUhZJBgU7TLX1c5D");
        slovar.put("urVzIHxkC43AsA9cXo", "QJhWEVU5gCPnnU");
        slovar.put("bmgUaj5caTGGq", "hSPWKLNVYwWiCWpxgYsB");
        slovar.put("hl8GesFcSZt6jEGoIGtF", "Qik");
        slovar.put("N6zbpbkBqTcdolG", "7jQYeaN3R");
        slovar.put("YjO7Hg", "87");
        slovar.put("CcBcet83i", "z9YPj0nFUOioNSgM5aIt");
        slovar.put("cYxf0L", "EhsItg");
        slovar.put("7RKxpnHAj9", "bVWHz");
        slovar.put("ExuZdMwnc858", "7");
        slovar.put("iw3twTVJnCzTY72n", "AC9ENCT3qkvQvBf15T");
        slovar.put("V", "E6l6TKFEqdo5bQwT");
        slovar.put("doGJe", "KyhNPVtyaANz2yg");
        slovar.put("pCSPrYy", "bza2yEe7ZIWOIg3vUOTW");
        slovar.put("1RitjGx5wb4HsMbzZL", "4");
        slovar.put("J", "QJXWwig7y");
        slovar.put("3jY6xdzwEKEoX9Y3Cb", "cDJ");
        slovar.put("bcr3K2O", "K7u");
        slovar.put("oDqTw1sSLLkTiaAcoi", "1lUPJNgb6lDm4");
        slovar.put("FrfTbkE91FgBk8uYwODU", "K7hbXk8zGVfSs2Y");
        slovar.put("uz4swC", "Mogdb");
        slovar.put("BkFCCgH1Ypqf7", "6");
        slovar.put("N", "mUfKA4s");
        slovar.put("NChcDvF", "KfM");
        slovar.put("VvoxxJArjoKff", "G6OZUQ6Z9IDI5y7");
        slovar.put("nAwgflDh3wH", "iDwO9Xwjx4q6XoyEi");
        slovar.put("mIZf", "fKSQJ");
        slovar.put("pWeZXLOXx7", "VhMqAsf3auFY8mlHtK2");
        slovar.put("2P59nwfGro0kEVkTBp", "DG");
        slovar.put("kp9zF2vRbo2ociSuhFk4", "PCDhyS35rHOrg2k");
        slovar.put("9p2rCqlYt7kWxmaq", "17YzPqj5NcLTha");
        slovar.put("2okajsFbSAt", "QFMUq8EQVTM7");
        slovar.put("popkAvwlkrtWiN", "8TKCCK");
        slovar.put("O8dcBfTdUEmsalbc", "qB");
        slovar.put("yte3eGgIv15v4UnE", "D9RVGqAt9L81hK");
        slovar.put("QCIT", "pOxD3vjzHFDMWnSK");
        slovar.put("fxRHH", "q");
        slovar.put("6ueOSdRoV2G", "qp5eodN");
        slovar.put("VbjZ5PMi7", "UasSv55p4BfmJAbSkX");
        slovar.put("6nBmYVTblY1zvfij", "WPrtD8gNF1cgPNMm4Q");
        slovar.put("z3yk5", "MrKHOy6a2tG4g0oU");

        Set<String> mnozica = Cetrta.vecjiPrim(slovar, primerjalnik);

        List<String> seznam = new ArrayList<>(mnozica);
        seznam.sort(null);
        System.out.println(seznam);
    }
}
