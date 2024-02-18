
import java.lang.reflect.*;
import java.util.*;

public class Test35 {

    public static void main(String[] args) {
        nadrazred(Tretja.Samostalnik.class);
    }

    private static void nadrazred(Class cl) {
        System.out.printf("Nadrazred razreda %s: %s%n",
                cl.getCanonicalName(), cl.getSuperclass().getCanonicalName());
    }
}
