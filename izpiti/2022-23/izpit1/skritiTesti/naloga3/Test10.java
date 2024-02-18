
import java.util.*;

public class Test10 {

    public static void main(String[] args) {
        Tretja.Tablica[] tablice = new Tretja.Tablica[50];
        tablice[0] = new Tretja.Tablica(new char[]{'V', 'L'}, 5233, false);
        tablice[1] = new Tretja.Tablica(new char[]{'V', 'L'}, 5233, false);
        tablice[2] = new Tretja.Tablica(new char[]{'W', 'V'}, 4791, true);
        tablice[3] = new Tretja.Tablica(new char[]{'W', 'V'}, 4791, true);
        tablice[4] = new Tretja.Tablica(new char[]{'K', 'W'}, 7334, true);
        tablice[5] = new Tretja.Tablica(new char[]{'V', 'L'}, 2713, true);
        tablice[6] = new Tretja.Tablica(new char[]{'V', 'L'}, 5233, false);
        tablice[7] = new Tretja.Tablica(new char[]{'K', 'W'}, 7334, false);
        tablice[8] = new Tretja.Tablica(new char[]{'V', 'L'}, 3597, true);
        tablice[9] = new Tretja.Tablica(new char[]{'V', 'L'}, 5233, false);
        tablice[10] = new Tretja.Tablica(new char[]{'R', 'J'}, 5233, false);
        tablice[11] = new Tretja.Tablica(new char[]{'V', 'J'}, 7652, true);
        tablice[12] = new Tretja.Tablica(new char[]{'W', 'T'}, 4791, false);
        tablice[13] = new Tretja.Tablica(new char[]{'V', 'L'}, 5233, true);
        tablice[14] = tablice[5];
        tablice[15] = new Tretja.Tablica(new char[]{'O', 'Q'}, 5233, true);
        tablice[16] = new Tretja.Tablica(new char[]{'N', 'G'}, 5233, false);
        tablice[17] = new Tretja.Tablica(new char[]{'B', 'R'}, 2713, true);
        tablice[18] = new Tretja.Tablica(new char[]{'V', 'L'}, 5233, false);
        tablice[19] = new Tretja.Tablica(new char[]{'V', 'L'}, 7394, true);
        tablice[20] = tablice[16];
        tablice[21] = new Tretja.Tablica(new char[]{'W', 'V'}, 4791, false);
        tablice[22] = new Tretja.Tablica(new char[]{'V', 'L'}, 4886, true);
        tablice[23] = new Tretja.Tablica(new char[]{'W', 'V'}, 4791, false);
        tablice[24] = tablice[21];
        tablice[25] = tablice[18];
        tablice[26] = new Tretja.Tablica(new char[]{'F', 'T'}, 5265, true);
        tablice[27] = new Tretja.Tablica(new char[]{'Y', 'T'}, 5233, false);
        tablice[28] = new Tretja.Tablica(new char[]{'K', 'W'}, 9143, true);
        tablice[29] = new Tretja.Tablica(new char[]{'M', 'W'}, 9837, true);
        tablice[30] = new Tretja.Tablica(new char[]{'Y', 'T'}, 9229, false);
        tablice[31] = tablice[19];
        tablice[32] = tablice[23];
        tablice[33] = new Tretja.Tablica(new char[]{'V', 'L'}, 7394, false);
        tablice[34] = new Tretja.Tablica(new char[]{'O', 'Q'}, 5233, false);
        tablice[35] = new Tretja.Tablica(new char[]{'V', 'L'}, 7394, true);
        tablice[36] = new Tretja.Tablica(new char[]{'I', 'A'}, 9182, false);
        tablice[37] = tablice[25];
        tablice[38] = new Tretja.Tablica(new char[]{'I', 'A'}, 1675, false);
        tablice[39] = tablice[2];
        tablice[40] = new Tretja.Tablica(new char[]{'Y', 'R'}, 7652, false);
        tablice[41] = new Tretja.Tablica(new char[]{'V', 'L'}, 3412, true);
        tablice[42] = new Tretja.Tablica(new char[]{'N', 'X'}, 6663, true);
        tablice[43] = new Tretja.Tablica(new char[]{'V', 'L'}, 5233, false);
        tablice[44] = new Tretja.Tablica(new char[]{'Z', 'J'}, 2713, false);
        tablice[45] = new Tretja.Tablica(new char[]{'H', 'L'}, 1454, false);
        tablice[46] = new Tretja.Tablica(new char[]{'R', 'K'}, 9223, false);
        tablice[47] = new Tretja.Tablica(new char[]{'W', 'V'}, 2621, false);
        tablice[48] = new Tretja.Tablica(new char[]{'I', 'A'}, 9616, false);
        tablice[49] = new Tretja.Tablica(new char[]{'Y', 'T'}, 9229, false);

        for (Tretja.Tablica tablica: tablice) {
            System.out.println(tablica.toString());
        }
    }
}
