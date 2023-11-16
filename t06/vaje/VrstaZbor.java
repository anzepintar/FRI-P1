import java.util.Scanner;

public class VrstaZbor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] vrsta = new int[n];
        for (int i = 0; i < vrsta.length; i++)
            vrsta[i] = sc.nextInt();
        sc.close();
        boolean vsajEden = false;
        for (int i = 0; i < vrsta.length; i++) {
            boolean lokalnoUrejen = false;
            if (i == 0)
                lokalnoUrejen = vrsta[i] <= vrsta[i + 1];
            else if (i == vrsta.length - 1)
                lokalnoUrejen = vrsta[i] >= vrsta[i - 1];
            else
                lokalnoUrejen = vrsta[i] >= vrsta[i - 1] && vrsta[i] <= vrsta[i + 1];

            if (lokalnoUrejen) {
                System.out.println(i);
                vsajEden = true;
            }
        }
        if (!vsajEden)
            System.out.println("NOBEDEN");
    }
    // lahko bi tudi
    // public static boolean lokalnoUrejen(int[] t, int i){
    // return (i==0||t[i]>=t[i-1])&&(t==t.length-1)||t[i]<=t[i+1];
    // }
    // ker ne pride do index out of bound exception, ker ko
    // je v konjunkciji nekaj true takoj vrne true in ne gre naprej
}
