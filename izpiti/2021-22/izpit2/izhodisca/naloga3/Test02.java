
import java.util.*;

public class Test02 {

    public static void main(String[] args) {
        Tretja.Predavalnica[] predavalnice = new Tretja.Predavalnica[2];

        predavalnice[0] = new Tretja.Garaza(   "G1", 100, 500);
        predavalnice[1] = new Tretja.Avditorna("A1",  50     );

        Tretja.Stavba stavba = new Tretja.Stavba(predavalnice);

        System.out.println(stavba.casCiscenja());
    }
}
