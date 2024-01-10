
import java.util.Random;

public class Test11 {

    public static void main(String[] args) {
        int stClanov = 10;
        int stNaslovov = 8;
        Knjiznica knjiznica = new Knjiznica(stClanov, stNaslovov, 6);

        Random random = new Random(123456);
        for (int i = 1;  i <= 1000;  i++) {
            int r = random.nextInt(100);
            int clan = random.nextInt(stClanov);
            int naslov = random.nextInt(stNaslovov);
            if (r < 60) {
                boolean b = knjiznica.posodi(clan, naslov);
                System.out.printf("posodi(%d, %d) -> %b%n", clan, naslov, b);
            } else if (r < 70) {
                knjiznica.clanVrne(clan);
                System.out.printf("clanVrne(%d)%n", clan);
            } else if (r < 80) {
                System.out.printf("posojeni(%d) -> %d%n", naslov, knjiznica.posojeni(naslov));
            } else if (r < 90) {
                System.out.printf("priClanu(%d) -> %d%n", clan, knjiznica.priClanu(clan));
            } else {
                System.out.printf("najNaslov() -> %d%n", knjiznica.najNaslov());
            }
        }
    }
}
