
import java.util.*;

public class Test45 {

    public static void main(String[] args) {
        Tretja.Tablica[] tablice = new Tretja.Tablica[50];
        tablice[0] = new Tretja.Tablica(new char[]{'Y', 'G'}, 3322, true);
        tablice[1] = new Tretja.Tablica(new char[]{'Y', 'G'}, 3322, false);
        tablice[2] = new Tretja.Tablica(new char[]{'Y', 'G'}, 3322, true);
        tablice[3] = tablice[2];
        tablice[4] = new Tretja.Tablica(new char[]{'D', 'J'}, 6139, true);
        tablice[5] = new Tretja.Tablica(new char[]{'Y', 'G'}, 4273, false);
        tablice[6] = new Tretja.Tablica(new char[]{'X', 'A'}, 3322, false);
        tablice[7] = new Tretja.Tablica(new char[]{'X', 'A'}, 3322, false);
        tablice[8] = tablice[4];
        tablice[9] = new Tretja.Tablica(new char[]{'H', 'G'}, 3322, false);
        tablice[10] = new Tretja.Tablica(new char[]{'Y', 'P'}, 2812, false);
        tablice[11] = tablice[6];
        tablice[12] = new Tretja.Tablica(new char[]{'M', 'M'}, 6139, true);
        tablice[13] = tablice[2];
        tablice[14] = new Tretja.Tablica(new char[]{'E', 'T'}, 4218, false);
        tablice[15] = new Tretja.Tablica(new char[]{'Y', 'G'}, 3322, false);
        tablice[16] = tablice[9];
        tablice[17] = new Tretja.Tablica(new char[]{'Z', 'W'}, 2812, true);
        tablice[18] = new Tretja.Tablica(new char[]{'W', 'L'}, 5916, true);
        tablice[19] = new Tretja.Tablica(new char[]{'M', 'J'}, 6139, true);
        tablice[20] = new Tretja.Tablica(new char[]{'W', 'J'}, 3322, false);
        tablice[21] = new Tretja.Tablica(new char[]{'Y', 'G'}, 1852, true);
        tablice[22] = new Tretja.Tablica(new char[]{'Y', 'G'}, 3322, true);
        tablice[23] = new Tretja.Tablica(new char[]{'Y', 'G'}, 1911, false);
        tablice[24] = new Tretja.Tablica(new char[]{'Y', 'G'}, 3586, false);
        tablice[25] = new Tretja.Tablica(new char[]{'Y', 'G'}, 3322, true);
        tablice[26] = new Tretja.Tablica(new char[]{'Y', 'G'}, 1483, false);
        tablice[27] = tablice[11];
        tablice[28] = new Tretja.Tablica(new char[]{'E', 'T'}, 8579, false);
        tablice[29] = new Tretja.Tablica(new char[]{'X', 'N'}, 2489, true);
        tablice[30] = new Tretja.Tablica(new char[]{'G', 'E'}, 2823, false);
        tablice[31] = new Tretja.Tablica(new char[]{'X', 'A'}, 5125, false);
        tablice[32] = new Tretja.Tablica(new char[]{'U', 'N'}, 4178, false);
        tablice[33] = new Tretja.Tablica(new char[]{'Y', 'G'}, 3322, true);
        tablice[34] = new Tretja.Tablica(new char[]{'E', 'T'}, 8867, true);
        tablice[35] = new Tretja.Tablica(new char[]{'Y', 'G'}, 3322, true);
        tablice[36] = new Tretja.Tablica(new char[]{'U', 'N'}, 4178, false);
        tablice[37] = new Tretja.Tablica(new char[]{'O', 'S'}, 4273, false);
        tablice[38] = new Tretja.Tablica(new char[]{'O', 'P'}, 2136, false);
        tablice[39] = new Tretja.Tablica(new char[]{'U', 'S'}, 6528, true);
        tablice[40] = new Tretja.Tablica(new char[]{'H', 'G'}, 3322, false);
        tablice[41] = new Tretja.Tablica(new char[]{'B', 'R'}, 5257, false);
        tablice[42] = new Tretja.Tablica(new char[]{'X', 'A'}, 3322, true);
        tablice[43] = new Tretja.Tablica(new char[]{'D', 'J'}, 6139, true);
        tablice[44] = new Tretja.Tablica(new char[]{'Y', 'G'}, 7355, true);
        tablice[45] = new Tretja.Tablica(new char[]{'U', 'R'}, 3322, true);
        tablice[46] = new Tretja.Tablica(new char[]{'Y', 'G'}, 6348, true);
        tablice[47] = new Tretja.Tablica(new char[]{'T', 'S'}, 2489, false);
        tablice[48] = new Tretja.Tablica(new char[]{'W', 'J'}, 7576, true);
        tablice[49] = new Tretja.Tablica(new char[]{'X', 'A'}, 3322, false);

        for (Tretja.Tablica t1: tablice) {
            for (Tretja.Tablica t2: tablice) {
                System.out.print(t1.hashCode() == t2.hashCode() ? '+' : '-');
            }
            System.out.println();
        }
    }
}
