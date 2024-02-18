
import java.util.*;

public class Test06 {

    public static void main(String[] args) {
        Tretja.Tablica[] tablice = new Tretja.Tablica[50];
        tablice[0] = new Tretja.Tablica(new char[]{'Q', 'K'}, 8761, false);
        tablice[1] = new Tretja.Tablica(new char[]{'Q', 'K'}, 8761, false);
        tablice[2] = new Tretja.Tablica(new char[]{'V', 'J'}, 7974, true);
        tablice[3] = new Tretja.Tablica(new char[]{'V', 'J'}, 1452, true);
        tablice[4] = new Tretja.Tablica(new char[]{'Q', 'K'}, 8761, false);
        tablice[5] = new Tretja.Tablica(new char[]{'O', 'F'}, 2122, false);
        tablice[6] = new Tretja.Tablica(new char[]{'V', 'J'}, 1452, true);
        tablice[7] = new Tretja.Tablica(new char[]{'Z', 'E'}, 2269, false);
        tablice[8] = tablice[7];
        tablice[9] = new Tretja.Tablica(new char[]{'V', 'J'}, 2215, true);
        tablice[10] = new Tretja.Tablica(new char[]{'B', 'Q'}, 8998, true);
        tablice[11] = new Tretja.Tablica(new char[]{'W', 'F'}, 2122, true);
        tablice[12] = new Tretja.Tablica(new char[]{'Z', 'O'}, 2653, false);
        tablice[13] = new Tretja.Tablica(new char[]{'Z', 'E'}, 2269, true);
        tablice[14] = new Tretja.Tablica(new char[]{'Q', 'T'}, 1452, true);
        tablice[15] = new Tretja.Tablica(new char[]{'Z', 'S'}, 4239, true);
        tablice[16] = new Tretja.Tablica(new char[]{'Z', 'S'}, 3616, false);
        tablice[17] = new Tretja.Tablica(new char[]{'Q', 'K'}, 1884, true);
        tablice[18] = new Tretja.Tablica(new char[]{'Q', 'K'}, 4834, false);
        tablice[19] = new Tretja.Tablica(new char[]{'Q', 'K'}, 8761, true);
        tablice[20] = new Tretja.Tablica(new char[]{'V', 'W'}, 1884, false);
        tablice[21] = new Tretja.Tablica(new char[]{'Q', 'K'}, 3273, true);
        tablice[22] = tablice[19];
        tablice[23] = new Tretja.Tablica(new char[]{'R', 'H'}, 3616, true);
        tablice[24] = new Tretja.Tablica(new char[]{'Q', 'K'}, 8761, true);
        tablice[25] = new Tretja.Tablica(new char[]{'Z', 'E'}, 2269, true);
        tablice[26] = new Tretja.Tablica(new char[]{'B', 'Q'}, 8998, false);
        tablice[27] = new Tretja.Tablica(new char[]{'Q', 'K'}, 7233, true);
        tablice[28] = new Tretja.Tablica(new char[]{'Q', 'K'}, 3761, false);
        tablice[29] = new Tretja.Tablica(new char[]{'Q', 'K'}, 8761, false);
        tablice[30] = tablice[23];
        tablice[31] = new Tretja.Tablica(new char[]{'Z', 'E'}, 2269, false);
        tablice[32] = tablice[30];
        tablice[33] = new Tretja.Tablica(new char[]{'B', 'Q'}, 8998, true);
        tablice[34] = new Tretja.Tablica(new char[]{'Z', 'E'}, 9873, true);
        tablice[35] = new Tretja.Tablica(new char[]{'Z', 'E'}, 9873, false);
        tablice[36] = new Tretja.Tablica(new char[]{'Q', 'K'}, 8679, true);
        tablice[37] = new Tretja.Tablica(new char[]{'H', 'I'}, 8761, true);
        tablice[38] = tablice[19];
        tablice[39] = new Tretja.Tablica(new char[]{'B', 'Q'}, 8998, false);
        tablice[40] = tablice[20];
        tablice[41] = new Tretja.Tablica(new char[]{'L', 'R'}, 2269, false);
        tablice[42] = new Tretja.Tablica(new char[]{'T', 'X'}, 8363, false);
        tablice[43] = new Tretja.Tablica(new char[]{'Q', 'K'}, 3822, false);
        tablice[44] = new Tretja.Tablica(new char[]{'Z', 'E'}, 2269, false);
        tablice[45] = new Tretja.Tablica(new char[]{'R', 'H'}, 8124, true);
        tablice[46] = new Tretja.Tablica(new char[]{'S', 'D'}, 4239, false);
        tablice[47] = new Tretja.Tablica(new char[]{'Z', 'O'}, 3228, true);
        tablice[48] = new Tretja.Tablica(new char[]{'V', 'J'}, 7115, false);
        tablice[49] = new Tretja.Tablica(new char[]{'B', 'Q'}, 8998, true);

        for (Tretja.Tablica t1: tablice) {
            for (Tretja.Tablica t2: tablice) {
                System.out.print(t1.equals(t2) ? '+' : '-');
            }
            System.out.println();
        }
    }
}
