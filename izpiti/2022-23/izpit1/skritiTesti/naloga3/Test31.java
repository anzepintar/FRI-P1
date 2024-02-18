
import java.util.*;

public class Test31 {

    public static void main(String[] args) {
        Tretja.Tablica[] tablice = new Tretja.Tablica[50];
        tablice[0] = new Tretja.Tablica(new char[]{'S', 'P'}, 6918, true);
        tablice[1] = new Tretja.Tablica(new char[]{'S', 'P'}, 6352, true);
        tablice[2] = new Tretja.Tablica(new char[]{'K', 'Y'}, 9245, true);
        tablice[3] = new Tretja.Tablica(new char[]{'S', 'P'}, 1825, false);
        tablice[4] = new Tretja.Tablica(new char[]{'S', 'P'}, 1825, true);
        tablice[5] = new Tretja.Tablica(new char[]{'S', 'P'}, 7162, true);
        tablice[6] = new Tretja.Tablica(new char[]{'U', 'C'}, 1825, false);
        tablice[7] = new Tretja.Tablica(new char[]{'C', 'K'}, 1825, true);
        tablice[8] = new Tretja.Tablica(new char[]{'F', 'K'}, 7157, true);
        tablice[9] = new Tretja.Tablica(new char[]{'S', 'P'}, 1641, false);
        tablice[10] = new Tretja.Tablica(new char[]{'S', 'P'}, 1982, false);
        tablice[11] = new Tretja.Tablica(new char[]{'S', 'P'}, 1982, true);
        tablice[12] = new Tretja.Tablica(new char[]{'S', 'P'}, 4474, true);
        tablice[13] = tablice[8];
        tablice[14] = new Tretja.Tablica(new char[]{'S', 'P'}, 1825, true);
        tablice[15] = new Tretja.Tablica(new char[]{'S', 'P'}, 6918, false);
        tablice[16] = new Tretja.Tablica(new char[]{'Y', 'X'}, 9311, true);
        tablice[17] = new Tretja.Tablica(new char[]{'S', 'P'}, 3413, true);
        tablice[18] = new Tretja.Tablica(new char[]{'S', 'P'}, 3413, true);
        tablice[19] = new Tretja.Tablica(new char[]{'S', 'P'}, 1684, true);
        tablice[20] = new Tretja.Tablica(new char[]{'K', 'L'}, 1825, true);
        tablice[21] = new Tretja.Tablica(new char[]{'X', 'Z'}, 8589, false);
        tablice[22] = tablice[1];
        tablice[23] = new Tretja.Tablica(new char[]{'S', 'P'}, 8137, true);
        tablice[24] = new Tretja.Tablica(new char[]{'S', 'P'}, 4474, true);
        tablice[25] = new Tretja.Tablica(new char[]{'S', 'P'}, 1458, true);
        tablice[26] = new Tretja.Tablica(new char[]{'Y', 'X'}, 1893, true);
        tablice[27] = new Tretja.Tablica(new char[]{'W', 'N'}, 3422, false);
        tablice[28] = new Tretja.Tablica(new char[]{'S', 'P'}, 3413, true);
        tablice[29] = new Tretja.Tablica(new char[]{'S', 'P'}, 1242, true);
        tablice[30] = tablice[25];
        tablice[31] = new Tretja.Tablica(new char[]{'S', 'P'}, 3413, false);
        tablice[32] = new Tretja.Tablica(new char[]{'G', 'W'}, 5685, false);
        tablice[33] = tablice[30];
        tablice[34] = new Tretja.Tablica(new char[]{'P', 'M'}, 2334, true);
        tablice[35] = new Tretja.Tablica(new char[]{'B', 'W'}, 3413, true);
        tablice[36] = new Tretja.Tablica(new char[]{'S', 'P'}, 3413, false);
        tablice[37] = new Tretja.Tablica(new char[]{'S', 'P'}, 1458, false);
        tablice[38] = new Tretja.Tablica(new char[]{'T', 'P'}, 7859, true);
        tablice[39] = new Tretja.Tablica(new char[]{'N', 'L'}, 4158, true);
        tablice[40] = new Tretja.Tablica(new char[]{'C', 'K'}, 7798, false);
        tablice[41] = new Tretja.Tablica(new char[]{'J', 'N'}, 5851, false);
        tablice[42] = new Tretja.Tablica(new char[]{'T', 'T'}, 1458, false);
        tablice[43] = new Tretja.Tablica(new char[]{'S', 'P'}, 1458, false);
        tablice[44] = tablice[3];
        tablice[45] = new Tretja.Tablica(new char[]{'Z', 'L'}, 8545, false);
        tablice[46] = new Tretja.Tablica(new char[]{'S', 'P'}, 4498, false);
        tablice[47] = new Tretja.Tablica(new char[]{'P', 'G'}, 3413, true);
        tablice[48] = new Tretja.Tablica(new char[]{'S', 'P'}, 3413, true);
        tablice[49] = new Tretja.Tablica(new char[]{'S', 'P'}, 3413, false);

        for (Tretja.Tablica t1: tablice) {
            for (Tretja.Tablica t2: tablice) {
                System.out.print(t1.equals(t2) ? '+' : '-');
            }
            System.out.println();
        }
    }
}
