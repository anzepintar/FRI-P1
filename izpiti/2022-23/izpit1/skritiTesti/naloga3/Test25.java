
import java.util.*;

public class Test25 {

    public static void main(String[] args) {
        Tretja.Tablica[] tablice = new Tretja.Tablica[50];
        tablice[0] = new Tretja.Tablica(new char[]{'P', 'E'}, 7939, true);
        tablice[1] = new Tretja.Tablica(new char[]{'P', 'E'}, 7939, false);
        tablice[2] = new Tretja.Tablica(new char[]{'P', 'E'}, 7939, false);
        tablice[3] = new Tretja.Tablica(new char[]{'P', 'E'}, 7939, true);
        tablice[4] = new Tretja.Tablica(new char[]{'P', 'E'}, 7939, false);
        tablice[5] = new Tretja.Tablica(new char[]{'P', 'E'}, 7939, true);
        tablice[6] = new Tretja.Tablica(new char[]{'C', 'D'}, 7939, true);
        tablice[7] = new Tretja.Tablica(new char[]{'P', 'E'}, 7939, true);
        tablice[8] = new Tretja.Tablica(new char[]{'C', 'D'}, 7939, false);
        tablice[9] = new Tretja.Tablica(new char[]{'S', 'W'}, 7939, false);
        tablice[10] = tablice[4];
        tablice[11] = new Tretja.Tablica(new char[]{'Z', 'Q'}, 7939, true);
        tablice[12] = new Tretja.Tablica(new char[]{'H', 'O'}, 5469, true);
        tablice[13] = new Tretja.Tablica(new char[]{'P', 'E'}, 7939, true);
        tablice[14] = new Tretja.Tablica(new char[]{'P', 'E'}, 3422, true);
        tablice[15] = new Tretja.Tablica(new char[]{'P', 'E'}, 7939, false);
        tablice[16] = new Tretja.Tablica(new char[]{'Z', 'Q'}, 7939, true);
        tablice[17] = tablice[2];
        tablice[18] = new Tretja.Tablica(new char[]{'P', 'E'}, 1523, true);
        tablice[19] = new Tretja.Tablica(new char[]{'C', 'D'}, 7939, true);
        tablice[20] = new Tretja.Tablica(new char[]{'S', 'W'}, 7939, false);
        tablice[21] = new Tretja.Tablica(new char[]{'P', 'E'}, 1491, true);
        tablice[22] = new Tretja.Tablica(new char[]{'H', 'O'}, 5469, true);
        tablice[23] = tablice[18];
        tablice[24] = new Tretja.Tablica(new char[]{'T', 'H'}, 7939, true);
        tablice[25] = tablice[20];
        tablice[26] = new Tretja.Tablica(new char[]{'P', 'E'}, 7939, false);
        tablice[27] = new Tretja.Tablica(new char[]{'P', 'E'}, 7939, true);
        tablice[28] = tablice[21];
        tablice[29] = new Tretja.Tablica(new char[]{'T', 'C'}, 7939, true);
        tablice[30] = tablice[14];
        tablice[31] = new Tretja.Tablica(new char[]{'Z', 'Q'}, 7939, false);
        tablice[32] = new Tretja.Tablica(new char[]{'P', 'E'}, 5729, true);
        tablice[33] = new Tretja.Tablica(new char[]{'P', 'E'}, 3422, false);
        tablice[34] = new Tretja.Tablica(new char[]{'P', 'E'}, 3422, true);
        tablice[35] = tablice[14];
        tablice[36] = new Tretja.Tablica(new char[]{'M', 'D'}, 7939, true);
        tablice[37] = new Tretja.Tablica(new char[]{'P', 'E'}, 3422, false);
        tablice[38] = new Tretja.Tablica(new char[]{'P', 'E'}, 3422, false);
        tablice[39] = new Tretja.Tablica(new char[]{'P', 'E'}, 5729, true);
        tablice[40] = new Tretja.Tablica(new char[]{'P', 'E'}, 6877, false);
        tablice[41] = new Tretja.Tablica(new char[]{'L', 'X'}, 7939, true);
        tablice[42] = new Tretja.Tablica(new char[]{'X', 'P'}, 7939, false);
        tablice[43] = tablice[31];
        tablice[44] = new Tretja.Tablica(new char[]{'Q', 'S'}, 3422, true);
        tablice[45] = new Tretja.Tablica(new char[]{'B', 'C'}, 8224, false);
        tablice[46] = new Tretja.Tablica(new char[]{'I', 'V'}, 7296, false);
        tablice[47] = new Tretja.Tablica(new char[]{'P', 'E'}, 1523, true);
        tablice[48] = new Tretja.Tablica(new char[]{'P', 'E'}, 1491, false);
        tablice[49] = new Tretja.Tablica(new char[]{'L', 'X'}, 7939, true);

        for (Tretja.Tablica t1: tablice) {
            for (Tretja.Tablica t2: tablice) {
                System.out.print(t1.equals(t2) ? '+' : '-');
            }
            System.out.println();
        }
    }
}
