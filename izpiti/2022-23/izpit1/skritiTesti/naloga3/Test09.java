
import java.util.*;

public class Test09 {

    public static void main(String[] args) {
        Tretja.Tablica[] tablice = new Tretja.Tablica[50];
        tablice[0] = new Tretja.Tablica(new char[]{'A', 'E'}, 6157, true);
        tablice[1] = new Tretja.Tablica(new char[]{'A', 'E'}, 8728, true);
        tablice[2] = new Tretja.Tablica(new char[]{'A', 'E'}, 6157, true);
        tablice[3] = tablice[2];
        tablice[4] = new Tretja.Tablica(new char[]{'A', 'E'}, 5213, true);
        tablice[5] = tablice[2];
        tablice[6] = new Tretja.Tablica(new char[]{'F', 'L'}, 1165, false);
        tablice[7] = new Tretja.Tablica(new char[]{'F', 'L'}, 1165, false);
        tablice[8] = tablice[3];
        tablice[9] = new Tretja.Tablica(new char[]{'A', 'E'}, 6157, false);
        tablice[10] = new Tretja.Tablica(new char[]{'A', 'E'}, 6157, true);
        tablice[11] = tablice[8];
        tablice[12] = new Tretja.Tablica(new char[]{'L', 'J'}, 5213, false);
        tablice[13] = new Tretja.Tablica(new char[]{'A', 'E'}, 8499, true);
        tablice[14] = new Tretja.Tablica(new char[]{'A', 'E'}, 8728, true);
        tablice[15] = new Tretja.Tablica(new char[]{'A', 'E'}, 6157, false);
        tablice[16] = new Tretja.Tablica(new char[]{'F', 'L'}, 1165, false);
        tablice[17] = tablice[3];
        tablice[18] = new Tretja.Tablica(new char[]{'L', 'J'}, 1366, false);
        tablice[19] = new Tretja.Tablica(new char[]{'A', 'E'}, 6157, true);
        tablice[20] = new Tretja.Tablica(new char[]{'L', 'J'}, 5213, false);
        tablice[21] = new Tretja.Tablica(new char[]{'L', 'J'}, 5213, false);
        tablice[22] = new Tretja.Tablica(new char[]{'A', 'E'}, 6157, true);
        tablice[23] = new Tretja.Tablica(new char[]{'A', 'Y'}, 6157, true);
        tablice[24] = new Tretja.Tablica(new char[]{'A', 'E'}, 8716, false);
        tablice[25] = new Tretja.Tablica(new char[]{'A', 'E'}, 8499, false);
        tablice[26] = new Tretja.Tablica(new char[]{'A', 'E'}, 6157, true);
        tablice[27] = new Tretja.Tablica(new char[]{'H', 'R'}, 1165, false);
        tablice[28] = new Tretja.Tablica(new char[]{'A', 'E'}, 6157, true);
        tablice[29] = new Tretja.Tablica(new char[]{'A', 'E'}, 5213, true);
        tablice[30] = new Tretja.Tablica(new char[]{'A', 'E'}, 6157, true);
        tablice[31] = tablice[29];
        tablice[32] = new Tretja.Tablica(new char[]{'A', 'E'}, 6157, false);
        tablice[33] = new Tretja.Tablica(new char[]{'A', 'E'}, 6157, false);
        tablice[34] = new Tretja.Tablica(new char[]{'A', 'E'}, 8728, true);
        tablice[35] = new Tretja.Tablica(new char[]{'A', 'E'}, 6157, true);
        tablice[36] = new Tretja.Tablica(new char[]{'L', 'J'}, 5213, true);
        tablice[37] = new Tretja.Tablica(new char[]{'L', 'J'}, 5213, true);
        tablice[38] = new Tretja.Tablica(new char[]{'A', 'E'}, 1428, true);
        tablice[39] = new Tretja.Tablica(new char[]{'Q', 'Y'}, 6157, false);
        tablice[40] = tablice[14];
        tablice[41] = new Tretja.Tablica(new char[]{'T', 'X'}, 5213, true);
        tablice[42] = new Tretja.Tablica(new char[]{'X', 'D'}, 9338, true);
        tablice[43] = tablice[22];
        tablice[44] = new Tretja.Tablica(new char[]{'A', 'E'}, 9537, true);
        tablice[45] = new Tretja.Tablica(new char[]{'A', 'E'}, 8222, false);
        tablice[46] = tablice[21];
        tablice[47] = tablice[39];
        tablice[48] = new Tretja.Tablica(new char[]{'A', 'E'}, 2887, true);
        tablice[49] = new Tretja.Tablica(new char[]{'A', 'E'}, 6157, true);

        for (Tretja.Tablica tablica: tablice) {
            System.out.println(tablica.toString());
        }
    }
}
