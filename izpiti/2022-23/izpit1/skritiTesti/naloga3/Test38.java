
import java.util.*;

public class Test38 {

    public static void main(String[] args) {
        Tretja.Tablica[] tablice = new Tretja.Tablica[50];
        tablice[0] = new Tretja.Tablica(new char[]{'I', 'N'}, 4226, false);
        tablice[1] = new Tretja.Tablica(new char[]{'F', 'B'}, 4574, true);
        tablice[2] = new Tretja.Tablica(new char[]{'I', 'N'}, 4226, false);
        tablice[3] = new Tretja.Tablica(new char[]{'I', 'N'}, 4226, false);
        tablice[4] = new Tretja.Tablica(new char[]{'I', 'N'}, 4226, false);
        tablice[5] = new Tretja.Tablica(new char[]{'T', 'K'}, 9189, true);
        tablice[6] = new Tretja.Tablica(new char[]{'K', 'G'}, 6462, true);
        tablice[7] = tablice[2];
        tablice[8] = new Tretja.Tablica(new char[]{'I', 'N'}, 1859, false);
        tablice[9] = new Tretja.Tablica(new char[]{'R', 'U'}, 1522, true);
        tablice[10] = new Tretja.Tablica(new char[]{'C', 'G'}, 9189, true);
        tablice[11] = new Tretja.Tablica(new char[]{'I', 'V'}, 4574, false);
        tablice[12] = new Tretja.Tablica(new char[]{'I', 'N'}, 1859, false);
        tablice[13] = new Tretja.Tablica(new char[]{'I', 'N'}, 4226, true);
        tablice[14] = new Tretja.Tablica(new char[]{'I', 'V'}, 4574, false);
        tablice[15] = new Tretja.Tablica(new char[]{'C', 'G'}, 9189, true);
        tablice[16] = new Tretja.Tablica(new char[]{'T', 'K'}, 9189, true);
        tablice[17] = new Tretja.Tablica(new char[]{'P', 'C'}, 2342, true);
        tablice[18] = new Tretja.Tablica(new char[]{'I', 'N'}, 4226, false);
        tablice[19] = new Tretja.Tablica(new char[]{'E', 'O'}, 7975, false);
        tablice[20] = new Tretja.Tablica(new char[]{'E', 'J'}, 1292, true);
        tablice[21] = new Tretja.Tablica(new char[]{'Y', 'M'}, 4226, false);
        tablice[22] = new Tretja.Tablica(new char[]{'L', 'Y'}, 9189, true);
        tablice[23] = new Tretja.Tablica(new char[]{'D', 'H'}, 4226, false);
        tablice[24] = new Tretja.Tablica(new char[]{'I', 'N'}, 1859, false);
        tablice[25] = new Tretja.Tablica(new char[]{'I', 'N'}, 4226, false);
        tablice[26] = new Tretja.Tablica(new char[]{'C', 'L'}, 4226, false);
        tablice[27] = new Tretja.Tablica(new char[]{'G', 'T'}, 3758, false);
        tablice[28] = new Tretja.Tablica(new char[]{'M', 'N'}, 8698, false);
        tablice[29] = new Tretja.Tablica(new char[]{'I', 'N'}, 4226, false);
        tablice[30] = new Tretja.Tablica(new char[]{'C', 'E'}, 4961, true);
        tablice[31] = new Tretja.Tablica(new char[]{'S', 'L'}, 4226, false);
        tablice[32] = new Tretja.Tablica(new char[]{'C', 'G'}, 9189, false);
        tablice[33] = new Tretja.Tablica(new char[]{'E', 'O'}, 5242, false);
        tablice[34] = new Tretja.Tablica(new char[]{'I', 'N'}, 1859, false);
        tablice[35] = new Tretja.Tablica(new char[]{'I', 'N'}, 4913, true);
        tablice[36] = new Tretja.Tablica(new char[]{'P', 'C'}, 2426, false);
        tablice[37] = new Tretja.Tablica(new char[]{'C', 'G'}, 3649, false);
        tablice[38] = new Tretja.Tablica(new char[]{'T', 'T'}, 9189, false);
        tablice[39] = new Tretja.Tablica(new char[]{'Z', 'O'}, 9835, true);
        tablice[40] = new Tretja.Tablica(new char[]{'M', 'C'}, 6462, true);
        tablice[41] = new Tretja.Tablica(new char[]{'E', 'J'}, 6183, false);
        tablice[42] = new Tretja.Tablica(new char[]{'P', 'Z'}, 8298, true);
        tablice[43] = tablice[4];
        tablice[44] = new Tretja.Tablica(new char[]{'I', 'Y'}, 1859, false);
        tablice[45] = new Tretja.Tablica(new char[]{'P', 'C'}, 2426, true);
        tablice[46] = new Tretja.Tablica(new char[]{'P', 'C'}, 2426, true);
        tablice[47] = new Tretja.Tablica(new char[]{'E', 'J'}, 6183, false);
        tablice[48] = tablice[31];
        tablice[49] = tablice[27];

        for (Tretja.Tablica t1: tablice) {
            for (Tretja.Tablica t2: tablice) {
                System.out.print(t1.hashCode() == t2.hashCode() ? '+' : '-');
            }
            System.out.println();
        }
    }
}
