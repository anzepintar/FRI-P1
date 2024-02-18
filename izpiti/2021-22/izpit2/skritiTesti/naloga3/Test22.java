
import java.util.*;

public class Test22 {

    public static void main(String[] args) {
        Tretja.Predavalnica[] predavalnice = new Tretja.Predavalnica[71];
        predavalnice[0] = new Tretja.Avditorna("A1", 128);
        predavalnice[1] = new Tretja.Garaza("G1", 107, 276);
        predavalnice[2] = new Tretja.Racunalnica("R1", 55, 48);
        predavalnice[3] = new Tretja.Garaza("G2", 275, 291);
        predavalnice[4] = new Tretja.Racunalnica("R2", 92, 80);
        predavalnice[5] = new Tretja.Avditorna("A2", 222);
        predavalnice[6] = new Tretja.Avditorna("A3", 199);
        predavalnice[7] = new Tretja.Racunalnica("R3", 17, 10);
        predavalnice[8] = new Tretja.Racunalnica("R4", 65, 2);
        predavalnice[9] = new Tretja.Garaza("G3", 120, 428);
        predavalnice[10] = new Tretja.Racunalnica("R5", 44, 43);
        predavalnice[11] = new Tretja.Avditorna("A4", 83);
        predavalnice[12] = new Tretja.Garaza("G4", 267, 487);
        predavalnice[13] = new Tretja.Garaza("G5", 134, 432);
        predavalnice[14] = new Tretja.Avditorna("A5", 28);
        predavalnice[15] = new Tretja.Avditorna("A6", 245);
        predavalnice[16] = new Tretja.Racunalnica("R6", 48, 33);
        predavalnice[17] = new Tretja.Garaza("G6", 128, 315);
        predavalnice[18] = new Tretja.Racunalnica("R7", 19, 8);
        predavalnice[19] = new Tretja.Racunalnica("R8", 38, 34);
        predavalnice[20] = new Tretja.Racunalnica("R9", 70, 48);
        predavalnice[21] = new Tretja.Racunalnica("R10", 18, 3);
        predavalnice[22] = new Tretja.Racunalnica("R11", 39, 14);
        predavalnice[23] = new Tretja.Garaza("G7", 289, 478);
        predavalnice[24] = new Tretja.Avditorna("A7", 56);
        predavalnice[25] = new Tretja.Garaza("G8", 215, 416);
        predavalnice[26] = new Tretja.Avditorna("A8", 173);
        predavalnice[27] = new Tretja.Avditorna("A9", 39);
        predavalnice[28] = new Tretja.Garaza("G9", 204, 202);
        predavalnice[29] = new Tretja.Avditorna("A10", 201);
        predavalnice[30] = new Tretja.Avditorna("A11", 254);
        predavalnice[31] = new Tretja.Racunalnica("R12", 51, 13);
        predavalnice[32] = new Tretja.Avditorna("A12", 98);
        predavalnice[33] = new Tretja.Racunalnica("R13", 60, 21);
        predavalnice[34] = new Tretja.Avditorna("A13", 172);
        predavalnice[35] = new Tretja.Avditorna("A14", 146);
        predavalnice[36] = new Tretja.Avditorna("A15", 145);
        predavalnice[37] = new Tretja.Racunalnica("R14", 84, 43);
        predavalnice[38] = new Tretja.Avditorna("A16", 247);
        predavalnice[39] = new Tretja.Racunalnica("R15", 78, 9);
        predavalnice[40] = new Tretja.Avditorna("A17", 224);
        predavalnice[41] = new Tretja.Racunalnica("R16", 76, 54);
        predavalnice[42] = new Tretja.Racunalnica("R17", 13, 12);
        predavalnice[43] = new Tretja.Garaza("G10", 116, 106);
        predavalnice[44] = new Tretja.Racunalnica("R18", 35, 35);
        predavalnice[45] = new Tretja.Racunalnica("R19", 78, 42);
        predavalnice[46] = new Tretja.Avditorna("A18", 205);
        predavalnice[47] = new Tretja.Racunalnica("R20", 60, 24);
        predavalnice[48] = new Tretja.Racunalnica("R21", 55, 45);
        predavalnice[49] = new Tretja.Garaza("G11", 86, 232);
        predavalnice[50] = new Tretja.Garaza("G12", 238, 329);
        predavalnice[51] = new Tretja.Racunalnica("R22", 96, 42);
        predavalnice[52] = new Tretja.Garaza("G13", 121, 353);
        predavalnice[53] = new Tretja.Garaza("G14", 114, 248);
        predavalnice[54] = new Tretja.Racunalnica("R23", 19, 19);
        predavalnice[55] = new Tretja.Garaza("G15", 235, 156);
        predavalnice[56] = new Tretja.Avditorna("A19", 106);
        predavalnice[57] = new Tretja.Garaza("G16", 295, 336);
        predavalnice[58] = new Tretja.Garaza("G17", 234, 157);
        predavalnice[59] = new Tretja.Garaza("G18", 95, 489);
        predavalnice[60] = new Tretja.Racunalnica("R24", 37, 21);
        predavalnice[61] = new Tretja.Garaza("G19", 239, 139);
        predavalnice[62] = new Tretja.Garaza("G20", 225, 183);
        predavalnice[63] = new Tretja.Avditorna("A20", 55);
        predavalnice[64] = new Tretja.Racunalnica("R25", 72, 5);
        predavalnice[65] = new Tretja.Racunalnica("R26", 39, 1);
        predavalnice[66] = new Tretja.Garaza("G21", 140, 212);
        predavalnice[67] = new Tretja.Garaza("G22", 86, 272);
        predavalnice[68] = new Tretja.Avditorna("A21", 144);
        predavalnice[69] = new Tretja.Racunalnica("R27", 89, 15);
        predavalnice[70] = new Tretja.Avditorna("A22", 41);
        Tretja.Stavba stavba = new Tretja.Stavba(predavalnice);

        System.out.println(stavba.casCiscenja());
    }
}
