
import java.util.*;

public class Test40 {

    public static void main(String[] args) {
        Tretja.Tablica[] tablice = new Tretja.Tablica[50];
        tablice[0] = new Tretja.Tablica(new char[]{'X', 'J'}, 4461, true);
        tablice[1] = new Tretja.Tablica(new char[]{'X', 'J'}, 3621, true);
        tablice[2] = new Tretja.Tablica(new char[]{'X', 'J'}, 4461, false);
        tablice[3] = tablice[1];
        tablice[4] = new Tretja.Tablica(new char[]{'A', 'M'}, 4461, false);
        tablice[5] = new Tretja.Tablica(new char[]{'R', 'S'}, 2663, false);
        tablice[6] = tablice[5];
        tablice[7] = new Tretja.Tablica(new char[]{'X', 'J'}, 8833, false);
        tablice[8] = new Tretja.Tablica(new char[]{'R', 'S'}, 2663, true);
        tablice[9] = new Tretja.Tablica(new char[]{'X', 'J'}, 1987, true);
        tablice[10] = new Tretja.Tablica(new char[]{'V', 'L'}, 4461, false);
        tablice[11] = new Tretja.Tablica(new char[]{'U', 'C'}, 2663, false);
        tablice[12] = tablice[2];
        tablice[13] = new Tretja.Tablica(new char[]{'T', 'J'}, 4461, false);
        tablice[14] = new Tretja.Tablica(new char[]{'F', 'A'}, 1485, false);
        tablice[15] = new Tretja.Tablica(new char[]{'X', 'J'}, 1987, false);
        tablice[16] = new Tretja.Tablica(new char[]{'X', 'J'}, 3621, true);
        tablice[17] = new Tretja.Tablica(new char[]{'X', 'J'}, 3621, false);
        tablice[18] = tablice[4];
        tablice[19] = tablice[2];
        tablice[20] = new Tretja.Tablica(new char[]{'A', 'R'}, 3621, false);
        tablice[21] = new Tretja.Tablica(new char[]{'X', 'J'}, 1987, false);
        tablice[22] = new Tretja.Tablica(new char[]{'Z', 'J'}, 9484, true);
        tablice[23] = new Tretja.Tablica(new char[]{'D', 'Q'}, 4461, false);
        tablice[24] = new Tretja.Tablica(new char[]{'Q', 'D'}, 2663, false);
        tablice[25] = new Tretja.Tablica(new char[]{'A', 'R'}, 3621, false);
        tablice[26] = new Tretja.Tablica(new char[]{'X', 'J'}, 2168, false);
        tablice[27] = new Tretja.Tablica(new char[]{'V', 'L'}, 1867, true);
        tablice[28] = tablice[15];
        tablice[29] = new Tretja.Tablica(new char[]{'I', 'N'}, 4461, false);
        tablice[30] = new Tretja.Tablica(new char[]{'Q', 'D'}, 2792, true);
        tablice[31] = new Tretja.Tablica(new char[]{'X', 'J'}, 1987, true);
        tablice[32] = new Tretja.Tablica(new char[]{'A', 'R'}, 3621, false);
        tablice[33] = new Tretja.Tablica(new char[]{'B', 'Y'}, 4461, true);
        tablice[34] = new Tretja.Tablica(new char[]{'E', 'C'}, 1987, false);
        tablice[35] = tablice[27];
        tablice[36] = tablice[31];
        tablice[37] = tablice[33];
        tablice[38] = tablice[19];
        tablice[39] = new Tretja.Tablica(new char[]{'S', 'T'}, 4461, false);
        tablice[40] = new Tretja.Tablica(new char[]{'R', 'S'}, 1188, true);
        tablice[41] = new Tretja.Tablica(new char[]{'U', 'C'}, 2663, true);
        tablice[42] = new Tretja.Tablica(new char[]{'R', 'B'}, 2391, false);
        tablice[43] = new Tretja.Tablica(new char[]{'I', 'S'}, 3621, true);
        tablice[44] = new Tretja.Tablica(new char[]{'X', 'J'}, 4461, true);
        tablice[45] = new Tretja.Tablica(new char[]{'X', 'J'}, 6597, true);
        tablice[46] = new Tretja.Tablica(new char[]{'X', 'J'}, 1987, false);
        tablice[47] = new Tretja.Tablica(new char[]{'X', 'J'}, 3621, true);
        tablice[48] = new Tretja.Tablica(new char[]{'X', 'J'}, 3621, true);
        tablice[49] = new Tretja.Tablica(new char[]{'B', 'Y'}, 2981, true);

        for (Tretja.Tablica t1: tablice) {
            for (Tretja.Tablica t2: tablice) {
                System.out.print(t1.hashCode() == t2.hashCode() ? '+' : '-');
            }
            System.out.println();
        }
    }
}
