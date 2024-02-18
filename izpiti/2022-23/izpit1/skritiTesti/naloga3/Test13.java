
import java.util.*;

public class Test13 {

    public static void main(String[] args) {
        Tretja.Tablica[] tablice = new Tretja.Tablica[50];
        tablice[0] = new Tretja.Tablica(new char[]{'W', 'A'}, 7621, false);
        tablice[1] = new Tretja.Tablica(new char[]{'W', 'A'}, 7621, false);
        tablice[2] = new Tretja.Tablica(new char[]{'W', 'A'}, 7621, false);
        tablice[3] = new Tretja.Tablica(new char[]{'D', 'B'}, 7621, true);
        tablice[4] = new Tretja.Tablica(new char[]{'W', 'A'}, 8486, false);
        tablice[5] = new Tretja.Tablica(new char[]{'W', 'A'}, 4578, true);
        tablice[6] = tablice[2];
        tablice[7] = new Tretja.Tablica(new char[]{'W', 'A'}, 7621, false);
        tablice[8] = new Tretja.Tablica(new char[]{'W', 'A'}, 7621, false);
        tablice[9] = tablice[5];
        tablice[10] = new Tretja.Tablica(new char[]{'W', 'A'}, 8253, false);
        tablice[11] = tablice[3];
        tablice[12] = new Tretja.Tablica(new char[]{'P', 'Z'}, 7621, false);
        tablice[13] = new Tretja.Tablica(new char[]{'D', 'B'}, 4939, true);
        tablice[14] = tablice[1];
        tablice[15] = new Tretja.Tablica(new char[]{'W', 'A'}, 7621, true);
        tablice[16] = new Tretja.Tablica(new char[]{'D', 'B'}, 7621, true);
        tablice[17] = tablice[8];
        tablice[18] = new Tretja.Tablica(new char[]{'W', 'A'}, 4578, false);
        tablice[19] = new Tretja.Tablica(new char[]{'U', 'L'}, 4939, false);
        tablice[20] = new Tretja.Tablica(new char[]{'W', 'A'}, 8253, false);
        tablice[21] = new Tretja.Tablica(new char[]{'U', 'L'}, 4939, true);
        tablice[22] = new Tretja.Tablica(new char[]{'W', 'A'}, 7621, false);
        tablice[23] = new Tretja.Tablica(new char[]{'L', 'G'}, 9475, true);
        tablice[24] = new Tretja.Tablica(new char[]{'T', 'I'}, 7621, false);
        tablice[25] = new Tretja.Tablica(new char[]{'W', 'A'}, 2595, true);
        tablice[26] = new Tretja.Tablica(new char[]{'D', 'B'}, 7285, false);
        tablice[27] = new Tretja.Tablica(new char[]{'Y', 'D'}, 6865, true);
        tablice[28] = new Tretja.Tablica(new char[]{'P', 'A'}, 4578, true);
        tablice[29] = new Tretja.Tablica(new char[]{'D', 'B'}, 4939, true);
        tablice[30] = new Tretja.Tablica(new char[]{'W', 'A'}, 4578, true);
        tablice[31] = new Tretja.Tablica(new char[]{'W', 'A'}, 7621, false);
        tablice[32] = new Tretja.Tablica(new char[]{'K', 'C'}, 7621, false);
        tablice[33] = new Tretja.Tablica(new char[]{'W', 'A'}, 6717, false);
        tablice[34] = new Tretja.Tablica(new char[]{'B', 'G'}, 3286, true);
        tablice[35] = new Tretja.Tablica(new char[]{'D', 'B'}, 8953, false);
        tablice[36] = new Tretja.Tablica(new char[]{'Q', 'I'}, 7621, true);
        tablice[37] = new Tretja.Tablica(new char[]{'D', 'B'}, 1514, true);
        tablice[38] = new Tretja.Tablica(new char[]{'Q', 'E'}, 7621, false);
        tablice[39] = new Tretja.Tablica(new char[]{'W', 'A'}, 6769, false);
        tablice[40] = new Tretja.Tablica(new char[]{'K', 'D'}, 6772, true);
        tablice[41] = new Tretja.Tablica(new char[]{'S', 'W'}, 9788, false);
        tablice[42] = new Tretja.Tablica(new char[]{'X', 'V'}, 4578, false);
        tablice[43] = new Tretja.Tablica(new char[]{'W', 'A'}, 7621, false);
        tablice[44] = new Tretja.Tablica(new char[]{'Q', 'E'}, 4771, true);
        tablice[45] = new Tretja.Tablica(new char[]{'Q', 'I'}, 4227, true);
        tablice[46] = tablice[12];
        tablice[47] = new Tretja.Tablica(new char[]{'A', 'G'}, 6829, false);
        tablice[48] = new Tretja.Tablica(new char[]{'A', 'T'}, 7621, false);
        tablice[49] = new Tretja.Tablica(new char[]{'Q', 'E'}, 2673, true);

        for (Tretja.Tablica tablica: tablice) {
            System.out.println(tablica.toString());
        }
    }
}
