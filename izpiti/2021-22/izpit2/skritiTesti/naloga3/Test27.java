
import java.util.*;

public class Test27 {

    public static void main(String[] args) {
        Tretja.Predavalnica[] predavalnice = new Tretja.Predavalnica[53];
        predavalnice[0] = new Tretja.Racunalnica("R1", 18, 15);
        predavalnice[1] = new Tretja.Avditorna("A1", 16);
        predavalnice[2] = new Tretja.Racunalnica("R2", 92, 44);
        predavalnice[3] = new Tretja.Racunalnica("R3", 72, 8);
        predavalnice[4] = new Tretja.Avditorna("A2", 158);
        predavalnice[5] = new Tretja.Garaza("G1", 152, 299);
        predavalnice[6] = new Tretja.Garaza("G2", 241, 488);
        predavalnice[7] = new Tretja.Garaza("G3", 272, 176);
        predavalnice[8] = new Tretja.Avditorna("A3", 214);
        predavalnice[9] = new Tretja.Racunalnica("R4", 90, 76);
        predavalnice[10] = new Tretja.Garaza("G4", 222, 170);
        predavalnice[11] = new Tretja.Garaza("G5", 86, 151);
        predavalnice[12] = new Tretja.Racunalnica("R5", 54, 25);
        predavalnice[13] = new Tretja.Garaza("G6", 237, 250);
        predavalnice[14] = new Tretja.Garaza("G7", 82, 487);
        predavalnice[15] = new Tretja.Racunalnica("R6", 58, 50);
        predavalnice[16] = new Tretja.Racunalnica("R7", 96, 21);
        predavalnice[17] = new Tretja.Garaza("G8", 62, 433);
        predavalnice[18] = new Tretja.Avditorna("A4", 112);
        predavalnice[19] = new Tretja.Garaza("G9", 201, 161);
        predavalnice[20] = new Tretja.Garaza("G10", 241, 403);
        predavalnice[21] = new Tretja.Avditorna("A5", 132);
        predavalnice[22] = new Tretja.Garaza("G11", 288, 173);
        predavalnice[23] = new Tretja.Avditorna("A6", 256);
        predavalnice[24] = new Tretja.Garaza("G12", 88, 119);
        predavalnice[25] = new Tretja.Racunalnica("R8", 31, 22);
        predavalnice[26] = new Tretja.Avditorna("A7", 252);
        predavalnice[27] = new Tretja.Racunalnica("R9", 89, 24);
        predavalnice[28] = new Tretja.Garaza("G13", 146, 451);
        predavalnice[29] = new Tretja.Racunalnica("R10", 50, 17);
        predavalnice[30] = new Tretja.Garaza("G14", 247, 279);
        predavalnice[31] = new Tretja.Garaza("G15", 101, 162);
        predavalnice[32] = new Tretja.Garaza("G16", 274, 159);
        predavalnice[33] = new Tretja.Garaza("G17", 293, 473);
        predavalnice[34] = new Tretja.Racunalnica("R11", 41, 38);
        predavalnice[35] = new Tretja.Racunalnica("R12", 99, 67);
        predavalnice[36] = new Tretja.Garaza("G18", 161, 113);
        predavalnice[37] = new Tretja.Racunalnica("R13", 66, 36);
        predavalnice[38] = new Tretja.Racunalnica("R14", 17, 9);
        predavalnice[39] = new Tretja.Garaza("G19", 131, 174);
        predavalnice[40] = new Tretja.Garaza("G20", 180, 247);
        predavalnice[41] = new Tretja.Garaza("G21", 164, 392);
        predavalnice[42] = new Tretja.Racunalnica("R15", 61, 18);
        predavalnice[43] = new Tretja.Avditorna("A8", 99);
        predavalnice[44] = new Tretja.Avditorna("A9", 140);
        predavalnice[45] = new Tretja.Racunalnica("R16", 67, 10);
        predavalnice[46] = new Tretja.Avditorna("A10", 113);
        predavalnice[47] = new Tretja.Avditorna("A11", 116);
        predavalnice[48] = new Tretja.Avditorna("A12", 55);
        predavalnice[49] = new Tretja.Garaza("G22", 222, 174);
        predavalnice[50] = new Tretja.Garaza("G23", 285, 402);
        predavalnice[51] = new Tretja.Garaza("G24", 295, 442);
        predavalnice[52] = new Tretja.Garaza("G25", 147, 421);
        Tretja.Stavba stavba = new Tretja.Stavba(predavalnice);

        int[] ostanek = new int[1];
        int[] razporeditev = null;

        ostanek[0] = -1;
        razporeditev = stavba.razporedi(84, ostanek);
        System.out.printf("%s | %d%n", Arrays.toString(razporeditev), ostanek[0]);

        ostanek[0] = -1;
        razporeditev = stavba.razporedi(2998, ostanek);
        System.out.printf("%s | %d%n", Arrays.toString(razporeditev), ostanek[0]);

        ostanek[0] = -1;
        razporeditev = stavba.razporedi(4040, ostanek);
        System.out.printf("%s | %d%n", Arrays.toString(razporeditev), ostanek[0]);

        ostanek[0] = -1;
        razporeditev = stavba.razporedi(14074, ostanek);
        System.out.printf("%s | %d%n", Arrays.toString(razporeditev), ostanek[0]);
    }
}
