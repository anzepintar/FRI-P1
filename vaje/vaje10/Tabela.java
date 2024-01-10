
public class Tabela extends Zaporedje {

    private int[] tabela;

    public Tabela(int[] tabela) {
        this.tabela = tabela;
    }

    @Override
    public Integer y(int x) {
        if (x < 0 || x >= this.tabela.length || this.tabela[x] < 0) {
            return null;
        }
        return this.tabela[x];
    }
}
