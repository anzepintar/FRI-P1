
import java.util.*;

public class Test21 {

    public static void main(String[] args) {
        Comparator<String> primerjalnik = (a, b) -> a.length() - b.length();

        Map<String, String> slovar = new HashMap<>();
        slovar.put("8G3", "GLm74T");
        slovar.put("kJ87vs", "J");
        slovar.put("Lg", "2U2OKH");
        slovar.put("PQC12", "nzTH");
        slovar.put("arNHweVbvqNQ5cpfzH", "2PWQB0F");
        slovar.put("JXCoDkoi6Fwpd8TXC1u", "Shyg1O1IkMzqlXi");
        slovar.put("rbrSVVwx3KoG", "DKZXSz476CeUB1sJyZi");
        slovar.put("gkOYfRy6p", "KJxLsGUb065wU");
        slovar.put("rWTCke", "E4DQGKswYDxF44xmH");
        slovar.put("tbll", "H");
        slovar.put("ZDnS2cIzE19jB8XV", "RtkUoNWijSl9J6");
        slovar.put("D0tQtztPV9DVp5", "HPcAFez6iDOiev00S5c6");
        slovar.put("J2du8aRsMrCwjDx1Gq4K", "LOjQ3mIKiT135s");
        slovar.put("MIasfKH2G06D3fo", "qVTsVlcw9m1");
        slovar.put("iM", "bJNiKVmNC1XT");
        slovar.put("L7hSOWw", "PQwbsreu");
        slovar.put("zyuS04", "vLOkkmc6wMmKmy5HQi4");
        slovar.put("g5lWiuvpGaYlK", "7WkfEYUcRw9J");
        slovar.put("PS1LtPb0xKIsMKf1QG", "oqXhCN1HvNLfCJSZ");
        slovar.put("Lds8yy5Jc3JCV1v", "uYq1PX2rhoRjD");
        slovar.put("MI9Xu", "Ferib");
        slovar.put("7TpL93lS", "CTA8ouCF2hVqOVYqYJ1f");
        slovar.put("p", "mVUPr848");
        slovar.put("UgvNQ7O", "aKksHQyYB");
        slovar.put("8v6UEPNvxneptPxQ", "GaS3ASbqSqmLUuCSWw");
        slovar.put("A3OlNU1s7sY7nt", "q7L6jRde1KU8Ix4fgK");
        slovar.put("WzyWtXerYNGY2bmpEEx", "rjt7UhTqaBnr89c");
        slovar.put("n040ACve8Y4pxBfc1Et9", "QnNzku2mK");
        slovar.put("7rtt2TV8FAxn", "liv7eyu9ydJRZJ");
        slovar.put("a2eAmz4s", "lFxV2ymLut");
        slovar.put("Zp81SWpyON92QX", "LpkONOoU27m");
        slovar.put("r5pZ", "1ke5KLQtil9wT");
        slovar.put("yzWVIapss3AEpe", "6Mlc4DNx4mk9agTeZI");
        slovar.put("PTdSsW5y9dwVHTuxW", "ciLNQK87rMQsPqpHbo");
        slovar.put("SoP4cyWvRfzZI", "uI2E98G");
        slovar.put("Fz06jQs", "qJSSClbRxqzjC5KJI");
        slovar.put("TITu7", "Yi1PDRX");
        slovar.put("xEg", "9TqVkGNb");
        slovar.put("5WOx0ILUgs", "93");
        slovar.put("7Eoylxd", "iDsb0ky7tYoNG6d6");
        slovar.put("2grryFY", "3H9r01zcQqoYRY9");
        slovar.put("Cw9WMLk4J", "VfAZcUYiK3ybqRwh");
        slovar.put("PqWNDZAyAhSERq", "023qXE");
        slovar.put("OrNBpHrbCXSQdh6TSwp", "kGKDXPDlttWd2e");
        slovar.put("nxyOyBXkdCUwQrSRr8i", "16ycB8WhEZQWopF52v8");
        slovar.put("WZV01DFVhTNe", "DrCTD5pBLw");
        slovar.put("71mI8bdMh99b", "9ZSQ");
        slovar.put("UFnRk", "Wn3");
        slovar.put("8i", "d9jK");
        slovar.put("irH9WuPTU", "zZZuZFVTFAT2");

        Set<String> mnozica = Cetrta.vecjiPrim(slovar, primerjalnik);

        List<String> seznam = new ArrayList<>(mnozica);
        seznam.sort(null);
        System.out.println(seznam);
    }
}
