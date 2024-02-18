
import java.util.*;

public class Test24 {

    public static void main(String[] args) {
        Tretja.Predavalnica[] predavalnice = new Tretja.Predavalnica[24];
        predavalnice[0] = new Tretja.Garaza("G1", 95, 284);
        predavalnice[1] = new Tretja.Garaza("G2", 199, 303);
        predavalnice[2] = new Tretja.Garaza("G3", 162, 407);
        predavalnice[3] = new Tretja.Avditorna("A1", 195);
        predavalnice[4] = new Tretja.Garaza("G4", 181, 315);
        predavalnice[5] = new Tretja.Avditorna("A2", 126);
        predavalnice[6] = new Tretja.Avditorna("A3", 109);
        predavalnice[7] = new Tretja.Garaza("G5", 54, 137);
        predavalnice[8] = new Tretja.Racunalnica("R1", 43, 32);
        predavalnice[9] = new Tretja.Garaza("G6", 261, 123);
        predavalnice[10] = new Tretja.Garaza("G7", 157, 141);
        predavalnice[11] = new Tretja.Racunalnica("R2", 99, 7);
        predavalnice[12] = new Tretja.Garaza("G8", 201, 406);
        predavalnice[13] = new Tretja.Avditorna("A4", 30);
        predavalnice[14] = new Tretja.Avditorna("A5", 250);
        predavalnice[15] = new Tretja.Avditorna("A6", 273);
        predavalnice[16] = new Tretja.Racunalnica("R3", 32, 11);
        predavalnice[17] = new Tretja.Garaza("G9", 94, 499);
        predavalnice[18] = new Tretja.Avditorna("A7", 159);
        predavalnice[19] = new Tretja.Racunalnica("R4", 43, 29);
        predavalnice[20] = new Tretja.Garaza("G10", 289, 202);
        predavalnice[21] = new Tretja.Racunalnica("R5", 48, 37);
        predavalnice[22] = new Tretja.Avditorna("A8", 134);
        predavalnice[23] = new Tretja.Avditorna("A9", 13);
        Tretja.Stavba stavba = new Tretja.Stavba(predavalnice);

        System.out.println(stavba.casCiscenja());
    }
}
