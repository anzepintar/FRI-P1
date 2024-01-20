import java.util.*;

public class Tekm_63230247 implements Stroj {
    // izhodiščna množica besed
    // (nastavi se ob inicializaciji, potem pa se ne spreminja)
    private Set<String> slovar;

    // Množica besed brez že uganjenih
    private Set<String> trenutneBesede;
    // nazadnje izbrana beseda
    private String nazadnjePreverjena;

    // Nastavi izhodiščno množico besed.
    @Override
    public void inicializiraj(Set<String> besede) {
        this.slovar = new TreeSet<>(besede);
    }

    //
    // Na podlagi podanega odziva na prejšnjo izbiro vrne naslednjo izbiro.
    //
    // odziv[i]: odziv ('+', 'o' ali '-') na i-to črko prejšnje izbire;
    // null, ko ogrodje zahteva prvo izbiro.
    //
    @Override
    public String poteza(List<Character> odziv) {

        if (odziv == null) {
            this.trenutneBesede = new TreeSet<>(this.slovar);
            // poriea je idealna prva beseda, če se slovar ne bi zmanjševal
            this.nazadnjePreverjena = najboljMozenNiz(this.trenutneBesede);
            System.out.println(this.nazadnjePreverjena);
            return this.nazadnjePreverjena;
        } else {
            if (vseEnako(odziv, '+')) {
                this.slovar.remove(nazadnjePreverjena);
                return null;
            }
            // Iz množice odstranimo vse besede, ki niso združljive z odzivom
            // na zadnjo izbiro.
            // odstrai vse nezdruzljive besede
            Set<String> odstrani = new TreeSet<>();
            for (String beseda : this.trenutneBesede) {
                if (!jeZdruzljiva(beseda, this.nazadnjePreverjena, odziv)) {
                    odstrani.add(beseda);
                }
            }
            this.trenutneBesede.removeAll(odstrani);
        }
        this.nazadnjePreverjena = najboljsaBeseda(this.trenutneBesede);
        return this.nazadnjePreverjena;
    }

    //
    // Vrne true natanko v primeru, če so vsi elementi podanega seznama enaki
    // podanemu elementu.
    //
    private static <T> boolean vseEnako(List<T> seznam, T element) {
        return seznam.stream().allMatch(e -> e.equals(element));
    }

    //
    // Vrne true natanko v primeru, če je beseda <beseda> združljiva s
    // podanim odzivom na podano izbiro.
    //
    private static boolean jeZdruzljiva(String beseda, String izbira, List<Character> odziv) {
        int n = odziv.size();

        // Izdelamo seznam znakov besed <beseda> in <izbira>
        // (nizi so nespremenljivi, seznami pa niso).
        // (npr. "znanka" -> ['z', 'n', 'a', 'n', 'k', 'a'].
        List<Character> crkeBesede = new ArrayList<>();
        List<Character> crkeIzbire = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            crkeBesede.add(beseda.charAt(i));
            crkeIzbire.add(izbira.charAt(i));
        }

        // Preverimo, ali za vse i-je, pri katerih je odziv[i] == '+',
        // velja beseda[i] == izbira[i].
        for (int i = 0; i < n; i++) {
            if (odziv.get(i) == '+') {
                if (crkeBesede.get(i) != crkeIzbire.get(i)) {
                    return false;
                }

                // Označimo, da smo ta položaj že pregledali
                // (to je pomembno za pravilno obravnavo odzivov 'o').
                crkeBesede.set(i, '#');
                crkeIzbire.set(i, '_');
            }
        }

        // Preverimo, ali za vse i-je, pri katerih je odziv[i] == 'o',
        // velja, da <beseda> vsebuje črko izbira[i], a ne na indeksu <i>.
        // Vsako tako črko beseda <izbira> je treba povezati z eno samo črko
        // besede <beseda>.

        for (int ixIzbira = 0; ixIzbira < n; ixIzbira++) {

            if (odziv.get(ixIzbira) == 'o') {
                char crka = crkeIzbire.get(ixIzbira);
                int ixBeseda = crkeBesede.indexOf(crka);
                if (ixBeseda < 0 || crkeBesede.get(ixIzbira) == crka) {
                    return false;
                }

                // Označimo, da smo pripadajoča položaja že pregledali.
                crkeBesede.set(ixBeseda, '#');
                crkeIzbire.set(ixIzbira, '_');
            }
        }

        // Preverimo, ali za vse i-je, pri katerih je odziv[i] == '-',
        // velja, da <beseda> ne vsebuje črke izbira[i].
        for (int i = 0; i < n; i++) {
            if (odziv.get(i) == '-' && crkeBesede.indexOf(crkeIzbire.get(i)) >= 0) {
                return false;
            }
        }

        return true;
    }

    // na podlagi https://www.youtube.com/watch?v=v68zYyaEmEA
    // dodaj da so v "besede" tudi kompatibilne neprave besede - "aeious"
    private static String najboljsaBeseda(Set<String> besede) {
        String najboljsaBeseda = new String();
        double maxEntropy = Double.MIN_VALUE;

        for (String beseda : besede) {
            double entropy = calculateEntropy(beseda);
            if (entropy > maxEntropy) {
                maxEntropy = entropy;
                najboljsaBeseda = beseda;
            }
        }
        return najboljsaBeseda;
    }

    private static double calculateEntropy(String beseda) {
        Map<Character, Integer> frekvencaCrke = new HashMap<>();
        for (char c : beseda.toCharArray()) {
            frekvencaCrke.put(c, frekvencaCrke.getOrDefault(c, 0) + 1);
        }

        double entropy = 0.0;
        for (int frequency : frekvencaCrke.values()) {
            double verjetnost = (double) frequency / beseda.length();
            entropy -= verjetnost * (Math.log(verjetnost) / Math.log(2));
        }
        return entropy;
    }

    // najbolj možen niz izmed vseh znakov - 1. je parien - kljub temu, da je prvi
    // parien
    private static String najboljMozenNiz(Set<String> besede) {
        String abeceda = "abcdefghijklmnoprstuvz";
        // napolni pozicija, črka : frekvenca - eno število
        int[][] seznam = new int[6][22];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 22; j++) {
                for (String beseda : besede) {
                    if (beseda.length() > i && beseda.charAt(i) == abeceda.charAt(j))
                        seznam[i][j]++;
                }
            }
        }
        // izbere najboljšo in drugo najboljšo frekvenco
        char[] najbolje = new char[6];
        char[] drugaNajbolje = new char[6];
        for (int i = 0; i < 6; i++) {
            int maxFrekvenca = 0;
            int drugaMaxFrekvenca = 0;
            for (int j = 0; j < 22; j++) {
                if (seznam[i][j] > maxFrekvenca) {
                    drugaMaxFrekvenca = maxFrekvenca;
                    maxFrekvenca = seznam[i][j];
                    drugaNajbolje[i] = najbolje[i];
                    najbolje[i] = abeceda.charAt(j);
                } else if (seznam[i][j] > drugaMaxFrekvenca) {
                    drugaMaxFrekvenca = seznam[i][j];
                    drugaNajbolje[i] = abeceda.charAt(j);
                }
            }
        }
        for (int i = 0; i < najbolje.length; i++) {
            for (int j = i + 1; j < najbolje.length; j++) {
                if (najbolje[i] == najbolje[j]) {
                    najbolje[j] = drugaNajbolje[j];
                }
            }
        }

        return new String(najbolje);
    }
}
