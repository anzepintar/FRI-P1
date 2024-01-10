import java.util.Scanner;

public class DN02_63230247 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt(); // oblika tipkovnice
        int d = sc.nextInt(); // b == 4 => liho, število tipk/vrstic tipkovnice
        int n = sc.nextInt(); // dolžina zaporedja tipk
        int zap[] = new int[n];
        for (int i = 0; i < zap.length; i++) {
            zap[i] = sc.nextInt();
        }
        switch (b) {
            case 1:
                ravnovrstnica(d, zap);
                break;

            case 2:
                kvadratnica(d, zap);
                break;

            case 3:
                piramidnica(b, zap);
                break;

            case 4:
                spiralnica(zap);
                break;

            default:
                System.out.println("Neveljavna oblika tipkovnice");
                break;
        }
        sc.close();
    }

    public static void ravnovrstnica(int d, int[] zap) {
        int sum = 0;
        for (int i = 1; i < zap.length; i++) {
            int x1 = zap[i - 1];
            int x2 = zap[i];
            sum += Math.abs(x2 - x1);
        }
        System.out.println(sum);
    }

    public static void kvadratnica(int d, int[] zap) {
        int sum = 0;
        for (int i = 1; i < zap.length; i++) {
            int x1 = zap[i - 1] / d;
            int y1 = zap[i - 1] % d;
            int x2 = zap[i] / d;
            int y2 = zap[i] % d;
            sum += Math.abs(x2 - x1) + Math.abs(y2 - y1);
        }
        System.out.println(sum);
    }

    public static void piramidnica(int b, int[] zap) {
        int sum = 0;
        for (int i = 1; i < zap.length; i++) {
            int y1 = (int) Math.sqrt(zap[i - 1]);
            int y2 = (int) Math.sqrt(zap[i]);
            int x1 = zap[i - 1] - (int) Math.pow(y1, 2) + (b - 1 - y1);
            int x2 = zap[i] - (int) Math.pow(y2, 2) + (b - 1 - y2);
            sum += Math.abs(x2 - x1) + Math.abs(y2 - y1);
        }
        System.out.println(sum);
    }

    public static void spiralnica(int[] zap) {
        int sum = 0;
        for (int i = 1; i < zap.length; i++) {
            int vrstica1 = (int) ((Math.sqrt(zap[i - 1]) + 1) / 2);
            int stran1 = (2 * vrstica1 + 1);
            int zacetek1 = vrstica1 != 0 ? (stran1 - 2) * (stran1 - 2) : 0;
            int x1 = 0;
            int y1 = 0;
            if (zap[i - 1] != 0) {
                int stransko1 = (zap[i - 1] - zacetek1) / (stran1 - 1);
                switch (stransko1) {
                    case 0:
                        x1 = zap[i - 1] - zacetek1 - vrstica1;
                        y1 = -vrstica1;
                        break;
                    case 1:
                        x1 = vrstica1;
                        y1 = zap[i - 1] - zacetek1 - (stran1 - 1) - vrstica1;
                        break;
                    case 2:
                        x1 = vrstica1 - (zap[i - 1] - zacetek1 - 2 * (stran1 - 1));
                        y1 = vrstica1;
                        break;
                    default:
                        x1 = -vrstica1;
                        y1 = vrstica1 - (zap[i - 1] - zacetek1 - 3 * (stran1 - 1));
                        break;
                }
            }
            int vrstica2 = (int) ((Math.sqrt(zap[i]) + 1) / 2);
            int stran2 = (2 * vrstica2 + 1);
            int zacetek2 = vrstica2 != 0 ? (stran2 - 2) * (stran2 - 2) : 0;
            int x2 = 0;
            int y2 = 0;
            if (zap[i] != 0) {
                int stransko2 = (zap[i] - zacetek2) / (stran2 - 1);
                switch (stransko2) {
                    case 0:
                        x2 = zap[i] - zacetek2 - vrstica2;
                        y2 = -vrstica2;
                        break;
                    case 1:
                        x2 = vrstica2;
                        y2 = zap[i] - zacetek2 - (stran2 - 1) - vrstica2;
                        break;
                    case 2:
                        x2 = vrstica2 - (zap[i] - zacetek2 - 2 * (stran2 - 1));
                        y2 = vrstica2;
                        break;
                    default:
                        x2 = -vrstica2;
                        y2 = vrstica2 - (zap[i] - zacetek2 - 3 * (stran2 - 1));
                        break;
                }
            }
            sum += Math.abs(x2 - x1) + Math.abs(y2 - y1);
        }
        System.out.println(sum);
    }
}
