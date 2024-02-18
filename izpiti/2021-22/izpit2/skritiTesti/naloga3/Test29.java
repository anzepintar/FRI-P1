
import java.util.*;

public class Test29 {

    public static void main(String[] args) {
        Tretja.Predavalnica[] predavalnice = new Tretja.Predavalnica[58];
        predavalnice[0] = new Tretja.Garaza("G1", 268, 286);
        predavalnice[1] = new Tretja.Racunalnica("R1", 88, 28);
        predavalnice[2] = new Tretja.Garaza("G2", 105, 268);
        predavalnice[3] = new Tretja.Garaza("G3", 151, 448);
        predavalnice[4] = new Tretja.Racunalnica("R2", 28, 21);
        predavalnice[5] = new Tretja.Garaza("G4", 198, 161);
        predavalnice[6] = new Tretja.Racunalnica("R3", 100, 90);
        predavalnice[7] = new Tretja.Racunalnica("R4", 41, 35);
        predavalnice[8] = new Tretja.Garaza("G5", 69, 463);
        predavalnice[9] = new Tretja.Garaza("G6", 269, 478);
        predavalnice[10] = new Tretja.Avditorna("A1", 261);
        predavalnice[11] = new Tretja.Garaza("G7", 236, 286);
        predavalnice[12] = new Tretja.Avditorna("A2", 67);
        predavalnice[13] = new Tretja.Garaza("G8", 229, 363);
        predavalnice[14] = new Tretja.Garaza("G9", 82, 334);
        predavalnice[15] = new Tretja.Garaza("G10", 81, 255);
        predavalnice[16] = new Tretja.Avditorna("A3", 230);
        predavalnice[17] = new Tretja.Racunalnica("R5", 37, 16);
        predavalnice[18] = new Tretja.Racunalnica("R6", 25, 4);
        predavalnice[19] = new Tretja.Avditorna("A4", 228);
        predavalnice[20] = new Tretja.Racunalnica("R7", 15, 14);
        predavalnice[21] = new Tretja.Avditorna("A5", 207);
        predavalnice[22] = new Tretja.Garaza("G11", 224, 405);
        predavalnice[23] = new Tretja.Avditorna("A6", 272);
        predavalnice[24] = new Tretja.Avditorna("A7", 150);
        predavalnice[25] = new Tretja.Avditorna("A8", 247);
        predavalnice[26] = new Tretja.Avditorna("A9", 233);
        predavalnice[27] = new Tretja.Avditorna("A10", 32);
        predavalnice[28] = new Tretja.Racunalnica("R8", 99, 47);
        predavalnice[29] = new Tretja.Racunalnica("R9", 94, 18);
        predavalnice[30] = new Tretja.Racunalnica("R10", 52, 51);
        predavalnice[31] = new Tretja.Garaza("G12", 183, 480);
        predavalnice[32] = new Tretja.Racunalnica("R11", 34, 22);
        predavalnice[33] = new Tretja.Racunalnica("R12", 50, 50);
        predavalnice[34] = new Tretja.Garaza("G13", 71, 180);
        predavalnice[35] = new Tretja.Garaza("G14", 71, 462);
        predavalnice[36] = new Tretja.Racunalnica("R13", 14, 3);
        predavalnice[37] = new Tretja.Garaza("G15", 196, 189);
        predavalnice[38] = new Tretja.Avditorna("A11", 199);
        predavalnice[39] = new Tretja.Garaza("G16", 236, 102);
        predavalnice[40] = new Tretja.Garaza("G17", 111, 299);
        predavalnice[41] = new Tretja.Avditorna("A12", 229);
        predavalnice[42] = new Tretja.Racunalnica("R14", 39, 17);
        predavalnice[43] = new Tretja.Racunalnica("R15", 20, 4);
        predavalnice[44] = new Tretja.Avditorna("A13", 79);
        predavalnice[45] = new Tretja.Garaza("G18", 268, 138);
        predavalnice[46] = new Tretja.Racunalnica("R16", 72, 15);
        predavalnice[47] = new Tretja.Racunalnica("R17", 12, 12);
        predavalnice[48] = new Tretja.Racunalnica("R18", 94, 56);
        predavalnice[49] = new Tretja.Avditorna("A14", 10);
        predavalnice[50] = new Tretja.Avditorna("A15", 294);
        predavalnice[51] = new Tretja.Avditorna("A16", 190);
        predavalnice[52] = new Tretja.Avditorna("A17", 57);
        predavalnice[53] = new Tretja.Racunalnica("R19", 39, 6);
        predavalnice[54] = new Tretja.Avditorna("A18", 75);
        predavalnice[55] = new Tretja.Avditorna("A19", 168);
        predavalnice[56] = new Tretja.Racunalnica("R20", 86, 49);
        predavalnice[57] = new Tretja.Racunalnica("R21", 96, 94);
        Tretja.Stavba stavba = new Tretja.Stavba(predavalnice);

        int[] ostanek = new int[1];
        int[] razporeditev = null;

        ostanek[0] = -1;
        razporeditev = stavba.razporedi(2302, ostanek);
        System.out.printf("%s | %d%n", Arrays.toString(razporeditev), ostanek[0]);

        ostanek[0] = -1;
        razporeditev = stavba.razporedi(2905, ostanek);
        System.out.printf("%s | %d%n", Arrays.toString(razporeditev), ostanek[0]);

        ostanek[0] = -1;
        razporeditev = stavba.razporedi(6300, ostanek);
        System.out.printf("%s | %d%n", Arrays.toString(razporeditev), ostanek[0]);

        ostanek[0] = -1;
        razporeditev = stavba.razporedi(11730, ostanek);
        System.out.printf("%s | %d%n", Arrays.toString(razporeditev), ostanek[0]);
    }
}
