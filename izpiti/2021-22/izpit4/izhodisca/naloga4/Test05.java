
import java.util.*;

public class Test05 {

    public static void main(String[] args) {
        Comparator<String> primerjalnik = (a, b) -> b.length() - a.length();

        Map<String, String> slovar = new HashMap<>();
        slovar.put("pRuqdGK", "ZG7xN");
        slovar.put("OWdaGZDjwqutXJ", "tA7DOz6fYZY1xBlZgP2S");
        slovar.put("q9K", "10M");
        slovar.put("KY", "dpn6sAFSFKwY0");
        slovar.put("WzBydBeY6an8oX", "XF");
        slovar.put("esWCPRr7sk", "7EpmnOG503u");
        slovar.put("aYTO8", "Y");
        slovar.put("T0ys", "u8");
        slovar.put("ULIDXMFuDvpiRIKisI", "7OXQWKEq91H5lZIzY8fd");
        slovar.put("AFIvztgrOiHAEYy", "IV8terdOj");
        slovar.put("dg", "B");
        slovar.put("QsF9PVFR7SM", "7ZQcm0SM");
        slovar.put("jK0", "RmFXeGVdcyv");
        slovar.put("5Qez5", "gkoJWlvPaJNpL");
        slovar.put("C3", "PkxycrhxnCbnEwqz0u");
        slovar.put("xID1VC2VubT", "F4T17x1BSCq4");
        slovar.put("v6DdEBTjo730pXiYD299", "uDOGhVV");
        slovar.put("ROGdH", "NCl9MdMY7OpSPXnIjE5Z");
        slovar.put("KHaL4FVTRMSQEQdivGsV", "b1U2miiYAO4yAj2p");
        slovar.put("9z30Eye0P7W5yOd", "3Ke");
        slovar.put("0SPemdraZ", "4zQv3UCwm24ervDpt6");
        slovar.put("H53", "DN7");
        slovar.put("PnTHeHhGs0csmazYN", "NG8GLT");
        slovar.put("CF1zcXxCbDzbY", "j");
        slovar.put("thgZ4uRgc", "zpHeQvbW9ZvEXGwD2E");
        slovar.put("CZZwFE", "v8m");
        slovar.put("67Fp", "g2yb1n");
        slovar.put("fb6EOn1QdtQG", "zyQ");
        slovar.put("pwoK", "OZw2q69");
        slovar.put("efbX0ko1S1iKZ6pi6Gl", "VjMJn");
        slovar.put("yxMGojvTmoGeZ3pqTtY", "XpBnd07PfEyqY");
        slovar.put("pv1bugFB0mFKSqMEX", "3t");
        slovar.put("npyt8dsbpuC", "6NRPIHIvvAW");
        slovar.put("jnlrZI8ZTSuyx", "oGuo27QQDRYj");
        slovar.put("0MRUsFjs4bJ", "A7rOkda7TZB1gw3gx");
        slovar.put("f2I5gkUTTdTf2DrV1P7", "QSC0BW99cjJcafvTK");
        slovar.put("XwUaI6VGyT", "ZtBfdezc9gOk");
        slovar.put("oOTIsF9PE2DimB", "W9BRfCCUJ6vYJili");
        slovar.put("yKDksXa74nrjoKbNvQL5", "oV0zflr5gC2UWwUe3bl5");
        slovar.put("6cboMd34EgIECnDOr", "QDc2kn");
        slovar.put("8WKGJtSU9gN9T2g", "B5PAP4ZMQt");
        slovar.put("0HYbK74X", "m13Q");
        slovar.put("xSmqeclKoLY", "DF7V");
        slovar.put("4j6eSmz2zixoffXglv", "N01erpz4KLiaDe");
        slovar.put("b44rs9M4WUQMuI", "Xnt2s4eewcx");
        slovar.put("1MUmbJ", "xgiRXWp");
        slovar.put("Yt", "6w8HJHOc");
        slovar.put("g", "2");
        slovar.put("nXhmvFYkygF", "2TpTb9zcMA9HcqY");
        slovar.put("PuwY", "Mw");

        Set<String> mnozica = Cetrta.vecjiPrim(slovar, primerjalnik);

        List<String> seznam = new ArrayList<>(mnozica);
        seznam.sort(null);
        System.out.println(seznam);
    }
}
