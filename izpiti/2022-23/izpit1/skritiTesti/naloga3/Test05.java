
import java.util.*;

public class Test05 {

    public static void main(String[] args) {
        Tretja.Tablica[] tablice = new Tretja.Tablica[50];
        tablice[0] = new Tretja.Tablica(new char[]{'L', 'Z'}, 9613, false);
        tablice[1] = new Tretja.Tablica(new char[]{'L', 'Z'}, 9613, false);
        tablice[2] = new Tretja.Tablica(new char[]{'L', 'Z'}, 9613, true);
        tablice[3] = tablice[2];
        tablice[4] = new Tretja.Tablica(new char[]{'L', 'Z'}, 9613, false);
        tablice[5] = new Tretja.Tablica(new char[]{'M', 'M'}, 9613, false);
        tablice[6] = new Tretja.Tablica(new char[]{'L', 'Z'}, 9613, true);
        tablice[7] = new Tretja.Tablica(new char[]{'M', 'M'}, 9613, false);
        tablice[8] = tablice[7];
        tablice[9] = new Tretja.Tablica(new char[]{'L', 'Z'}, 9613, false);
        tablice[10] = new Tretja.Tablica(new char[]{'M', 'M'}, 9613, false);
        tablice[11] = new Tretja.Tablica(new char[]{'K', 'L'}, 9613, false);
        tablice[12] = new Tretja.Tablica(new char[]{'H', 'U'}, 8199, false);
        tablice[13] = new Tretja.Tablica(new char[]{'M', 'M'}, 9613, true);
        tablice[14] = new Tretja.Tablica(new char[]{'L', 'Z'}, 9613, false);
        tablice[15] = new Tretja.Tablica(new char[]{'L', 'Z'}, 9613, true);
        tablice[16] = new Tretja.Tablica(new char[]{'F', 'G'}, 6849, true);
        tablice[17] = new Tretja.Tablica(new char[]{'L', 'Z'}, 9613, false);
        tablice[18] = new Tretja.Tablica(new char[]{'I', 'A'}, 8199, true);
        tablice[19] = new Tretja.Tablica(new char[]{'M', 'M'}, 7566, true);
        tablice[20] = new Tretja.Tablica(new char[]{'V', 'S'}, 9613, false);
        tablice[21] = new Tretja.Tablica(new char[]{'L', 'Z'}, 9613, true);
        tablice[22] = new Tretja.Tablica(new char[]{'L', 'Z'}, 9613, false);
        tablice[23] = new Tretja.Tablica(new char[]{'I', 'L'}, 4767, false);
        tablice[24] = new Tretja.Tablica(new char[]{'M', 'M'}, 2475, true);
        tablice[25] = new Tretja.Tablica(new char[]{'T', 'S'}, 9613, false);
        tablice[26] = new Tretja.Tablica(new char[]{'F', 'G'}, 4674, false);
        tablice[27] = new Tretja.Tablica(new char[]{'L', 'W'}, 1676, true);
        tablice[28] = tablice[5];
        tablice[29] = tablice[12];
        tablice[30] = new Tretja.Tablica(new char[]{'M', 'M'}, 9613, false);
        tablice[31] = new Tretja.Tablica(new char[]{'L', 'Z'}, 9613, false);
        tablice[32] = new Tretja.Tablica(new char[]{'L', 'Z'}, 9613, false);
        tablice[33] = tablice[12];
        tablice[34] = new Tretja.Tablica(new char[]{'H', 'J'}, 6182, true);
        tablice[35] = new Tretja.Tablica(new char[]{'U', 'O'}, 9613, false);
        tablice[36] = tablice[7];
        tablice[37] = new Tretja.Tablica(new char[]{'F', 'G'}, 6684, true);
        tablice[38] = tablice[36];
        tablice[39] = new Tretja.Tablica(new char[]{'R', 'T'}, 9613, false);
        tablice[40] = new Tretja.Tablica(new char[]{'M', 'M'}, 1715, true);
        tablice[41] = new Tretja.Tablica(new char[]{'V', 'S'}, 9613, true);
        tablice[42] = new Tretja.Tablica(new char[]{'B', 'F'}, 7566, true);
        tablice[43] = new Tretja.Tablica(new char[]{'F', 'G'}, 6849, true);
        tablice[44] = new Tretja.Tablica(new char[]{'O', 'H'}, 3453, false);
        tablice[45] = tablice[44];
        tablice[46] = new Tretja.Tablica(new char[]{'L', 'Z'}, 3758, false);
        tablice[47] = new Tretja.Tablica(new char[]{'M', 'N'}, 9613, false);
        tablice[48] = new Tretja.Tablica(new char[]{'E', 'K'}, 9613, false);
        tablice[49] = new Tretja.Tablica(new char[]{'P', 'Q'}, 6849, true);

        for (Tretja.Tablica tablica: tablice) {
            System.out.println(tablica.toString());
        }
    }
}
