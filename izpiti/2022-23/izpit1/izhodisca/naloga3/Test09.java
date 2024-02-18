
import java.util.*;

public class Test09 {

    public static void main(String[] args) {
        Tretja.Tablica[] tablice = new Tretja.Tablica[50];
        tablice[0] = new Tretja.Tablica(new char[]{'I', 'X'}, 9853, false);
        tablice[1] = new Tretja.Tablica(new char[]{'I', 'X'}, 9853, false);
        tablice[2] = new Tretja.Tablica(new char[]{'E', 'U'}, 7473, true);
        tablice[3] = tablice[2];
        tablice[4] = new Tretja.Tablica(new char[]{'I', 'X'}, 5137, false);
        tablice[5] = new Tretja.Tablica(new char[]{'E', 'U'}, 7473, false);
        tablice[6] = new Tretja.Tablica(new char[]{'E', 'U'}, 7473, true);
        tablice[7] = new Tretja.Tablica(new char[]{'I', 'X'}, 9853, false);
        tablice[8] = new Tretja.Tablica(new char[]{'I', 'X'}, 5137, false);
        tablice[9] = new Tretja.Tablica(new char[]{'I', 'X'}, 5137, true);
        tablice[10] = new Tretja.Tablica(new char[]{'I', 'X'}, 9853, false);
        tablice[11] = new Tretja.Tablica(new char[]{'V', 'N'}, 7473, false);
        tablice[12] = new Tretja.Tablica(new char[]{'E', 'U'}, 4649, true);
        tablice[13] = new Tretja.Tablica(new char[]{'I', 'X'}, 5137, false);
        tablice[14] = new Tretja.Tablica(new char[]{'I', 'X'}, 6644, false);
        tablice[15] = new Tretja.Tablica(new char[]{'E', 'U'}, 6236, true);
        tablice[16] = tablice[6];
        tablice[17] = new Tretja.Tablica(new char[]{'D', 'X'}, 8119, false);
        tablice[18] = new Tretja.Tablica(new char[]{'E', 'U'}, 7473, true);
        tablice[19] = new Tretja.Tablica(new char[]{'Y', 'E'}, 8472, true);
        tablice[20] = new Tretja.Tablica(new char[]{'H', 'U'}, 9636, false);
        tablice[21] = new Tretja.Tablica(new char[]{'I', 'X'}, 9853, false);
        tablice[22] = tablice[12];
        tablice[23] = new Tretja.Tablica(new char[]{'E', 'U'}, 4649, true);
        tablice[24] = new Tretja.Tablica(new char[]{'I', 'X'}, 9853, false);
        tablice[25] = new Tretja.Tablica(new char[]{'E', 'U'}, 1433, false);
        tablice[26] = new Tretja.Tablica(new char[]{'E', 'U'}, 4649, false);
        tablice[27] = new Tretja.Tablica(new char[]{'J', 'H'}, 2622, false);
        tablice[28] = new Tretja.Tablica(new char[]{'E', 'U'}, 4649, true);
        tablice[29] = new Tretja.Tablica(new char[]{'Q', 'N'}, 7986, false);
        tablice[30] = new Tretja.Tablica(new char[]{'I', 'X'}, 8724, false);
        tablice[31] = new Tretja.Tablica(new char[]{'A', 'S'}, 6633, true);
        tablice[32] = new Tretja.Tablica(new char[]{'D', 'T'}, 6682, false);
        tablice[33] = tablice[29];
        tablice[34] = new Tretja.Tablica(new char[]{'Z', 'S'}, 8724, false);
        tablice[35] = new Tretja.Tablica(new char[]{'H', 'U'}, 9636, true);
        tablice[36] = new Tretja.Tablica(new char[]{'G', 'H'}, 5221, true);
        tablice[37] = new Tretja.Tablica(new char[]{'A', 'S'}, 6633, false);
        tablice[38] = new Tretja.Tablica(new char[]{'I', 'X'}, 5137, false);
        tablice[39] = new Tretja.Tablica(new char[]{'D', 'X'}, 8119, false);
        tablice[40] = new Tretja.Tablica(new char[]{'I', 'X'}, 6768, false);
        tablice[41] = new Tretja.Tablica(new char[]{'D', 'T'}, 6682, true);
        tablice[42] = new Tretja.Tablica(new char[]{'B', 'C'}, 9853, false);
        tablice[43] = new Tretja.Tablica(new char[]{'J', 'H'}, 2622, false);
        tablice[44] = new Tretja.Tablica(new char[]{'D', 'T'}, 6682, false);
        tablice[45] = new Tretja.Tablica(new char[]{'D', 'M'}, 7495, false);
        tablice[46] = new Tretja.Tablica(new char[]{'Z', 'S'}, 8724, true);
        tablice[47] = new Tretja.Tablica(new char[]{'E', 'U'}, 7473, true);
        tablice[48] = new Tretja.Tablica(new char[]{'Y', 'V'}, 5137, false);
        tablice[49] = new Tretja.Tablica(new char[]{'K', 'T'}, 8724, true);

        for (Tretja.Tablica t1: tablice) {
            for (Tretja.Tablica t2: tablice) {
                System.out.print(t1.hashCode() == t2.hashCode() ? '+' : '-');
            }
            System.out.println();
        }
    }
}
