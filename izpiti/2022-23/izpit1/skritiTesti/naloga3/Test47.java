
import java.util.*;

public class Test47 {

    public static void main(String[] args) {
        Tretja.Tablica[] tablice = new Tretja.Tablica[50];
        tablice[0] = new Tretja.Tablica(new char[]{'M', 'Q'}, 6881, true);
        tablice[1] = new Tretja.Tablica(new char[]{'M', 'Q'}, 6881, false);
        tablice[2] = new Tretja.Tablica(new char[]{'I', 'A'}, 8897, true);
        tablice[3] = new Tretja.Tablica(new char[]{'M', 'Q'}, 6881, true);
        tablice[4] = new Tretja.Tablica(new char[]{'M', 'Q'}, 3999, false);
        tablice[5] = tablice[1];
        tablice[6] = new Tretja.Tablica(new char[]{'M', 'Q'}, 6881, false);
        tablice[7] = tablice[4];
        tablice[8] = new Tretja.Tablica(new char[]{'M', 'Q'}, 6881, false);
        tablice[9] = new Tretja.Tablica(new char[]{'M', 'Q'}, 6881, true);
        tablice[10] = new Tretja.Tablica(new char[]{'M', 'Q'}, 6881, true);
        tablice[11] = new Tretja.Tablica(new char[]{'Y', 'I'}, 6881, false);
        tablice[12] = new Tretja.Tablica(new char[]{'G', 'H'}, 8897, true);
        tablice[13] = tablice[5];
        tablice[14] = new Tretja.Tablica(new char[]{'H', 'E'}, 4467, false);
        tablice[15] = tablice[14];
        tablice[16] = new Tretja.Tablica(new char[]{'M', 'Q'}, 6881, false);
        tablice[17] = tablice[4];
        tablice[18] = new Tretja.Tablica(new char[]{'T', 'O'}, 4467, false);
        tablice[19] = new Tretja.Tablica(new char[]{'M', 'Q'}, 6881, false);
        tablice[20] = new Tretja.Tablica(new char[]{'U', 'F'}, 6881, false);
        tablice[21] = tablice[13];
        tablice[22] = new Tretja.Tablica(new char[]{'M', 'Q'}, 6881, false);
        tablice[23] = new Tretja.Tablica(new char[]{'I', 'T'}, 2926, true);
        tablice[24] = new Tretja.Tablica(new char[]{'M', 'Q'}, 6881, false);
        tablice[25] = new Tretja.Tablica(new char[]{'M', 'Q'}, 6881, true);
        tablice[26] = new Tretja.Tablica(new char[]{'H', 'E'}, 4467, true);
        tablice[27] = new Tretja.Tablica(new char[]{'G', 'T'}, 9659, true);
        tablice[28] = new Tretja.Tablica(new char[]{'M', 'Q'}, 6881, false);
        tablice[29] = new Tretja.Tablica(new char[]{'M', 'Q'}, 2676, false);
        tablice[30] = new Tretja.Tablica(new char[]{'P', 'D'}, 5968, false);
        tablice[31] = new Tretja.Tablica(new char[]{'H', 'E'}, 7661, false);
        tablice[32] = tablice[19];
        tablice[33] = new Tretja.Tablica(new char[]{'M', 'Q'}, 3999, true);
        tablice[34] = new Tretja.Tablica(new char[]{'E', 'K'}, 6881, false);
        tablice[35] = new Tretja.Tablica(new char[]{'M', 'Q'}, 6881, true);
        tablice[36] = new Tretja.Tablica(new char[]{'P', 'D'}, 3434, true);
        tablice[37] = new Tretja.Tablica(new char[]{'M', 'Q'}, 6881, false);
        tablice[38] = tablice[17];
        tablice[39] = new Tretja.Tablica(new char[]{'H', 'E'}, 4467, true);
        tablice[40] = new Tretja.Tablica(new char[]{'P', 'D'}, 5968, false);
        tablice[41] = new Tretja.Tablica(new char[]{'P', 'C'}, 4467, true);
        tablice[42] = new Tretja.Tablica(new char[]{'N', 'S'}, 1118, false);
        tablice[43] = new Tretja.Tablica(new char[]{'M', 'Q'}, 6881, true);
        tablice[44] = new Tretja.Tablica(new char[]{'H', 'E'}, 7661, false);
        tablice[45] = new Tretja.Tablica(new char[]{'M', 'Q'}, 2766, true);
        tablice[46] = new Tretja.Tablica(new char[]{'D', 'D'}, 2676, false);
        tablice[47] = tablice[5];
        tablice[48] = new Tretja.Tablica(new char[]{'S', 'T'}, 1995, true);
        tablice[49] = new Tretja.Tablica(new char[]{'M', 'Q'}, 6881, true);

        for (Tretja.Tablica t1: tablice) {
            for (Tretja.Tablica t2: tablice) {
                System.out.print(t1.hashCode() == t2.hashCode() ? '+' : '-');
            }
            System.out.println();
        }
    }
}
