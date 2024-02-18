
import java.util.*;

public class Test34 {

    public static void main(String[] args) {
        Tretja.Tablica[] tablice = new Tretja.Tablica[50];
        tablice[0] = new Tretja.Tablica(new char[]{'V', 'X'}, 2654, true);
        tablice[1] = new Tretja.Tablica(new char[]{'V', 'X'}, 4868, false);
        tablice[2] = new Tretja.Tablica(new char[]{'V', 'X'}, 2654, false);
        tablice[3] = new Tretja.Tablica(new char[]{'V', 'X'}, 2654, true);
        tablice[4] = new Tretja.Tablica(new char[]{'V', 'X'}, 2654, false);
        tablice[5] = new Tretja.Tablica(new char[]{'V', 'X'}, 4868, true);
        tablice[6] = tablice[1];
        tablice[7] = new Tretja.Tablica(new char[]{'V', 'X'}, 4868, true);
        tablice[8] = tablice[7];
        tablice[9] = new Tretja.Tablica(new char[]{'V', 'X'}, 2654, false);
        tablice[10] = tablice[6];
        tablice[11] = tablice[3];
        tablice[12] = new Tretja.Tablica(new char[]{'V', 'X'}, 2654, true);
        tablice[13] = new Tretja.Tablica(new char[]{'V', 'X'}, 2654, false);
        tablice[14] = new Tretja.Tablica(new char[]{'V', 'X'}, 2654, false);
        tablice[15] = new Tretja.Tablica(new char[]{'V', 'X'}, 4868, true);
        tablice[16] = new Tretja.Tablica(new char[]{'Y', 'C'}, 4868, true);
        tablice[17] = new Tretja.Tablica(new char[]{'J', 'A'}, 2654, false);
        tablice[18] = new Tretja.Tablica(new char[]{'V', 'X'}, 4868, false);
        tablice[19] = new Tretja.Tablica(new char[]{'V', 'X'}, 4868, true);
        tablice[20] = new Tretja.Tablica(new char[]{'U', 'C'}, 2654, false);
        tablice[21] = new Tretja.Tablica(new char[]{'V', 'X'}, 2654, false);
        tablice[22] = new Tretja.Tablica(new char[]{'Y', 'W'}, 4868, true);
        tablice[23] = new Tretja.Tablica(new char[]{'V', 'X'}, 2654, true);
        tablice[24] = new Tretja.Tablica(new char[]{'F', 'K'}, 4868, false);
        tablice[25] = new Tretja.Tablica(new char[]{'V', 'X'}, 2654, true);
        tablice[26] = new Tretja.Tablica(new char[]{'V', 'X'}, 1572, false);
        tablice[27] = new Tretja.Tablica(new char[]{'F', 'K'}, 4868, true);
        tablice[28] = new Tretja.Tablica(new char[]{'M', 'W'}, 2654, false);
        tablice[29] = new Tretja.Tablica(new char[]{'N', 'X'}, 4868, true);
        tablice[30] = new Tretja.Tablica(new char[]{'T', 'B'}, 4868, true);
        tablice[31] = new Tretja.Tablica(new char[]{'O', 'H'}, 2654, false);
        tablice[32] = new Tretja.Tablica(new char[]{'I', 'V'}, 2654, true);
        tablice[33] = new Tretja.Tablica(new char[]{'R', 'L'}, 3995, false);
        tablice[34] = new Tretja.Tablica(new char[]{'V', 'X'}, 3995, false);
        tablice[35] = new Tretja.Tablica(new char[]{'V', 'X'}, 4868, true);
        tablice[36] = new Tretja.Tablica(new char[]{'V', 'X'}, 2654, false);
        tablice[37] = new Tretja.Tablica(new char[]{'V', 'X'}, 4868, false);
        tablice[38] = tablice[30];
        tablice[39] = new Tretja.Tablica(new char[]{'R', 'L'}, 3699, false);
        tablice[40] = new Tretja.Tablica(new char[]{'R', 'S'}, 4225, false);
        tablice[41] = new Tretja.Tablica(new char[]{'O', 'L'}, 9378, true);
        tablice[42] = tablice[4];
        tablice[43] = tablice[2];
        tablice[44] = new Tretja.Tablica(new char[]{'F', 'K'}, 5865, false);
        tablice[45] = new Tretja.Tablica(new char[]{'V', 'X'}, 4868, false);
        tablice[46] = new Tretja.Tablica(new char[]{'V', 'X'}, 3995, true);
        tablice[47] = new Tretja.Tablica(new char[]{'V', 'X'}, 2654, true);
        tablice[48] = new Tretja.Tablica(new char[]{'V', 'X'}, 4868, true);
        tablice[49] = new Tretja.Tablica(new char[]{'F', 'K'}, 6776, true);

        for (Tretja.Tablica t1: tablice) {
            for (Tretja.Tablica t2: tablice) {
                System.out.print(t1.hashCode() == t2.hashCode() ? '+' : '-');
            }
            System.out.println();
        }
    }
}
