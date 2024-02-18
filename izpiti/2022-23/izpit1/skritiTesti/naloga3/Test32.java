
import java.util.*;

public class Test32 {

    public static void main(String[] args) {
        Tretja.Tablica[] tablice = new Tretja.Tablica[50];
        tablice[0] = new Tretja.Tablica(new char[]{'F', 'K'}, 6538, false);
        tablice[1] = new Tretja.Tablica(new char[]{'F', 'K'}, 3284, false);
        tablice[2] = new Tretja.Tablica(new char[]{'F', 'K'}, 6538, false);
        tablice[3] = new Tretja.Tablica(new char[]{'F', 'K'}, 4615, false);
        tablice[4] = new Tretja.Tablica(new char[]{'F', 'K'}, 6538, true);
        tablice[5] = new Tretja.Tablica(new char[]{'F', 'K'}, 6538, true);
        tablice[6] = new Tretja.Tablica(new char[]{'F', 'K'}, 4615, false);
        tablice[7] = new Tretja.Tablica(new char[]{'F', 'K'}, 4615, false);
        tablice[8] = new Tretja.Tablica(new char[]{'G', 'W'}, 6538, false);
        tablice[9] = new Tretja.Tablica(new char[]{'F', 'K'}, 6538, true);
        tablice[10] = new Tretja.Tablica(new char[]{'G', 'W'}, 5342, true);
        tablice[11] = new Tretja.Tablica(new char[]{'F', 'K'}, 6538, false);
        tablice[12] = new Tretja.Tablica(new char[]{'S', 'X'}, 6538, true);
        tablice[13] = new Tretja.Tablica(new char[]{'M', 'S'}, 5342, true);
        tablice[14] = new Tretja.Tablica(new char[]{'G', 'W'}, 7827, true);
        tablice[15] = new Tretja.Tablica(new char[]{'G', 'W'}, 2571, false);
        tablice[16] = new Tretja.Tablica(new char[]{'F', 'K'}, 1862, true);
        tablice[17] = new Tretja.Tablica(new char[]{'F', 'K'}, 4615, false);
        tablice[18] = new Tretja.Tablica(new char[]{'F', 'K'}, 4615, true);
        tablice[19] = new Tretja.Tablica(new char[]{'F', 'K'}, 6538, false);
        tablice[20] = new Tretja.Tablica(new char[]{'F', 'Q'}, 2791, false);
        tablice[21] = new Tretja.Tablica(new char[]{'L', 'T'}, 5342, false);
        tablice[22] = new Tretja.Tablica(new char[]{'O', 'E'}, 8195, true);
        tablice[23] = new Tretja.Tablica(new char[]{'F', 'K'}, 6538, true);
        tablice[24] = new Tretja.Tablica(new char[]{'S', 'D'}, 2571, false);
        tablice[25] = new Tretja.Tablica(new char[]{'T', 'Q'}, 4133, false);
        tablice[26] = new Tretja.Tablica(new char[]{'R', 'S'}, 6538, false);
        tablice[27] = new Tretja.Tablica(new char[]{'F', 'K'}, 6538, true);
        tablice[28] = new Tretja.Tablica(new char[]{'F', 'K'}, 6538, true);
        tablice[29] = tablice[28];
        tablice[30] = new Tretja.Tablica(new char[]{'S', 'M'}, 1862, true);
        tablice[31] = new Tretja.Tablica(new char[]{'X', 'G'}, 1862, false);
        tablice[32] = tablice[2];
        tablice[33] = new Tretja.Tablica(new char[]{'F', 'K'}, 1894, true);
        tablice[34] = new Tretja.Tablica(new char[]{'P', 'W'}, 1773, true);
        tablice[35] = new Tretja.Tablica(new char[]{'X', 'A'}, 7827, true);
        tablice[36] = new Tretja.Tablica(new char[]{'J', 'L'}, 5694, false);
        tablice[37] = new Tretja.Tablica(new char[]{'K', 'X'}, 4211, true);
        tablice[38] = new Tretja.Tablica(new char[]{'K', 'L'}, 5411, true);
        tablice[39] = new Tretja.Tablica(new char[]{'Z', 'S'}, 1862, true);
        tablice[40] = new Tretja.Tablica(new char[]{'Z', 'S'}, 1528, true);
        tablice[41] = new Tretja.Tablica(new char[]{'K', 'X'}, 5226, false);
        tablice[42] = new Tretja.Tablica(new char[]{'P', 'W'}, 1773, true);
        tablice[43] = new Tretja.Tablica(new char[]{'F', 'K'}, 6538, false);
        tablice[44] = new Tretja.Tablica(new char[]{'F', 'K'}, 4615, false);
        tablice[45] = new Tretja.Tablica(new char[]{'J', 'L'}, 9395, false);
        tablice[46] = new Tretja.Tablica(new char[]{'G', 'Z'}, 7161, false);
        tablice[47] = new Tretja.Tablica(new char[]{'F', 'K'}, 8491, true);
        tablice[48] = tablice[8];
        tablice[49] = new Tretja.Tablica(new char[]{'Q', 'Q'}, 6538, false);

        for (Tretja.Tablica t1: tablice) {
            for (Tretja.Tablica t2: tablice) {
                System.out.print(t1.equals(t2) ? '+' : '-');
            }
            System.out.println();
        }
    }
}
