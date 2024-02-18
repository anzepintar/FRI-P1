
import java.util.*;

public class Test14 {

    public static void main(String[] args) {
        Tretja.Tablica[] tablice = new Tretja.Tablica[50];
        tablice[0] = new Tretja.Tablica(new char[]{'N', 'Y'}, 8229, false);
        tablice[1] = new Tretja.Tablica(new char[]{'F', 'P'}, 8229, true);
        tablice[2] = new Tretja.Tablica(new char[]{'T', 'M'}, 8229, true);
        tablice[3] = new Tretja.Tablica(new char[]{'F', 'G'}, 8229, true);
        tablice[4] = new Tretja.Tablica(new char[]{'N', 'Y'}, 5615, false);
        tablice[5] = tablice[4];
        tablice[6] = new Tretja.Tablica(new char[]{'N', 'Y'}, 9884, false);
        tablice[7] = new Tretja.Tablica(new char[]{'D', 'E'}, 8229, false);
        tablice[8] = new Tretja.Tablica(new char[]{'D', 'E'}, 2756, false);
        tablice[9] = new Tretja.Tablica(new char[]{'N', 'Y'}, 5363, false);
        tablice[10] = new Tretja.Tablica(new char[]{'I', 'C'}, 2727, false);
        tablice[11] = new Tretja.Tablica(new char[]{'N', 'Y'}, 8229, false);
        tablice[12] = new Tretja.Tablica(new char[]{'N', 'Y'}, 2111, false);
        tablice[13] = new Tretja.Tablica(new char[]{'N', 'Y'}, 9884, true);
        tablice[14] = new Tretja.Tablica(new char[]{'F', 'P'}, 8229, false);
        tablice[15] = new Tretja.Tablica(new char[]{'N', 'Y'}, 5615, true);
        tablice[16] = new Tretja.Tablica(new char[]{'N', 'Y'}, 2111, true);
        tablice[17] = new Tretja.Tablica(new char[]{'E', 'V'}, 1712, true);
        tablice[18] = new Tretja.Tablica(new char[]{'L', 'S'}, 8229, false);
        tablice[19] = new Tretja.Tablica(new char[]{'I', 'H'}, 6275, false);
        tablice[20] = tablice[18];
        tablice[21] = new Tretja.Tablica(new char[]{'M', 'K'}, 5615, false);
        tablice[22] = new Tretja.Tablica(new char[]{'F', 'G'}, 6257, false);
        tablice[23] = new Tretja.Tablica(new char[]{'N', 'Y'}, 5615, false);
        tablice[24] = new Tretja.Tablica(new char[]{'L', 'W'}, 4311, true);
        tablice[25] = new Tretja.Tablica(new char[]{'N', 'Y'}, 2111, true);
        tablice[26] = new Tretja.Tablica(new char[]{'L', 'K'}, 5615, true);
        tablice[27] = new Tretja.Tablica(new char[]{'N', 'Y'}, 5615, true);
        tablice[28] = new Tretja.Tablica(new char[]{'I', 'H'}, 6275, false);
        tablice[29] = new Tretja.Tablica(new char[]{'N', 'Y'}, 2111, true);
        tablice[30] = new Tretja.Tablica(new char[]{'N', 'Y'}, 2111, true);
        tablice[31] = new Tretja.Tablica(new char[]{'N', 'Y'}, 3299, true);
        tablice[32] = new Tretja.Tablica(new char[]{'N', 'Y'}, 2111, false);
        tablice[33] = new Tretja.Tablica(new char[]{'S', 'P'}, 2953, true);
        tablice[34] = new Tretja.Tablica(new char[]{'F', 'G'}, 6257, false);
        tablice[35] = new Tretja.Tablica(new char[]{'O', 'I'}, 4783, true);
        tablice[36] = tablice[28];
        tablice[37] = new Tretja.Tablica(new char[]{'F', 'P'}, 8229, true);
        tablice[38] = new Tretja.Tablica(new char[]{'N', 'Q'}, 7292, true);
        tablice[39] = new Tretja.Tablica(new char[]{'I', 'R'}, 8675, true);
        tablice[40] = new Tretja.Tablica(new char[]{'I', 'H'}, 6275, false);
        tablice[41] = new Tretja.Tablica(new char[]{'N', 'Q'}, 7292, true);
        tablice[42] = new Tretja.Tablica(new char[]{'W', 'Q'}, 4311, false);
        tablice[43] = new Tretja.Tablica(new char[]{'B', 'C'}, 5785, false);
        tablice[44] = new Tretja.Tablica(new char[]{'N', 'Y'}, 8229, false);
        tablice[45] = new Tretja.Tablica(new char[]{'F', 'P'}, 2271, false);
        tablice[46] = new Tretja.Tablica(new char[]{'N', 'Y'}, 5615, true);
        tablice[47] = new Tretja.Tablica(new char[]{'N', 'Y'}, 5363, false);
        tablice[48] = new Tretja.Tablica(new char[]{'L', 'S'}, 8229, true);
        tablice[49] = new Tretja.Tablica(new char[]{'F', 'G'}, 6257, false);

        for (Tretja.Tablica tablica: tablice) {
            System.out.println(tablica.toString());
        }
    }
}
