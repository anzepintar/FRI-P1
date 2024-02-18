
import java.util.*;

public class Test18 {

    public static void main(String[] args) {
        Tretja.Tablica[] tablice = new Tretja.Tablica[50];
        tablice[0] = new Tretja.Tablica(new char[]{'E', 'C'}, 7881, true);
        tablice[1] = new Tretja.Tablica(new char[]{'E', 'C'}, 7881, false);
        tablice[2] = new Tretja.Tablica(new char[]{'E', 'C'}, 7881, true);
        tablice[3] = new Tretja.Tablica(new char[]{'X', 'O'}, 7881, false);
        tablice[4] = new Tretja.Tablica(new char[]{'R', 'K'}, 7881, false);
        tablice[5] = new Tretja.Tablica(new char[]{'Z', 'T'}, 7881, false);
        tablice[6] = new Tretja.Tablica(new char[]{'W', 'F'}, 7881, true);
        tablice[7] = new Tretja.Tablica(new char[]{'E', 'C'}, 7881, true);
        tablice[8] = new Tretja.Tablica(new char[]{'E', 'C'}, 5198, true);
        tablice[9] = new Tretja.Tablica(new char[]{'I', 'H'}, 7881, false);
        tablice[10] = tablice[5];
        tablice[11] = new Tretja.Tablica(new char[]{'Y', 'N'}, 7881, false);
        tablice[12] = tablice[10];
        tablice[13] = tablice[10];
        tablice[14] = new Tretja.Tablica(new char[]{'E', 'C'}, 3944, true);
        tablice[15] = new Tretja.Tablica(new char[]{'Y', 'N'}, 7881, true);
        tablice[16] = new Tretja.Tablica(new char[]{'Z', 'A'}, 7881, false);
        tablice[17] = new Tretja.Tablica(new char[]{'I', 'G'}, 3944, true);
        tablice[18] = new Tretja.Tablica(new char[]{'Y', 'N'}, 7881, false);
        tablice[19] = new Tretja.Tablica(new char[]{'E', 'C'}, 7881, false);
        tablice[20] = new Tretja.Tablica(new char[]{'S', 'N'}, 7881, true);
        tablice[21] = new Tretja.Tablica(new char[]{'L', 'B'}, 7881, false);
        tablice[22] = new Tretja.Tablica(new char[]{'E', 'C'}, 7881, false);
        tablice[23] = new Tretja.Tablica(new char[]{'Z', 'T'}, 7881, false);
        tablice[24] = new Tretja.Tablica(new char[]{'Z', 'A'}, 5682, false);
        tablice[25] = new Tretja.Tablica(new char[]{'E', 'C'}, 7881, true);
        tablice[26] = tablice[7];
        tablice[27] = new Tretja.Tablica(new char[]{'R', 'K'}, 7881, true);
        tablice[28] = new Tretja.Tablica(new char[]{'Z', 'T'}, 7881, false);
        tablice[29] = new Tretja.Tablica(new char[]{'L', 'D'}, 7881, false);
        tablice[30] = new Tretja.Tablica(new char[]{'E', 'C'}, 7881, false);
        tablice[31] = new Tretja.Tablica(new char[]{'Z', 'N'}, 5427, true);
        tablice[32] = new Tretja.Tablica(new char[]{'R', 'K'}, 8173, true);
        tablice[33] = new Tretja.Tablica(new char[]{'K', 'J'}, 9984, false);
        tablice[34] = new Tretja.Tablica(new char[]{'Z', 'T'}, 7881, false);
        tablice[35] = new Tretja.Tablica(new char[]{'Q', 'Q'}, 7881, false);
        tablice[36] = new Tretja.Tablica(new char[]{'E', 'C'}, 7881, true);
        tablice[37] = new Tretja.Tablica(new char[]{'E', 'C'}, 7881, true);
        tablice[38] = tablice[17];
        tablice[39] = new Tretja.Tablica(new char[]{'E', 'C'}, 7881, false);
        tablice[40] = new Tretja.Tablica(new char[]{'E', 'C'}, 2678, false);
        tablice[41] = new Tretja.Tablica(new char[]{'M', 'R'}, 3944, false);
        tablice[42] = new Tretja.Tablica(new char[]{'R', 'K'}, 7881, false);
        tablice[43] = new Tretja.Tablica(new char[]{'Z', 'T'}, 7881, false);
        tablice[44] = tablice[39];
        tablice[45] = new Tretja.Tablica(new char[]{'M', 'K'}, 7881, false);
        tablice[46] = new Tretja.Tablica(new char[]{'R', 'K'}, 2151, true);
        tablice[47] = new Tretja.Tablica(new char[]{'E', 'C'}, 7881, true);
        tablice[48] = new Tretja.Tablica(new char[]{'L', 'B'}, 7881, false);
        tablice[49] = new Tretja.Tablica(new char[]{'H', 'B'}, 9311, false);

        for (Tretja.Tablica t1: tablice) {
            for (Tretja.Tablica t2: tablice) {
                System.out.print(t1.equals(t2) ? '+' : '-');
            }
            System.out.println();
        }
    }
}
