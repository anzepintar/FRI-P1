
import java.util.*;

public class Test20 {

    public static void main(String[] args) {
        Comparator<String> primerjalnik = (a, b) -> b.compareTo(a);

        Map<String, String> slovar = new HashMap<>();
        slovar.put("GdafFl", "sAPN5QvHWZIdiTuZd");
        slovar.put("g8u3P3NU1m0T", "qCd");
        slovar.put("vCMPE", "R2fjWT");
        slovar.put("0mzjEQJ", "It2Bgd11LDbFlUibRsr");
        slovar.put("pB", "VD1ga6YU");
        slovar.put("qCSo8CggNev24Kb7Cjy", "EiiXhzCabP6rdn");
        slovar.put("p2WNkETqSRu", "Wbad");
        slovar.put("dk296s8yUMz", "yDIXdnyD");
        slovar.put("VvvM8L4Eyl", "V4mDf2xgOYeHi");
        slovar.put("p70e1iqVG5yYt2M75tMY", "aWuOJh0nj");
        slovar.put("YFESWMnm1UVjO", "Ajf1YTXJzi");
        slovar.put("W1FXuxRXCooP", "MSkmd3sugeM80");
        slovar.put("u", "HWiPaHqtfH1z");
        slovar.put("ijbCGk1QXD6OhSW6w6", "m");
        slovar.put("VhwWIk3PFSRYWgvQxt", "NJ02T");
        slovar.put("uTzn7MkkBkYbCvan7GD", "Oj9Rvht5");
        slovar.put("rOBJtm9IZ1s", "cR9a");
        slovar.put("tm0f0I", "I9U8vU1fpVPb");
        slovar.put("RErkPe7ObZmnBkd8g", "xW44ClXBiroKZueKy");
        slovar.put("om595l5UiYb", "BooZwTOzIev94QRkzSgo");
        slovar.put("ED", "BsIg");
        slovar.put("C7xv9LbISUNGdN", "0A1nt");
        slovar.put("mw44f7kyn27M9l5TUM", "XzPgyA7aWd");
        slovar.put("mQZhHG", "L02");
        slovar.put("Q8KUurrlHpwbHTd", "4LXdCWXg");
        slovar.put("47M", "3Goqd9PrdJLp9ydY9");
        slovar.put("H1LVMtxLmBjI1kWxrP", "xAipW4aoes2b340");
        slovar.put("XNJAH", "imp1spY7gKLF5w");
        slovar.put("uj6M3ZqEZQJ5DVVi8", "AhNYfhIwlCkxJ");
        slovar.put("VKzFsPv", "dg09yHm10V");
        slovar.put("Hsedx", "JDfDk8cvxiJO");
        slovar.put("KPV", "uHJmbBJTVrWdWRxbaBF");
        slovar.put("2JDueE", "UlLbAljCBusLSY09");
        slovar.put("BTOMD4teqh30IwZS1T", "iLn3yIEn0");
        slovar.put("Zn4JK45dMDpU", "zu1fZdpJmRdkoMEBKS");
        slovar.put("YPr8mYI", "yx2DGoeMSb2jV");
        slovar.put("CrI9czvTOZegL", "2hYkVHY");
        slovar.put("DOSwPWDuVcRIr", "H7SUTQUH9");
        slovar.put("ch9tH8dCf", "p5UtyKGxbpuJxvSHDc94");
        slovar.put("qEOKlLsB", "GNEqNN");
        slovar.put("Cm", "vNXTZtiF6");
        slovar.put("WQu4z6aQIib431", "qp7Z6jh");
        slovar.put("ort", "6PDLWxvsyJtC");
        slovar.put("Uidm89IJyD3nfjOe", "rUVqsc7");
        slovar.put("xOxD7vq", "a1levwXl");
        slovar.put("9LBs3aDqflyB1", "wCtFv11zEN");
        slovar.put("bWX5TyWnW", "fDL2cOH0YycBj1E31");
        slovar.put("f28aKZ2cZLB6lFFxkC", "YWpMtqisioQU8l");
        slovar.put("TpkhIVdGDnUB0RZCN2y", "txASh0nt");
        slovar.put("dfkM3", "8no6WVVSK");

        Set<String> mnozica = Cetrta.vecjiPrim(slovar, primerjalnik);

        List<String> seznam = new ArrayList<>(mnozica);
        seznam.sort(null);
        System.out.println(seznam);
    }
}
