public class Knjiznica {
    private int[] zaloga;
    private int[][] seznamClanov;
    private int[] zgodovinaIzposoj;

    public Knjiznica(int stClanov, int stNaslovov, int stIzvodovNaNaslov) {
        this.zaloga = new int[stNaslovov];
        for (int i = 0; i < this.zaloga.length; i++) {
            this.zaloga[i] = stIzvodovNaNaslov;
        }
        this.seznamClanov = new int[stClanov][stNaslovov];
        this.zgodovinaIzposoj = new int[stNaslovov];
    }

    public boolean posodi(int clan, int naslov) {
        if (this.zaloga[naslov] > 0 && this.seznamClanov[clan][naslov] == 0) {
            this.seznamClanov[clan][naslov]++;
            zaloga[naslov]--;
            zgodovinaIzposoj[naslov]++;
            return true;
        }
        return false;
    }

    public void clanVrne(int clan) {
        for (int i = 0; i < zaloga.length; i++) {
            zaloga[i] += seznamClanov[clan][i];
            seznamClanov[clan][i] = 0;
        }
    }

    public int posojeni(int naslov) {
        int sum = 0;
        for (int i = 0; i < seznamClanov.length; i++) {
            sum += seznamClanov[i][naslov];
        }
        return sum;
    }

    public int priClanu(int clan) {
        int sum = 0;
        for (int i = 0; i < seznamClanov[clan].length; i++) {
            sum += seznamClanov[clan][i];
        }
        return sum;
    }

    public int najNaslov() {
        int max = 0;
        for (int i = 0; i < zgodovinaIzposoj.length; i++) {
            if (zgodovinaIzposoj[i] > zgodovinaIzposoj[max])
                max = i;
        }
        return max;
    }
}
