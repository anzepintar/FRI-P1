
import java.util.*;

public class Test33 {

    public static void main(String[] args) {
        Tretja.Tablica[] tablice = new Tretja.Tablica[50];
        tablice[0] = new Tretja.Tablica(new char[]{'D', 'N'}, 3497, true);
        tablice[1] = new Tretja.Tablica(new char[]{'D', 'N'}, 3497, true);
        tablice[2] = new Tretja.Tablica(new char[]{'D', 'N'}, 3497, false);
        tablice[3] = new Tretja.Tablica(new char[]{'D', 'N'}, 2568, false);
        tablice[4] = new Tretja.Tablica(new char[]{'D', 'N'}, 6357, false);
        tablice[5] = new Tretja.Tablica(new char[]{'D', 'N'}, 3497, false);
        tablice[6] = tablice[3];
        tablice[7] = new Tretja.Tablica(new char[]{'A', 'T'}, 3497, true);
        tablice[8] = new Tretja.Tablica(new char[]{'D', 'N'}, 5696, true);
        tablice[9] = new Tretja.Tablica(new char[]{'C', 'Z'}, 1266, true);
        tablice[10] = new Tretja.Tablica(new char[]{'S', 'U'}, 2568, true);
        tablice[11] = tablice[8];
        tablice[12] = new Tretja.Tablica(new char[]{'D', 'N'}, 2616, false);
        tablice[13] = new Tretja.Tablica(new char[]{'S', 'E'}, 3497, false);
        tablice[14] = new Tretja.Tablica(new char[]{'D', 'N'}, 2616, true);
        tablice[15] = new Tretja.Tablica(new char[]{'D', 'N'}, 1895, true);
        tablice[16] = new Tretja.Tablica(new char[]{'W', 'Q'}, 3497, true);
        tablice[17] = new Tretja.Tablica(new char[]{'D', 'N'}, 3497, true);
        tablice[18] = new Tretja.Tablica(new char[]{'P', 'B'}, 7214, false);
        tablice[19] = new Tretja.Tablica(new char[]{'A', 'T'}, 3497, false);
        tablice[20] = new Tretja.Tablica(new char[]{'B', 'V'}, 3886, false);
        tablice[21] = new Tretja.Tablica(new char[]{'D', 'N'}, 3497, false);
        tablice[22] = new Tretja.Tablica(new char[]{'B', 'V'}, 3886, false);
        tablice[23] = new Tretja.Tablica(new char[]{'W', 'Q'}, 3497, false);
        tablice[24] = new Tretja.Tablica(new char[]{'D', 'N'}, 6357, false);
        tablice[25] = new Tretja.Tablica(new char[]{'W', 'Q'}, 3497, false);
        tablice[26] = new Tretja.Tablica(new char[]{'D', 'N'}, 3497, false);
        tablice[27] = tablice[1];
        tablice[28] = new Tretja.Tablica(new char[]{'C', 'Z'}, 1266, false);
        tablice[29] = tablice[25];
        tablice[30] = new Tretja.Tablica(new char[]{'D', 'N'}, 3497, false);
        tablice[31] = new Tretja.Tablica(new char[]{'H', 'A'}, 1895, true);
        tablice[32] = tablice[8];
        tablice[33] = new Tretja.Tablica(new char[]{'I', 'B'}, 3359, false);
        tablice[34] = new Tretja.Tablica(new char[]{'D', 'N'}, 3497, true);
        tablice[35] = new Tretja.Tablica(new char[]{'H', 'A'}, 6879, false);
        tablice[36] = new Tretja.Tablica(new char[]{'S', 'E'}, 5813, true);
        tablice[37] = new Tretja.Tablica(new char[]{'Y', 'W'}, 3497, true);
        tablice[38] = new Tretja.Tablica(new char[]{'D', 'N'}, 4569, false);
        tablice[39] = new Tretja.Tablica(new char[]{'B', 'K'}, 3497, true);
        tablice[40] = new Tretja.Tablica(new char[]{'D', 'N'}, 2568, false);
        tablice[41] = new Tretja.Tablica(new char[]{'D', 'N'}, 5696, false);
        tablice[42] = tablice[5];
        tablice[43] = new Tretja.Tablica(new char[]{'Y', 'H'}, 5787, true);
        tablice[44] = new Tretja.Tablica(new char[]{'D', 'N'}, 1813, true);
        tablice[45] = tablice[19];
        tablice[46] = new Tretja.Tablica(new char[]{'F', 'C'}, 2568, false);
        tablice[47] = new Tretja.Tablica(new char[]{'H', 'A'}, 8132, true);
        tablice[48] = new Tretja.Tablica(new char[]{'D', 'N'}, 2568, false);
        tablice[49] = new Tretja.Tablica(new char[]{'Z', 'I'}, 3497, false);

        for (Tretja.Tablica t1: tablice) {
            for (Tretja.Tablica t2: tablice) {
                System.out.print(t1.equals(t2) ? '+' : '-');
            }
            System.out.println();
        }
    }
}
