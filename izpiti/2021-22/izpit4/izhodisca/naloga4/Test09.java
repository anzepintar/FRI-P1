
import java.util.*;

public class Test09 {

    public static void main(String[] args) {
        String[] objekti = {
            "GCbmuek", "bwMM73s",
            "ibjlAQGyptEmYzKKz", "eDoizmPfd1UF5I",
            "bSf3XVtCdCfIrvHbk6o", "W88AvwBAfIOF3WsZ3E",
            "3r", "vb5tWVC2fUVZlk",
            "py2qUKS", "Q4oK7z2UHDtMdaB",
            "2OmRVuEk5T", "1xrj5V",
            "UR", "0FphWu",
            "IDaI4F9Y", "9UTDTejtioEhr38",
            "pnnz5Kl9V9Jxo", "9RakM3OqN2wzH0RJfLWn",
            "yVjWRY3rzC", "x1vxFeF9Gtdx",
            "5vJKJO0V", "N4BBaGAAE",
            "jliQN5ZaSQ9x", "sUnwnOlj2Lfu4kTeS4E",
            "JwVokxmryAoZZ", "Iuqw53SFw2",
            "QOVagdEv9CKhd1fgBzOt", "NASKd97pjcbFR4q10w0",
            "OZCAWV", "S4HyHLVwQLl",
            "SrpXJtb2", "e",
            "bEFHoJ9uEu5tXP", "MHpBU",
            "ebz", "KNuDJXrSjhWeL",
            "NPf3FmiwChT", "Gsxv",
            "ZgliRZ2YYY9mMrjOwWQo", "dhXSt31",
            "xt8OJi5D97Gi0mORz2", "lvscqlBr",
            "j9ZE7zDH4T17M", "eksq61vR",
            "qkHBOjKb6Ok", "GFf3246HXvVI",
            "0CxNJEu1FVufS", "hPWYanBkUO64uJUo8",
            "aOjzTgT", "R7EpbFKHOhw",
            "Zjria1HAtQdKv0M4Vc0", "aDKmhFZi7794tl05yEsZ",
            "Cm", "UVFC8z39XIWgv",
            "yp8wSF", "G",
            "L", "lclImOMTHNqORD2dQ8D",
            "dNDOnqkN8z", "uybuNe",
        };

        Map<String, String> slovar = new HashMap<>();
        Set<String> mnozica = new HashSet<>();

        slovar.put(objekti[0], objekti[1]);
        slovar.put(objekti[2], objekti[3]);
        slovar.put(objekti[4], objekti[5]);
        mnozica.add(objekti[4]);
        slovar.put(objekti[6], objekti[7]);
        mnozica.add(objekti[6]);
        slovar.put(objekti[8], objekti[9]);
        mnozica.add(objekti[8]);
        slovar.put(objekti[10], objekti[11]);
        mnozica.add(objekti[10]);
        slovar.put(objekti[12], objekti[13]);
        mnozica.add(objekti[12]);
        slovar.put(objekti[14], objekti[15]);
        mnozica.add(objekti[14]);
        slovar.put(objekti[16], objekti[17]);
        slovar.put(objekti[18], objekti[19]);
        slovar.put(objekti[20], objekti[21]);
        mnozica.add(objekti[20]);
        slovar.put(objekti[22], objekti[23]);
        mnozica.add(objekti[22]);
        slovar.put(objekti[24], objekti[25]);
        slovar.put(objekti[26], objekti[27]);
        mnozica.add(objekti[26]);
        slovar.put(objekti[28], objekti[29]);
        mnozica.add(objekti[28]);
        slovar.put(objekti[30], objekti[31]);
        mnozica.add(objekti[30]);
        slovar.put(objekti[32], objekti[33]);
        mnozica.add(objekti[32]);
        slovar.put(objekti[34], objekti[35]);
        slovar.put(objekti[36], objekti[37]);
        slovar.put(objekti[38], objekti[39]);
        mnozica.add(objekti[38]);
        slovar.put(objekti[40], objekti[41]);
        slovar.put(objekti[42], objekti[43]);
        slovar.put(objekti[44], objekti[45]);
        slovar.put(objekti[46], objekti[47]);
        mnozica.add(objekti[46]);
        slovar.put(objekti[48], objekti[49]);
        mnozica.add(objekti[48]);
        slovar.put(objekti[50], objekti[51]);
        mnozica.add(objekti[50]);
        slovar.put(objekti[52], objekti[53]);
        mnozica.add(objekti[52]);
        slovar.put(objekti[54], objekti[55]);
        slovar.put(objekti[56], objekti[57]);
        mnozica.add(objekti[56]);
        slovar.put(objekti[58], objekti[59]);
        mnozica.add(objekti[58]);

        Comparator<String> prim = Cetrta.primerjalnik(slovar, mnozica);

        System.out.println(prim.compare(objekti[14], objekti[15]) > 0);
        System.out.println(prim.compare(objekti[8], objekti[40]) > 0);
        System.out.println(prim.compare(objekti[14], objekti[1]) > 0);
        System.out.println(prim.compare(objekti[57], objekti[41]) > 0);
        System.out.println(prim.compare(objekti[28], objekti[29]) > 0);
        System.out.println(prim.compare(objekti[42], objekti[47]) > 0);
        System.out.println(prim.compare(objekti[53], objekti[31]) > 0);
        System.out.println(prim.compare(objekti[28], objekti[29]) > 0);
        System.out.println(prim.compare(objekti[10], objekti[11]) > 0);
        System.out.println(prim.compare(objekti[33], objekti[19]) > 0);
        System.out.println(prim.compare(objekti[26], objekti[27]) > 0);
        System.out.println(prim.compare(objekti[4], objekti[9]) > 0);
        System.out.println(prim.compare(objekti[2], objekti[3]) > 0);
        System.out.println(prim.compare(objekti[36], objekti[20]) > 0);
        System.out.println(prim.compare(objekti[34], objekti[35]) > 0);
        System.out.println(prim.compare(objekti[53], objekti[57]) > 0);
        System.out.println(prim.compare(objekti[32], objekti[33]) > 0);
        System.out.println(prim.compare(objekti[46], objekti[47]) > 0);
        System.out.println(prim.compare(objekti[35], objekti[39]) > 0);
        System.out.println(prim.compare(objekti[2], objekti[3]) > 0);
        System.out.println(prim.compare(objekti[1], objekti[27]) > 0);
        System.out.println(prim.compare(objekti[36], objekti[1]) > 0);
        System.out.println(prim.compare(objekti[13], objekti[10]) > 0);
        System.out.println(prim.compare(objekti[27], objekti[18]) > 0);
        System.out.println(prim.compare(objekti[20], objekti[1]) > 0);
        System.out.println(prim.compare(objekti[21], objekti[3]) > 0);
        System.out.println(prim.compare(objekti[10], objekti[11]) > 0);
        System.out.println(prim.compare(objekti[58], objekti[59]) > 0);
        System.out.println(prim.compare(objekti[2], objekti[46]) > 0);
        System.out.println(prim.compare(objekti[0], objekti[1]) > 0);
        System.out.println(prim.compare(objekti[49], objekti[34]) > 0);
        System.out.println(prim.compare(objekti[28], objekti[29]) > 0);
        System.out.println(prim.compare(objekti[22], objekti[23]) > 0);
        System.out.println(prim.compare(objekti[4], objekti[57]) > 0);
        System.out.println(prim.compare(objekti[58], objekti[19]) > 0);
        System.out.println(prim.compare(objekti[1], objekti[46]) > 0);
        System.out.println(prim.compare(objekti[16], objekti[17]) > 0);
        System.out.println(prim.compare(objekti[8], objekti[31]) > 0);
        System.out.println(prim.compare(objekti[10], objekti[11]) > 0);
        System.out.println(prim.compare(objekti[10], objekti[52]) > 0);
        System.out.println(prim.compare(objekti[32], objekti[33]) > 0);
        System.out.println(prim.compare(objekti[0], objekti[1]) > 0);
        System.out.println(prim.compare(objekti[17], objekti[2]) > 0);
        System.out.println(prim.compare(objekti[46], objekti[47]) > 0);
        System.out.println(prim.compare(objekti[44], objekti[12]) > 0);
        System.out.println(prim.compare(objekti[33], objekti[48]) > 0);
        System.out.println(prim.compare(objekti[51], objekti[19]) > 0);
        System.out.println(prim.compare(objekti[48], objekti[16]) > 0);
        System.out.println(prim.compare(objekti[23], objekti[7]) > 0);
        System.out.println(prim.compare(objekti[38], objekti[39]) > 0);
    }
}
