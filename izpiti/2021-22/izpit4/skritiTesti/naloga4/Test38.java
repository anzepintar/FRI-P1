
import java.util.*;

public class Test38 {

    public static void main(String[] args) {
        String[] objekti = {
            "M4UCTkGM8bzEMNDzr1", "6awPxTfDqkIQwrf",
            "sfOE", "qjkdDq1zmg31M",
            "N1dilNsrNBR", "Ba",
            "FfcXEXxqD", "6ZU6Cibu",
            "w", "SXwGa",
            "Ix0AOTTM", "KwYGVrlZmDkb",
            "5uBqdMP8HvXI1JJ3GM3", "1Qhj6bh2o41SZRrU6e",
            "JfW80blbp5pF4RzddS", "u1sUw74L7v3RXYGz",
            "aFsx3iJrSEL09", "MR4TkN7vjMtS7oDjGH",
            "hWMU3gWiH4", "3XaGSg8OljKSTfPz",
            "xD1QDyaL", "Mg7V3KTSLOQNE4",
            "c", "ls6gdMo",
            "VQZFRohH", "Xciy8gN4PkmxdzAlz",
            "m", "sIuygYLCsWe6Nxn",
            "IVW", "cxlluyg",
            "rZgl0tCEEoG7WxJC", "95",
            "wFUcOVSK9Lbxm", "XVvfxvH0QjC9",
            "y5gkNOvaNjbDYYXsMba1", "SFcIkPfWjENvA",
            "1j", "xx16z",
            "jRKnflaPTcZZh", "Ul4eJtrgcrqJFD",
            "tH4HrAGqiQ", "gWx",
            "nxf", "qHljqe",
            "gRUbK", "gdnqn",
            "k2D5G6QjLal5", "r1Ga0X1AUu5c4PGh",
            "RkgF", "BaeBQ6i3lDxC",
            "Zv5JFWuy", "8S4Za",
            "ZY6E0JT4zg", "ojlDgR79aBjg9B6neLo",
            "65wnCV1BUPvFFzSx", "dyd5DTG4sA85FLSxo",
            "a6tlA", "2kuqs",
            "jmP7", "cAUakHtB",
        };

        Map<String, String> slovar = new HashMap<>();
        Set<String> mnozica = new HashSet<>();

        slovar.put(objekti[0], objekti[1]);
        slovar.put(objekti[2], objekti[3]);
        slovar.put(objekti[4], objekti[5]);
        mnozica.add(objekti[4]);
        slovar.put(objekti[6], objekti[7]);
        mnozica.add(objekti[6]);
        slovar.put(objekti[8], objekti[9]);
        mnozica.add(objekti[8]);
        slovar.put(objekti[10], objekti[11]);
        mnozica.add(objekti[10]);
        slovar.put(objekti[12], objekti[13]);
        mnozica.add(objekti[12]);
        slovar.put(objekti[14], objekti[15]);
        mnozica.add(objekti[14]);
        slovar.put(objekti[16], objekti[17]);
        mnozica.add(objekti[16]);
        slovar.put(objekti[18], objekti[19]);
        mnozica.add(objekti[18]);
        slovar.put(objekti[20], objekti[21]);
        slovar.put(objekti[22], objekti[23]);
        slovar.put(objekti[24], objekti[25]);
        slovar.put(objekti[26], objekti[27]);
        mnozica.add(objekti[26]);
        slovar.put(objekti[28], objekti[29]);
        mnozica.add(objekti[28]);
        slovar.put(objekti[30], objekti[31]);
        mnozica.add(objekti[30]);
        slovar.put(objekti[32], objekti[33]);
        mnozica.add(objekti[32]);
        slovar.put(objekti[34], objekti[35]);
        slovar.put(objekti[36], objekti[37]);
        mnozica.add(objekti[36]);
        slovar.put(objekti[38], objekti[39]);
        mnozica.add(objekti[38]);
        slovar.put(objekti[40], objekti[41]);
        mnozica.add(objekti[40]);
        slovar.put(objekti[42], objekti[43]);
        slovar.put(objekti[44], objekti[45]);
        mnozica.add(objekti[44]);
        slovar.put(objekti[46], objekti[47]);
        slovar.put(objekti[48], objekti[49]);
        mnozica.add(objekti[48]);
        slovar.put(objekti[50], objekti[51]);
        mnozica.add(objekti[50]);
        slovar.put(objekti[52], objekti[53]);
        mnozica.add(objekti[52]);
        slovar.put(objekti[54], objekti[55]);
        mnozica.add(objekti[54]);
        slovar.put(objekti[56], objekti[57]);
        mnozica.add(objekti[56]);
        slovar.put(objekti[58], objekti[59]);

        Comparator<String> prim = Cetrta.primerjalnik(slovar, mnozica);

        System.out.println(prim.compare(objekti[40], objekti[41]) > 0);
        System.out.println(prim.compare(objekti[34], objekti[4]) > 0);
        System.out.println(prim.compare(objekti[22], objekti[29]) > 0);
        System.out.println(prim.compare(objekti[20], objekti[21]) > 0);
        System.out.println(prim.compare(objekti[54], objekti[55]) > 0);
        System.out.println(prim.compare(objekti[38], objekti[30]) > 0);
        System.out.println(prim.compare(objekti[2], objekti[3]) > 0);
        System.out.println(prim.compare(objekti[52], objekti[50]) > 0);
        System.out.println(prim.compare(objekti[32], objekti[33]) > 0);
        System.out.println(prim.compare(objekti[32], objekti[33]) > 0);
        System.out.println(prim.compare(objekti[4], objekti[53]) > 0);
        System.out.println(prim.compare(objekti[22], objekti[17]) > 0);
        System.out.println(prim.compare(objekti[46], objekti[58]) > 0);
        System.out.println(prim.compare(objekti[36], objekti[4]) > 0);
        System.out.println(prim.compare(objekti[44], objekti[45]) > 0);
        System.out.println(prim.compare(objekti[2], objekti[3]) > 0);
        System.out.println(prim.compare(objekti[52], objekti[53]) > 0);
        System.out.println(prim.compare(objekti[9], objekti[17]) > 0);
        System.out.println(prim.compare(objekti[7], objekti[43]) > 0);
        System.out.println(prim.compare(objekti[52], objekti[13]) > 0);
        System.out.println(prim.compare(objekti[38], objekti[47]) > 0);
        System.out.println(prim.compare(objekti[56], objekti[57]) > 0);
        System.out.println(prim.compare(objekti[44], objekti[45]) > 0);
        System.out.println(prim.compare(objekti[28], objekti[29]) > 0);
        System.out.println(prim.compare(objekti[32], objekti[33]) > 0);
        System.out.println(prim.compare(objekti[2], objekti[3]) > 0);
        System.out.println(prim.compare(objekti[54], objekti[48]) > 0);
        System.out.println(prim.compare(objekti[46], objekti[47]) > 0);
        System.out.println(prim.compare(objekti[19], objekti[38]) > 0);
        System.out.println(prim.compare(objekti[52], objekti[53]) > 0);
        System.out.println(prim.compare(objekti[42], objekti[15]) > 0);
        System.out.println(prim.compare(objekti[4], objekti[5]) > 0);
        System.out.println(prim.compare(objekti[53], objekti[28]) > 0);
        System.out.println(prim.compare(objekti[36], objekti[37]) > 0);
        System.out.println(prim.compare(objekti[42], objekti[49]) > 0);
        System.out.println(prim.compare(objekti[26], objekti[4]) > 0);
        System.out.println(prim.compare(objekti[58], objekti[4]) > 0);
        System.out.println(prim.compare(objekti[42], objekti[43]) > 0);
        System.out.println(prim.compare(objekti[6], objekti[7]) > 0);
        System.out.println(prim.compare(objekti[2], objekti[3]) > 0);
        System.out.println(prim.compare(objekti[22], objekti[23]) > 0);
        System.out.println(prim.compare(objekti[3], objekti[32]) > 0);
        System.out.println(prim.compare(objekti[4], objekti[27]) > 0);
        System.out.println(prim.compare(objekti[22], objekti[23]) > 0);
        System.out.println(prim.compare(objekti[4], objekti[19]) > 0);
        System.out.println(prim.compare(objekti[2], objekti[3]) > 0);
        System.out.println(prim.compare(objekti[38], objekti[11]) > 0);
        System.out.println(prim.compare(objekti[35], objekti[36]) > 0);
        System.out.println(prim.compare(objekti[0], objekti[1]) > 0);
        System.out.println(prim.compare(objekti[52], objekti[53]) > 0);
    }
}
