
import java.util.*;

public class Test01 {

    public static void main(String[] args) {
        Tretja.Predavalnica[] predavalnice = new Tretja.Predavalnica[6];

        predavalnice[0] = new Tretja.Racunalnica("R1",  20,  10);
        predavalnice[1] = new Tretja.Garaza(     "G1", 100, 200);
        predavalnice[2] = new Tretja.Racunalnica("R2",  30,  20);
        predavalnice[3] = new Tretja.Avditorna(  "A1",  50     );
        predavalnice[4] = new Tretja.Racunalnica("R3",  10,  10);
        predavalnice[5] = new Tretja.Avditorna(  "A1",  40     );

        Tretja.Stavba stavba = new Tretja.Stavba(predavalnice);

        System.out.println(stavba.casCiscenja());
    }
}
