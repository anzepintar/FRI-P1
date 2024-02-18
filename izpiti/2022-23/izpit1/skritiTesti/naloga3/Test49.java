
import java.util.*;

public class Test49 {

    public static void main(String[] args) {
        Tretja.Tablica[] tablice = new Tretja.Tablica[50];
        tablice[0] = new Tretja.Tablica(new char[]{'E', 'K'}, 2973, false);
        tablice[1] = new Tretja.Tablica(new char[]{'Z', 'S'}, 7917, false);
        tablice[2] = new Tretja.Tablica(new char[]{'J', 'S'}, 8337, false);
        tablice[3] = new Tretja.Tablica(new char[]{'C', 'T'}, 7917, true);
        tablice[4] = new Tretja.Tablica(new char[]{'E', 'K'}, 2136, true);
        tablice[5] = new Tretja.Tablica(new char[]{'Z', 'S'}, 7917, true);
        tablice[6] = new Tretja.Tablica(new char[]{'E', 'K'}, 3585, false);
        tablice[7] = new Tretja.Tablica(new char[]{'C', 'T'}, 9851, true);
        tablice[8] = new Tretja.Tablica(new char[]{'O', 'H'}, 1456, true);
        tablice[9] = new Tretja.Tablica(new char[]{'E', 'K'}, 4718, true);
        tablice[10] = new Tretja.Tablica(new char[]{'E', 'K'}, 6791, false);
        tablice[11] = new Tretja.Tablica(new char[]{'K', 'J'}, 1972, true);
        tablice[12] = new Tretja.Tablica(new char[]{'E', 'K'}, 3585, false);
        tablice[13] = new Tretja.Tablica(new char[]{'C', 'T'}, 7917, false);
        tablice[14] = new Tretja.Tablica(new char[]{'E', 'K'}, 4718, false);
        tablice[15] = new Tretja.Tablica(new char[]{'E', 'K'}, 4718, false);
        tablice[16] = new Tretja.Tablica(new char[]{'I', 'Q'}, 6791, true);
        tablice[17] = new Tretja.Tablica(new char[]{'H', 'F'}, 7255, true);
        tablice[18] = new Tretja.Tablica(new char[]{'E', 'K'}, 4718, true);
        tablice[19] = tablice[15];
        tablice[20] = new Tretja.Tablica(new char[]{'K', 'J'}, 1972, false);
        tablice[21] = new Tretja.Tablica(new char[]{'E', 'K'}, 4718, false);
        tablice[22] = new Tretja.Tablica(new char[]{'K', 'J'}, 1972, true);
        tablice[23] = new Tretja.Tablica(new char[]{'E', 'K'}, 4718, true);
        tablice[24] = new Tretja.Tablica(new char[]{'Q', 'Y'}, 8439, false);
        tablice[25] = new Tretja.Tablica(new char[]{'K', 'W'}, 7917, true);
        tablice[26] = new Tretja.Tablica(new char[]{'E', 'K'}, 6888, true);
        tablice[27] = tablice[17];
        tablice[28] = new Tretja.Tablica(new char[]{'E', 'K'}, 9725, false);
        tablice[29] = tablice[8];
        tablice[30] = tablice[10];
        tablice[31] = new Tretja.Tablica(new char[]{'Q', 'Y'}, 8439, true);
        tablice[32] = new Tretja.Tablica(new char[]{'Z', 'S'}, 8447, false);
        tablice[33] = new Tretja.Tablica(new char[]{'Z', 'S'}, 7917, false);
        tablice[34] = new Tretja.Tablica(new char[]{'J', 'S'}, 8337, false);
        tablice[35] = new Tretja.Tablica(new char[]{'E', 'K'}, 4718, false);
        tablice[36] = new Tretja.Tablica(new char[]{'C', 'T'}, 9876, false);
        tablice[37] = new Tretja.Tablica(new char[]{'E', 'K'}, 9725, true);
        tablice[38] = new Tretja.Tablica(new char[]{'E', 'K'}, 4718, false);
        tablice[39] = new Tretja.Tablica(new char[]{'E', 'K'}, 5584, true);
        tablice[40] = new Tretja.Tablica(new char[]{'K', 'W'}, 7917, true);
        tablice[41] = new Tretja.Tablica(new char[]{'J', 'S'}, 8337, true);
        tablice[42] = new Tretja.Tablica(new char[]{'P', 'T'}, 4718, true);
        tablice[43] = new Tretja.Tablica(new char[]{'X', 'X'}, 7388, false);
        tablice[44] = new Tretja.Tablica(new char[]{'E', 'K'}, 4718, false);
        tablice[45] = new Tretja.Tablica(new char[]{'E', 'K'}, 6888, false);
        tablice[46] = new Tretja.Tablica(new char[]{'J', 'S'}, 8337, false);
        tablice[47] = new Tretja.Tablica(new char[]{'A', 'B'}, 8439, true);
        tablice[48] = tablice[22];
        tablice[49] = new Tretja.Tablica(new char[]{'E', 'K'}, 9288, false);

        for (Tretja.Tablica t1: tablice) {
            for (Tretja.Tablica t2: tablice) {
                System.out.print(t1.hashCode() == t2.hashCode() ? '+' : '-');
            }
            System.out.println();
        }
    }
}
