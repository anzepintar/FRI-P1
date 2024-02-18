
import java.util.*;

public class Test13 {

    public static void main(String[] args) {
        Tretja.Predavalnica[] predavalnice = new Tretja.Predavalnica[20];
        predavalnice[0] = new Tretja.Racunalnica("R1", 17, 16);
        predavalnice[1] = new Tretja.Garaza("G1", 182, 382);
        predavalnice[2] = new Tretja.Garaza("G2", 219, 266);
        predavalnice[3] = new Tretja.Garaza("G3", 238, 251);
        predavalnice[4] = new Tretja.Garaza("G4", 255, 422);
        predavalnice[5] = new Tretja.Garaza("G5", 223, 345);
        predavalnice[6] = new Tretja.Avditorna("A1", 281);
        predavalnice[7] = new Tretja.Garaza("G6", 218, 117);
        predavalnice[8] = new Tretja.Garaza("G7", 189, 316);
        predavalnice[9] = new Tretja.Avditorna("A2", 148);
        predavalnice[10] = new Tretja.Garaza("G8", 237, 282);
        predavalnice[11] = new Tretja.Garaza("G9", 135, 412);
        predavalnice[12] = new Tretja.Racunalnica("R2", 53, 1);
        predavalnice[13] = new Tretja.Racunalnica("R3", 51, 3);
        predavalnice[14] = new Tretja.Racunalnica("R4", 90, 57);
        predavalnice[15] = new Tretja.Racunalnica("R5", 70, 60);
        predavalnice[16] = new Tretja.Garaza("G10", 161, 107);
        predavalnice[17] = new Tretja.Racunalnica("R6", 68, 48);
        predavalnice[18] = new Tretja.Garaza("G11", 299, 183);
        predavalnice[19] = new Tretja.Avditorna("A3", 202);
        Tretja.Stavba stavba = new Tretja.Stavba(predavalnice);

        System.out.println(stavba.casCiscenja());
    }
}
