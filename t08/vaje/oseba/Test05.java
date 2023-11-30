
public class Test05 {

    public static void main(String[] args) {
        Oseba os1 = new Oseba("Janez", "Novak", 'M', 1953, null, null);
        Oseba os2 = new Oseba("Ana", "Novak", 'Z', 1955, null, null);
        Oseba os3 = new Oseba("Mojca", "Oblak", 'Z', 1953, null, null);

        izpisiStarejso(os1, os2);
        izpisiStarejso(os2, os1);
        izpisiStarejso(os1, os1);
        izpisiStarejso(os1, os3);
        izpisiStarejso(os2, os3);
    }

    private static void izpisiStarejso(Oseba a, Oseba b) {
        Oseba c = Oseba.starejsa(a, b);
        if (c == a) {
            System.out.println("prva");
        } else if (c == b) {
            System.out.println("druga");
        } else if (c == null) {
            System.out.println("nobena");
        } else {
            System.out.println("neznana");
        }
    }
}
