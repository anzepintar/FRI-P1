
import java.util.*;

public class Test12 {

    public static void main(String[] args) {
        Tretja.Tablica[] tablice = new Tretja.Tablica[50];
        tablice[0] = new Tretja.Tablica(new char[]{'D', 'E'}, 1344, false);
        tablice[1] = new Tretja.Tablica(new char[]{'D', 'E'}, 1344, true);
        tablice[2] = new Tretja.Tablica(new char[]{'V', 'J'}, 1434, true);
        tablice[3] = new Tretja.Tablica(new char[]{'V', 'J'}, 1434, true);
        tablice[4] = new Tretja.Tablica(new char[]{'D', 'E'}, 1344, false);
        tablice[5] = tablice[2];
        tablice[6] = tablice[3];
        tablice[7] = new Tretja.Tablica(new char[]{'D', 'E'}, 1344, true);
        tablice[8] = tablice[6];
        tablice[9] = new Tretja.Tablica(new char[]{'I', 'Q'}, 1434, true);
        tablice[10] = new Tretja.Tablica(new char[]{'X', 'D'}, 6741, false);
        tablice[11] = new Tretja.Tablica(new char[]{'V', 'J'}, 1434, true);
        tablice[12] = new Tretja.Tablica(new char[]{'X', 'D'}, 6741, false);
        tablice[13] = new Tretja.Tablica(new char[]{'D', 'E'}, 5459, false);
        tablice[14] = new Tretja.Tablica(new char[]{'G', 'V'}, 1256, false);
        tablice[15] = new Tretja.Tablica(new char[]{'V', 'J'}, 1434, false);
        tablice[16] = new Tretja.Tablica(new char[]{'I', 'Q'}, 1434, false);
        tablice[17] = new Tretja.Tablica(new char[]{'D', 'E'}, 1344, false);
        tablice[18] = new Tretja.Tablica(new char[]{'V', 'J'}, 9337, true);
        tablice[19] = new Tretja.Tablica(new char[]{'D', 'E'}, 7317, false);
        tablice[20] = tablice[17];
        tablice[21] = new Tretja.Tablica(new char[]{'I', 'Q'}, 1763, false);
        tablice[22] = new Tretja.Tablica(new char[]{'V', 'J'}, 1434, true);
        tablice[23] = new Tretja.Tablica(new char[]{'Q', 'A'}, 1434, false);
        tablice[24] = tablice[23];
        tablice[25] = new Tretja.Tablica(new char[]{'A', 'B'}, 2255, true);
        tablice[26] = new Tretja.Tablica(new char[]{'V', 'H'}, 1434, false);
        tablice[27] = new Tretja.Tablica(new char[]{'X', 'D'}, 6741, true);
        tablice[28] = new Tretja.Tablica(new char[]{'V', 'H'}, 5281, false);
        tablice[29] = new Tretja.Tablica(new char[]{'V', 'J'}, 1434, true);
        tablice[30] = new Tretja.Tablica(new char[]{'V', 'J'}, 1434, false);
        tablice[31] = new Tretja.Tablica(new char[]{'V', 'J'}, 8212, true);
        tablice[32] = new Tretja.Tablica(new char[]{'X', 'I'}, 1213, true);
        tablice[33] = new Tretja.Tablica(new char[]{'V', 'J'}, 1434, false);
        tablice[34] = new Tretja.Tablica(new char[]{'V', 'H'}, 5197, false);
        tablice[35] = new Tretja.Tablica(new char[]{'V', 'J'}, 1434, true);
        tablice[36] = new Tretja.Tablica(new char[]{'V', 'J'}, 1434, true);
        tablice[37] = tablice[6];
        tablice[38] = new Tretja.Tablica(new char[]{'D', 'E'}, 5553, false);
        tablice[39] = new Tretja.Tablica(new char[]{'S', 'I'}, 8759, false);
        tablice[40] = tablice[35];
        tablice[41] = tablice[29];
        tablice[42] = new Tretja.Tablica(new char[]{'V', 'J'}, 1434, false);
        tablice[43] = new Tretja.Tablica(new char[]{'X', 'U'}, 1434, false);
        tablice[44] = new Tretja.Tablica(new char[]{'V', 'F'}, 4854, true);
        tablice[45] = new Tretja.Tablica(new char[]{'X', 'C'}, 4985, false);
        tablice[46] = new Tretja.Tablica(new char[]{'I', 'Q'}, 1434, false);
        tablice[47] = new Tretja.Tablica(new char[]{'J', 'X'}, 1434, true);
        tablice[48] = new Tretja.Tablica(new char[]{'V', 'J'}, 1434, true);
        tablice[49] = new Tretja.Tablica(new char[]{'N', 'D'}, 6741, false);

        for (Tretja.Tablica tablica: tablice) {
            System.out.println(tablica.toString());
        }
    }
}
