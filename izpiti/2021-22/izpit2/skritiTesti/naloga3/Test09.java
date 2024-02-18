
import java.util.*;

public class Test09 {

    public static void main(String[] args) {
        Tretja.Predavalnica[] predavalnice = new Tretja.Predavalnica[43];
        predavalnice[0] = new Tretja.Avditorna("A1", 38);
        predavalnice[1] = new Tretja.Avditorna("A2", 94);
        predavalnice[2] = new Tretja.Racunalnica("R1", 95, 2);
        predavalnice[3] = new Tretja.Racunalnica("R2", 95, 42);
        predavalnice[4] = new Tretja.Avditorna("A3", 102);
        predavalnice[5] = new Tretja.Avditorna("A4", 38);
        predavalnice[6] = new Tretja.Garaza("G1", 227, 228);
        predavalnice[7] = new Tretja.Garaza("G2", 124, 460);
        predavalnice[8] = new Tretja.Racunalnica("R3", 50, 43);
        predavalnice[9] = new Tretja.Garaza("G3", 173, 353);
        predavalnice[10] = new Tretja.Avditorna("A5", 241);
        predavalnice[11] = new Tretja.Racunalnica("R4", 81, 50);
        predavalnice[12] = new Tretja.Garaza("G4", 213, 270);
        predavalnice[13] = new Tretja.Racunalnica("R5", 79, 70);
        predavalnice[14] = new Tretja.Racunalnica("R6", 18, 15);
        predavalnice[15] = new Tretja.Avditorna("A6", 230);
        predavalnice[16] = new Tretja.Avditorna("A7", 64);
        predavalnice[17] = new Tretja.Racunalnica("R7", 94, 81);
        predavalnice[18] = new Tretja.Garaza("G5", 219, 274);
        predavalnice[19] = new Tretja.Garaza("G6", 222, 138);
        predavalnice[20] = new Tretja.Racunalnica("R8", 58, 13);
        predavalnice[21] = new Tretja.Garaza("G7", 250, 153);
        predavalnice[22] = new Tretja.Avditorna("A8", 149);
        predavalnice[23] = new Tretja.Racunalnica("R9", 70, 39);
        predavalnice[24] = new Tretja.Racunalnica("R10", 82, 57);
        predavalnice[25] = new Tretja.Racunalnica("R11", 10, 4);
        predavalnice[26] = new Tretja.Garaza("G8", 238, 250);
        predavalnice[27] = new Tretja.Garaza("G9", 146, 477);
        predavalnice[28] = new Tretja.Racunalnica("R12", 67, 53);
        predavalnice[29] = new Tretja.Racunalnica("R13", 33, 9);
        predavalnice[30] = new Tretja.Racunalnica("R14", 31, 20);
        predavalnice[31] = new Tretja.Racunalnica("R15", 56, 28);
        predavalnice[32] = new Tretja.Garaza("G10", 159, 450);
        predavalnice[33] = new Tretja.Racunalnica("R16", 67, 53);
        predavalnice[34] = new Tretja.Avditorna("A9", 72);
        predavalnice[35] = new Tretja.Racunalnica("R17", 13, 12);
        predavalnice[36] = new Tretja.Avditorna("A10", 99);
        predavalnice[37] = new Tretja.Avditorna("A11", 226);
        predavalnice[38] = new Tretja.Racunalnica("R18", 93, 62);
        predavalnice[39] = new Tretja.Avditorna("A12", 125);
        predavalnice[40] = new Tretja.Garaza("G11", 229, 331);
        predavalnice[41] = new Tretja.Racunalnica("R19", 33, 27);
        predavalnice[42] = new Tretja.Garaza("G12", 98, 499);
        Tretja.Stavba stavba = new Tretja.Stavba(predavalnice);

        System.out.println(stavba.casCiscenja());
    }
}
