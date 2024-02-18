
import java.util.*;

public class Test43 {

    public static void main(String[] args) {
        Tretja.Tablica[] tablice = new Tretja.Tablica[50];
        tablice[0] = new Tretja.Tablica(new char[]{'D', 'F'}, 4288, false);
        tablice[1] = new Tretja.Tablica(new char[]{'U', 'D'}, 8214, true);
        tablice[2] = new Tretja.Tablica(new char[]{'D', 'F'}, 3235, true);
        tablice[3] = new Tretja.Tablica(new char[]{'O', 'P'}, 8474, false);
        tablice[4] = new Tretja.Tablica(new char[]{'D', 'F'}, 5334, true);
        tablice[5] = new Tretja.Tablica(new char[]{'O', 'P'}, 8474, false);
        tablice[6] = new Tretja.Tablica(new char[]{'P', 'G'}, 5334, true);
        tablice[7] = new Tretja.Tablica(new char[]{'D', 'F'}, 4288, false);
        tablice[8] = new Tretja.Tablica(new char[]{'P', 'G'}, 5334, true);
        tablice[9] = new Tretja.Tablica(new char[]{'D', 'F'}, 4288, false);
        tablice[10] = new Tretja.Tablica(new char[]{'D', 'F'}, 3235, false);
        tablice[11] = tablice[9];
        tablice[12] = new Tretja.Tablica(new char[]{'D', 'F'}, 3235, true);
        tablice[13] = new Tretja.Tablica(new char[]{'G', 'I'}, 5334, true);
        tablice[14] = tablice[9];
        tablice[15] = new Tretja.Tablica(new char[]{'P', 'R'}, 9281, false);
        tablice[16] = new Tretja.Tablica(new char[]{'D', 'F'}, 4288, false);
        tablice[17] = new Tretja.Tablica(new char[]{'O', 'O'}, 9984, false);
        tablice[18] = new Tretja.Tablica(new char[]{'O', 'P'}, 9424, true);
        tablice[19] = tablice[9];
        tablice[20] = new Tretja.Tablica(new char[]{'D', 'F'}, 7841, false);
        tablice[21] = tablice[4];
        tablice[22] = new Tretja.Tablica(new char[]{'O', 'O'}, 9984, false);
        tablice[23] = new Tretja.Tablica(new char[]{'D', 'F'}, 4288, true);
        tablice[24] = new Tretja.Tablica(new char[]{'D', 'F'}, 4288, true);
        tablice[25] = tablice[2];
        tablice[26] = new Tretja.Tablica(new char[]{'G', 'I'}, 5334, false);
        tablice[27] = new Tretja.Tablica(new char[]{'V', 'Z'}, 3235, true);
        tablice[28] = new Tretja.Tablica(new char[]{'L', 'S'}, 4288, true);
        tablice[29] = new Tretja.Tablica(new char[]{'D', 'F'}, 4288, true);
        tablice[30] = new Tretja.Tablica(new char[]{'O', 'V'}, 9423, true);
        tablice[31] = new Tretja.Tablica(new char[]{'P', 'G'}, 5334, false);
        tablice[32] = tablice[19];
        tablice[33] = new Tretja.Tablica(new char[]{'I', 'S'}, 9315, false);
        tablice[34] = tablice[5];
        tablice[35] = tablice[18];
        tablice[36] = new Tretja.Tablica(new char[]{'L', 'T'}, 3235, true);
        tablice[37] = new Tretja.Tablica(new char[]{'A', 'Q'}, 6486, false);
        tablice[38] = new Tretja.Tablica(new char[]{'L', 'S'}, 4288, false);
        tablice[39] = new Tretja.Tablica(new char[]{'M', 'O'}, 5334, false);
        tablice[40] = new Tretja.Tablica(new char[]{'O', 'P'}, 8474, true);
        tablice[41] = new Tretja.Tablica(new char[]{'L', 'S'}, 4288, true);
        tablice[42] = new Tretja.Tablica(new char[]{'D', 'F'}, 7841, true);
        tablice[43] = new Tretja.Tablica(new char[]{'E', 'R'}, 8858, true);
        tablice[44] = tablice[22];
        tablice[45] = new Tretja.Tablica(new char[]{'O', 'P'}, 7385, true);
        tablice[46] = tablice[3];
        tablice[47] = new Tretja.Tablica(new char[]{'L', 'S'}, 4288, false);
        tablice[48] = tablice[31];
        tablice[49] = new Tretja.Tablica(new char[]{'N', 'R'}, 1824, true);

        for (Tretja.Tablica t1: tablice) {
            for (Tretja.Tablica t2: tablice) {
                System.out.print(t1.hashCode() == t2.hashCode() ? '+' : '-');
            }
            System.out.println();
        }
    }
}
