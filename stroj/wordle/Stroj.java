
import java.util.*;

//
// Vmesnik, ki ga mora implementirati vsak stroj, ki bo sodeloval na
// tekmovanju.
//

public interface Stroj {

    //
    // Ogrodje pokliče to metodo samo enkrat (ob inicializaciji stroja).
    // Parameter <besede> je množica besed, ki tvorijo slovar.
    //
    public abstract void inicializiraj(Set<String> besede);

    //
    // Ogrodje pokliče to metodo vsakokrat, ko je stroj na vrsti za ugibanje
    // besede. V vsaki igri (torej vsakokrat, ko ogrodje izbere eno od besed v
    // slovarju) je parameter <odziv> v prvem klicu metode enak <null>, v vseh
    // nadaljnjih klicih pa je ta parameter seznam znakov iz množice {'+',
    // 'o', '-'}, ki podaja odziv na predhodni strojev poskus.  Ko stroj
    // besedo ugane, je parameter <odziv> seznam /n/ znakov '+'.
    //
    // Če je <odziv> seznam /n/ znakov '+', mora metoda vrniti vrednost
    // <null>, sicer pa mora vrniti besedo, sestavljeno iz /n/ malih črk
    // slovenske abecede brez šumnikov.  Ni nujno, da beseda pripada
    // slovarju.
    //
    public abstract String poteza(List<Character> odziv);
}
