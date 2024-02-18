
import java.util.*;

public class Test46 {

    public static void main(String[] args) {
        Tretja.Tablica[] tablice = new Tretja.Tablica[50];
        tablice[0] = new Tretja.Tablica(new char[]{'N', 'E'}, 3981, false);
        tablice[1] = new Tretja.Tablica(new char[]{'P', 'N'}, 3981, true);
        tablice[2] = new Tretja.Tablica(new char[]{'P', 'N'}, 5757, false);
        tablice[3] = new Tretja.Tablica(new char[]{'N', 'E'}, 3981, false);
        tablice[4] = new Tretja.Tablica(new char[]{'Z', 'J'}, 3981, false);
        tablice[5] = new Tretja.Tablica(new char[]{'N', 'E'}, 1915, true);
        tablice[6] = new Tretja.Tablica(new char[]{'P', 'N'}, 5757, true);
        tablice[7] = new Tretja.Tablica(new char[]{'Z', 'J'}, 4928, true);
        tablice[8] = new Tretja.Tablica(new char[]{'R', 'P'}, 3981, true);
        tablice[9] = new Tretja.Tablica(new char[]{'R', 'P'}, 3981, false);
        tablice[10] = new Tretja.Tablica(new char[]{'W', 'Z'}, 1915, false);
        tablice[11] = new Tretja.Tablica(new char[]{'Z', 'J'}, 4928, false);
        tablice[12] = new Tretja.Tablica(new char[]{'L', 'T'}, 3981, true);
        tablice[13] = tablice[5];
        tablice[14] = tablice[8];
        tablice[15] = tablice[12];
        tablice[16] = tablice[6];
        tablice[17] = new Tretja.Tablica(new char[]{'R', 'P'}, 3981, false);
        tablice[18] = new Tretja.Tablica(new char[]{'O', 'U'}, 3981, true);
        tablice[19] = new Tretja.Tablica(new char[]{'N', 'E'}, 1915, false);
        tablice[20] = new Tretja.Tablica(new char[]{'O', 'V'}, 3424, true);
        tablice[21] = new Tretja.Tablica(new char[]{'S', 'D'}, 3981, true);
        tablice[22] = new Tretja.Tablica(new char[]{'R', 'P'}, 3981, false);
        tablice[23] = new Tretja.Tablica(new char[]{'N', 'N'}, 3981, true);
        tablice[24] = new Tretja.Tablica(new char[]{'N', 'E'}, 1915, false);
        tablice[25] = new Tretja.Tablica(new char[]{'L', 'T'}, 3981, true);
        tablice[26] = new Tretja.Tablica(new char[]{'L', 'T'}, 3981, true);
        tablice[27] = new Tretja.Tablica(new char[]{'P', 'Q'}, 1915, true);
        tablice[28] = tablice[1];
        tablice[29] = new Tretja.Tablica(new char[]{'C', 'I'}, 3981, false);
        tablice[30] = new Tretja.Tablica(new char[]{'O', 'V'}, 1987, true);
        tablice[31] = tablice[19];
        tablice[32] = new Tretja.Tablica(new char[]{'N', 'E'}, 3981, true);
        tablice[33] = tablice[12];
        tablice[34] = new Tretja.Tablica(new char[]{'H', 'F'}, 3481, false);
        tablice[35] = new Tretja.Tablica(new char[]{'Y', 'D'}, 3981, false);
        tablice[36] = new Tretja.Tablica(new char[]{'S', 'U'}, 3295, true);
        tablice[37] = new Tretja.Tablica(new char[]{'O', 'V'}, 1987, true);
        tablice[38] = new Tretja.Tablica(new char[]{'Z', 'P'}, 3981, true);
        tablice[39] = new Tretja.Tablica(new char[]{'O', 'V'}, 1987, true);
        tablice[40] = new Tretja.Tablica(new char[]{'O', 'B'}, 9238, true);
        tablice[41] = new Tretja.Tablica(new char[]{'N', 'E'}, 1915, false);
        tablice[42] = new Tretja.Tablica(new char[]{'C', 'C'}, 6525, false);
        tablice[43] = new Tretja.Tablica(new char[]{'S', 'U'}, 2799, true);
        tablice[44] = new Tretja.Tablica(new char[]{'Y', 'C'}, 3981, true);
        tablice[45] = tablice[27];
        tablice[46] = new Tretja.Tablica(new char[]{'L', 'T'}, 3981, true);
        tablice[47] = new Tretja.Tablica(new char[]{'W', 'E'}, 6226, true);
        tablice[48] = new Tretja.Tablica(new char[]{'P', 'Q'}, 1915, true);
        tablice[49] = new Tretja.Tablica(new char[]{'R', 'A'}, 8385, false);

        for (Tretja.Tablica t1: tablice) {
            for (Tretja.Tablica t2: tablice) {
                System.out.print(t1.hashCode() == t2.hashCode() ? '+' : '-');
            }
            System.out.println();
        }
    }
}
