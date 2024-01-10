public class Plazilec extends Zival {
    private static int steviloHranjenj;
    private static int[] steviloPreganjanj = new int[9];

    @Override
    public int getIndeks() {
        return 1;
    }

    @Override
    public void seHrani() {
        super.seHrani();
        steviloHranjenj++;
    }

    @Override
    public int steviloHranjenj() {
        return steviloHranjenj;
    }

    @Override
    public void preganja(Zival druga) {
        super.preganja(druga);
        steviloPreganjanj[druga.getIndeks()]++;
    }

    @Override
    public int steviloPreganjanj(Zival druga) {
        return steviloPreganjanj[druga.getIndeks()];
    }

}
