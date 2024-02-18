
import java.util.*;

public class Test27 {

    public static void main(String[] args) {
        Comparator<String> primerjalnik = (a, b) -> a.compareTo(b);

        Map<String, String> slovar = new HashMap<>();
        slovar.put("I6x0PJr8c", "8RVJ");
        slovar.put("eYhbM8tG0XwW36uUf", "TMWi1oLF");
        slovar.put("McF22D4wOH4", "e2n2xiwBvnph0mYl");
        slovar.put("vch246UtTOcDiKQ", "bc");
        slovar.put("yeaRTjcfcKDqRW", "zjjkBXNl");
        slovar.put("akwihWHW", "0QGZar0wUlZL2erdSP99");
        slovar.put("qV", "7tNkFioHreIbEk");
        slovar.put("I", "EdDUHY");
        slovar.put("0I7VvoL", "I2YfT5jSrVN");
        slovar.put("LVo2aA1cJyAcQPZ6bU", "coqI5WnG4ShVJC");
        slovar.put("2olfhrCbkImu", "hSKAwZuCh");
        slovar.put("2KOg", "hieXJtOo5hqlk");
        slovar.put("NoJfAJbLSgG7YWm", "2pwCD4");
        slovar.put("sWYgQV", "EsbizRDdCGKt2bWvM");
        slovar.put("9I2KkpBaLWCXH", "Gzl8VI");
        slovar.put("yxBShWylPfJCt", "sG");
        slovar.put("OnTBsRSRD2uJeG", "EKZwK2TZIyHdWQHxQw");
        slovar.put("fQhF2xf2f6WVwtm5F", "u5GmfHxMqiRgIXP");
        slovar.put("1Cpm", "7EZBXLn");
        slovar.put("yfEBC09B", "WsTsOdV");
        slovar.put("Kjf", "FVXcP");
        slovar.put("mF4Am", "rICEL");
        slovar.put("j4u28fugBK", "S");
        slovar.put("nQB", "W5A9qhJ2FmH");
        slovar.put("EMuMSm7r6W3Z7", "WrVP");
        slovar.put("rg7cpfm2bvyv1", "kiNroX87acX5");
        slovar.put("6V4jYLezq4TPRJXN", "I90JvTiHmjmrBVlb4");
        slovar.put("nYTeQh50H0NyOqkUr", "4EzdQC");
        slovar.put("VQT6U0lk", "7VNh");
        slovar.put("OpnUVbH5BqZzvK8u7W", "R5meHMTRO");
        slovar.put("N", "j34V4APuC4z");
        slovar.put("loi8WJMpsZ2McG", "YyuwiRhldpjgHn3qV8A");
        slovar.put("z8faLiNtBU", "JBuKqOa");
        slovar.put("nUOsmr6g67oLqwA", "Ey2zPTU4qcd7T");
        slovar.put("c1K5d7byIszMEDIH", "vfIkXIn05H");
        slovar.put("T0tzMGMy", "IzCIl");
        slovar.put("Vni2LXRkNQ", "l");
        slovar.put("csJVuAlK1d", "JcPMiBSNA9V");
        slovar.put("rq6auVRZGMbPGVsC4E", "pB");
        slovar.put("FUTzHgAz8B4q8c9ZE", "pUVRqYm96");
        slovar.put("hzFsoG3ePoLz", "24B80kv");
        slovar.put("pR", "RJjP0lbRv9YcRWCzIR7F");
        slovar.put("Scwv6", "VIf8YndOpFPczzke0itz");
        slovar.put("WExdy9zDCn9F0hSD", "ESYMf");
        slovar.put("gXu", "Vux6lc5NM5bUyaz700R");
        slovar.put("fZUTUPTRuqAc4", "oeLV2GrV4ceCEkI");
        slovar.put("SQPWbm12Mne7Yqvhy", "5");
        slovar.put("N9ee440yAA", "rnc");
        slovar.put("bDjbA4s0M9ZxEv7hXF", "XQ3Hjw54");
        slovar.put("gApS0ZYxr7sOfV8n7L", "w6kp9RfRRgGkjyyKo2");

        Set<String> mnozica = Cetrta.vecjiPrim(slovar, primerjalnik);

        List<String> seznam = new ArrayList<>(mnozica);
        seznam.sort(null);
        System.out.println(seznam);
    }
}
