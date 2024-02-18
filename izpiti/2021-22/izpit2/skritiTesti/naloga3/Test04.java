
import java.util.*;

public class Test04 {

    public static void main(String[] args) {
        Tretja.Predavalnica[] predavalnice = new Tretja.Predavalnica[46];
        predavalnice[0] = new Tretja.Garaza("G1", 64, 398);
        predavalnice[1] = new Tretja.Garaza("G2", 281, 332);
        predavalnice[2] = new Tretja.Racunalnica("R1", 96, 20);
        predavalnice[3] = new Tretja.Racunalnica("R2", 16, 1);
        predavalnice[4] = new Tretja.Garaza("G3", 204, 252);
        predavalnice[5] = new Tretja.Garaza("G4", 93, 219);
        predavalnice[6] = new Tretja.Racunalnica("R3", 10, 4);
        predavalnice[7] = new Tretja.Avditorna("A1", 232);
        predavalnice[8] = new Tretja.Garaza("G5", 248, 239);
        predavalnice[9] = new Tretja.Avditorna("A2", 185);
        predavalnice[10] = new Tretja.Racunalnica("R4", 30, 10);
        predavalnice[11] = new Tretja.Racunalnica("R5", 33, 27);
        predavalnice[12] = new Tretja.Avditorna("A3", 143);
        predavalnice[13] = new Tretja.Avditorna("A4", 224);
        predavalnice[14] = new Tretja.Garaza("G6", 243, 250);
        predavalnice[15] = new Tretja.Avditorna("A5", 225);
        predavalnice[16] = new Tretja.Garaza("G7", 78, 308);
        predavalnice[17] = new Tretja.Racunalnica("R6", 96, 58);
        predavalnice[18] = new Tretja.Avditorna("A6", 65);
        predavalnice[19] = new Tretja.Avditorna("A7", 184);
        predavalnice[20] = new Tretja.Racunalnica("R7", 23, 10);
        predavalnice[21] = new Tretja.Avditorna("A8", 246);
        predavalnice[22] = new Tretja.Avditorna("A9", 271);
        predavalnice[23] = new Tretja.Racunalnica("R8", 18, 3);
        predavalnice[24] = new Tretja.Racunalnica("R9", 62, 47);
        predavalnice[25] = new Tretja.Garaza("G8", 154, 314);
        predavalnice[26] = new Tretja.Racunalnica("R10", 25, 6);
        predavalnice[27] = new Tretja.Garaza("G9", 101, 194);
        predavalnice[28] = new Tretja.Garaza("G10", 166, 486);
        predavalnice[29] = new Tretja.Racunalnica("R11", 47, 2);
        predavalnice[30] = new Tretja.Avditorna("A10", 200);
        predavalnice[31] = new Tretja.Garaza("G11", 100, 278);
        predavalnice[32] = new Tretja.Avditorna("A11", 141);
        predavalnice[33] = new Tretja.Racunalnica("R12", 14, 9);
        predavalnice[34] = new Tretja.Racunalnica("R13", 26, 17);
        predavalnice[35] = new Tretja.Racunalnica("R14", 66, 15);
        predavalnice[36] = new Tretja.Garaza("G12", 213, 259);
        predavalnice[37] = new Tretja.Avditorna("A12", 241);
        predavalnice[38] = new Tretja.Garaza("G13", 242, 437);
        predavalnice[39] = new Tretja.Racunalnica("R15", 68, 43);
        predavalnice[40] = new Tretja.Avditorna("A13", 282);
        predavalnice[41] = new Tretja.Racunalnica("R16", 78, 62);
        predavalnice[42] = new Tretja.Avditorna("A14", 67);
        predavalnice[43] = new Tretja.Avditorna("A15", 32);
        predavalnice[44] = new Tretja.Racunalnica("R17", 64, 60);
        predavalnice[45] = new Tretja.Avditorna("A16", 59);
        Tretja.Stavba stavba = new Tretja.Stavba(predavalnice);

        System.out.println(stavba.casCiscenja());
    }
}
