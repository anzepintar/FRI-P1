
import java.util.*;

public class Test30 {

    public static void main(String[] args) {
        Tretja.Tablica[] tablice = new Tretja.Tablica[50];
        tablice[0] = new Tretja.Tablica(new char[]{'Z', 'X'}, 9616, true);
        tablice[1] = new Tretja.Tablica(new char[]{'V', 'I'}, 9616, false);
        tablice[2] = new Tretja.Tablica(new char[]{'V', 'I'}, 9616, true);
        tablice[3] = new Tretja.Tablica(new char[]{'V', 'I'}, 9616, false);
        tablice[4] = new Tretja.Tablica(new char[]{'F', 'U'}, 3945, false);
        tablice[5] = new Tretja.Tablica(new char[]{'F', 'U'}, 6197, true);
        tablice[6] = new Tretja.Tablica(new char[]{'Z', 'K'}, 5679, false);
        tablice[7] = new Tretja.Tablica(new char[]{'Z', 'X'}, 9616, false);
        tablice[8] = new Tretja.Tablica(new char[]{'V', 'I'}, 9616, true);
        tablice[9] = new Tretja.Tablica(new char[]{'Z', 'X'}, 9616, true);
        tablice[10] = tablice[6];
        tablice[11] = new Tretja.Tablica(new char[]{'D', 'Y'}, 9616, true);
        tablice[12] = new Tretja.Tablica(new char[]{'M', 'I'}, 9616, false);
        tablice[13] = new Tretja.Tablica(new char[]{'Z', 'X'}, 9616, true);
        tablice[14] = new Tretja.Tablica(new char[]{'S', 'I'}, 5679, true);
        tablice[15] = new Tretja.Tablica(new char[]{'X', 'C'}, 4856, false);
        tablice[16] = tablice[14];
        tablice[17] = tablice[16];
        tablice[18] = new Tretja.Tablica(new char[]{'X', 'C'}, 4856, true);
        tablice[19] = tablice[7];
        tablice[20] = new Tretja.Tablica(new char[]{'Z', 'X'}, 7311, false);
        tablice[21] = new Tretja.Tablica(new char[]{'M', 'I'}, 2176, true);
        tablice[22] = new Tretja.Tablica(new char[]{'D', 'Y'}, 8741, false);
        tablice[23] = new Tretja.Tablica(new char[]{'W', 'B'}, 9616, false);
        tablice[24] = new Tretja.Tablica(new char[]{'M', 'I'}, 7875, false);
        tablice[25] = tablice[8];
        tablice[26] = new Tretja.Tablica(new char[]{'V', 'I'}, 5691, true);
        tablice[27] = new Tretja.Tablica(new char[]{'Q', 'E'}, 7875, false);
        tablice[28] = new Tretja.Tablica(new char[]{'K', 'X'}, 3945, false);
        tablice[29] = new Tretja.Tablica(new char[]{'S', 'I'}, 5679, true);
        tablice[30] = new Tretja.Tablica(new char[]{'V', 'I'}, 9616, true);
        tablice[31] = new Tretja.Tablica(new char[]{'Z', 'X'}, 9616, true);
        tablice[32] = new Tretja.Tablica(new char[]{'X', 'C'}, 4856, true);
        tablice[33] = new Tretja.Tablica(new char[]{'Z', 'X'}, 9616, false);
        tablice[34] = new Tretja.Tablica(new char[]{'X', 'C'}, 4856, true);
        tablice[35] = new Tretja.Tablica(new char[]{'V', 'I'}, 7575, true);
        tablice[36] = tablice[4];
        tablice[37] = new Tretja.Tablica(new char[]{'I', 'T'}, 9616, true);
        tablice[38] = new Tretja.Tablica(new char[]{'C', 'T'}, 5691, false);
        tablice[39] = tablice[16];
        tablice[40] = new Tretja.Tablica(new char[]{'V', 'I'}, 9616, false);
        tablice[41] = new Tretja.Tablica(new char[]{'Z', 'X'}, 9616, true);
        tablice[42] = tablice[32];
        tablice[43] = new Tretja.Tablica(new char[]{'Q', 'E'}, 7875, true);
        tablice[44] = new Tretja.Tablica(new char[]{'F', 'U'}, 3945, true);
        tablice[45] = new Tretja.Tablica(new char[]{'H', 'N'}, 4856, true);
        tablice[46] = new Tretja.Tablica(new char[]{'F', 'U'}, 3945, true);
        tablice[47] = new Tretja.Tablica(new char[]{'K', 'X'}, 3945, false);
        tablice[48] = new Tretja.Tablica(new char[]{'B', 'V'}, 8224, true);
        tablice[49] = new Tretja.Tablica(new char[]{'W', 'N'}, 7494, true);

        for (Tretja.Tablica t1: tablice) {
            for (Tretja.Tablica t2: tablice) {
                System.out.print(t1.equals(t2) ? '+' : '-');
            }
            System.out.println();
        }
    }
}
