import java.util.Arrays;

public class Blok {
    public static final int MAX_ST_STANOVANJ = 1000;
    private Stanovanje s0;
    private Stanovanje[] vsaStanovanja;

    public Blok(Stanovanje stanovanje) {
        this.s0 = stanovanje;
        this.vsaStanovanja = null;
    }

    public Oseba starosta() {
        this.obisciVsaStanovanja();
        Oseba naj = null;
        for (Stanovanje stanovanje : this.vsaStanovanja) {
            Oseba starosta = stanovanje.starosta();
            if (starosta != null) {
                if (naj == null || starosta.jeStarejsaOd(naj)) {
                    naj = starosta;
                }
            }
        }
        return naj;
    }

    private void obisciVsaStanovanja() {
        if (this.vsaStanovanja != null) {
            return;
        }
        Stanovanje[] vsaStanovanjaTemp = new Stanovanje[MAX_ST_STANOVANJ];
        int stVseh = 0;
        Stanovanje[] neobdelana = new Stanovanje[MAX_ST_STANOVANJ];
        int stNeobdelanih = 0;
        neobdelana[stNeobdelanih++] = this.s0;
        this.s0.setObiskano(true);
        this.s0.nastaviKoordinati(0, 0);
        while (stNeobdelanih > 0) {
            Stanovanje trenutno = neobdelana[--stNeobdelanih];
            int[] koordinati = trenutno.vrniKoordinati();
            vsaStanovanjaTemp[stVseh++] = trenutno;
            int[] dVrstica = { 0, -1, 0, 1 };
            int[] dStolpec = { -1, 0, 1, 0 };
            int ixSoseda = 0;
            for (Stanovanje sosed : trenutno.getSosedi()) {
                if (sosed != null && !sosed.getObiskano()) {
                    sosed.setObiskano(true);
                    int vr = koordinati[0] + dVrstica[ixSoseda];
                    int st = koordinati[1] + dStolpec[ixSoseda];
                    sosed.nastaviKoordinati(vr, st);
                    neobdelana[stNeobdelanih++] = sosed;
                }
                ixSoseda++;
            }
        }
        this.vsaStanovanja = Arrays.copyOf(vsaStanovanjaTemp, stVseh);
    }

    public int[][] razporeditev() {
        this.obisciVsaStanovanja();
        int minVr = 0;
        int minSt = 0;
        int maxVr = 0;
        int maxSt = 0;
        if (this.vsaStanovanja != null) {
            for (Stanovanje stanovanje : this.vsaStanovanja) {
                int[] k = stanovanje.vrniKoordinati();
                minVr = Math.min(minVr, k[0]);
                maxVr = Math.max(maxVr, k[0]);
                minSt = Math.min(minSt, k[1]);
                maxSt = Math.max(maxSt, k[1]);
            }
            int stVrstic = maxVr - minVr + 1;
            int stStolpcev = maxSt - minSt + 1;
            int[][] razporeditev = new int[stVrstic][stStolpcev];
            for (int i = 0; i < stVrstic; i++) {
                for (int j = 0; j < stStolpcev; j++) {
                    razporeditev[i][j] = -1;
                }
            }
            for (Stanovanje stanovanje : this.vsaStanovanja) {
                int[] k = stanovanje.vrniKoordinati();
                razporeditev[k[0] - minVr][k[1] - minSt] = stanovanje.steviloStanovalcev();
            }
            return razporeditev;
        }
        return null;
    }

}
