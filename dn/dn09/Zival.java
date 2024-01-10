public class Zival {
    private static int steviloHranjenj;
    private static int[] steviloPreganjanj = new int[9];

    public int getIndeks() {
        return 0;
    }

    public void seHrani() {
        steviloHranjenj++;
    }

    public int steviloHranjenj() {
        return steviloHranjenj;
    }

    public void preganja(Zival druga) {
        steviloPreganjanj[druga.getIndeks()]++;
    }

    public int steviloPreganjanj(Zival druga) {
        return steviloPreganjanj[druga.getIndeks()];
    }

}
