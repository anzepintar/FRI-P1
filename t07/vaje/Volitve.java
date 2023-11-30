public class Volitve {

    public static int steviloGlasov(int[][][] t, int leto, int stranka) {
        int sum = 0;
        for (int i = 0; i < t[leto][stranka].length; i++) {
            sum += t[leto][stranka][i];
        }
        return sum;
    }

    public static int[][] glasovi(int[][][] t) {
        int leta = t.length;
        int stranke = t[0].length;
        int[][] tab = new int[leta][stranke];
        for (int i = 0; i < leta; i++) {
            for (int j = 0; j < stranke; j++) {
                tab[i][j] = steviloGlasov(t, i, j);
            }
        }
        return tab;
    }

    public static int najVolisce(int[][][] t, int stranka) {
        int najVolisce = 0;
        int sumNajVolisce = t[0][stranka][0];
        for (int i = 0; i < t[0][stranka].length; i++) {
            int sumVolisce = 0;
            for (int j = 0; j < t.length; j++) {
                sumVolisce += t[j][stranka][i];
            }
            if (sumVolisce > sumNajVolisce) {
                sumNajVolisce = sumVolisce;
                najVolisce = i;
            }
        }
        return najVolisce;
    }

    public static int vsotaUvrstitev(int[][][] t, int stranka, int volisce) {
        int vsotaUvrstitev = 0;
        for (int i = 0; i < t.length; i++) {
            int mesto = 1;
            for (int j = 0; j < t[0].length; j++) {
                if (t[i][j][volisce] > t[i][stranka][volisce]) {
                    mesto++;
                }
            }
            vsotaUvrstitev += mesto;
        }
        return vsotaUvrstitev;
    }

}
