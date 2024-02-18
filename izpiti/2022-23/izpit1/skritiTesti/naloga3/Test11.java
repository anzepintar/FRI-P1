
import java.util.*;

public class Test11 {

    public static void main(String[] args) {
        Tretja.Tablica[] tablice = new Tretja.Tablica[50];
        tablice[0] = new Tretja.Tablica(new char[]{'Z', 'E'}, 9375, true);
        tablice[1] = new Tretja.Tablica(new char[]{'Z', 'E'}, 9375, true);
        tablice[2] = new Tretja.Tablica(new char[]{'Z', 'E'}, 9375, false);
        tablice[3] = new Tretja.Tablica(new char[]{'I', 'E'}, 4235, false);
        tablice[4] = new Tretja.Tablica(new char[]{'D', 'Z'}, 9584, false);
        tablice[5] = new Tretja.Tablica(new char[]{'E', 'B'}, 5774, false);
        tablice[6] = new Tretja.Tablica(new char[]{'P', 'A'}, 5774, true);
        tablice[7] = new Tretja.Tablica(new char[]{'D', 'Z'}, 9584, true);
        tablice[8] = new Tretja.Tablica(new char[]{'E', 'B'}, 8642, true);
        tablice[9] = new Tretja.Tablica(new char[]{'E', 'B'}, 8642, false);
        tablice[10] = new Tretja.Tablica(new char[]{'E', 'B'}, 8239, false);
        tablice[11] = new Tretja.Tablica(new char[]{'L', 'G'}, 5774, false);
        tablice[12] = new Tretja.Tablica(new char[]{'I', 'E'}, 4796, true);
        tablice[13] = tablice[5];
        tablice[14] = new Tretja.Tablica(new char[]{'C', 'I'}, 4379, false);
        tablice[15] = tablice[13];
        tablice[16] = new Tretja.Tablica(new char[]{'C', 'P'}, 5774, false);
        tablice[17] = new Tretja.Tablica(new char[]{'E', 'B'}, 8642, true);
        tablice[18] = tablice[17];
        tablice[19] = new Tretja.Tablica(new char[]{'E', 'B'}, 5774, true);
        tablice[20] = tablice[16];
        tablice[21] = new Tretja.Tablica(new char[]{'I', 'H'}, 2739, true);
        tablice[22] = new Tretja.Tablica(new char[]{'E', 'B'}, 6499, false);
        tablice[23] = new Tretja.Tablica(new char[]{'C', 'P'}, 5774, false);
        tablice[24] = new Tretja.Tablica(new char[]{'E', 'C'}, 5774, false);
        tablice[25] = new Tretja.Tablica(new char[]{'C', 'P'}, 5774, false);
        tablice[26] = new Tretja.Tablica(new char[]{'C', 'O'}, 5774, false);
        tablice[27] = new Tretja.Tablica(new char[]{'Z', 'E'}, 6131, false);
        tablice[28] = new Tretja.Tablica(new char[]{'E', 'B'}, 8642, false);
        tablice[29] = new Tretja.Tablica(new char[]{'E', 'H'}, 3679, false);
        tablice[30] = tablice[25];
        tablice[31] = new Tretja.Tablica(new char[]{'E', 'B'}, 4733, true);
        tablice[32] = new Tretja.Tablica(new char[]{'E', 'B'}, 8642, true);
        tablice[33] = tablice[11];
        tablice[34] = new Tretja.Tablica(new char[]{'H', 'U'}, 5774, false);
        tablice[35] = new Tretja.Tablica(new char[]{'C', 'I'}, 4379, true);
        tablice[36] = new Tretja.Tablica(new char[]{'L', 'G'}, 9894, false);
        tablice[37] = new Tretja.Tablica(new char[]{'H', 'U'}, 5774, true);
        tablice[38] = new Tretja.Tablica(new char[]{'C', 'I'}, 4379, true);
        tablice[39] = new Tretja.Tablica(new char[]{'L', 'G'}, 1114, true);
        tablice[40] = new Tretja.Tablica(new char[]{'Q', 'N'}, 7254, false);
        tablice[41] = new Tretja.Tablica(new char[]{'G', 'M'}, 2388, false);
        tablice[42] = new Tretja.Tablica(new char[]{'E', 'B'}, 5774, false);
        tablice[43] = new Tretja.Tablica(new char[]{'E', 'B'}, 5774, true);
        tablice[44] = tablice[2];
        tablice[45] = new Tretja.Tablica(new char[]{'L', 'G'}, 2214, true);
        tablice[46] = new Tretja.Tablica(new char[]{'R', 'Y'}, 5774, false);
        tablice[47] = new Tretja.Tablica(new char[]{'E', 'B'}, 8642, true);
        tablice[48] = new Tretja.Tablica(new char[]{'C', 'P'}, 5774, false);
        tablice[49] = new Tretja.Tablica(new char[]{'Q', 'G'}, 8642, true);

        for (Tretja.Tablica tablica: tablice) {
            System.out.println(tablica.toString());
        }
    }
}
