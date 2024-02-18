
import java.util.*;

public class Test23 {

    public static void main(String[] args) {
        Tretja.Tablica[] tablice = new Tretja.Tablica[50];
        tablice[0] = new Tretja.Tablica(new char[]{'H', 'Y'}, 2222, true);
        tablice[1] = new Tretja.Tablica(new char[]{'H', 'Y'}, 2222, true);
        tablice[2] = new Tretja.Tablica(new char[]{'S', 'O'}, 4967, true);
        tablice[3] = new Tretja.Tablica(new char[]{'Z', 'L'}, 4967, true);
        tablice[4] = new Tretja.Tablica(new char[]{'N', 'F'}, 2222, false);
        tablice[5] = new Tretja.Tablica(new char[]{'N', 'F'}, 2222, true);
        tablice[6] = new Tretja.Tablica(new char[]{'Z', 'L'}, 3479, true);
        tablice[7] = new Tretja.Tablica(new char[]{'H', 'Y'}, 5942, true);
        tablice[8] = new Tretja.Tablica(new char[]{'N', 'F'}, 2222, true);
        tablice[9] = new Tretja.Tablica(new char[]{'H', 'Y'}, 5942, true);
        tablice[10] = new Tretja.Tablica(new char[]{'K', 'H'}, 5942, false);
        tablice[11] = new Tretja.Tablica(new char[]{'H', 'Y'}, 6625, true);
        tablice[12] = new Tretja.Tablica(new char[]{'X', 'P'}, 7578, true);
        tablice[13] = new Tretja.Tablica(new char[]{'H', 'Y'}, 2222, true);
        tablice[14] = new Tretja.Tablica(new char[]{'Z', 'L'}, 3479, true);
        tablice[15] = new Tretja.Tablica(new char[]{'N', 'F'}, 1938, false);
        tablice[16] = new Tretja.Tablica(new char[]{'K', 'H'}, 5942, true);
        tablice[17] = new Tretja.Tablica(new char[]{'H', 'Y'}, 6855, true);
        tablice[18] = new Tretja.Tablica(new char[]{'H', 'Y'}, 2222, true);
        tablice[19] = new Tretja.Tablica(new char[]{'H', 'Y'}, 2222, true);
        tablice[20] = new Tretja.Tablica(new char[]{'H', 'Y'}, 6855, true);
        tablice[21] = new Tretja.Tablica(new char[]{'L', 'L'}, 2222, true);
        tablice[22] = new Tretja.Tablica(new char[]{'U', 'J'}, 7553, true);
        tablice[23] = new Tretja.Tablica(new char[]{'L', 'L'}, 2222, true);
        tablice[24] = new Tretja.Tablica(new char[]{'L', 'L'}, 2222, true);
        tablice[25] = new Tretja.Tablica(new char[]{'Z', 'L'}, 3479, true);
        tablice[26] = new Tretja.Tablica(new char[]{'U', 'D'}, 2222, true);
        tablice[27] = tablice[2];
        tablice[28] = tablice[24];
        tablice[29] = new Tretja.Tablica(new char[]{'T', 'W'}, 3479, true);
        tablice[30] = tablice[18];
        tablice[31] = new Tretja.Tablica(new char[]{'S', 'U'}, 3917, true);
        tablice[32] = tablice[3];
        tablice[33] = new Tretja.Tablica(new char[]{'T', 'W'}, 1987, true);
        tablice[34] = new Tretja.Tablica(new char[]{'T', 'W'}, 4911, false);
        tablice[35] = tablice[33];
        tablice[36] = tablice[10];
        tablice[37] = new Tretja.Tablica(new char[]{'Z', 'L'}, 3499, true);
        tablice[38] = new Tretja.Tablica(new char[]{'P', 'U'}, 4967, false);
        tablice[39] = new Tretja.Tablica(new char[]{'H', 'Y'}, 2222, true);
        tablice[40] = new Tretja.Tablica(new char[]{'H', 'Y'}, 8599, true);
        tablice[41] = new Tretja.Tablica(new char[]{'B', 'Q'}, 2222, true);
        tablice[42] = new Tretja.Tablica(new char[]{'Z', 'L'}, 6584, true);
        tablice[43] = new Tretja.Tablica(new char[]{'W', 'F'}, 7552, false);
        tablice[44] = new Tretja.Tablica(new char[]{'L', 'G'}, 3776, false);
        tablice[45] = tablice[28];
        tablice[46] = new Tretja.Tablica(new char[]{'H', 'Y'}, 2222, true);
        tablice[47] = new Tretja.Tablica(new char[]{'L', 'L'}, 2222, false);
        tablice[48] = tablice[24];
        tablice[49] = new Tretja.Tablica(new char[]{'H', 'Y'}, 6855, false);

        for (Tretja.Tablica t1: tablice) {
            for (Tretja.Tablica t2: tablice) {
                System.out.print(t1.equals(t2) ? '+' : '-');
            }
            System.out.println();
        }
    }
}
