
import java.util.*;

public class Test08 {

    public static void main(String[] args) {
        Tretja.Tablica[] tablice = new Tretja.Tablica[50];
        tablice[0] = new Tretja.Tablica(new char[]{'W', 'U'}, 2367, true);
        tablice[1] = new Tretja.Tablica(new char[]{'W', 'U'}, 2367, false);
        tablice[2] = new Tretja.Tablica(new char[]{'W', 'U'}, 2367, true);
        tablice[3] = tablice[1];
        tablice[4] = new Tretja.Tablica(new char[]{'W', 'U'}, 2367, false);
        tablice[5] = new Tretja.Tablica(new char[]{'W', 'U'}, 2367, true);
        tablice[6] = tablice[2];
        tablice[7] = new Tretja.Tablica(new char[]{'W', 'U'}, 2367, false);
        tablice[8] = tablice[2];
        tablice[9] = new Tretja.Tablica(new char[]{'J', 'J'}, 2367, false);
        tablice[10] = new Tretja.Tablica(new char[]{'W', 'U'}, 1591, false);
        tablice[11] = new Tretja.Tablica(new char[]{'W', 'U'}, 2367, false);
        tablice[12] = new Tretja.Tablica(new char[]{'H', 'D'}, 2367, false);
        tablice[13] = tablice[9];
        tablice[14] = new Tretja.Tablica(new char[]{'W', 'U'}, 2367, true);
        tablice[15] = new Tretja.Tablica(new char[]{'W', 'U'}, 2488, true);
        tablice[16] = new Tretja.Tablica(new char[]{'W', 'U'}, 2488, true);
        tablice[17] = new Tretja.Tablica(new char[]{'W', 'U'}, 2367, false);
        tablice[18] = new Tretja.Tablica(new char[]{'J', 'J'}, 2367, false);
        tablice[19] = new Tretja.Tablica(new char[]{'W', 'U'}, 7881, true);
        tablice[20] = new Tretja.Tablica(new char[]{'D', 'A'}, 5521, false);
        tablice[21] = new Tretja.Tablica(new char[]{'W', 'U'}, 9931, false);
        tablice[22] = tablice[8];
        tablice[23] = tablice[17];
        tablice[24] = new Tretja.Tablica(new char[]{'M', 'S'}, 2493, false);
        tablice[25] = tablice[18];
        tablice[26] = new Tretja.Tablica(new char[]{'A', 'J'}, 2488, false);
        tablice[27] = new Tretja.Tablica(new char[]{'W', 'U'}, 2367, false);
        tablice[28] = new Tretja.Tablica(new char[]{'M', 'S'}, 2493, true);
        tablice[29] = new Tretja.Tablica(new char[]{'W', 'U'}, 5641, false);
        tablice[30] = new Tretja.Tablica(new char[]{'W', 'U'}, 2367, true);
        tablice[31] = tablice[26];
        tablice[32] = new Tretja.Tablica(new char[]{'F', 'T'}, 2488, false);
        tablice[33] = tablice[8];
        tablice[34] = tablice[5];
        tablice[35] = new Tretja.Tablica(new char[]{'A', 'J'}, 3738, false);
        tablice[36] = tablice[14];
        tablice[37] = new Tretja.Tablica(new char[]{'K', 'V'}, 3558, true);
        tablice[38] = new Tretja.Tablica(new char[]{'J', 'J'}, 8656, false);
        tablice[39] = new Tretja.Tablica(new char[]{'J', 'J'}, 2367, false);
        tablice[40] = new Tretja.Tablica(new char[]{'M', 'S'}, 4761, false);
        tablice[41] = new Tretja.Tablica(new char[]{'W', 'U'}, 1454, false);
        tablice[42] = new Tretja.Tablica(new char[]{'W', 'L'}, 5521, false);
        tablice[43] = tablice[42];
        tablice[44] = tablice[23];
        tablice[45] = new Tretja.Tablica(new char[]{'Z', 'M'}, 6765, true);
        tablice[46] = tablice[26];
        tablice[47] = new Tretja.Tablica(new char[]{'Z', 'R'}, 2488, true);
        tablice[48] = new Tretja.Tablica(new char[]{'W', 'L'}, 5521, true);
        tablice[49] = new Tretja.Tablica(new char[]{'W', 'U'}, 2367, true);

        for (Tretja.Tablica t1: tablice) {
            for (Tretja.Tablica t2: tablice) {
                System.out.print(t1.hashCode() == t2.hashCode() ? '+' : '-');
            }
            System.out.println();
        }
    }
}
