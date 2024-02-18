
import java.util.*;

public class Test40 {

    public static void main(String[] args) {
        Tretja.Predavalnica[] predavalnice = new Tretja.Predavalnica[18];
        predavalnice[0] = new Tretja.Garaza("G1", 200, 494);
        predavalnice[1] = new Tretja.Racunalnica("R1", 64, 7);
        predavalnice[2] = new Tretja.Garaza("G2", 62, 244);
        predavalnice[3] = new Tretja.Avditorna("A1", 20);
        predavalnice[4] = new Tretja.Racunalnica("R2", 27, 7);
        predavalnice[5] = new Tretja.Avditorna("A2", 240);
        predavalnice[6] = new Tretja.Racunalnica("R3", 16, 15);
        predavalnice[7] = new Tretja.Avditorna("A3", 52);
        predavalnice[8] = new Tretja.Garaza("G3", 94, 483);
        predavalnice[9] = new Tretja.Garaza("G4", 132, 158);
        predavalnice[10] = new Tretja.Racunalnica("R4", 21, 17);
        predavalnice[11] = new Tretja.Racunalnica("R5", 66, 3);
        predavalnice[12] = new Tretja.Avditorna("A4", 281);
        predavalnice[13] = new Tretja.Garaza("G5", 86, 350);
        predavalnice[14] = new Tretja.Avditorna("A5", 97);
        predavalnice[15] = new Tretja.Avditorna("A6", 116);
        predavalnice[16] = new Tretja.Garaza("G6", 198, 246);
        predavalnice[17] = new Tretja.Racunalnica("R6", 43, 28);
        Tretja.Stavba stavba = new Tretja.Stavba(predavalnice);

        int[] ostanek = new int[1];
        int[] razporeditev = null;

        ostanek[0] = -1;
        razporeditev = stavba.razporedi(1, ostanek);
        System.out.printf("%s | %d%n", Arrays.toString(razporeditev), ostanek[0]);

        ostanek[0] = -1;
        razporeditev = stavba.razporedi(820, ostanek);
        System.out.printf("%s | %d%n", Arrays.toString(razporeditev), ostanek[0]);

        ostanek[0] = -1;
        razporeditev = stavba.razporedi(1452, ostanek);
        System.out.printf("%s | %d%n", Arrays.toString(razporeditev), ostanek[0]);

        ostanek[0] = -1;
        razporeditev = stavba.razporedi(3160, ostanek);
        System.out.printf("%s | %d%n", Arrays.toString(razporeditev), ostanek[0]);
    }
}
