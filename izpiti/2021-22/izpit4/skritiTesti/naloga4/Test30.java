
import java.util.*;

public class Test30 {

    public static void main(String[] args) {
        Comparator<String> primerjalnik = (a, b) -> b.length() - a.length();

        Map<String, String> slovar = new HashMap<>();
        slovar.put("Fkvdl1qQ8xu0GAkWL", "9ISxAJrkgSHVkgV");
        slovar.put("ELf9oVBgF4V1", "4VHBz57k4Zj6cpcRS95");
        slovar.put("lEkQOKGQaL5YC", "QvEjlJQQ");
        slovar.put("qHcL8t", "w3CnppQ");
        slovar.put("w62efNShwKJ7", "5LNXcRKCKgmtOyONxuG");
        slovar.put("f9F7RqyJM13q3nvf", "XMgxBqGKKwGDyp");
        slovar.put("mTwouQChKxb9M6e", "7hYaZFvr3d");
        slovar.put("OqzNG739AvLtP9d", "8p5gZgy6MhMA2qZ15MiX");
        slovar.put("mcfnAxfSnYMPLeCc", "zk9sI00xQYfv");
        slovar.put("5ILBqtVX6NH0oncpm8", "HvTGw1ne1ThNSdAmZ8");
        slovar.put("Y", "0U492");
        slovar.put("adl", "jVkryd0sO");
        slovar.put("5qgpL", "kMIRBIwUUXtqVrqJ");
        slovar.put("mIAZOptJclwC", "eQ");
        slovar.put("3NzXAL062JO9", "V8LTPQGj3");
        slovar.put("K6c33bCNgO", "imkGt4FeuSQ");
        slovar.put("ZYPqbImeo", "YXe33Dxwx8cje");
        slovar.put("DqYPsTTohSxVpw", "RliPLusscZ8SnD");
        slovar.put("YmwTvJ3cE7nm8", "PggYINAmK1aKpiZHK");
        slovar.put("9sKpBg", "tBIjpQ");
        slovar.put("yWCHISSclwKUd", "lyD09SQgiAob");
        slovar.put("Twjqov3NairTByZc", "R");
        slovar.put("P8GwvR", "IVdVDRRmRmrXuiYW");
        slovar.put("lNtvFLba", "NTdLcGw8BejBBIW4PzYT");
        slovar.put("sHm9Mgn9Rj5B35SnlSZ", "q0iQShV3iu");
        slovar.put("YtROtYWl0fBdUbl5", "X1CsjItSJM4vuNHSak");
        slovar.put("BDUKJl5Q", "b");
        slovar.put("kg6w0nkEHc2M5", "G");
        slovar.put("o40d0e", "rlr11lT");
        slovar.put("qXNL", "UZH0DM1c8gYkOwu412Qz");
        slovar.put("IDuk7axThN6", "Ho88F0ozMSQRFp5A");
        slovar.put("zBZoMLeCwCz2BiO", "TeUBy2hkcPjwtTQu");
        slovar.put("mRJfrczONmssa", "1wsMnLEYGY");
        slovar.put("ivptR000h", "A3odT7eqr4HYTX8");
        slovar.put("pZz0U7b", "n0");
        slovar.put("LSJ3i3oLqQiqPMA7a5D", "4");
        slovar.put("Z5JHhJFr0Oe", "BUB8d");
        slovar.put("HWkjpB0huTk", "neE5hA4AqSnLtWidY");
        slovar.put("6gQ4z6dkz1wP5", "mlPPPSEU2Ql2Ty");
        slovar.put("TTGFPSI1", "7U");
        slovar.put("NXB3TVkm7l", "QuQNMOJ05amWiVfK8Md");
        slovar.put("gVpdaE", "99GIfU5xhdCNpDvN");
        slovar.put("hNK83vzjmQ9box", "B12Ns2iEkJNo");
        slovar.put("rMT8zcxWc", "eeo6I");
        slovar.put("YOKGf72tHp", "JH2TYqTVPXmJhMB9J");
        slovar.put("eFQoo2", "acW3NL1eeH1XlrrNlaT8");
        slovar.put("VBo", "mk");
        slovar.put("yC", "TZw");
        slovar.put("PTdMsLhr36jqxvxfN", "mGogIw1DB6qx0Q0uDT");
        slovar.put("o6dN5c3UnZxD0", "JL");

        Set<String> mnozica = Cetrta.vecjiPrim(slovar, primerjalnik);

        List<String> seznam = new ArrayList<>(mnozica);
        seznam.sort(null);
        System.out.println(seznam);
    }
}
