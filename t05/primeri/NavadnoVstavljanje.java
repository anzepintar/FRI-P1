import java.util.Arrays;

public class NavadnoVstavljanje {
    public static void main(String[] args) {
        int[] tabela = { 80, 50, 75, 30, 45, 60, 95, 20 };
        System.out.println(Arrays.toString(tabela));
        uredi(tabela);
        System.out.println(Arrays.toString(tabela));
    }

    public static void uredi(int[] t) {
        for (int i = 1; i < t.length; i++) {
            int trenutni = t[i];
            int j = i - 1;
            while (j >= 0 && t[j] > trenutni) {
                t[j + 1] = t[j];
                j--;

            }
            t[j + 1] = trenutni;
        }
    }
}
