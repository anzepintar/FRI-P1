
import java.util.*;

public class Test01 {

    public static void main(String[] args) {
        Tretja.Tablica[] tablice = new Tretja.Tablica[50];
        tablice[0] = new Tretja.Tablica(new char[]{'O', 'O'}, 9587, false);
        tablice[1] = new Tretja.Tablica(new char[]{'O', 'J'}, 2853, false);
        tablice[2] = new Tretja.Tablica(new char[]{'O', 'J'}, 9261, false);
        tablice[3] = new Tretja.Tablica(new char[]{'O', 'O'}, 9587, false);
        tablice[4] = new Tretja.Tablica(new char[]{'O', 'O'}, 8163, true);
        tablice[5] = new Tretja.Tablica(new char[]{'O', 'O'}, 9566, false);
        tablice[6] = new Tretja.Tablica(new char[]{'O', 'O'}, 2992, false);
        tablice[7] = tablice[5];
        tablice[8] = tablice[7];
        tablice[9] = new Tretja.Tablica(new char[]{'B', 'L'}, 9566, true);
        tablice[10] = new Tretja.Tablica(new char[]{'O', 'O'}, 9384, true);
        tablice[11] = tablice[9];
        tablice[12] = new Tretja.Tablica(new char[]{'O', 'O'}, 9587, false);
        tablice[13] = tablice[11];
        tablice[14] = new Tretja.Tablica(new char[]{'D', 'M'}, 9261, true);
        tablice[15] = new Tretja.Tablica(new char[]{'N', 'M'}, 8619, true);
        tablice[16] = new Tretja.Tablica(new char[]{'B', 'L'}, 4469, false);
        tablice[17] = tablice[10];
        tablice[18] = new Tretja.Tablica(new char[]{'C', 'Y'}, 8619, false);
        tablice[19] = new Tretja.Tablica(new char[]{'C', 'Y'}, 7898, true);
        tablice[20] = new Tretja.Tablica(new char[]{'D', 'M'}, 2743, true);
        tablice[21] = new Tretja.Tablica(new char[]{'O', 'O'}, 5582, false);
        tablice[22] = new Tretja.Tablica(new char[]{'O', 'O'}, 5582, false);
        tablice[23] = tablice[12];
        tablice[24] = new Tretja.Tablica(new char[]{'M', 'E'}, 8619, true);
        tablice[25] = tablice[18];
        tablice[26] = new Tretja.Tablica(new char[]{'M', 'E'}, 1497, true);
        tablice[27] = tablice[10];
        tablice[28] = tablice[21];
        tablice[29] = new Tretja.Tablica(new char[]{'E', 'N'}, 7954, true);
        tablice[30] = new Tretja.Tablica(new char[]{'B', 'L'}, 4363, true);
        tablice[31] = new Tretja.Tablica(new char[]{'B', 'L'}, 3632, true);
        tablice[32] = new Tretja.Tablica(new char[]{'O', 'O'}, 9384, false);
        tablice[33] = new Tretja.Tablica(new char[]{'D', 'M'}, 7252, true);
        tablice[34] = new Tretja.Tablica(new char[]{'V', 'K'}, 9587, false);
        tablice[35] = new Tretja.Tablica(new char[]{'C', 'Y'}, 2822, false);
        tablice[36] = new Tretja.Tablica(new char[]{'D', 'T'}, 2992, false);
        tablice[37] = new Tretja.Tablica(new char[]{'N', 'S'}, 9587, true);
        tablice[38] = new Tretja.Tablica(new char[]{'B', 'L'}, 4469, false);
        tablice[39] = new Tretja.Tablica(new char[]{'B', 'L'}, 3632, true);
        tablice[40] = new Tretja.Tablica(new char[]{'T', 'N'}, 3923, true);
        tablice[41] = new Tretja.Tablica(new char[]{'N', 'M'}, 8619, true);
        tablice[42] = new Tretja.Tablica(new char[]{'M', 'U'}, 9384, true);
        tablice[43] = new Tretja.Tablica(new char[]{'M', 'E'}, 8619, true);
        tablice[44] = new Tretja.Tablica(new char[]{'O', 'O'}, 9587, false);
        tablice[45] = tablice[4];
        tablice[46] = new Tretja.Tablica(new char[]{'N', 'J'}, 9566, true);
        tablice[47] = new Tretja.Tablica(new char[]{'D', 'M'}, 9261, true);
        tablice[48] = new Tretja.Tablica(new char[]{'O', 'O'}, 9566, true);
        tablice[49] = new Tretja.Tablica(new char[]{'O', 'O'}, 5582, true);

        for (Tretja.Tablica tablica: tablice) {
            System.out.println(tablica.toString());
        }
    }
}
