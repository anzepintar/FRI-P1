
import java.util.*;

public class Test41 {

    public static void main(String[] args) {
        Tretja.Tablica[] tablice = new Tretja.Tablica[50];
        tablice[0] = new Tretja.Tablica(new char[]{'T', 'U'}, 2154, false);
        tablice[1] = new Tretja.Tablica(new char[]{'T', 'U'}, 4842, true);
        tablice[2] = new Tretja.Tablica(new char[]{'T', 'U'}, 4842, false);
        tablice[3] = tablice[2];
        tablice[4] = tablice[3];
        tablice[5] = new Tretja.Tablica(new char[]{'U', 'Q'}, 2154, true);
        tablice[6] = new Tretja.Tablica(new char[]{'T', 'U'}, 4842, false);
        tablice[7] = new Tretja.Tablica(new char[]{'T', 'U'}, 5823, false);
        tablice[8] = new Tretja.Tablica(new char[]{'W', 'K'}, 4842, true);
        tablice[9] = tablice[6];
        tablice[10] = tablice[1];
        tablice[11] = new Tretja.Tablica(new char[]{'I', 'C'}, 4842, false);
        tablice[12] = new Tretja.Tablica(new char[]{'T', 'U'}, 4842, true);
        tablice[13] = new Tretja.Tablica(new char[]{'T', 'U'}, 2745, true);
        tablice[14] = new Tretja.Tablica(new char[]{'J', 'B'}, 4842, true);
        tablice[15] = new Tretja.Tablica(new char[]{'T', 'U'}, 4842, true);
        tablice[16] = new Tretja.Tablica(new char[]{'T', 'U'}, 4842, false);
        tablice[17] = new Tretja.Tablica(new char[]{'C', 'L'}, 4842, true);
        tablice[18] = new Tretja.Tablica(new char[]{'T', 'U'}, 4842, true);
        tablice[19] = new Tretja.Tablica(new char[]{'C', 'U'}, 4842, true);
        tablice[20] = new Tretja.Tablica(new char[]{'T', 'U'}, 9862, true);
        tablice[21] = new Tretja.Tablica(new char[]{'T', 'T'}, 4192, false);
        tablice[22] = tablice[5];
        tablice[23] = new Tretja.Tablica(new char[]{'K', 'C'}, 9798, false);
        tablice[24] = new Tretja.Tablica(new char[]{'C', 'L'}, 4842, false);
        tablice[25] = tablice[22];
        tablice[26] = new Tretja.Tablica(new char[]{'U', 'Q'}, 5433, false);
        tablice[27] = new Tretja.Tablica(new char[]{'C', 'U'}, 4842, true);
        tablice[28] = new Tretja.Tablica(new char[]{'C', 'U'}, 2139, false);
        tablice[29] = new Tretja.Tablica(new char[]{'C', 'U'}, 8499, true);
        tablice[30] = new Tretja.Tablica(new char[]{'D', 'G'}, 8412, true);
        tablice[31] = new Tretja.Tablica(new char[]{'C', 'U'}, 7151, true);
        tablice[32] = new Tretja.Tablica(new char[]{'I', 'N'}, 4299, false);
        tablice[33] = tablice[5];
        tablice[34] = new Tretja.Tablica(new char[]{'U', 'L'}, 2154, false);
        tablice[35] = new Tretja.Tablica(new char[]{'V', 'D'}, 2421, false);
        tablice[36] = new Tretja.Tablica(new char[]{'U', 'W'}, 4842, false);
        tablice[37] = new Tretja.Tablica(new char[]{'Q', 'T'}, 6444, true);
        tablice[38] = new Tretja.Tablica(new char[]{'U', 'Q'}, 8692, false);
        tablice[39] = new Tretja.Tablica(new char[]{'U', 'Q'}, 2154, false);
        tablice[40] = new Tretja.Tablica(new char[]{'T', 'U'}, 1843, false);
        tablice[41] = new Tretja.Tablica(new char[]{'R', 'C'}, 1789, true);
        tablice[42] = new Tretja.Tablica(new char[]{'Z', 'P'}, 8499, false);
        tablice[43] = new Tretja.Tablica(new char[]{'U', 'L'}, 2154, false);
        tablice[44] = tablice[32];
        tablice[45] = new Tretja.Tablica(new char[]{'T', 'U'}, 6289, true);
        tablice[46] = new Tretja.Tablica(new char[]{'Z', 'F'}, 4538, true);
        tablice[47] = new Tretja.Tablica(new char[]{'T', 'U'}, 6791, true);
        tablice[48] = new Tretja.Tablica(new char[]{'H', 'N'}, 8232, false);
        tablice[49] = new Tretja.Tablica(new char[]{'I', 'N'}, 1843, false);

        for (Tretja.Tablica t1: tablice) {
            for (Tretja.Tablica t2: tablice) {
                System.out.print(t1.hashCode() == t2.hashCode() ? '+' : '-');
            }
            System.out.println();
        }
    }
}
