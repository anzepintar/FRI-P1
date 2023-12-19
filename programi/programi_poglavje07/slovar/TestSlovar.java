
/*
 * Testni razred za razred Slovar
 */

public class TestSlovar {

    public static void main(String[] args) {
        Slovar drzava2sosede = new Slovar();
        drzava2sosede.shrani("Slovenija", 4);
        drzava2sosede.shrani("Nemčija", 9);
        drzava2sosede.shrani("Malta", 0);
        drzava2sosede.shrani("Norveška", 3);
        drzava2sosede.shrani("Rusija", 14);

        int stSosed = (Integer) drzava2sosede.vrni("Nemčija");
        System.out.println(stSosed);
    }
}
