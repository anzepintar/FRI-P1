
import java.util.*;

public class Test48 {

    public static void main(String[] args) {
        Tretja.Tablica[] tablice = new Tretja.Tablica[50];
        tablice[0] = new Tretja.Tablica(new char[]{'X', 'Q'}, 6978, false);
        tablice[1] = new Tretja.Tablica(new char[]{'M', 'Z'}, 6978, true);
        tablice[2] = new Tretja.Tablica(new char[]{'X', 'Q'}, 6978, false);
        tablice[3] = new Tretja.Tablica(new char[]{'X', 'Q'}, 6978, true);
        tablice[4] = tablice[1];
        tablice[5] = new Tretja.Tablica(new char[]{'V', 'J'}, 1181, true);
        tablice[6] = new Tretja.Tablica(new char[]{'O', 'V'}, 6895, false);
        tablice[7] = new Tretja.Tablica(new char[]{'C', 'E'}, 4314, true);
        tablice[8] = tablice[5];
        tablice[9] = new Tretja.Tablica(new char[]{'C', 'E'}, 9867, true);
        tablice[10] = new Tretja.Tablica(new char[]{'V', 'J'}, 1181, true);
        tablice[11] = new Tretja.Tablica(new char[]{'V', 'J'}, 1181, true);
        tablice[12] = new Tretja.Tablica(new char[]{'V', 'J'}, 1181, false);
        tablice[13] = new Tretja.Tablica(new char[]{'H', 'T'}, 1181, true);
        tablice[14] = new Tretja.Tablica(new char[]{'I', 'H'}, 5511, false);
        tablice[15] = new Tretja.Tablica(new char[]{'V', 'J'}, 6682, false);
        tablice[16] = new Tretja.Tablica(new char[]{'C', 'L'}, 1181, false);
        tablice[17] = tablice[7];
        tablice[18] = new Tretja.Tablica(new char[]{'M', 'Z'}, 6978, true);
        tablice[19] = new Tretja.Tablica(new char[]{'C', 'L'}, 7285, true);
        tablice[20] = new Tretja.Tablica(new char[]{'P', 'U'}, 1181, true);
        tablice[21] = new Tretja.Tablica(new char[]{'C', 'E'}, 4314, false);
        tablice[22] = new Tretja.Tablica(new char[]{'M', 'Z'}, 6978, false);
        tablice[23] = new Tretja.Tablica(new char[]{'H', 'T'}, 9871, true);
        tablice[24] = tablice[10];
        tablice[25] = new Tretja.Tablica(new char[]{'V', 'J'}, 1181, true);
        tablice[26] = new Tretja.Tablica(new char[]{'I', 'H'}, 5511, false);
        tablice[27] = new Tretja.Tablica(new char[]{'C', 'M'}, 6895, true);
        tablice[28] = new Tretja.Tablica(new char[]{'H', 'T'}, 1181, true);
        tablice[29] = new Tretja.Tablica(new char[]{'G', 'Z'}, 6978, false);
        tablice[30] = tablice[15];
        tablice[31] = new Tretja.Tablica(new char[]{'V', 'J'}, 1181, false);
        tablice[32] = new Tretja.Tablica(new char[]{'H', 'T'}, 1181, false);
        tablice[33] = new Tretja.Tablica(new char[]{'I', 'H'}, 5511, true);
        tablice[34] = new Tretja.Tablica(new char[]{'H', 'Q'}, 1181, true);
        tablice[35] = new Tretja.Tablica(new char[]{'M', 'Z'}, 6978, true);
        tablice[36] = new Tretja.Tablica(new char[]{'H', 'Q'}, 1654, true);
        tablice[37] = new Tretja.Tablica(new char[]{'X', 'Q'}, 6978, true);
        tablice[38] = tablice[21];
        tablice[39] = new Tretja.Tablica(new char[]{'H', 'T'}, 1181, true);
        tablice[40] = new Tretja.Tablica(new char[]{'X', 'Q'}, 6978, false);
        tablice[41] = new Tretja.Tablica(new char[]{'N', 'E'}, 9871, true);
        tablice[42] = new Tretja.Tablica(new char[]{'C', 'E'}, 4314, true);
        tablice[43] = new Tretja.Tablica(new char[]{'H', 'T'}, 1181, true);
        tablice[44] = new Tretja.Tablica(new char[]{'V', 'J'}, 6523, true);
        tablice[45] = new Tretja.Tablica(new char[]{'V', 'J'}, 1229, true);
        tablice[46] = new Tretja.Tablica(new char[]{'H', 'D'}, 1181, false);
        tablice[47] = tablice[46];
        tablice[48] = new Tretja.Tablica(new char[]{'B', 'Q'}, 1548, false);
        tablice[49] = new Tretja.Tablica(new char[]{'V', 'J'}, 1882, false);

        for (Tretja.Tablica t1: tablice) {
            for (Tretja.Tablica t2: tablice) {
                System.out.print(t1.hashCode() == t2.hashCode() ? '+' : '-');
            }
            System.out.println();
        }
    }
}
