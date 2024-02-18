
import java.util.*;

public class Test47 {

    public static void main(String[] args) {
        Tretja.Predavalnica[] predavalnice = new Tretja.Predavalnica[56];
        predavalnice[0] = new Tretja.Avditorna("A1", 42);
        predavalnice[1] = new Tretja.Garaza("G1", 203, 479);
        predavalnice[2] = new Tretja.Garaza("G2", 189, 330);
        predavalnice[3] = new Tretja.Avditorna("A2", 112);
        predavalnice[4] = new Tretja.Avditorna("A3", 260);
        predavalnice[5] = new Tretja.Garaza("G3", 186, 469);
        predavalnice[6] = new Tretja.Racunalnica("R1", 91, 26);
        predavalnice[7] = new Tretja.Garaza("G4", 122, 393);
        predavalnice[8] = new Tretja.Avditorna("A4", 163);
        predavalnice[9] = new Tretja.Garaza("G5", 206, 375);
        predavalnice[10] = new Tretja.Avditorna("A5", 90);
        predavalnice[11] = new Tretja.Racunalnica("R2", 66, 61);
        predavalnice[12] = new Tretja.Avditorna("A6", 272);
        predavalnice[13] = new Tretja.Garaza("G6", 112, 404);
        predavalnice[14] = new Tretja.Avditorna("A7", 277);
        predavalnice[15] = new Tretja.Garaza("G7", 291, 117);
        predavalnice[16] = new Tretja.Avditorna("A8", 229);
        predavalnice[17] = new Tretja.Avditorna("A9", 140);
        predavalnice[18] = new Tretja.Avditorna("A10", 41);
        predavalnice[19] = new Tretja.Garaza("G8", 222, 280);
        predavalnice[20] = new Tretja.Racunalnica("R3", 17, 15);
        predavalnice[21] = new Tretja.Racunalnica("R4", 68, 39);
        predavalnice[22] = new Tretja.Garaza("G9", 265, 211);
        predavalnice[23] = new Tretja.Racunalnica("R5", 58, 52);
        predavalnice[24] = new Tretja.Avditorna("A11", 49);
        predavalnice[25] = new Tretja.Racunalnica("R6", 52, 25);
        predavalnice[26] = new Tretja.Racunalnica("R7", 42, 4);
        predavalnice[27] = new Tretja.Garaza("G10", 241, 304);
        predavalnice[28] = new Tretja.Avditorna("A12", 221);
        predavalnice[29] = new Tretja.Garaza("G11", 208, 365);
        predavalnice[30] = new Tretja.Avditorna("A13", 23);
        predavalnice[31] = new Tretja.Avditorna("A14", 102);
        predavalnice[32] = new Tretja.Avditorna("A15", 20);
        predavalnice[33] = new Tretja.Garaza("G12", 284, 459);
        predavalnice[34] = new Tretja.Racunalnica("R8", 70, 6);
        predavalnice[35] = new Tretja.Garaza("G13", 124, 254);
        predavalnice[36] = new Tretja.Garaza("G14", 175, 166);
        predavalnice[37] = new Tretja.Avditorna("A16", 255);
        predavalnice[38] = new Tretja.Garaza("G15", 103, 452);
        predavalnice[39] = new Tretja.Racunalnica("R9", 22, 22);
        predavalnice[40] = new Tretja.Racunalnica("R10", 24, 2);
        predavalnice[41] = new Tretja.Avditorna("A17", 80);
        predavalnice[42] = new Tretja.Garaza("G16", 185, 371);
        predavalnice[43] = new Tretja.Avditorna("A18", 262);
        predavalnice[44] = new Tretja.Garaza("G17", 125, 228);
        predavalnice[45] = new Tretja.Racunalnica("R11", 19, 13);
        predavalnice[46] = new Tretja.Avditorna("A19", 203);
        predavalnice[47] = new Tretja.Garaza("G18", 53, 317);
        predavalnice[48] = new Tretja.Avditorna("A20", 159);
        predavalnice[49] = new Tretja.Racunalnica("R12", 92, 74);
        predavalnice[50] = new Tretja.Racunalnica("R13", 96, 14);
        predavalnice[51] = new Tretja.Racunalnica("R14", 52, 49);
        predavalnice[52] = new Tretja.Garaza("G19", 63, 313);
        predavalnice[53] = new Tretja.Racunalnica("R15", 19, 9);
        predavalnice[54] = new Tretja.Garaza("G20", 97, 187);
        predavalnice[55] = new Tretja.Garaza("G21", 296, 312);
        Tretja.Stavba stavba = new Tretja.Stavba(predavalnice);

        int[] ostanek = new int[1];
        int[] razporeditev = null;

        ostanek[0] = -1;
        razporeditev = stavba.razporedi(1880, ostanek);
        System.out.printf("%s | %d%n", Arrays.toString(razporeditev), ostanek[0]);

        ostanek[0] = -1;
        razporeditev = stavba.razporedi(3101, ostanek);
        System.out.printf("%s | %d%n", Arrays.toString(razporeditev), ostanek[0]);

        ostanek[0] = -1;
        razporeditev = stavba.razporedi(6061, ostanek);
        System.out.printf("%s | %d%n", Arrays.toString(razporeditev), ostanek[0]);

        ostanek[0] = -1;
        razporeditev = stavba.razporedi(7652, ostanek);
        System.out.printf("%s | %d%n", Arrays.toString(razporeditev), ostanek[0]);
    }
}
