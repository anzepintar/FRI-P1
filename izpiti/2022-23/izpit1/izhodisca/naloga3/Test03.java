
import java.util.*;

public class Test03 {

    public static void main(String[] args) {
        Tretja.Tablica[] tablice = new Tretja.Tablica[50];
        tablice[0] = new Tretja.Tablica(new char[]{'G', 'K'}, 4748, true);
        tablice[1] = new Tretja.Tablica(new char[]{'D', 'O'}, 3144, false);
        tablice[2] = new Tretja.Tablica(new char[]{'D', 'O'}, 3144, true);
        tablice[3] = tablice[2];
        tablice[4] = new Tretja.Tablica(new char[]{'D', 'O'}, 3144, true);
        tablice[5] = new Tretja.Tablica(new char[]{'D', 'O'}, 5499, false);
        tablice[6] = new Tretja.Tablica(new char[]{'D', 'O'}, 3144, false);
        tablice[7] = new Tretja.Tablica(new char[]{'D', 'O'}, 9944, false);
        tablice[8] = new Tretja.Tablica(new char[]{'G', 'K'}, 4748, true);
        tablice[9] = new Tretja.Tablica(new char[]{'C', 'R'}, 9647, false);
        tablice[10] = new Tretja.Tablica(new char[]{'G', 'K'}, 7926, false);
        tablice[11] = new Tretja.Tablica(new char[]{'N', 'Q'}, 6123, false);
        tablice[12] = new Tretja.Tablica(new char[]{'D', 'O'}, 3144, true);
        tablice[13] = new Tretja.Tablica(new char[]{'D', 'O'}, 9944, false);
        tablice[14] = new Tretja.Tablica(new char[]{'L', 'C'}, 9944, false);
        tablice[15] = new Tretja.Tablica(new char[]{'D', 'E'}, 7618, true);
        tablice[16] = new Tretja.Tablica(new char[]{'G', 'K'}, 4748, false);
        tablice[17] = new Tretja.Tablica(new char[]{'D', 'O'}, 3144, false);
        tablice[18] = new Tretja.Tablica(new char[]{'D', 'S'}, 9421, true);
        tablice[19] = tablice[2];
        tablice[20] = new Tretja.Tablica(new char[]{'V', 'Y'}, 9451, false);
        tablice[21] = new Tretja.Tablica(new char[]{'D', 'O'}, 4867, false);
        tablice[22] = new Tretja.Tablica(new char[]{'L', 'C'}, 9944, true);
        tablice[23] = new Tretja.Tablica(new char[]{'D', 'O'}, 9944, true);
        tablice[24] = new Tretja.Tablica(new char[]{'D', 'O'}, 9944, true);
        tablice[25] = new Tretja.Tablica(new char[]{'D', 'O'}, 3144, false);
        tablice[26] = new Tretja.Tablica(new char[]{'D', 'O'}, 3144, false);
        tablice[27] = new Tretja.Tablica(new char[]{'D', 'O'}, 9944, false);
        tablice[28] = new Tretja.Tablica(new char[]{'G', 'C'}, 9647, false);
        tablice[29] = new Tretja.Tablica(new char[]{'D', 'Y'}, 9144, true);
        tablice[30] = new Tretja.Tablica(new char[]{'A', 'M'}, 9249, true);
        tablice[31] = new Tretja.Tablica(new char[]{'L', 'C'}, 1847, true);
        tablice[32] = tablice[25];
        tablice[33] = new Tretja.Tablica(new char[]{'D', 'O'}, 9944, false);
        tablice[34] = new Tretja.Tablica(new char[]{'G', 'K'}, 4748, true);
        tablice[35] = new Tretja.Tablica(new char[]{'D', 'O'}, 3144, true);
        tablice[36] = tablice[22];
        tablice[37] = new Tretja.Tablica(new char[]{'T', 'V'}, 3144, false);
        tablice[38] = new Tretja.Tablica(new char[]{'O', 'A'}, 9144, true);
        tablice[39] = new Tretja.Tablica(new char[]{'T', 'R'}, 3532, true);
        tablice[40] = new Tretja.Tablica(new char[]{'D', 'O'}, 9944, true);
        tablice[41] = new Tretja.Tablica(new char[]{'Z', 'D'}, 5186, false);
        tablice[42] = new Tretja.Tablica(new char[]{'V', 'Y'}, 7671, true);
        tablice[43] = new Tretja.Tablica(new char[]{'Z', 'D'}, 3144, true);
        tablice[44] = new Tretja.Tablica(new char[]{'J', 'Z'}, 9518, true);
        tablice[45] = new Tretja.Tablica(new char[]{'L', 'Z'}, 7671, false);
        tablice[46] = new Tretja.Tablica(new char[]{'G', 'E'}, 1393, true);
        tablice[47] = tablice[35];
        tablice[48] = new Tretja.Tablica(new char[]{'D', 'O'}, 3144, false);
        tablice[49] = new Tretja.Tablica(new char[]{'D', 'O'}, 3144, false);

        for (Tretja.Tablica tablica: tablice) {
            System.out.println(tablica.toString());
        }
    }
}
