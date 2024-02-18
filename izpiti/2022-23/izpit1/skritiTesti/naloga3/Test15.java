
import java.util.*;

public class Test15 {

    public static void main(String[] args) {
        Tretja.Tablica[] tablice = new Tretja.Tablica[50];
        tablice[0] = new Tretja.Tablica(new char[]{'J', 'E'}, 6292, false);
        tablice[1] = new Tretja.Tablica(new char[]{'J', 'E'}, 6292, true);
        tablice[2] = new Tretja.Tablica(new char[]{'J', 'E'}, 6292, true);
        tablice[3] = new Tretja.Tablica(new char[]{'J', 'E'}, 6292, false);
        tablice[4] = new Tretja.Tablica(new char[]{'I', 'O'}, 6292, true);
        tablice[5] = new Tretja.Tablica(new char[]{'J', 'E'}, 6292, false);
        tablice[6] = new Tretja.Tablica(new char[]{'J', 'E'}, 6292, false);
        tablice[7] = new Tretja.Tablica(new char[]{'J', 'E'}, 1463, false);
        tablice[8] = new Tretja.Tablica(new char[]{'H', 'D'}, 6325, false);
        tablice[9] = new Tretja.Tablica(new char[]{'S', 'N'}, 1463, false);
        tablice[10] = new Tretja.Tablica(new char[]{'O', 'U'}, 6292, true);
        tablice[11] = new Tretja.Tablica(new char[]{'X', 'D'}, 6292, true);
        tablice[12] = new Tretja.Tablica(new char[]{'T', 'O'}, 6292, true);
        tablice[13] = new Tretja.Tablica(new char[]{'J', 'E'}, 1541, false);
        tablice[14] = new Tretja.Tablica(new char[]{'J', 'A'}, 6292, true);
        tablice[15] = new Tretja.Tablica(new char[]{'O', 'U'}, 6292, true);
        tablice[16] = new Tretja.Tablica(new char[]{'H', 'D'}, 6325, true);
        tablice[17] = new Tretja.Tablica(new char[]{'H', 'D'}, 6325, true);
        tablice[18] = new Tretja.Tablica(new char[]{'O', 'U'}, 6292, true);
        tablice[19] = new Tretja.Tablica(new char[]{'O', 'U'}, 2573, false);
        tablice[20] = tablice[9];
        tablice[21] = new Tretja.Tablica(new char[]{'H', 'D'}, 6325, false);
        tablice[22] = new Tretja.Tablica(new char[]{'O', 'U'}, 6292, false);
        tablice[23] = new Tretja.Tablica(new char[]{'O', 'U'}, 2573, false);
        tablice[24] = tablice[12];
        tablice[25] = new Tretja.Tablica(new char[]{'X', 'D'}, 6292, false);
        tablice[26] = new Tretja.Tablica(new char[]{'J', 'A'}, 6292, true);
        tablice[27] = new Tretja.Tablica(new char[]{'J', 'E'}, 6292, false);
        tablice[28] = tablice[8];
        tablice[29] = new Tretja.Tablica(new char[]{'J', 'E'}, 1541, true);
        tablice[30] = new Tretja.Tablica(new char[]{'A', 'V'}, 4521, false);
        tablice[31] = new Tretja.Tablica(new char[]{'N', 'Y'}, 2573, true);
        tablice[32] = new Tretja.Tablica(new char[]{'M', 'L'}, 1463, false);
        tablice[33] = new Tretja.Tablica(new char[]{'M', 'L'}, 1658, false);
        tablice[34] = new Tretja.Tablica(new char[]{'J', 'E'}, 3457, false);
        tablice[35] = tablice[12];
        tablice[36] = new Tretja.Tablica(new char[]{'J', 'E'}, 6292, false);
        tablice[37] = new Tretja.Tablica(new char[]{'O', 'U'}, 2573, true);
        tablice[38] = new Tretja.Tablica(new char[]{'N', 'Y'}, 7471, true);
        tablice[39] = new Tretja.Tablica(new char[]{'T', 'V'}, 1914, true);
        tablice[40] = new Tretja.Tablica(new char[]{'M', 'E'}, 6325, true);
        tablice[41] = new Tretja.Tablica(new char[]{'H', 'D'}, 3394, false);
        tablice[42] = new Tretja.Tablica(new char[]{'Y', 'A'}, 6292, false);
        tablice[43] = new Tretja.Tablica(new char[]{'T', 'O'}, 6292, false);
        tablice[44] = new Tretja.Tablica(new char[]{'R', 'L'}, 6292, true);
        tablice[45] = new Tretja.Tablica(new char[]{'H', 'D'}, 8377, false);
        tablice[46] = new Tretja.Tablica(new char[]{'J', 'E'}, 6292, true);
        tablice[47] = new Tretja.Tablica(new char[]{'O', 'U'}, 6292, true);
        tablice[48] = new Tretja.Tablica(new char[]{'J', 'E'}, 2126, false);
        tablice[49] = new Tretja.Tablica(new char[]{'F', 'B'}, 6292, true);

        for (Tretja.Tablica tablica: tablice) {
            System.out.println(tablica.toString());
        }
    }
}
