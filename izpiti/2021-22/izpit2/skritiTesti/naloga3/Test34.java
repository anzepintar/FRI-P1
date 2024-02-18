
import java.util.*;

public class Test34 {

    public static void main(String[] args) {
        Tretja.Predavalnica[] predavalnice = new Tretja.Predavalnica[83];
        predavalnice[0] = new Tretja.Garaza("G1", 278, 365);
        predavalnice[1] = new Tretja.Avditorna("A1", 63);
        predavalnice[2] = new Tretja.Garaza("G2", 107, 264);
        predavalnice[3] = new Tretja.Avditorna("A2", 290);
        predavalnice[4] = new Tretja.Racunalnica("R1", 41, 30);
        predavalnice[5] = new Tretja.Garaza("G3", 134, 166);
        predavalnice[6] = new Tretja.Garaza("G4", 122, 449);
        predavalnice[7] = new Tretja.Avditorna("A3", 53);
        predavalnice[8] = new Tretja.Avditorna("A4", 13);
        predavalnice[9] = new Tretja.Garaza("G5", 78, 417);
        predavalnice[10] = new Tretja.Racunalnica("R2", 61, 6);
        predavalnice[11] = new Tretja.Avditorna("A5", 172);
        predavalnice[12] = new Tretja.Garaza("G6", 193, 227);
        predavalnice[13] = new Tretja.Avditorna("A6", 158);
        predavalnice[14] = new Tretja.Garaza("G7", 50, 250);
        predavalnice[15] = new Tretja.Garaza("G8", 76, 466);
        predavalnice[16] = new Tretja.Garaza("G9", 222, 173);
        predavalnice[17] = new Tretja.Racunalnica("R3", 52, 46);
        predavalnice[18] = new Tretja.Garaza("G10", 276, 286);
        predavalnice[19] = new Tretja.Racunalnica("R4", 95, 90);
        predavalnice[20] = new Tretja.Avditorna("A7", 96);
        predavalnice[21] = new Tretja.Avditorna("A8", 93);
        predavalnice[22] = new Tretja.Garaza("G11", 233, 250);
        predavalnice[23] = new Tretja.Garaza("G12", 67, 271);
        predavalnice[24] = new Tretja.Avditorna("A9", 147);
        predavalnice[25] = new Tretja.Avditorna("A10", 291);
        predavalnice[26] = new Tretja.Avditorna("A11", 202);
        predavalnice[27] = new Tretja.Racunalnica("R5", 89, 2);
        predavalnice[28] = new Tretja.Avditorna("A12", 223);
        predavalnice[29] = new Tretja.Racunalnica("R6", 49, 31);
        predavalnice[30] = new Tretja.Garaza("G13", 183, 235);
        predavalnice[31] = new Tretja.Racunalnica("R7", 79, 18);
        predavalnice[32] = new Tretja.Racunalnica("R8", 18, 7);
        predavalnice[33] = new Tretja.Garaza("G14", 184, 290);
        predavalnice[34] = new Tretja.Garaza("G15", 148, 278);
        predavalnice[35] = new Tretja.Garaza("G16", 252, 247);
        predavalnice[36] = new Tretja.Avditorna("A13", 253);
        predavalnice[37] = new Tretja.Racunalnica("R9", 39, 25);
        predavalnice[38] = new Tretja.Racunalnica("R10", 33, 22);
        predavalnice[39] = new Tretja.Avditorna("A14", 13);
        predavalnice[40] = new Tretja.Avditorna("A15", 263);
        predavalnice[41] = new Tretja.Racunalnica("R11", 39, 21);
        predavalnice[42] = new Tretja.Garaza("G17", 74, 363);
        predavalnice[43] = new Tretja.Racunalnica("R12", 12, 2);
        predavalnice[44] = new Tretja.Garaza("G18", 121, 490);
        predavalnice[45] = new Tretja.Garaza("G19", 79, 134);
        predavalnice[46] = new Tretja.Garaza("G20", 289, 484);
        predavalnice[47] = new Tretja.Avditorna("A16", 18);
        predavalnice[48] = new Tretja.Avditorna("A17", 206);
        predavalnice[49] = new Tretja.Racunalnica("R13", 50, 1);
        predavalnice[50] = new Tretja.Racunalnica("R14", 45, 35);
        predavalnice[51] = new Tretja.Racunalnica("R15", 70, 41);
        predavalnice[52] = new Tretja.Garaza("G21", 238, 407);
        predavalnice[53] = new Tretja.Avditorna("A18", 61);
        predavalnice[54] = new Tretja.Racunalnica("R16", 78, 23);
        predavalnice[55] = new Tretja.Avditorna("A19", 229);
        predavalnice[56] = new Tretja.Avditorna("A20", 70);
        predavalnice[57] = new Tretja.Garaza("G22", 197, 434);
        predavalnice[58] = new Tretja.Garaza("G23", 294, 390);
        predavalnice[59] = new Tretja.Avditorna("A21", 298);
        predavalnice[60] = new Tretja.Avditorna("A22", 91);
        predavalnice[61] = new Tretja.Avditorna("A23", 34);
        predavalnice[62] = new Tretja.Racunalnica("R17", 44, 23);
        predavalnice[63] = new Tretja.Avditorna("A24", 147);
        predavalnice[64] = new Tretja.Avditorna("A25", 28);
        predavalnice[65] = new Tretja.Avditorna("A26", 70);
        predavalnice[66] = new Tretja.Garaza("G24", 127, 332);
        predavalnice[67] = new Tretja.Racunalnica("R18", 46, 16);
        predavalnice[68] = new Tretja.Racunalnica("R19", 35, 22);
        predavalnice[69] = new Tretja.Avditorna("A27", 227);
        predavalnice[70] = new Tretja.Garaza("G25", 213, 410);
        predavalnice[71] = new Tretja.Racunalnica("R20", 16, 1);
        predavalnice[72] = new Tretja.Avditorna("A28", 34);
        predavalnice[73] = new Tretja.Garaza("G26", 128, 140);
        predavalnice[74] = new Tretja.Avditorna("A29", 284);
        predavalnice[75] = new Tretja.Racunalnica("R21", 99, 51);
        predavalnice[76] = new Tretja.Garaza("G27", 84, 412);
        predavalnice[77] = new Tretja.Garaza("G28", 52, 346);
        predavalnice[78] = new Tretja.Garaza("G29", 126, 434);
        predavalnice[79] = new Tretja.Racunalnica("R22", 58, 52);
        predavalnice[80] = new Tretja.Racunalnica("R23", 81, 32);
        predavalnice[81] = new Tretja.Avditorna("A30", 154);
        predavalnice[82] = new Tretja.Avditorna("A31", 251);
        Tretja.Stavba stavba = new Tretja.Stavba(predavalnice);

        int[] ostanek = new int[1];
        int[] razporeditev = null;

        ostanek[0] = -1;
        razporeditev = stavba.razporedi(466, ostanek);
        System.out.printf("%s | %d%n", Arrays.toString(razporeditev), ostanek[0]);

        ostanek[0] = -1;
        razporeditev = stavba.razporedi(4708, ostanek);
        System.out.printf("%s | %d%n", Arrays.toString(razporeditev), ostanek[0]);

        ostanek[0] = -1;
        razporeditev = stavba.razporedi(8185, ostanek);
        System.out.printf("%s | %d%n", Arrays.toString(razporeditev), ostanek[0]);

        ostanek[0] = -1;
        razporeditev = stavba.razporedi(18518, ostanek);
        System.out.printf("%s | %d%n", Arrays.toString(razporeditev), ostanek[0]);
    }
}
