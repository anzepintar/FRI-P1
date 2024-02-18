
import java.util.*;

public class Test05 {

    public static void main(String[] args) {
        Tretja.Predavalnica[] predavalnice = new Tretja.Predavalnica[21];
        predavalnice[0] = new Tretja.Racunalnica("R1", 38, 37);
        predavalnice[1] = new Tretja.Avditorna("A1", 154);
        predavalnice[2] = new Tretja.Garaza("G1", 219, 118);
        predavalnice[3] = new Tretja.Avditorna("A2", 70);
        predavalnice[4] = new Tretja.Avditorna("A3", 289);
        predavalnice[5] = new Tretja.Garaza("G2", 147, 459);
        predavalnice[6] = new Tretja.Garaza("G3", 143, 485);
        predavalnice[7] = new Tretja.Racunalnica("R2", 64, 8);
        predavalnice[8] = new Tretja.Avditorna("A4", 239);
        predavalnice[9] = new Tretja.Racunalnica("R3", 92, 19);
        predavalnice[10] = new Tretja.Garaza("G4", 140, 357);
        predavalnice[11] = new Tretja.Avditorna("A5", 272);
        predavalnice[12] = new Tretja.Garaza("G5", 210, 350);
        predavalnice[13] = new Tretja.Avditorna("A6", 162);
        predavalnice[14] = new Tretja.Garaza("G6", 122, 303);
        predavalnice[15] = new Tretja.Avditorna("A7", 299);
        predavalnice[16] = new Tretja.Avditorna("A8", 198);
        predavalnice[17] = new Tretja.Avditorna("A9", 135);
        predavalnice[18] = new Tretja.Racunalnica("R4", 80, 2);
        predavalnice[19] = new Tretja.Racunalnica("R5", 42, 11);
        predavalnice[20] = new Tretja.Garaza("G7", 85, 248);
        Tretja.Stavba stavba = new Tretja.Stavba(predavalnice);

        System.out.println(stavba.casCiscenja());
    }
}
