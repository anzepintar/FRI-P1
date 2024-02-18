
import java.util.*;

public class Test28 {

    public static void main(String[] args) {
        Tretja.Tablica[] tablice = new Tretja.Tablica[50];
        tablice[0] = new Tretja.Tablica(new char[]{'N', 'U'}, 6485, false);
        tablice[1] = new Tretja.Tablica(new char[]{'N', 'U'}, 2824, false);
        tablice[2] = new Tretja.Tablica(new char[]{'N', 'U'}, 6485, true);
        tablice[3] = new Tretja.Tablica(new char[]{'Z', 'B'}, 6485, true);
        tablice[4] = new Tretja.Tablica(new char[]{'N', 'U'}, 2824, true);
        tablice[5] = new Tretja.Tablica(new char[]{'N', 'U'}, 2824, true);
        tablice[6] = new Tretja.Tablica(new char[]{'N', 'U'}, 3243, true);
        tablice[7] = new Tretja.Tablica(new char[]{'N', 'U'}, 2824, true);
        tablice[8] = new Tretja.Tablica(new char[]{'N', 'U'}, 4154, false);
        tablice[9] = new Tretja.Tablica(new char[]{'N', 'U'}, 3361, true);
        tablice[10] = new Tretja.Tablica(new char[]{'N', 'U'}, 6485, true);
        tablice[11] = new Tretja.Tablica(new char[]{'N', 'U'}, 8562, true);
        tablice[12] = tablice[9];
        tablice[13] = tablice[4];
        tablice[14] = new Tretja.Tablica(new char[]{'Z', 'O'}, 4154, true);
        tablice[15] = tablice[1];
        tablice[16] = new Tretja.Tablica(new char[]{'N', 'U'}, 6485, true);
        tablice[17] = new Tretja.Tablica(new char[]{'N', 'U'}, 9192, false);
        tablice[18] = new Tretja.Tablica(new char[]{'N', 'U'}, 3243, true);
        tablice[19] = new Tretja.Tablica(new char[]{'N', 'U'}, 3361, false);
        tablice[20] = tablice[10];
        tablice[21] = new Tretja.Tablica(new char[]{'N', 'U'}, 2117, true);
        tablice[22] = new Tretja.Tablica(new char[]{'P', 'Q'}, 8591, true);
        tablice[23] = tablice[21];
        tablice[24] = new Tretja.Tablica(new char[]{'Z', 'R'}, 4192, false);
        tablice[25] = new Tretja.Tablica(new char[]{'N', 'U'}, 3361, false);
        tablice[26] = new Tretja.Tablica(new char[]{'E', 'N'}, 3243, false);
        tablice[27] = tablice[2];
        tablice[28] = new Tretja.Tablica(new char[]{'N', 'U'}, 6485, true);
        tablice[29] = new Tretja.Tablica(new char[]{'C', 'Q'}, 8562, false);
        tablice[30] = new Tretja.Tablica(new char[]{'D', 'V'}, 2824, false);
        tablice[31] = new Tretja.Tablica(new char[]{'N', 'U'}, 6485, false);
        tablice[32] = new Tretja.Tablica(new char[]{'C', 'Y'}, 8562, true);
        tablice[33] = tablice[16];
        tablice[34] = new Tretja.Tablica(new char[]{'E', 'N'}, 3243, true);
        tablice[35] = new Tretja.Tablica(new char[]{'P', 'Q'}, 8591, false);
        tablice[36] = new Tretja.Tablica(new char[]{'E', 'T'}, 2824, false);
        tablice[37] = new Tretja.Tablica(new char[]{'N', 'U'}, 2824, true);
        tablice[38] = new Tretja.Tablica(new char[]{'E', 'T'}, 2824, true);
        tablice[39] = new Tretja.Tablica(new char[]{'Z', 'B'}, 6345, true);
        tablice[40] = new Tretja.Tablica(new char[]{'V', 'J'}, 3185, true);
        tablice[41] = new Tretja.Tablica(new char[]{'N', 'U'}, 8588, false);
        tablice[42] = new Tretja.Tablica(new char[]{'N', 'U'}, 8588, false);
        tablice[43] = new Tretja.Tablica(new char[]{'N', 'U'}, 2824, false);
        tablice[44] = new Tretja.Tablica(new char[]{'M', 'L'}, 2824, true);
        tablice[45] = new Tretja.Tablica(new char[]{'N', 'U'}, 3361, false);
        tablice[46] = tablice[34];
        tablice[47] = tablice[45];
        tablice[48] = tablice[10];
        tablice[49] = new Tretja.Tablica(new char[]{'N', 'U'}, 9574, false);

        for (Tretja.Tablica t1: tablice) {
            for (Tretja.Tablica t2: tablice) {
                System.out.print(t1.equals(t2) ? '+' : '-');
            }
            System.out.println();
        }
    }
}
