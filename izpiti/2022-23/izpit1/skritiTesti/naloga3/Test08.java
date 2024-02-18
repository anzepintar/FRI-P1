
import java.util.*;

public class Test08 {

    public static void main(String[] args) {
        Tretja.Tablica[] tablice = new Tretja.Tablica[50];
        tablice[0] = new Tretja.Tablica(new char[]{'F', 'O'}, 9678, false);
        tablice[1] = new Tretja.Tablica(new char[]{'B', 'J'}, 9678, true);
        tablice[2] = new Tretja.Tablica(new char[]{'F', 'O'}, 9678, false);
        tablice[3] = new Tretja.Tablica(new char[]{'F', 'O'}, 9678, false);
        tablice[4] = new Tretja.Tablica(new char[]{'B', 'J'}, 9678, false);
        tablice[5] = tablice[1];
        tablice[6] = new Tretja.Tablica(new char[]{'Z', 'N'}, 1753, false);
        tablice[7] = new Tretja.Tablica(new char[]{'O', 'X'}, 1753, true);
        tablice[8] = tablice[6];
        tablice[9] = new Tretja.Tablica(new char[]{'T', 'H'}, 9373, true);
        tablice[10] = tablice[6];
        tablice[11] = new Tretja.Tablica(new char[]{'Z', 'N'}, 4281, false);
        tablice[12] = new Tretja.Tablica(new char[]{'R', 'R'}, 9324, false);
        tablice[13] = new Tretja.Tablica(new char[]{'F', 'O'}, 7791, false);
        tablice[14] = tablice[5];
        tablice[15] = new Tretja.Tablica(new char[]{'O', 'X'}, 1753, true);
        tablice[16] = new Tretja.Tablica(new char[]{'H', 'A'}, 9611, false);
        tablice[17] = new Tretja.Tablica(new char[]{'B', 'J'}, 9678, true);
        tablice[18] = new Tretja.Tablica(new char[]{'F', 'O'}, 9678, false);
        tablice[19] = new Tretja.Tablica(new char[]{'F', 'O'}, 9678, true);
        tablice[20] = new Tretja.Tablica(new char[]{'B', 'J'}, 9678, false);
        tablice[21] = new Tretja.Tablica(new char[]{'O', 'X'}, 5915, false);
        tablice[22] = new Tretja.Tablica(new char[]{'T', 'P'}, 7635, false);
        tablice[23] = new Tretja.Tablica(new char[]{'L', 'B'}, 9678, false);
        tablice[24] = new Tretja.Tablica(new char[]{'L', 'U'}, 6569, false);
        tablice[25] = new Tretja.Tablica(new char[]{'F', 'O'}, 9678, false);
        tablice[26] = new Tretja.Tablica(new char[]{'E', 'Z'}, 4281, false);
        tablice[27] = new Tretja.Tablica(new char[]{'F', 'O'}, 9678, false);
        tablice[28] = new Tretja.Tablica(new char[]{'E', 'Z'}, 4281, false);
        tablice[29] = new Tretja.Tablica(new char[]{'E', 'Z'}, 4281, false);
        tablice[30] = new Tretja.Tablica(new char[]{'E', 'Z'}, 4281, true);
        tablice[31] = new Tretja.Tablica(new char[]{'F', 'O'}, 9678, true);
        tablice[32] = new Tretja.Tablica(new char[]{'H', 'A'}, 9611, true);
        tablice[33] = new Tretja.Tablica(new char[]{'I', 'J'}, 4616, false);
        tablice[34] = new Tretja.Tablica(new char[]{'P', 'X'}, 9678, false);
        tablice[35] = new Tretja.Tablica(new char[]{'T', 'H'}, 9373, true);
        tablice[36] = new Tretja.Tablica(new char[]{'F', 'O'}, 9693, false);
        tablice[37] = tablice[11];
        tablice[38] = new Tretja.Tablica(new char[]{'F', 'O'}, 5364, false);
        tablice[39] = tablice[15];
        tablice[40] = new Tretja.Tablica(new char[]{'O', 'R'}, 2795, false);
        tablice[41] = new Tretja.Tablica(new char[]{'Q', 'Y'}, 9542, true);
        tablice[42] = new Tretja.Tablica(new char[]{'B', 'B'}, 4281, false);
        tablice[43] = new Tretja.Tablica(new char[]{'O', 'X'}, 8684, true);
        tablice[44] = new Tretja.Tablica(new char[]{'Z', 'C'}, 9678, false);
        tablice[45] = new Tretja.Tablica(new char[]{'J', 'Q'}, 1969, true);
        tablice[46] = tablice[42];
        tablice[47] = new Tretja.Tablica(new char[]{'U', 'B'}, 2198, false);
        tablice[48] = new Tretja.Tablica(new char[]{'O', 'X'}, 1753, true);
        tablice[49] = new Tretja.Tablica(new char[]{'N', 'B'}, 1753, false);

        for (Tretja.Tablica tablica: tablice) {
            System.out.println(tablica.toString());
        }
    }
}
