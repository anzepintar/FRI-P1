
import java.util.*;

public class Test21 {

    public static void main(String[] args) {
        Tretja.Predavalnica[] predavalnice = new Tretja.Predavalnica[33];
        predavalnice[0] = new Tretja.Racunalnica("R1", 27, 1);
        predavalnice[1] = new Tretja.Avditorna("A1", 183);
        predavalnice[2] = new Tretja.Racunalnica("R2", 94, 64);
        predavalnice[3] = new Tretja.Avditorna("A2", 30);
        predavalnice[4] = new Tretja.Avditorna("A3", 29);
        predavalnice[5] = new Tretja.Racunalnica("R3", 19, 4);
        predavalnice[6] = new Tretja.Garaza("G1", 245, 432);
        predavalnice[7] = new Tretja.Racunalnica("R4", 42, 28);
        predavalnice[8] = new Tretja.Avditorna("A4", 103);
        predavalnice[9] = new Tretja.Racunalnica("R5", 10, 7);
        predavalnice[10] = new Tretja.Garaza("G2", 279, 372);
        predavalnice[11] = new Tretja.Racunalnica("R6", 71, 23);
        predavalnice[12] = new Tretja.Avditorna("A5", 49);
        predavalnice[13] = new Tretja.Avditorna("A6", 205);
        predavalnice[14] = new Tretja.Racunalnica("R7", 39, 15);
        predavalnice[15] = new Tretja.Avditorna("A7", 190);
        predavalnice[16] = new Tretja.Garaza("G3", 157, 155);
        predavalnice[17] = new Tretja.Garaza("G4", 238, 429);
        predavalnice[18] = new Tretja.Racunalnica("R8", 64, 60);
        predavalnice[19] = new Tretja.Racunalnica("R9", 79, 16);
        predavalnice[20] = new Tretja.Avditorna("A8", 239);
        predavalnice[21] = new Tretja.Garaza("G5", 92, 414);
        predavalnice[22] = new Tretja.Garaza("G6", 176, 426);
        predavalnice[23] = new Tretja.Avditorna("A9", 264);
        predavalnice[24] = new Tretja.Garaza("G7", 157, 471);
        predavalnice[25] = new Tretja.Avditorna("A10", 192);
        predavalnice[26] = new Tretja.Avditorna("A11", 112);
        predavalnice[27] = new Tretja.Avditorna("A12", 154);
        predavalnice[28] = new Tretja.Racunalnica("R10", 88, 82);
        predavalnice[29] = new Tretja.Avditorna("A13", 67);
        predavalnice[30] = new Tretja.Garaza("G8", 101, 214);
        predavalnice[31] = new Tretja.Avditorna("A14", 22);
        predavalnice[32] = new Tretja.Garaza("G9", 252, 226);
        Tretja.Stavba stavba = new Tretja.Stavba(predavalnice);

        System.out.println(stavba.casCiscenja());
    }
}
