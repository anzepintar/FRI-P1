
import java.util.*;

public class Test36 {

    public static void main(String[] args) {
        Tretja.Tablica[] tablice = new Tretja.Tablica[50];
        tablice[0] = new Tretja.Tablica(new char[]{'Q', 'Q'}, 8629, true);
        tablice[1] = new Tretja.Tablica(new char[]{'Q', 'Q'}, 8629, true);
        tablice[2] = new Tretja.Tablica(new char[]{'Q', 'Q'}, 8629, true);
        tablice[3] = new Tretja.Tablica(new char[]{'L', 'B'}, 8629, true);
        tablice[4] = new Tretja.Tablica(new char[]{'Q', 'Q'}, 8629, false);
        tablice[5] = new Tretja.Tablica(new char[]{'Q', 'Q'}, 3921, true);
        tablice[6] = new Tretja.Tablica(new char[]{'Q', 'Q'}, 8629, false);
        tablice[7] = new Tretja.Tablica(new char[]{'U', 'B'}, 1869, false);
        tablice[8] = new Tretja.Tablica(new char[]{'C', 'D'}, 8629, true);
        tablice[9] = new Tretja.Tablica(new char[]{'Q', 'Q'}, 8536, false);
        tablice[10] = new Tretja.Tablica(new char[]{'L', 'B'}, 3918, true);
        tablice[11] = new Tretja.Tablica(new char[]{'Q', 'Q'}, 8536, false);
        tablice[12] = tablice[10];
        tablice[13] = new Tretja.Tablica(new char[]{'X', 'U'}, 3918, true);
        tablice[14] = tablice[11];
        tablice[15] = new Tretja.Tablica(new char[]{'H', 'Q'}, 1869, false);
        tablice[16] = new Tretja.Tablica(new char[]{'J', 'L'}, 3918, true);
        tablice[17] = new Tretja.Tablica(new char[]{'Q', 'Q'}, 8629, true);
        tablice[18] = new Tretja.Tablica(new char[]{'Q', 'Q'}, 8629, true);
        tablice[19] = new Tretja.Tablica(new char[]{'Q', 'Q'}, 8629, true);
        tablice[20] = tablice[8];
        tablice[21] = new Tretja.Tablica(new char[]{'J', 'L'}, 9497, false);
        tablice[22] = new Tretja.Tablica(new char[]{'J', 'L'}, 3918, true);
        tablice[23] = tablice[3];
        tablice[24] = new Tretja.Tablica(new char[]{'Q', 'Q'}, 8536, false);
        tablice[25] = tablice[11];
        tablice[26] = new Tretja.Tablica(new char[]{'Q', 'Q'}, 3921, true);
        tablice[27] = new Tretja.Tablica(new char[]{'S', 'P'}, 3918, false);
        tablice[28] = new Tretja.Tablica(new char[]{'H', 'C'}, 8799, true);
        tablice[29] = new Tretja.Tablica(new char[]{'C', 'D'}, 8629, false);
        tablice[30] = tablice[27];
        tablice[31] = new Tretja.Tablica(new char[]{'L', 'B'}, 1416, false);
        tablice[32] = new Tretja.Tablica(new char[]{'L', 'M'}, 3918, true);
        tablice[33] = new Tretja.Tablica(new char[]{'Y', 'P'}, 5864, false);
        tablice[34] = new Tretja.Tablica(new char[]{'Q', 'Q'}, 7788, false);
        tablice[35] = new Tretja.Tablica(new char[]{'J', 'L'}, 2142, false);
        tablice[36] = new Tretja.Tablica(new char[]{'U', 'B'}, 9728, true);
        tablice[37] = new Tretja.Tablica(new char[]{'E', 'M'}, 1869, false);
        tablice[38] = new Tretja.Tablica(new char[]{'Q', 'Q'}, 8629, false);
        tablice[39] = new Tretja.Tablica(new char[]{'I', 'J'}, 3329, false);
        tablice[40] = new Tretja.Tablica(new char[]{'Y', 'P'}, 5864, false);
        tablice[41] = new Tretja.Tablica(new char[]{'S', 'P'}, 3918, false);
        tablice[42] = new Tretja.Tablica(new char[]{'Q', 'Q'}, 3921, true);
        tablice[43] = new Tretja.Tablica(new char[]{'L', 'B'}, 3918, false);
        tablice[44] = new Tretja.Tablica(new char[]{'Q', 'Q'}, 8629, false);
        tablice[45] = new Tretja.Tablica(new char[]{'H', 'E'}, 8629, false);
        tablice[46] = new Tretja.Tablica(new char[]{'X', 'U'}, 3918, true);
        tablice[47] = new Tretja.Tablica(new char[]{'Q', 'Q'}, 3921, false);
        tablice[48] = new Tretja.Tablica(new char[]{'V', 'R'}, 4213, false);
        tablice[49] = tablice[33];

        for (Tretja.Tablica t1: tablice) {
            for (Tretja.Tablica t2: tablice) {
                System.out.print(t1.hashCode() == t2.hashCode() ? '+' : '-');
            }
            System.out.println();
        }
    }
}
