
import java.util.*;

public class Test50 {

    public static void main(String[] args) {
        String[] objekti = {
            "4b", "4K8p",
            "50Af6G5rRBBM", "uU",
            "75NFSI", "UQcgF3G57",
            "uaPN6qaG3bgQY6dTW", "XDqkcQl9E5JaeswGZgW",
            "ffHVA", "wOp1mmSK2vT",
            "lrvvZEhRaS3BjkCheOLP", "QdzR2",
            "fYFaVshDUoh4lO8l", "VJxjS",
            "bBZpB7k6CMyUv5", "p",
            "vH6m7nNDz", "sSStP8Eu75rGwtqMwbLW",
            "YcCY1mkfFtnx5", "4w3",
            "aHQQbpdy915xF6GkLly", "jUfcLe9cU1",
            "iWlgvEVkFBOWZH", "xI33k",
            "ZynpKs", "RMwqwZjC36kqH8LK7",
            "VbJUwAMtlm8cikweeL8", "aNuM9hjVA5u1X35WFs",
            "kc6ajl63", "PRYo2GEU",
            "jjGTQi", "QkzJ",
            "AkDG6tNj", "87PPyaQfIyFyvse",
            "ExMwAR5Hu", "andJB3ZG7P",
            "kRiQEAPRjYVRzAYcZC", "LgkfTPc",
            "XwN", "kfEzOJqeClqn7g0fNRy",
            "PbRtYnfI9", "ROGqcYCJU",
            "cbN4n1", "j",
            "M", "i92ixr4334HF4wb",
            "6B3YsvVRbB9dTMaJwbK", "2O6HAT",
            "oWSsth3", "bEeq16ha",
            "hEfo3K", "2PudswSInEO",
            "jR1fFge0zjb", "jorKBYS02m",
            "oJq", "5",
            "QeGCXN", "7s",
            "SqO8MzFoin", "4",
        };

        Map<String, String> slovar = new HashMap<>();
        Set<String> mnozica = new HashSet<>();

        slovar.put(objekti[0], objekti[1]);
        slovar.put(objekti[2], objekti[3]);
        slovar.put(objekti[4], objekti[5]);
        slovar.put(objekti[6], objekti[7]);
        mnozica.add(objekti[6]);
        slovar.put(objekti[8], objekti[9]);
        mnozica.add(objekti[8]);
        slovar.put(objekti[10], objekti[11]);
        slovar.put(objekti[12], objekti[13]);
        mnozica.add(objekti[12]);
        slovar.put(objekti[14], objekti[15]);
        mnozica.add(objekti[14]);
        slovar.put(objekti[16], objekti[17]);
        slovar.put(objekti[18], objekti[19]);
        slovar.put(objekti[20], objekti[21]);
        slovar.put(objekti[22], objekti[23]);
        mnozica.add(objekti[22]);
        slovar.put(objekti[24], objekti[25]);
        mnozica.add(objekti[24]);
        slovar.put(objekti[26], objekti[27]);
        mnozica.add(objekti[26]);
        slovar.put(objekti[28], objekti[29]);
        slovar.put(objekti[30], objekti[31]);
        slovar.put(objekti[32], objekti[33]);
        mnozica.add(objekti[32]);
        slovar.put(objekti[34], objekti[35]);
        slovar.put(objekti[36], objekti[37]);
        slovar.put(objekti[38], objekti[39]);
        slovar.put(objekti[40], objekti[41]);
        mnozica.add(objekti[40]);
        slovar.put(objekti[42], objekti[43]);
        slovar.put(objekti[44], objekti[45]);
        mnozica.add(objekti[44]);
        slovar.put(objekti[46], objekti[47]);
        slovar.put(objekti[48], objekti[49]);
        slovar.put(objekti[50], objekti[51]);
        slovar.put(objekti[52], objekti[53]);
        slovar.put(objekti[54], objekti[55]);
        slovar.put(objekti[56], objekti[57]);
        slovar.put(objekti[58], objekti[59]);

        Comparator<String> prim = Cetrta.primerjalnik(slovar, mnozica);

        System.out.println(prim.compare(objekti[16], objekti[17]) > 0);
        System.out.println(prim.compare(objekti[42], objekti[43]) > 0);
        System.out.println(prim.compare(objekti[26], objekti[27]) > 0);
        System.out.println(prim.compare(objekti[12], objekti[13]) > 0);
        System.out.println(prim.compare(objekti[50], objekti[51]) > 0);
        System.out.println(prim.compare(objekti[52], objekti[53]) > 0);
        System.out.println(prim.compare(objekti[13], objekti[41]) > 0);
        System.out.println(prim.compare(objekti[38], objekti[39]) > 0);
        System.out.println(prim.compare(objekti[18], objekti[32]) > 0);
        System.out.println(prim.compare(objekti[52], objekti[53]) > 0);
        System.out.println(prim.compare(objekti[50], objekti[51]) > 0);
        System.out.println(prim.compare(objekti[44], objekti[38]) > 0);
        System.out.println(prim.compare(objekti[22], objekti[6]) > 0);
        System.out.println(prim.compare(objekti[58], objekti[53]) > 0);
        System.out.println(prim.compare(objekti[38], objekti[39]) > 0);
        System.out.println(prim.compare(objekti[50], objekti[51]) > 0);
        System.out.println(prim.compare(objekti[24], objekti[29]) > 0);
        System.out.println(prim.compare(objekti[28], objekti[29]) > 0);
        System.out.println(prim.compare(objekti[52], objekti[45]) > 0);
        System.out.println(prim.compare(objekti[22], objekti[23]) > 0);
        System.out.println(prim.compare(objekti[12], objekti[13]) > 0);
        System.out.println(prim.compare(objekti[30], objekti[20]) > 0);
        System.out.println(prim.compare(objekti[56], objekti[46]) > 0);
        System.out.println(prim.compare(objekti[54], objekti[55]) > 0);
        System.out.println(prim.compare(objekti[47], objekti[9]) > 0);
        System.out.println(prim.compare(objekti[28], objekti[29]) > 0);
        System.out.println(prim.compare(objekti[52], objekti[53]) > 0);
        System.out.println(prim.compare(objekti[59], objekti[9]) > 0);
        System.out.println(prim.compare(objekti[38], objekti[44]) > 0);
        System.out.println(prim.compare(objekti[6], objekti[39]) > 0);
        System.out.println(prim.compare(objekti[32], objekti[33]) > 0);
        System.out.println(prim.compare(objekti[43], objekti[18]) > 0);
        System.out.println(prim.compare(objekti[52], objekti[53]) > 0);
        System.out.println(prim.compare(objekti[44], objekti[19]) > 0);
        System.out.println(prim.compare(objekti[23], objekti[4]) > 0);
        System.out.println(prim.compare(objekti[58], objekti[5]) > 0);
        System.out.println(prim.compare(objekti[40], objekti[41]) > 0);
        System.out.println(prim.compare(objekti[4], objekti[5]) > 0);
        System.out.println(prim.compare(objekti[42], objekti[48]) > 0);
        System.out.println(prim.compare(objekti[10], objekti[5]) > 0);
        System.out.println(prim.compare(objekti[10], objekti[11]) > 0);
        System.out.println(prim.compare(objekti[14], objekti[2]) > 0);
        System.out.println(prim.compare(objekti[52], objekti[53]) > 0);
        System.out.println(prim.compare(objekti[14], objekti[15]) > 0);
        System.out.println(prim.compare(objekti[24], objekti[25]) > 0);
        System.out.println(prim.compare(objekti[10], objekti[11]) > 0);
        System.out.println(prim.compare(objekti[12], objekti[45]) > 0);
        System.out.println(prim.compare(objekti[2], objekti[3]) > 0);
        System.out.println(prim.compare(objekti[13], objekti[38]) > 0);
        System.out.println(prim.compare(objekti[0], objekti[8]) > 0);
    }
}
