import java.util.Scanner;

public class DN03_63230247 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long h = sc.nextInt();
        long w = sc.nextInt();
        int k = sc.nextInt();
        sc.close();
        long[] plosce = new long[k + 1]; // sem se zapišejo število plošč različnih velikosti, s katerimi
        // bi
        // lahko bolj
        // ali manj idealno pokrili steno
        for (int i = 0; i < plosce.length; i++) {
            plosce[i] = (long) (h / (long) Math.pow(2, i)) * (w / (long) Math.pow(2, i)); // == 1, 4, 16, 64
        }
        // naredi tabelo [323, 72, 16, 4] za vhod 19 17 3
        // 4+(16×2⁴−4×2⁶)/2⁴+(72×2²−16×2⁴)/2²+(323×2⁰−72×2²)/2⁰ za vhod 19 17 3
        long sum = plosce[plosce.length - 1];
        for (int i = 0; i < plosce.length - 1; i += 1) {
            sum += (long) ((long) (plosce[i] * (long) Math.pow(2, i * 2)
                    - (long) plosce[i + 1] * (long) Math.pow(2, (i + 1) * 2))
                    / (long) Math.pow(2, i * 2));
        }
        System.out.println(sum);
    }
}
