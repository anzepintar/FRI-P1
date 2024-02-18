
import java.util.*;

public class Test35 {

    public static void main(String[] args) {
        Tretja.Tablica[] tablice = new Tretja.Tablica[50];
        tablice[0] = new Tretja.Tablica(new char[]{'A', 'E'}, 9274, false);
        tablice[1] = new Tretja.Tablica(new char[]{'A', 'E'}, 9274, false);
        tablice[2] = new Tretja.Tablica(new char[]{'A', 'E'}, 9274, true);
        tablice[3] = new Tretja.Tablica(new char[]{'A', 'E'}, 9274, false);
        tablice[4] = new Tretja.Tablica(new char[]{'A', 'E'}, 9274, true);
        tablice[5] = new Tretja.Tablica(new char[]{'A', 'E'}, 9274, false);
        tablice[6] = new Tretja.Tablica(new char[]{'H', 'W'}, 9274, true);
        tablice[7] = new Tretja.Tablica(new char[]{'A', 'E'}, 2867, true);
        tablice[8] = new Tretja.Tablica(new char[]{'J', 'H'}, 9274, true);
        tablice[9] = tablice[5];
        tablice[10] = new Tretja.Tablica(new char[]{'A', 'E'}, 5116, false);
        tablice[11] = new Tretja.Tablica(new char[]{'A', 'E'}, 9274, true);
        tablice[12] = new Tretja.Tablica(new char[]{'A', 'E'}, 9274, true);
        tablice[13] = new Tretja.Tablica(new char[]{'A', 'E'}, 9274, true);
        tablice[14] = new Tretja.Tablica(new char[]{'A', 'E'}, 9274, true);
        tablice[15] = tablice[14];
        tablice[16] = new Tretja.Tablica(new char[]{'A', 'E'}, 5438, false);
        tablice[17] = new Tretja.Tablica(new char[]{'A', 'E'}, 9274, false);
        tablice[18] = new Tretja.Tablica(new char[]{'A', 'E'}, 9274, true);
        tablice[19] = new Tretja.Tablica(new char[]{'K', 'T'}, 5274, false);
        tablice[20] = new Tretja.Tablica(new char[]{'M', 'E'}, 5116, true);
        tablice[21] = new Tretja.Tablica(new char[]{'P', 'K'}, 9274, true);
        tablice[22] = new Tretja.Tablica(new char[]{'A', 'E'}, 9274, false);
        tablice[23] = new Tretja.Tablica(new char[]{'I', 'F'}, 7141, false);
        tablice[24] = new Tretja.Tablica(new char[]{'A', 'E'}, 9274, false);
        tablice[25] = new Tretja.Tablica(new char[]{'A', 'T'}, 5116, false);
        tablice[26] = new Tretja.Tablica(new char[]{'A', 'E'}, 9274, true);
        tablice[27] = tablice[3];
        tablice[28] = new Tretja.Tablica(new char[]{'A', 'E'}, 9274, true);
        tablice[29] = new Tretja.Tablica(new char[]{'A', 'E'}, 2867, false);
        tablice[30] = new Tretja.Tablica(new char[]{'A', 'E'}, 9274, false);
        tablice[31] = new Tretja.Tablica(new char[]{'A', 'E'}, 9274, false);
        tablice[32] = new Tretja.Tablica(new char[]{'A', 'E'}, 9274, false);
        tablice[33] = new Tretja.Tablica(new char[]{'A', 'E'}, 9633, true);
        tablice[34] = new Tretja.Tablica(new char[]{'A', 'E'}, 9274, false);
        tablice[35] = new Tretja.Tablica(new char[]{'L', 'N'}, 2867, false);
        tablice[36] = new Tretja.Tablica(new char[]{'A', 'E'}, 2867, false);
        tablice[37] = new Tretja.Tablica(new char[]{'A', 'E'}, 9274, false);
        tablice[38] = new Tretja.Tablica(new char[]{'U', 'X'}, 7442, true);
        tablice[39] = new Tretja.Tablica(new char[]{'M', 'S'}, 9131, false);
        tablice[40] = new Tretja.Tablica(new char[]{'W', 'D'}, 5438, true);
        tablice[41] = new Tretja.Tablica(new char[]{'Z', 'W'}, 9274, false);
        tablice[42] = new Tretja.Tablica(new char[]{'A', 'E'}, 9274, true);
        tablice[43] = tablice[33];
        tablice[44] = new Tretja.Tablica(new char[]{'A', 'E'}, 9274, true);
        tablice[45] = new Tretja.Tablica(new char[]{'A', 'E'}, 9274, false);
        tablice[46] = new Tretja.Tablica(new char[]{'C', 'W'}, 9274, false);
        tablice[47] = new Tretja.Tablica(new char[]{'G', 'J'}, 2661, false);
        tablice[48] = new Tretja.Tablica(new char[]{'F', 'V'}, 8829, true);
        tablice[49] = new Tretja.Tablica(new char[]{'P', 'F'}, 8855, false);

        for (Tretja.Tablica t1: tablice) {
            for (Tretja.Tablica t2: tablice) {
                System.out.print(t1.hashCode() == t2.hashCode() ? '+' : '-');
            }
            System.out.println();
        }
    }
}
