
/*
 * Samodejno testiranje:
 * tj.exe
 *
 * Javni testni primeri:
 * 01..03: kli"cejo samo metodo /vecji/
 * 04..06: kli"cejo samo metodo /vecjiPrim/
 * 07..10: kli"cejo samo metodo /primerjalnik/
 *
 * Skriti testni primeri:
 * 01..16: kli"cejo samo metodo /vecji/
 * 17..33: kli"cejo samo metodo /vecjiPrim/
 * 34..50: kli"cejo samo metodo /primerjalnik/
 *
 * V testnih primerih, ki kli"cejo metodo /primerjalnik/, za vsak par kazalcev
 * a in b velja (a.equals(b) ==> a == b).  Z drugimi besedami: nikoli ne
 * izdelamo dveh enakih objektov, npr. Cas a = new Cas(10, 35) in 
 * Cas b = new Cas(10, 35).
 */


import java.util.*;

public class Cetrta {

    public static Set<Integer> vecji(Map<Integer, Integer> slovar) {
        // popravite / dopolnite ...
        return null;
    }

    public static <T> Set<T> vecjiPrim(Map<T, T> slovar, Comparator<T> prim) {
        // popravite / dopolnite ...
        return null;
    }

    public static <T> Comparator<T> primerjalnik(Map<T, T> slovar, Set<T> mnozica) {
        // popravite / dopolnite ...
        return null;
    }

    // pomo"zne metode, notranji razredi (po potrebi) ...

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi) ...
    }
}
