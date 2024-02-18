
import java.util.*;

public class Test39 {

    public static void main(String[] args) {
        Tretja.Tablica[] tablice = new Tretja.Tablica[50];
        tablice[0] = new Tretja.Tablica(new char[]{'P', 'K'}, 1532, true);
        tablice[1] = new Tretja.Tablica(new char[]{'P', 'K'}, 3756, false);
        tablice[2] = new Tretja.Tablica(new char[]{'P', 'K'}, 1512, true);
        tablice[3] = new Tretja.Tablica(new char[]{'P', 'K'}, 3756, true);
        tablice[4] = new Tretja.Tablica(new char[]{'P', 'K'}, 3756, true);
        tablice[5] = new Tretja.Tablica(new char[]{'Q', 'W'}, 3756, false);
        tablice[6] = new Tretja.Tablica(new char[]{'P', 'K'}, 3756, false);
        tablice[7] = new Tretja.Tablica(new char[]{'B', 'N'}, 1532, false);
        tablice[8] = tablice[3];
        tablice[9] = new Tretja.Tablica(new char[]{'X', 'T'}, 3756, false);
        tablice[10] = new Tretja.Tablica(new char[]{'Z', 'H'}, 3756, false);
        tablice[11] = new Tretja.Tablica(new char[]{'P', 'K'}, 8132, false);
        tablice[12] = tablice[6];
        tablice[13] = tablice[11];
        tablice[14] = tablice[6];
        tablice[15] = tablice[4];
        tablice[16] = new Tretja.Tablica(new char[]{'X', 'T'}, 3756, true);
        tablice[17] = new Tretja.Tablica(new char[]{'M', 'V'}, 1512, true);
        tablice[18] = new Tretja.Tablica(new char[]{'P', 'K'}, 1512, false);
        tablice[19] = new Tretja.Tablica(new char[]{'Q', 'W'}, 3756, false);
        tablice[20] = new Tretja.Tablica(new char[]{'T', 'S'}, 3756, true);
        tablice[21] = new Tretja.Tablica(new char[]{'P', 'K'}, 3529, true);
        tablice[22] = new Tretja.Tablica(new char[]{'K', 'N'}, 1625, false);
        tablice[23] = new Tretja.Tablica(new char[]{'R', 'O'}, 3756, false);
        tablice[24] = new Tretja.Tablica(new char[]{'F', 'W'}, 9489, false);
        tablice[25] = new Tretja.Tablica(new char[]{'Y', 'S'}, 5559, true);
        tablice[26] = new Tretja.Tablica(new char[]{'L', 'U'}, 3529, false);
        tablice[27] = tablice[10];
        tablice[28] = new Tretja.Tablica(new char[]{'L', 'U'}, 3529, false);
        tablice[29] = new Tretja.Tablica(new char[]{'P', 'K'}, 3756, true);
        tablice[30] = new Tretja.Tablica(new char[]{'I', 'P'}, 3756, false);
        tablice[31] = new Tretja.Tablica(new char[]{'P', 'K'}, 6779, true);
        tablice[32] = new Tretja.Tablica(new char[]{'Y', 'S'}, 8119, false);
        tablice[33] = tablice[13];
        tablice[34] = new Tretja.Tablica(new char[]{'H', 'L'}, 5559, true);
        tablice[35] = new Tretja.Tablica(new char[]{'Z', 'H'}, 3756, true);
        tablice[36] = new Tretja.Tablica(new char[]{'L', 'U'}, 2614, false);
        tablice[37] = new Tretja.Tablica(new char[]{'M', 'O'}, 5559, true);
        tablice[38] = tablice[23];
        tablice[39] = tablice[14];
        tablice[40] = tablice[12];
        tablice[41] = new Tretja.Tablica(new char[]{'X', 'X'}, 5419, false);
        tablice[42] = new Tretja.Tablica(new char[]{'X', 'P'}, 1339, false);
        tablice[43] = tablice[5];
        tablice[44] = new Tretja.Tablica(new char[]{'U', 'N'}, 4797, true);
        tablice[45] = new Tretja.Tablica(new char[]{'Q', 'W'}, 3756, true);
        tablice[46] = tablice[5];
        tablice[47] = new Tretja.Tablica(new char[]{'A', 'K'}, 3756, true);
        tablice[48] = new Tretja.Tablica(new char[]{'H', 'P'}, 3756, false);
        tablice[49] = new Tretja.Tablica(new char[]{'P', 'K'}, 1532, true);

        for (Tretja.Tablica t1: tablice) {
            for (Tretja.Tablica t2: tablice) {
                System.out.print(t1.hashCode() == t2.hashCode() ? '+' : '-');
            }
            System.out.println();
        }
    }
}
