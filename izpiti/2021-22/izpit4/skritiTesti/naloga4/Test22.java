
import java.util.*;

public class Test22 {

    public static void main(String[] args) {
        Comparator<String> primerjalnik = (a, b) -> b.length() - a.length();

        Map<String, String> slovar = new HashMap<>();
        slovar.put("oXkW", "rLAadbSBUBp5A9Jd2swU");
        slovar.put("s2DvbEqzh", "BQJt");
        slovar.put("jaGk", "iDl7");
        slovar.put("F2SFbWVCwZO8sqI1gVDd", "syZ7sQoGZg");
        slovar.put("zxF8jvGiWowKwMCG", "Q1DM");
        slovar.put("TwowAjmFLX", "X5fsPZho");
        slovar.put("0", "GhR");
        slovar.put("C1PZhZ9e8W7ccs", "ExPDnEwVcczTr9y4zt");
        slovar.put("QcGLqb9bVkyAK", "JL5vqAhgMfIyib6zr");
        slovar.put("fnlCPqxRVrsxs2Oae18Q", "1MNhCHARI2p79");
        slovar.put("dH3D0D", "MMTzV");
        slovar.put("Mtle9j4gHMnHbM7tg", "BqknKby2uiZPa9Wx");
        slovar.put("8", "bx2UiCqMLprQkVglh");
        slovar.put("7Pr2", "itMsU4Pl");
        slovar.put("YSeyt1vI6", "lv1Xm1jfXk");
        slovar.put("h7P4x", "iIBI1gvB6hm3Tvg");
        slovar.put("cjBZx5vf2AO", "VGf3TJJD");
        slovar.put("LjD5T2PqGYOMNba", "Z4ydUCHmkUjq3mI");
        slovar.put("ji", "daL");
        slovar.put("nicT", "JKpHakh");
        slovar.put("AjXVsOe", "LKWRBFk44eNpYuNFGU");
        slovar.put("CeJJTDH6", "kGNjFV5Lhyx9yezghD");
        slovar.put("9Y4DfPKXvzs6s7u0mygF", "GEdo");
        slovar.put("iwH0KXHACcO", "8c6IPdyPd8U7ylJ");
        slovar.put("QUp221ZPHlNHc1Utwvuf", "OAbFcn5hMOW");
        slovar.put("uW", "NXKHSLHL9g");
        slovar.put("OZoa0C", "OPiZhWtPTi5aQCn5");
        slovar.put("2qa7Msv", "0p7pN2ykypq");
        slovar.put("D5E4nhvjtLdKkiH4", "A4aG1iV7UxSkj9");
        slovar.put("3Ijccep", "CMx6XYQ");
        slovar.put("kmz", "7Tc3DTj");
        slovar.put("wqV", "XASCm9VotvcU1WPTaYmK");
        slovar.put("B28Q3lyY", "EY6k9n");
        slovar.put("46RjFDo", "mWuCDkMYNuGg");
        slovar.put("H", "No5");
        slovar.put("oUlSRjqvPWK4hZ3pN9", "BOyFGNzSfLL01LBo");
        slovar.put("G6wltOhqoJsKif2Ip", "980YebNDR");
        slovar.put("y", "nSKEE31IpyX70MS");
        slovar.put("zFrHEQokA", "92MDalyOnYhOSbauN3yc");
        slovar.put("xWpAekIGVdgQ", "xEZJFWrJ8Ikk");
        slovar.put("fZ2XTADhXHyLt", "wvLVNM8SDDn95");
        slovar.put("JhdXpXH3THyUjv1W3SGc", "bKM4dsLN2O1z61ai");
        slovar.put("kmE", "nFEVAVXJc");
        slovar.put("ES9poKkvMJ", "yNHNgPEPvXq0g");
        slovar.put("5v8PZmdAFa33M0h", "SfMXXpcstG");
        slovar.put("clN6rAOudWvkw", "fVigs5qeFZCiZ1");
        slovar.put("eCd1", "2hXeRy06G7P6rS1du");
        slovar.put("ZKYlwIebKR3guhB0f", "xO9adHeclu6BZtuiKSB");
        slovar.put("rSl9wWpjkcWQu4k", "APNcpbnv");
        slovar.put("O7bMfno", "5UeItX4yw8O4NGTkR");

        Set<String> mnozica = Cetrta.vecjiPrim(slovar, primerjalnik);

        List<String> seznam = new ArrayList<>(mnozica);
        seznam.sort(null);
        System.out.println(seznam);
    }
}
