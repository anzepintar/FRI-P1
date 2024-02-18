
import java.util.*;

public class Test02 {

    public static void main(String[] args) {
        Tretja.Tablica[] tablice = new Tretja.Tablica[50];
        tablice[0] = new Tretja.Tablica(new char[]{'O', 'Y'}, 2897, false);
        tablice[1] = new Tretja.Tablica(new char[]{'N', 'D'}, 5316, true);
        tablice[2] = new Tretja.Tablica(new char[]{'N', 'D'}, 3485, false);
        tablice[3] = new Tretja.Tablica(new char[]{'P', 'W'}, 1112, false);
        tablice[4] = new Tretja.Tablica(new char[]{'U', 'P'}, 9189, false);
        tablice[5] = new Tretja.Tablica(new char[]{'N', 'D'}, 4114, true);
        tablice[6] = new Tretja.Tablica(new char[]{'N', 'D'}, 4114, false);
        tablice[7] = new Tretja.Tablica(new char[]{'Q', 'T'}, 9189, true);
        tablice[8] = tablice[5];
        tablice[9] = new Tretja.Tablica(new char[]{'R', 'K'}, 4114, false);
        tablice[10] = new Tretja.Tablica(new char[]{'N', 'D'}, 5316, true);
        tablice[11] = new Tretja.Tablica(new char[]{'G', 'O'}, 1115, true);
        tablice[12] = new Tretja.Tablica(new char[]{'U', 'P'}, 9189, true);
        tablice[13] = new Tretja.Tablica(new char[]{'U', 'P'}, 9189, false);
        tablice[14] = new Tretja.Tablica(new char[]{'G', 'O'}, 1115, true);
        tablice[15] = new Tretja.Tablica(new char[]{'D', 'W'}, 7285, false);
        tablice[16] = new Tretja.Tablica(new char[]{'U', 'P'}, 6365, true);
        tablice[17] = new Tretja.Tablica(new char[]{'Q', 'T'}, 9189, true);
        tablice[18] = new Tretja.Tablica(new char[]{'U', 'P'}, 9189, false);
        tablice[19] = new Tretja.Tablica(new char[]{'U', 'P'}, 9212, true);
        tablice[20] = new Tretja.Tablica(new char[]{'Q', 'T'}, 9189, true);
        tablice[21] = new Tretja.Tablica(new char[]{'N', 'T'}, 2182, false);
        tablice[22] = new Tretja.Tablica(new char[]{'U', 'P'}, 2237, false);
        tablice[23] = new Tretja.Tablica(new char[]{'X', 'E'}, 8153, false);
        tablice[24] = new Tretja.Tablica(new char[]{'Q', 'T'}, 9189, true);
        tablice[25] = new Tretja.Tablica(new char[]{'C', 'V'}, 4114, false);
        tablice[26] = new Tretja.Tablica(new char[]{'U', 'P'}, 8161, true);
        tablice[27] = new Tretja.Tablica(new char[]{'N', 'D'}, 6885, false);
        tablice[28] = new Tretja.Tablica(new char[]{'V', 'V'}, 7794, false);
        tablice[29] = new Tretja.Tablica(new char[]{'Q', 'T'}, 9189, true);
        tablice[30] = tablice[1];
        tablice[31] = new Tretja.Tablica(new char[]{'U', 'P'}, 8553, false);
        tablice[32] = new Tretja.Tablica(new char[]{'U', 'P'}, 6365, false);
        tablice[33] = new Tretja.Tablica(new char[]{'P', 'Q'}, 3857, true);
        tablice[34] = new Tretja.Tablica(new char[]{'U', 'P'}, 9189, false);
        tablice[35] = tablice[20];
        tablice[36] = tablice[1];
        tablice[37] = new Tretja.Tablica(new char[]{'C', 'P'}, 6365, false);
        tablice[38] = tablice[17];
        tablice[39] = new Tretja.Tablica(new char[]{'U', 'P'}, 9189, false);
        tablice[40] = new Tretja.Tablica(new char[]{'P', 'W'}, 1112, false);
        tablice[41] = new Tretja.Tablica(new char[]{'N', 'D'}, 4114, true);
        tablice[42] = new Tretja.Tablica(new char[]{'Q', 'T'}, 5826, true);
        tablice[43] = tablice[1];
        tablice[44] = new Tretja.Tablica(new char[]{'L', 'E'}, 3485, true);
        tablice[45] = new Tretja.Tablica(new char[]{'U', 'P'}, 9189, true);
        tablice[46] = new Tretja.Tablica(new char[]{'I', 'E'}, 4114, true);
        tablice[47] = tablice[18];
        tablice[48] = new Tretja.Tablica(new char[]{'N', 'T'}, 4143, true);
        tablice[49] = tablice[5];

        for (Tretja.Tablica tablica: tablice) {
            System.out.println(tablica.toString());
        }
    }
}
