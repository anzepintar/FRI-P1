
import java.util.*;

public class Test37 {

    public static void main(String[] args) {
        Tretja.Tablica[] tablice = new Tretja.Tablica[50];
        tablice[0] = new Tretja.Tablica(new char[]{'I', 'M'}, 8217, false);
        tablice[1] = new Tretja.Tablica(new char[]{'I', 'M'}, 8217, true);
        tablice[2] = new Tretja.Tablica(new char[]{'K', 'R'}, 1128, true);
        tablice[3] = new Tretja.Tablica(new char[]{'K', 'R'}, 1128, true);
        tablice[4] = new Tretja.Tablica(new char[]{'K', 'R'}, 1128, true);
        tablice[5] = new Tretja.Tablica(new char[]{'K', 'R'}, 1128, false);
        tablice[6] = new Tretja.Tablica(new char[]{'I', 'Q'}, 7725, true);
        tablice[7] = tablice[1];
        tablice[8] = tablice[3];
        tablice[9] = new Tretja.Tablica(new char[]{'I', 'M'}, 2625, false);
        tablice[10] = new Tretja.Tablica(new char[]{'K', 'R'}, 9666, false);
        tablice[11] = new Tretja.Tablica(new char[]{'I', 'Q'}, 3453, false);
        tablice[12] = new Tretja.Tablica(new char[]{'I', 'M'}, 8217, false);
        tablice[13] = new Tretja.Tablica(new char[]{'J', 'E'}, 1128, false);
        tablice[14] = new Tretja.Tablica(new char[]{'I', 'Q'}, 4397, false);
        tablice[15] = new Tretja.Tablica(new char[]{'P', 'O'}, 7725, true);
        tablice[16] = new Tretja.Tablica(new char[]{'I', 'Q'}, 5294, false);
        tablice[17] = new Tretja.Tablica(new char[]{'I', 'Q'}, 4397, true);
        tablice[18] = new Tretja.Tablica(new char[]{'I', 'Q'}, 5294, false);
        tablice[19] = new Tretja.Tablica(new char[]{'I', 'M'}, 8217, true);
        tablice[20] = new Tretja.Tablica(new char[]{'P', 'O'}, 9418, false);
        tablice[21] = new Tretja.Tablica(new char[]{'I', 'Q'}, 7725, false);
        tablice[22] = new Tretja.Tablica(new char[]{'X', 'Y'}, 7725, true);
        tablice[23] = new Tretja.Tablica(new char[]{'K', 'R'}, 1128, false);
        tablice[24] = new Tretja.Tablica(new char[]{'I', 'M'}, 2625, false);
        tablice[25] = new Tretja.Tablica(new char[]{'J', 'E'}, 7366, false);
        tablice[26] = tablice[11];
        tablice[27] = new Tretja.Tablica(new char[]{'Q', 'L'}, 7725, false);
        tablice[28] = new Tretja.Tablica(new char[]{'M', 'X'}, 7366, true);
        tablice[29] = new Tretja.Tablica(new char[]{'K', 'R'}, 1128, true);
        tablice[30] = new Tretja.Tablica(new char[]{'P', 'O'}, 1341, true);
        tablice[31] = new Tretja.Tablica(new char[]{'I', 'Q'}, 5966, true);
        tablice[32] = new Tretja.Tablica(new char[]{'I', 'M'}, 8217, true);
        tablice[33] = new Tretja.Tablica(new char[]{'J', 'E'}, 8431, false);
        tablice[34] = new Tretja.Tablica(new char[]{'J', 'E'}, 1128, true);
        tablice[35] = new Tretja.Tablica(new char[]{'J', 'E'}, 7366, false);
        tablice[36] = new Tretja.Tablica(new char[]{'S', 'H'}, 1671, false);
        tablice[37] = new Tretja.Tablica(new char[]{'J', 'E'}, 7366, false);
        tablice[38] = new Tretja.Tablica(new char[]{'E', 'C'}, 3453, false);
        tablice[39] = new Tretja.Tablica(new char[]{'I', 'Q'}, 5364, false);
        tablice[40] = new Tretja.Tablica(new char[]{'P', 'O'}, 6168, true);
        tablice[41] = new Tretja.Tablica(new char[]{'G', 'L'}, 3442, false);
        tablice[42] = new Tretja.Tablica(new char[]{'K', 'R'}, 1128, true);
        tablice[43] = new Tretja.Tablica(new char[]{'Q', 'A'}, 5364, true);
        tablice[44] = new Tretja.Tablica(new char[]{'J', 'E'}, 9952, false);
        tablice[45] = new Tretja.Tablica(new char[]{'E', 'C'}, 3453, true);
        tablice[46] = new Tretja.Tablica(new char[]{'K', 'R'}, 1128, true);
        tablice[47] = new Tretja.Tablica(new char[]{'I', 'M'}, 7323, false);
        tablice[48] = new Tretja.Tablica(new char[]{'X', 'V'}, 8217, false);
        tablice[49] = new Tretja.Tablica(new char[]{'K', 'R'}, 1128, true);

        for (Tretja.Tablica t1: tablice) {
            for (Tretja.Tablica t2: tablice) {
                System.out.print(t1.hashCode() == t2.hashCode() ? '+' : '-');
            }
            System.out.println();
        }
    }
}
