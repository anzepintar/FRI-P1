public class Medved extends Sesalec {
    private static int steviloHranjenj;
    private static int[] steviloPreganjanj = new int[9];

    @Override
    public int getIndeks() {
        return 6;
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
        Sesalec sesalec = new Sesalec();
        sesalec.preganja(druga);
        steviloPreganjanj[druga.getIndeks()]++;
    }

    @Override
    public int steviloPreganjanj(Zival druga) {
        return steviloPreganjanj[druga.getIndeks()];
    }

}
