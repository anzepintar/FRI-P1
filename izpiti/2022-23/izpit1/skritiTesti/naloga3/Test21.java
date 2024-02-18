
import java.util.*;

public class Test21 {

    public static void main(String[] args) {
        Tretja.Tablica[] tablice = new Tretja.Tablica[50];
        tablice[0] = new Tretja.Tablica(new char[]{'S', 'O'}, 3173, false);
        tablice[1] = new Tretja.Tablica(new char[]{'S', 'O'}, 3173, false);
        tablice[2] = new Tretja.Tablica(new char[]{'S', 'O'}, 3173, true);
        tablice[3] = new Tretja.Tablica(new char[]{'S', 'O'}, 3173, false);
        tablice[4] = tablice[2];
        tablice[5] = new Tretja.Tablica(new char[]{'S', 'O'}, 6512, false);
        tablice[6] = new Tretja.Tablica(new char[]{'H', 'D'}, 3173, false);
        tablice[7] = tablice[6];
        tablice[8] = tablice[6];
        tablice[9] = new Tretja.Tablica(new char[]{'W', 'L'}, 6512, false);
        tablice[10] = new Tretja.Tablica(new char[]{'S', 'O'}, 3173, true);
        tablice[11] = new Tretja.Tablica(new char[]{'C', 'R'}, 2162, true);
        tablice[12] = new Tretja.Tablica(new char[]{'W', 'L'}, 6512, false);
        tablice[13] = new Tretja.Tablica(new char[]{'C', 'R'}, 9443, false);
        tablice[14] = new Tretja.Tablica(new char[]{'H', 'D'}, 3173, true);
        tablice[15] = new Tretja.Tablica(new char[]{'Y', 'G'}, 9443, false);
        tablice[16] = new Tretja.Tablica(new char[]{'T', 'O'}, 3173, true);
        tablice[17] = tablice[8];
        tablice[18] = new Tretja.Tablica(new char[]{'C', 'R'}, 9443, false);
        tablice[19] = new Tretja.Tablica(new char[]{'S', 'O'}, 3173, false);
        tablice[20] = new Tretja.Tablica(new char[]{'H', 'D'}, 3173, true);
        tablice[21] = new Tretja.Tablica(new char[]{'P', 'J'}, 3173, true);
        tablice[22] = new Tretja.Tablica(new char[]{'H', 'D'}, 3173, false);
        tablice[23] = new Tretja.Tablica(new char[]{'Y', 'G'}, 9443, false);
        tablice[24] = tablice[21];
        tablice[25] = tablice[22];
        tablice[26] = new Tretja.Tablica(new char[]{'Z', 'N'}, 1942, true);
        tablice[27] = new Tretja.Tablica(new char[]{'H', 'D'}, 9751, false);
        tablice[28] = tablice[20];
        tablice[29] = tablice[12];
        tablice[30] = new Tretja.Tablica(new char[]{'Y', 'E'}, 1683, false);
        tablice[31] = new Tretja.Tablica(new char[]{'Y', 'G'}, 9443, true);
        tablice[32] = new Tretja.Tablica(new char[]{'P', 'J'}, 3173, true);
        tablice[33] = new Tretja.Tablica(new char[]{'H', 'D'}, 3173, false);
        tablice[34] = new Tretja.Tablica(new char[]{'A', 'I'}, 7596, false);
        tablice[35] = new Tretja.Tablica(new char[]{'H', 'D'}, 7866, true);
        tablice[36] = new Tretja.Tablica(new char[]{'Y', 'E'}, 1683, false);
        tablice[37] = new Tretja.Tablica(new char[]{'S', 'O'}, 3173, true);
        tablice[38] = tablice[16];
        tablice[39] = new Tretja.Tablica(new char[]{'P', 'J'}, 3173, false);
        tablice[40] = new Tretja.Tablica(new char[]{'H', 'D'}, 5455, true);
        tablice[41] = new Tretja.Tablica(new char[]{'S', 'O'}, 6512, false);
        tablice[42] = new Tretja.Tablica(new char[]{'W', 'L'}, 6512, true);
        tablice[43] = new Tretja.Tablica(new char[]{'G', 'M'}, 3173, true);
        tablice[44] = new Tretja.Tablica(new char[]{'I', 'J'}, 5479, false);
        tablice[45] = new Tretja.Tablica(new char[]{'R', 'C'}, 3173, false);
        tablice[46] = new Tretja.Tablica(new char[]{'S', 'O'}, 8415, false);
        tablice[47] = new Tretja.Tablica(new char[]{'P', 'J'}, 3173, false);
        tablice[48] = tablice[46];
        tablice[49] = new Tretja.Tablica(new char[]{'K', 'P'}, 3173, true);

        for (Tretja.Tablica t1: tablice) {
            for (Tretja.Tablica t2: tablice) {
                System.out.print(t1.equals(t2) ? '+' : '-');
            }
            System.out.println();
        }
    }
}
