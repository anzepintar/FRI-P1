
import java.util.*;

public class Test16 {

    public static void main(String[] args) {
        Tretja.Tablica[] tablice = new Tretja.Tablica[50];
        tablice[0] = new Tretja.Tablica(new char[]{'N', 'T'}, 9688, true);
        tablice[1] = new Tretja.Tablica(new char[]{'K', 'I'}, 9688, false);
        tablice[2] = new Tretja.Tablica(new char[]{'J', 'I'}, 9688, false);
        tablice[3] = tablice[2];
        tablice[4] = new Tretja.Tablica(new char[]{'K', 'I'}, 9688, false);
        tablice[5] = tablice[4];
        tablice[6] = new Tretja.Tablica(new char[]{'K', 'I'}, 9688, true);
        tablice[7] = new Tretja.Tablica(new char[]{'K', 'I'}, 8984, true);
        tablice[8] = new Tretja.Tablica(new char[]{'L', 'K'}, 5955, true);
        tablice[9] = new Tretja.Tablica(new char[]{'L', 'D'}, 5955, false);
        tablice[10] = new Tretja.Tablica(new char[]{'K', 'I'}, 8984, true);
        tablice[11] = tablice[6];
        tablice[12] = new Tretja.Tablica(new char[]{'K', 'I'}, 9688, true);
        tablice[13] = new Tretja.Tablica(new char[]{'K', 'I'}, 3641, false);
        tablice[14] = tablice[11];
        tablice[15] = new Tretja.Tablica(new char[]{'K', 'I'}, 9688, false);
        tablice[16] = new Tretja.Tablica(new char[]{'R', 'J'}, 4186, false);
        tablice[17] = new Tretja.Tablica(new char[]{'N', 'T'}, 9688, false);
        tablice[18] = tablice[1];
        tablice[19] = new Tretja.Tablica(new char[]{'K', 'I'}, 9688, false);
        tablice[20] = new Tretja.Tablica(new char[]{'L', 'D'}, 1843, true);
        tablice[21] = tablice[11];
        tablice[22] = new Tretja.Tablica(new char[]{'U', 'W'}, 9688, true);
        tablice[23] = tablice[18];
        tablice[24] = new Tretja.Tablica(new char[]{'J', 'I'}, 9688, false);
        tablice[25] = new Tretja.Tablica(new char[]{'O', 'V'}, 5512, true);
        tablice[26] = new Tretja.Tablica(new char[]{'K', 'I'}, 7655, true);
        tablice[27] = tablice[9];
        tablice[28] = new Tretja.Tablica(new char[]{'N', 'T'}, 9688, false);
        tablice[29] = new Tretja.Tablica(new char[]{'O', 'V'}, 5512, true);
        tablice[30] = new Tretja.Tablica(new char[]{'V', 'F'}, 1536, false);
        tablice[31] = new Tretja.Tablica(new char[]{'Q', 'G'}, 7529, false);
        tablice[32] = new Tretja.Tablica(new char[]{'D', 'E'}, 9496, false);
        tablice[33] = new Tretja.Tablica(new char[]{'X', 'D'}, 3953, true);
        tablice[34] = new Tretja.Tablica(new char[]{'K', 'I'}, 9688, true);
        tablice[35] = new Tretja.Tablica(new char[]{'C', 'K'}, 3953, true);
        tablice[36] = tablice[17];
        tablice[37] = tablice[24];
        tablice[38] = new Tretja.Tablica(new char[]{'K', 'I'}, 9688, false);
        tablice[39] = new Tretja.Tablica(new char[]{'K', 'I'}, 9688, true);
        tablice[40] = new Tretja.Tablica(new char[]{'Q', 'Y'}, 5658, false);
        tablice[41] = new Tretja.Tablica(new char[]{'U', 'W'}, 1476, true);
        tablice[42] = new Tretja.Tablica(new char[]{'J', 'I'}, 9688, false);
        tablice[43] = tablice[10];
        tablice[44] = new Tretja.Tablica(new char[]{'L', 'K'}, 5955, true);
        tablice[45] = tablice[10];
        tablice[46] = new Tretja.Tablica(new char[]{'V', 'F'}, 1536, true);
        tablice[47] = tablice[16];
        tablice[48] = tablice[9];
        tablice[49] = new Tretja.Tablica(new char[]{'C', 'B'}, 5627, false);

        for (Tretja.Tablica tablica: tablice) {
            System.out.println(tablica.toString());
        }
    }
}
