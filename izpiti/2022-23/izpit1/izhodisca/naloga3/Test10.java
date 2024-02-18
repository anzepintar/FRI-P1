
import java.util.*;

public class Test10 {

    public static void main(String[] args) {
        Tretja.Tablica[] tablice = new Tretja.Tablica[50];
        tablice[0] = new Tretja.Tablica(new char[]{'I', 'O'}, 9444, false);
        tablice[1] = new Tretja.Tablica(new char[]{'W', 'N'}, 7131, true);
        tablice[2] = tablice[1];
        tablice[3] = new Tretja.Tablica(new char[]{'W', 'N'}, 5576, false);
        tablice[4] = tablice[3];
        tablice[5] = new Tretja.Tablica(new char[]{'S', 'S'}, 9444, false);
        tablice[6] = new Tretja.Tablica(new char[]{'S', 'S'}, 9939, true);
        tablice[7] = new Tretja.Tablica(new char[]{'I', 'O'}, 9444, false);
        tablice[8] = new Tretja.Tablica(new char[]{'S', 'S'}, 9939, true);
        tablice[9] = new Tretja.Tablica(new char[]{'S', 'S'}, 9939, false);
        tablice[10] = new Tretja.Tablica(new char[]{'S', 'S'}, 9939, false);
        tablice[11] = tablice[5];
        tablice[12] = new Tretja.Tablica(new char[]{'S', 'S'}, 9939, true);
        tablice[13] = new Tretja.Tablica(new char[]{'W', 'N'}, 5576, false);
        tablice[14] = tablice[8];
        tablice[15] = new Tretja.Tablica(new char[]{'I', 'O'}, 9444, true);
        tablice[16] = new Tretja.Tablica(new char[]{'L', 'B'}, 6268, true);
        tablice[17] = new Tretja.Tablica(new char[]{'I', 'O'}, 9444, false);
        tablice[18] = new Tretja.Tablica(new char[]{'S', 'S'}, 1252, true);
        tablice[19] = new Tretja.Tablica(new char[]{'I', 'O'}, 9444, false);
        tablice[20] = new Tretja.Tablica(new char[]{'P', 'K'}, 9939, false);
        tablice[21] = new Tretja.Tablica(new char[]{'W', 'N'}, 5576, false);
        tablice[22] = new Tretja.Tablica(new char[]{'R', 'D'}, 5576, true);
        tablice[23] = new Tretja.Tablica(new char[]{'L', 'B'}, 6268, true);
        tablice[24] = new Tretja.Tablica(new char[]{'S', 'S'}, 9939, true);
        tablice[25] = tablice[3];
        tablice[26] = tablice[10];
        tablice[27] = new Tretja.Tablica(new char[]{'R', 'H'}, 9373, true);
        tablice[28] = new Tretja.Tablica(new char[]{'S', 'S'}, 9939, false);
        tablice[29] = new Tretja.Tablica(new char[]{'A', 'L'}, 9939, true);
        tablice[30] = new Tretja.Tablica(new char[]{'W', 'N'}, 7131, true);
        tablice[31] = tablice[15];
        tablice[32] = new Tretja.Tablica(new char[]{'R', 'H'}, 9373, false);
        tablice[33] = new Tretja.Tablica(new char[]{'L', 'L'}, 9939, true);
        tablice[34] = tablice[30];
        tablice[35] = new Tretja.Tablica(new char[]{'P', 'L'}, 1135, true);
        tablice[36] = new Tretja.Tablica(new char[]{'S', 'S'}, 9939, false);
        tablice[37] = tablice[30];
        tablice[38] = new Tretja.Tablica(new char[]{'W', 'N'}, 5713, true);
        tablice[39] = new Tretja.Tablica(new char[]{'P', 'L'}, 3848, true);
        tablice[40] = new Tretja.Tablica(new char[]{'O', 'C'}, 9939, true);
        tablice[41] = new Tretja.Tablica(new char[]{'S', 'S'}, 1252, true);
        tablice[42] = new Tretja.Tablica(new char[]{'V', 'X'}, 9939, false);
        tablice[43] = new Tretja.Tablica(new char[]{'I', 'O'}, 9826, false);
        tablice[44] = new Tretja.Tablica(new char[]{'C', 'O'}, 6958, true);
        tablice[45] = new Tretja.Tablica(new char[]{'I', 'O'}, 9444, false);
        tablice[46] = new Tretja.Tablica(new char[]{'S', 'S'}, 9939, false);
        tablice[47] = new Tretja.Tablica(new char[]{'K', 'T'}, 9939, true);
        tablice[48] = new Tretja.Tablica(new char[]{'O', 'C'}, 8948, true);
        tablice[49] = new Tretja.Tablica(new char[]{'R', 'H'}, 1184, false);

        for (Tretja.Tablica t1: tablice) {
            for (Tretja.Tablica t2: tablice) {
                System.out.print(t1.hashCode() == t2.hashCode() ? '+' : '-');
            }
            System.out.println();
        }
    }
}
