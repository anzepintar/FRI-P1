
import java.util.*;

public class Test06 {

    public static void main(String[] args) {
        Tretja.Tablica[] tablice = new Tretja.Tablica[50];
        tablice[0] = new Tretja.Tablica(new char[]{'U', 'Q'}, 3651, true);
        tablice[1] = new Tretja.Tablica(new char[]{'U', 'Q'}, 3651, false);
        tablice[2] = new Tretja.Tablica(new char[]{'U', 'Q'}, 3651, false);
        tablice[3] = new Tretja.Tablica(new char[]{'U', 'Q'}, 3651, false);
        tablice[4] = new Tretja.Tablica(new char[]{'U', 'Q'}, 3651, true);
        tablice[5] = new Tretja.Tablica(new char[]{'J', 'R'}, 3651, true);
        tablice[6] = new Tretja.Tablica(new char[]{'U', 'Q'}, 5914, false);
        tablice[7] = new Tretja.Tablica(new char[]{'Q', 'N'}, 3651, false);
        tablice[8] = new Tretja.Tablica(new char[]{'Z', 'T'}, 6621, false);
        tablice[9] = new Tretja.Tablica(new char[]{'U', 'Q'}, 6828, true);
        tablice[10] = tablice[6];
        tablice[11] = new Tretja.Tablica(new char[]{'U', 'Q'}, 3651, false);
        tablice[12] = new Tretja.Tablica(new char[]{'U', 'Q'}, 3651, true);
        tablice[13] = tablice[4];
        tablice[14] = new Tretja.Tablica(new char[]{'U', 'Q'}, 5914, false);
        tablice[15] = new Tretja.Tablica(new char[]{'D', 'E'}, 8919, true);
        tablice[16] = new Tretja.Tablica(new char[]{'U', 'Q'}, 3651, true);
        tablice[17] = tablice[13];
        tablice[18] = new Tretja.Tablica(new char[]{'Q', 'N'}, 4962, false);
        tablice[19] = new Tretja.Tablica(new char[]{'Z', 'E'}, 3651, false);
        tablice[20] = new Tretja.Tablica(new char[]{'U', 'Q'}, 7596, false);
        tablice[21] = new Tretja.Tablica(new char[]{'U', 'Q'}, 3651, false);
        tablice[22] = new Tretja.Tablica(new char[]{'U', 'Q'}, 7596, true);
        tablice[23] = new Tretja.Tablica(new char[]{'U', 'Q'}, 7596, true);
        tablice[24] = new Tretja.Tablica(new char[]{'U', 'Q'}, 2715, false);
        tablice[25] = tablice[16];
        tablice[26] = new Tretja.Tablica(new char[]{'Q', 'D'}, 5238, false);
        tablice[27] = new Tretja.Tablica(new char[]{'U', 'Q'}, 3651, false);
        tablice[28] = new Tretja.Tablica(new char[]{'Y', 'P'}, 3651, true);
        tablice[29] = new Tretja.Tablica(new char[]{'N', 'M'}, 5914, false);
        tablice[30] = new Tretja.Tablica(new char[]{'B', 'U'}, 7493, true);
        tablice[31] = new Tretja.Tablica(new char[]{'U', 'Q'}, 7596, false);
        tablice[32] = new Tretja.Tablica(new char[]{'Z', 'D'}, 2795, true);
        tablice[33] = new Tretja.Tablica(new char[]{'N', 'M'}, 5914, false);
        tablice[34] = tablice[19];
        tablice[35] = new Tretja.Tablica(new char[]{'Z', 'T'}, 9898, true);
        tablice[36] = new Tretja.Tablica(new char[]{'K', 'A'}, 4365, true);
        tablice[37] = new Tretja.Tablica(new char[]{'Y', 'P'}, 3651, false);
        tablice[38] = new Tretja.Tablica(new char[]{'S', 'W'}, 3217, false);
        tablice[39] = new Tretja.Tablica(new char[]{'U', 'Q'}, 2715, false);
        tablice[40] = new Tretja.Tablica(new char[]{'U', 'Q'}, 7482, false);
        tablice[41] = new Tretja.Tablica(new char[]{'S', 'Y'}, 3651, false);
        tablice[42] = new Tretja.Tablica(new char[]{'E', 'S'}, 8126, true);
        tablice[43] = tablice[40];
        tablice[44] = tablice[40];
        tablice[45] = tablice[10];
        tablice[46] = new Tretja.Tablica(new char[]{'U', 'Q'}, 7482, true);
        tablice[47] = tablice[16];
        tablice[48] = new Tretja.Tablica(new char[]{'U', 'Q'}, 4459, false);
        tablice[49] = tablice[35];

        for (Tretja.Tablica tablica: tablice) {
            System.out.println(tablica.toString());
        }
    }
}
