
public class Test01 {

    public static void main(String[] args) {
        Oseba os1 = new Oseba("Janez", "Novak", 'M', 1953, null, null);
        Oseba os2 = new Oseba("Ana", "Novak", 'Z', 1955, null, null);

        System.out.println(os1.vrniIme());
        System.out.println(os2.vrniIme());
    }
}
