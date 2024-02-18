
import java.util.*;

public class Test18 {

    public static void main(String[] args) {
        Tretja.Predavalnica[] predavalnice = new Tretja.Predavalnica[76];
        predavalnice[0] = new Tretja.Avditorna("A1", 250);
        predavalnice[1] = new Tretja.Garaza("G1", 243, 218);
        predavalnice[2] = new Tretja.Garaza("G2", 99, 256);
        predavalnice[3] = new Tretja.Avditorna("A2", 265);
        predavalnice[4] = new Tretja.Racunalnica("R1", 100, 22);
        predavalnice[5] = new Tretja.Garaza("G3", 59, 388);
        predavalnice[6] = new Tretja.Garaza("G4", 56, 379);
        predavalnice[7] = new Tretja.Racunalnica("R2", 74, 33);
        predavalnice[8] = new Tretja.Racunalnica("R3", 71, 18);
        predavalnice[9] = new Tretja.Garaza("G5", 232, 257);
        predavalnice[10] = new Tretja.Avditorna("A3", 203);
        predavalnice[11] = new Tretja.Garaza("G6", 233, 314);
        predavalnice[12] = new Tretja.Racunalnica("R4", 43, 3);
        predavalnice[13] = new Tretja.Garaza("G7", 155, 483);
        predavalnice[14] = new Tretja.Garaza("G8", 129, 397);
        predavalnice[15] = new Tretja.Avditorna("A4", 220);
        predavalnice[16] = new Tretja.Racunalnica("R5", 75, 26);
        predavalnice[17] = new Tretja.Avditorna("A5", 232);
        predavalnice[18] = new Tretja.Avditorna("A6", 281);
        predavalnice[19] = new Tretja.Garaza("G9", 267, 199);
        predavalnice[20] = new Tretja.Racunalnica("R6", 61, 4);
        predavalnice[21] = new Tretja.Racunalnica("R7", 94, 75);
        predavalnice[22] = new Tretja.Avditorna("A7", 15);
        predavalnice[23] = new Tretja.Racunalnica("R8", 12, 8);
        predavalnice[24] = new Tretja.Racunalnica("R9", 65, 64);
        predavalnice[25] = new Tretja.Avditorna("A8", 197);
        predavalnice[26] = new Tretja.Avditorna("A9", 111);
        predavalnice[27] = new Tretja.Avditorna("A10", 118);
        predavalnice[28] = new Tretja.Racunalnica("R10", 28, 21);
        predavalnice[29] = new Tretja.Racunalnica("R11", 95, 35);
        predavalnice[30] = new Tretja.Racunalnica("R12", 25, 17);
        predavalnice[31] = new Tretja.Racunalnica("R13", 32, 13);
        predavalnice[32] = new Tretja.Garaza("G10", 102, 298);
        predavalnice[33] = new Tretja.Racunalnica("R14", 21, 16);
        predavalnice[34] = new Tretja.Racunalnica("R15", 27, 5);
        predavalnice[35] = new Tretja.Garaza("G11", 112, 102);
        predavalnice[36] = new Tretja.Avditorna("A11", 201);
        predavalnice[37] = new Tretja.Racunalnica("R16", 26, 22);
        predavalnice[38] = new Tretja.Avditorna("A12", 43);
        predavalnice[39] = new Tretja.Garaza("G12", 228, 377);
        predavalnice[40] = new Tretja.Racunalnica("R17", 22, 9);
        predavalnice[41] = new Tretja.Garaza("G13", 162, 315);
        predavalnice[42] = new Tretja.Racunalnica("R18", 50, 29);
        predavalnice[43] = new Tretja.Avditorna("A13", 188);
        predavalnice[44] = new Tretja.Garaza("G14", 287, 360);
        predavalnice[45] = new Tretja.Garaza("G15", 215, 264);
        predavalnice[46] = new Tretja.Racunalnica("R19", 57, 25);
        predavalnice[47] = new Tretja.Garaza("G16", 94, 472);
        predavalnice[48] = new Tretja.Avditorna("A14", 160);
        predavalnice[49] = new Tretja.Racunalnica("R20", 50, 14);
        predavalnice[50] = new Tretja.Avditorna("A15", 61);
        predavalnice[51] = new Tretja.Racunalnica("R21", 83, 39);
        predavalnice[52] = new Tretja.Racunalnica("R22", 25, 15);
        predavalnice[53] = new Tretja.Racunalnica("R23", 44, 18);
        predavalnice[54] = new Tretja.Racunalnica("R24", 15, 15);
        predavalnice[55] = new Tretja.Racunalnica("R25", 19, 17);
        predavalnice[56] = new Tretja.Racunalnica("R26", 63, 49);
        predavalnice[57] = new Tretja.Racunalnica("R27", 39, 17);
        predavalnice[58] = new Tretja.Racunalnica("R28", 74, 48);
        predavalnice[59] = new Tretja.Racunalnica("R29", 10, 2);
        predavalnice[60] = new Tretja.Avditorna("A16", 251);
        predavalnice[61] = new Tretja.Racunalnica("R30", 48, 3);
        predavalnice[62] = new Tretja.Racunalnica("R31", 45, 22);
        predavalnice[63] = new Tretja.Avditorna("A17", 179);
        predavalnice[64] = new Tretja.Avditorna("A18", 84);
        predavalnice[65] = new Tretja.Avditorna("A19", 19);
        predavalnice[66] = new Tretja.Avditorna("A20", 107);
        predavalnice[67] = new Tretja.Garaza("G17", 226, 384);
        predavalnice[68] = new Tretja.Avditorna("A21", 273);
        predavalnice[69] = new Tretja.Avditorna("A22", 198);
        predavalnice[70] = new Tretja.Racunalnica("R32", 13, 6);
        predavalnice[71] = new Tretja.Racunalnica("R33", 47, 20);
        predavalnice[72] = new Tretja.Racunalnica("R34", 57, 27);
        predavalnice[73] = new Tretja.Garaza("G18", 178, 175);
        predavalnice[74] = new Tretja.Avditorna("A23", 122);
        predavalnice[75] = new Tretja.Racunalnica("R35", 45, 6);
        Tretja.Stavba stavba = new Tretja.Stavba(predavalnice);

        System.out.println(stavba.casCiscenja());
    }
}
