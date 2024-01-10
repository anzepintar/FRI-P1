
//
// Program izpiše skupno število celic, ki jih osvetljujejo luči na podanih
// koordinatah, če vsaka luč osvetljuje celico pod seboj in vseh njenih osem
// sosed.
//

import java.util.*;

public class Luci {

    private static final int[][] ODMIKI = {
        {-1, -1}, {0, -1}, {1, -1},
        {-1,  0}, {0,  0}, {1,  0},
        {-1,  1}, {0,  1}, {1,  1}
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stLuci = sc.nextInt();
        Set<Celica> osvetljene = new HashSet<>();

        // preberemo položaje luči in za vsako luč dodamo vse celice, ki jih
        // ta osvetljuje, v množico
        for (int i = 0; i < stLuci; i++) {
            int x0 = sc.nextInt();
            int y0 = sc.nextInt();
            for (int[] odmik: ODMIKI) {
                osvetljene.add(new Celica(x0 + odmik[0], y0 + odmik[1]));
            }
        }

        // izpišemo velikost množice
        System.out.println(osvetljene.size());
    }
}
