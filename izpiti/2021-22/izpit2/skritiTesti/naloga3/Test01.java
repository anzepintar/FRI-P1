
import java.util.*;

public class Test01 {

    public static void main(String[] args) {
        Tretja.Predavalnica[] predavalnice = new Tretja.Predavalnica[40];
        predavalnice[0] = new Tretja.Garaza("G1", 80, 208);
        predavalnice[1] = new Tretja.Avditorna("A1", 300);
        predavalnice[2] = new Tretja.Garaza("G2", 196, 416);
        predavalnice[3] = new Tretja.Garaza("G3", 136, 411);
        predavalnice[4] = new Tretja.Garaza("G4", 112, 297);
        predavalnice[5] = new Tretja.Racunalnica("R1", 54, 30);
        predavalnice[6] = new Tretja.Racunalnica("R2", 23, 2);
        predavalnice[7] = new Tretja.Racunalnica("R3", 41, 8);
        predavalnice[8] = new Tretja.Garaza("G5", 116, 419);
        predavalnice[9] = new Tretja.Avditorna("A2", 151);
        predavalnice[10] = new Tretja.Racunalnica("R4", 10, 9);
        predavalnice[11] = new Tretja.Garaza("G6", 222, 297);
        predavalnice[12] = new Tretja.Avditorna("A3", 107);
        predavalnice[13] = new Tretja.Avditorna("A4", 207);
        predavalnice[14] = new Tretja.Racunalnica("R5", 77, 75);
        predavalnice[15] = new Tretja.Garaza("G7", 258, 205);
        predavalnice[16] = new Tretja.Garaza("G8", 83, 329);
        predavalnice[17] = new Tretja.Racunalnica("R6", 33, 15);
        predavalnice[18] = new Tretja.Avditorna("A5", 248);
        predavalnice[19] = new Tretja.Avditorna("A6", 149);
        predavalnice[20] = new Tretja.Avditorna("A7", 125);
        predavalnice[21] = new Tretja.Garaza("G9", 290, 108);
        predavalnice[22] = new Tretja.Garaza("G10", 150, 494);
        predavalnice[23] = new Tretja.Garaza("G11", 216, 335);
        predavalnice[24] = new Tretja.Avditorna("A8", 116);
        predavalnice[25] = new Tretja.Racunalnica("R7", 52, 46);
        predavalnice[26] = new Tretja.Racunalnica("R8", 10, 5);
        predavalnice[27] = new Tretja.Racunalnica("R9", 49, 30);
        predavalnice[28] = new Tretja.Racunalnica("R10", 40, 20);
        predavalnice[29] = new Tretja.Racunalnica("R11", 25, 6);
        predavalnice[30] = new Tretja.Garaza("G12", 217, 365);
        predavalnice[31] = new Tretja.Garaza("G13", 92, 335);
        predavalnice[32] = new Tretja.Garaza("G14", 210, 251);
        predavalnice[33] = new Tretja.Garaza("G15", 297, 280);
        predavalnice[34] = new Tretja.Avditorna("A9", 54);
        predavalnice[35] = new Tretja.Avditorna("A10", 68);
        predavalnice[36] = new Tretja.Avditorna("A11", 239);
        predavalnice[37] = new Tretja.Racunalnica("R12", 52, 2);
        predavalnice[38] = new Tretja.Garaza("G16", 79, 346);
        predavalnice[39] = new Tretja.Avditorna("A12", 277);
        Tretja.Stavba stavba = new Tretja.Stavba(predavalnice);

        System.out.println(stavba.casCiscenja());
    }
}
