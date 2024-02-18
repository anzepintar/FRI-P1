
import java.util.*;

public class Test03 {

    public static void main(String[] args) {
        Tretja.Predavalnica[] predavalnice = new Tretja.Predavalnica[38];
        predavalnice[0] = new Tretja.Racunalnica("R1", 25, 13);
        predavalnice[1] = new Tretja.Garaza("G1", 224, 195);
        predavalnice[2] = new Tretja.Avditorna("A1", 103);
        predavalnice[3] = new Tretja.Garaza("G2", 230, 272);
        predavalnice[4] = new Tretja.Avditorna("A2", 155);
        predavalnice[5] = new Tretja.Avditorna("A3", 112);
        predavalnice[6] = new Tretja.Racunalnica("R2", 54, 16);
        predavalnice[7] = new Tretja.Racunalnica("R3", 49, 36);
        predavalnice[8] = new Tretja.Garaza("G3", 126, 342);
        predavalnice[9] = new Tretja.Racunalnica("R4", 45, 6);
        predavalnice[10] = new Tretja.Avditorna("A4", 35);
        predavalnice[11] = new Tretja.Avditorna("A5", 206);
        predavalnice[12] = new Tretja.Avditorna("A6", 117);
        predavalnice[13] = new Tretja.Garaza("G4", 246, 459);
        predavalnice[14] = new Tretja.Racunalnica("R5", 14, 10);
        predavalnice[15] = new Tretja.Avditorna("A7", 60);
        predavalnice[16] = new Tretja.Racunalnica("R6", 90, 78);
        predavalnice[17] = new Tretja.Avditorna("A8", 99);
        predavalnice[18] = new Tretja.Racunalnica("R7", 90, 1);
        predavalnice[19] = new Tretja.Garaza("G5", 106, 396);
        predavalnice[20] = new Tretja.Avditorna("A9", 198);
        predavalnice[21] = new Tretja.Racunalnica("R8", 46, 39);
        predavalnice[22] = new Tretja.Garaza("G6", 152, 303);
        predavalnice[23] = new Tretja.Garaza("G7", 76, 305);
        predavalnice[24] = new Tretja.Garaza("G8", 92, 324);
        predavalnice[25] = new Tretja.Garaza("G9", 295, 253);
        predavalnice[26] = new Tretja.Garaza("G10", 137, 447);
        predavalnice[27] = new Tretja.Avditorna("A10", 288);
        predavalnice[28] = new Tretja.Avditorna("A11", 177);
        predavalnice[29] = new Tretja.Racunalnica("R9", 34, 26);
        predavalnice[30] = new Tretja.Racunalnica("R10", 62, 61);
        predavalnice[31] = new Tretja.Avditorna("A12", 33);
        predavalnice[32] = new Tretja.Garaza("G11", 210, 199);
        predavalnice[33] = new Tretja.Racunalnica("R11", 55, 41);
        predavalnice[34] = new Tretja.Avditorna("A13", 300);
        predavalnice[35] = new Tretja.Racunalnica("R12", 86, 65);
        predavalnice[36] = new Tretja.Racunalnica("R13", 59, 25);
        predavalnice[37] = new Tretja.Avditorna("A14", 201);
        Tretja.Stavba stavba = new Tretja.Stavba(predavalnice);

        System.out.println(stavba.casCiscenja());
    }
}
