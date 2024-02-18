
import java.util.*;

public class Test26 {

    public static void main(String[] args) {
        Tretja.Tablica[] tablice = new Tretja.Tablica[50];
        tablice[0] = new Tretja.Tablica(new char[]{'B', 'X'}, 7269, true);
        tablice[1] = new Tretja.Tablica(new char[]{'B', 'X'}, 7269, false);
        tablice[2] = new Tretja.Tablica(new char[]{'B', 'X'}, 7269, false);
        tablice[3] = new Tretja.Tablica(new char[]{'B', 'X'}, 7269, true);
        tablice[4] = new Tretja.Tablica(new char[]{'H', 'P'}, 2431, false);
        tablice[5] = new Tretja.Tablica(new char[]{'H', 'J'}, 7269, true);
        tablice[6] = new Tretja.Tablica(new char[]{'B', 'X'}, 7788, false);
        tablice[7] = new Tretja.Tablica(new char[]{'H', 'D'}, 6976, true);
        tablice[8] = new Tretja.Tablica(new char[]{'H', 'J'}, 7269, true);
        tablice[9] = new Tretja.Tablica(new char[]{'H', 'J'}, 7269, true);
        tablice[10] = tablice[2];
        tablice[11] = new Tretja.Tablica(new char[]{'H', 'F'}, 6976, false);
        tablice[12] = new Tretja.Tablica(new char[]{'D', 'C'}, 7269, false);
        tablice[13] = tablice[9];
        tablice[14] = new Tretja.Tablica(new char[]{'B', 'X'}, 8442, false);
        tablice[15] = new Tretja.Tablica(new char[]{'B', 'X'}, 7269, false);
        tablice[16] = tablice[4];
        tablice[17] = new Tretja.Tablica(new char[]{'S', 'Z'}, 6834, false);
        tablice[18] = new Tretja.Tablica(new char[]{'H', 'J'}, 7269, false);
        tablice[19] = new Tretja.Tablica(new char[]{'Q', 'V'}, 7269, true);
        tablice[20] = new Tretja.Tablica(new char[]{'F', 'T'}, 7269, false);
        tablice[21] = new Tretja.Tablica(new char[]{'B', 'X'}, 7269, false);
        tablice[22] = new Tretja.Tablica(new char[]{'R', 'X'}, 7269, false);
        tablice[23] = new Tretja.Tablica(new char[]{'B', 'X'}, 7269, false);
        tablice[24] = new Tretja.Tablica(new char[]{'H', 'F'}, 6976, true);
        tablice[25] = tablice[18];
        tablice[26] = tablice[16];
        tablice[27] = new Tretja.Tablica(new char[]{'H', 'D'}, 6976, true);
        tablice[28] = new Tretja.Tablica(new char[]{'B', 'X'}, 7269, false);
        tablice[29] = new Tretja.Tablica(new char[]{'H', 'F'}, 6976, true);
        tablice[30] = new Tretja.Tablica(new char[]{'Z', 'L'}, 7269, true);
        tablice[31] = new Tretja.Tablica(new char[]{'H', 'F'}, 1187, true);
        tablice[32] = new Tretja.Tablica(new char[]{'J', 'P'}, 3859, false);
        tablice[33] = new Tretja.Tablica(new char[]{'Z', 'L'}, 7269, true);
        tablice[34] = new Tretja.Tablica(new char[]{'R', 'X'}, 7269, false);
        tablice[35] = new Tretja.Tablica(new char[]{'H', 'J'}, 7269, true);
        tablice[36] = new Tretja.Tablica(new char[]{'F', 'T'}, 7269, false);
        tablice[37] = new Tretja.Tablica(new char[]{'H', 'J'}, 4564, true);
        tablice[38] = new Tretja.Tablica(new char[]{'B', 'X'}, 7269, true);
        tablice[39] = tablice[31];
        tablice[40] = tablice[23];
        tablice[41] = new Tretja.Tablica(new char[]{'F', 'T'}, 4779, false);
        tablice[42] = new Tretja.Tablica(new char[]{'H', 'F'}, 1187, false);
        tablice[43] = new Tretja.Tablica(new char[]{'B', 'X'}, 7269, true);
        tablice[44] = new Tretja.Tablica(new char[]{'B', 'T'}, 7773, true);
        tablice[45] = new Tretja.Tablica(new char[]{'Y', 'E'}, 7269, false);
        tablice[46] = new Tretja.Tablica(new char[]{'H', 'J'}, 4564, false);
        tablice[47] = new Tretja.Tablica(new char[]{'Q', 'V'}, 7269, false);
        tablice[48] = new Tretja.Tablica(new char[]{'R', 'X'}, 7269, false);
        tablice[49] = new Tretja.Tablica(new char[]{'W', 'F'}, 7269, true);

        for (Tretja.Tablica t1: tablice) {
            for (Tretja.Tablica t2: tablice) {
                System.out.print(t1.equals(t2) ? '+' : '-');
            }
            System.out.println();
        }
    }
}
