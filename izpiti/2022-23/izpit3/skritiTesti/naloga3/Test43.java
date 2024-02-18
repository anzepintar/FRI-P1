
import java.lang.reflect.*;
import java.util.*;

public class Test43 {

    public static void main(String[] args) {
        atributi(Tretja.Pridevnik.class);
    }

    private static void atributi(Class cl) {
        List<Field> atributi = new ArrayList<>(Arrays.asList(cl.getDeclaredFields()));
        atributi.sort((a1, a2) -> a1.getName().compareTo(a2.getName()));
        System.out.printf("Atributi, ki jih uvede razred %s: %s%n",
                cl.getCanonicalName(), atributi);
    }
}
