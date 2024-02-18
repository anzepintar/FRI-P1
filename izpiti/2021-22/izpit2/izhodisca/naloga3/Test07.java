
import java.util.*;

public class Test07 {

    public static void main(String[] args) {
        Tretja.Predavalnica[] predavalnice = new Tretja.Predavalnica[51];
        predavalnice[0] = new Tretja.Garaza("G1", 136, 355);
        predavalnice[1] = new Tretja.Garaza("G2", 257, 452);
        predavalnice[2] = new Tretja.Avditorna("A1", 33);
        predavalnice[3] = new Tretja.Racunalnica("R1", 76, 72);
        predavalnice[4] = new Tretja.Racunalnica("R2", 16, 7);
        predavalnice[5] = new Tretja.Garaza("G3", 56, 323);
        predavalnice[6] = new Tretja.Garaza("G4", 145, 275);
        predavalnice[7] = new Tretja.Avditorna("A2", 252);
        predavalnice[8] = new Tretja.Racunalnica("R3", 62, 57);
        predavalnice[9] = new Tretja.Racunalnica("R4", 98, 11);
        predavalnice[10] = new Tretja.Racunalnica("R5", 43, 21);
        predavalnice[11] = new Tretja.Avditorna("A3", 238);
        predavalnice[12] = new Tretja.Racunalnica("R6", 66, 37);
        predavalnice[13] = new Tretja.Avditorna("A4", 242);
        predavalnice[14] = new Tretja.Racunalnica("R7", 51, 33);
        predavalnice[15] = new Tretja.Garaza("G5", 130, 166);
        predavalnice[16] = new Tretja.Garaza("G6", 199, 219);
        predavalnice[17] = new Tretja.Garaza("G7", 140, 404);
        predavalnice[18] = new Tretja.Avditorna("A5", 212);
        predavalnice[19] = new Tretja.Racunalnica("R8", 65, 60);
        predavalnice[20] = new Tretja.Avditorna("A6", 267);
        predavalnice[21] = new Tretja.Garaza("G8", 86, 478);
        predavalnice[22] = new Tretja.Racunalnica("R9", 90, 12);
        predavalnice[23] = new Tretja.Racunalnica("R10", 42, 21);
        predavalnice[24] = new Tretja.Racunalnica("R11", 32, 20);
        predavalnice[25] = new Tretja.Garaza("G9", 296, 425);
        predavalnice[26] = new Tretja.Racunalnica("R12", 22, 3);
        predavalnice[27] = new Tretja.Racunalnica("R13", 23, 2);
        predavalnice[28] = new Tretja.Garaza("G10", 102, 377);
        predavalnice[29] = new Tretja.Racunalnica("R14", 34, 3);
        predavalnice[30] = new Tretja.Racunalnica("R15", 14, 3);
        predavalnice[31] = new Tretja.Racunalnica("R16", 78, 35);
        predavalnice[32] = new Tretja.Avditorna("A7", 116);
        predavalnice[33] = new Tretja.Avditorna("A8", 121);
        predavalnice[34] = new Tretja.Avditorna("A9", 56);
        predavalnice[35] = new Tretja.Garaza("G11", 116, 184);
        predavalnice[36] = new Tretja.Avditorna("A10", 12);
        predavalnice[37] = new Tretja.Racunalnica("R17", 64, 18);
        predavalnice[38] = new Tretja.Garaza("G12", 266, 256);
        predavalnice[39] = new Tretja.Racunalnica("R18", 19, 15);
        predavalnice[40] = new Tretja.Garaza("G13", 198, 343);
        predavalnice[41] = new Tretja.Garaza("G14", 250, 458);
        predavalnice[42] = new Tretja.Garaza("G15", 271, 115);
        predavalnice[43] = new Tretja.Garaza("G16", 225, 128);
        predavalnice[44] = new Tretja.Garaza("G17", 133, 386);
        predavalnice[45] = new Tretja.Racunalnica("R19", 56, 21);
        predavalnice[46] = new Tretja.Avditorna("A11", 246);
        predavalnice[47] = new Tretja.Garaza("G18", 264, 322);
        predavalnice[48] = new Tretja.Avditorna("A12", 54);
        predavalnice[49] = new Tretja.Garaza("G19", 158, 173);
        predavalnice[50] = new Tretja.Racunalnica("R20", 80, 58);
        Tretja.Stavba stavba = new Tretja.Stavba(predavalnice);

        int[] ostanek = new int[1];
        int[] razporeditev = null;

        ostanek[0] = -1;
        razporeditev = stavba.razporedi(723, ostanek);
        System.out.printf("%s | %d%n", Arrays.toString(razporeditev), ostanek[0]);

        ostanek[0] = -1;
        razporeditev = stavba.razporedi(3034, ostanek);
        System.out.printf("%s | %d%n", Arrays.toString(razporeditev), ostanek[0]);

        ostanek[0] = -1;
        razporeditev = stavba.razporedi(5112, ostanek);
        System.out.printf("%s | %d%n", Arrays.toString(razporeditev), ostanek[0]);

        ostanek[0] = -1;
        razporeditev = stavba.razporedi(11661, ostanek);
        System.out.printf("%s | %d%n", Arrays.toString(razporeditev), ostanek[0]);
    }
}
