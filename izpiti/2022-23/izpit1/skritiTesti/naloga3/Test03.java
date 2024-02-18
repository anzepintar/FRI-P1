
import java.util.*;

public class Test03 {

    public static void main(String[] args) {
        Tretja.Tablica[] tablice = new Tretja.Tablica[50];
        tablice[0] = new Tretja.Tablica(new char[]{'Z', 'Y'}, 1499, false);
        tablice[1] = new Tretja.Tablica(new char[]{'U', 'W'}, 1499, false);
        tablice[2] = new Tretja.Tablica(new char[]{'U', 'W'}, 1499, true);
        tablice[3] = tablice[2];
        tablice[4] = new Tretja.Tablica(new char[]{'U', 'W'}, 1499, true);
        tablice[5] = tablice[4];
        tablice[6] = new Tretja.Tablica(new char[]{'U', 'W'}, 1499, true);
        tablice[7] = new Tretja.Tablica(new char[]{'U', 'W'}, 5665, true);
        tablice[8] = new Tretja.Tablica(new char[]{'U', 'W'}, 2691, false);
        tablice[9] = new Tretja.Tablica(new char[]{'U', 'W'}, 6252, false);
        tablice[10] = new Tretja.Tablica(new char[]{'U', 'W'}, 3176, false);
        tablice[11] = new Tretja.Tablica(new char[]{'U', 'W'}, 9831, false);
        tablice[12] = new Tretja.Tablica(new char[]{'U', 'W'}, 3176, false);
        tablice[13] = new Tretja.Tablica(new char[]{'U', 'W'}, 6252, true);
        tablice[14] = tablice[9];
        tablice[15] = tablice[11];
        tablice[16] = new Tretja.Tablica(new char[]{'U', 'W'}, 3176, true);
        tablice[17] = tablice[2];
        tablice[18] = tablice[16];
        tablice[19] = new Tretja.Tablica(new char[]{'U', 'W'}, 1499, true);
        tablice[20] = new Tretja.Tablica(new char[]{'U', 'W'}, 4713, false);
        tablice[21] = new Tretja.Tablica(new char[]{'U', 'W'}, 3176, true);
        tablice[22] = new Tretja.Tablica(new char[]{'M', 'E'}, 5171, true);
        tablice[23] = new Tretja.Tablica(new char[]{'I', 'R'}, 1126, false);
        tablice[24] = new Tretja.Tablica(new char[]{'D', 'P'}, 6789, false);
        tablice[25] = new Tretja.Tablica(new char[]{'U', 'W'}, 6252, false);
        tablice[26] = new Tretja.Tablica(new char[]{'U', 'W'}, 9541, true);
        tablice[27] = new Tretja.Tablica(new char[]{'U', 'W'}, 6127, false);
        tablice[28] = new Tretja.Tablica(new char[]{'I', 'R'}, 1126, true);
        tablice[29] = tablice[22];
        tablice[30] = tablice[10];
        tablice[31] = new Tretja.Tablica(new char[]{'U', 'W'}, 1499, true);
        tablice[32] = new Tretja.Tablica(new char[]{'S', 'D'}, 4713, true);
        tablice[33] = new Tretja.Tablica(new char[]{'S', 'D'}, 4713, false);
        tablice[34] = new Tretja.Tablica(new char[]{'U', 'W'}, 3176, true);
        tablice[35] = new Tretja.Tablica(new char[]{'S', 'D'}, 1499, true);
        tablice[36] = new Tretja.Tablica(new char[]{'B', 'M'}, 9541, true);
        tablice[37] = tablice[9];
        tablice[38] = new Tretja.Tablica(new char[]{'H', 'U'}, 1499, true);
        tablice[39] = new Tretja.Tablica(new char[]{'N', 'D'}, 1499, false);
        tablice[40] = tablice[10];
        tablice[41] = new Tretja.Tablica(new char[]{'M', 'E'}, 5171, false);
        tablice[42] = new Tretja.Tablica(new char[]{'U', 'W'}, 1341, false);
        tablice[43] = new Tretja.Tablica(new char[]{'S', 'D'}, 1499, false);
        tablice[44] = new Tretja.Tablica(new char[]{'Z', 'Y'}, 1499, true);
        tablice[45] = new Tretja.Tablica(new char[]{'A', 'D'}, 4711, true);
        tablice[46] = new Tretja.Tablica(new char[]{'U', 'W'}, 1341, true);
        tablice[47] = new Tretja.Tablica(new char[]{'Q', 'U'}, 5171, true);
        tablice[48] = new Tretja.Tablica(new char[]{'U', 'W'}, 1499, true);
        tablice[49] = new Tretja.Tablica(new char[]{'M', 'E'}, 5171, false);

        for (Tretja.Tablica tablica: tablice) {
            System.out.println(tablica.toString());
        }
    }
}
