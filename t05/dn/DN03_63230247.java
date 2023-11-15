import java.util.Scanner;

public class DN03_63230247 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int k = sc.nextInt();
        sc.close();
        int[] plosce = new int[k + 1]; // sem se zapišejo število plošč različnih velikosti, s katerimi bi lahko bolj
                                       // ali manj idealno pokrili steno
        for (int i = 0; i < plosce.length; i++) {
            plosce[i] = (h / (int) Math.pow(2, i)) * (w / (int) Math.pow(2, i)); // == 1, 4, 16, 64
        }
        // naredi tabelo [323, 72, 16, 4] za vhod 19 17 3
        // 4+(16×2⁴−4×2⁶)/2⁴+(72×2²−16×2⁴)/2²+(323×2⁰−72×2²)/2⁰ za vhod 19 17 3
        int sum = plosce[plosce.length - 1];
        for (int i = 0; i < plosce.length - 1; i += 1) {
            sum += (int) ((plosce[i] * Math.pow(2, i * 2) - plosce[i + 1] * Math.pow(2, (i + 1) * 2))
                    / Math.pow(2, i * 2));
        }
        System.out.println(sum);
    }
}
