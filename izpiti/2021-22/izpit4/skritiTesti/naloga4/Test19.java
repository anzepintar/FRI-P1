
import java.util.*;

public class Test19 {

    public static void main(String[] args) {
        Comparator<String> primerjalnik = (a, b) -> a.compareTo(b);

        Map<String, String> slovar = new HashMap<>();
        slovar.put("pNQf", "ZOYt");
        slovar.put("wqsUWu8QMnrhDt5MZle", "2jfGJygM1QJzHYkQ72lA");
        slovar.put("93AW5SHWiDYX", "m7wu9DKvJkTB73fw1Mx");
        slovar.put("Y", "m");
        slovar.put("smlkZ5n", "zbVlU");
        slovar.put("baX7V", "gTjZVKegW5UmzMU5v");
        slovar.put("jd", "w");
        slovar.put("jTsqUmoEnO", "YhbqIY3y3");
        slovar.put("6WaOFg8CIdGBh", "lwxZWf31xbGak");
        slovar.put("K118SwAKl", "3r25NauKYn9RccGSy");
        slovar.put("s1f", "XbTVv0H");
        slovar.put("TeSd", "sB6JkYU1EZ");
        slovar.put("6wA1BAmnF81cPgNCG", "XV4vO5tfOAFS7rx");
        slovar.put("D6cPs", "FaHnykBaC");
        slovar.put("jN5a8", "qDU");
        slovar.put("p", "vN6vU5Si4pn7m");
        slovar.put("9VYEMYvi6ixOi0P4Um", "LQ49YJVfMtvPqi2");
        slovar.put("AXoaeFVk", "0jNDqrYZAnNIAJkVHY");
        slovar.put("d5", "0ZSdDqXoGllkuS2P");
        slovar.put("5", "lhbchLTO3H");
        slovar.put("8t", "p6KrkbPbryzN3UayP");
        slovar.put("qF7sJqKA1", "djhiVbjqdry6");
        slovar.put("n5XOoh4hZgc9t", "QGQw3NICeYX");
        slovar.put("hF5ztejHDy4y", "CjgcBqw");
        slovar.put("tBxIyP", "xs");
        slovar.put("VgoCSqTndgYEkM0", "D53tSdVsfe");
        slovar.put("YaJiadsxt", "4IEo3JYyNlTkIl");
        slovar.put("H02", "Q6mTlEpASDK");
        slovar.put("mUvP0rStN5mWx9xzV", "M");
        slovar.put("BFREPckWvI7CFKt", "auhgZxEjbNB7Lad");
        slovar.put("06ZGC", "GJGv2phI13");
        slovar.put("kmR", "JMaBhmtKUnWWcZHaxA");
        slovar.put("1pokOqolz0wHXggkdB", "gRDho");
        slovar.put("4L0i", "d2yPMbcLeMVc8Gm");
        slovar.put("4g1R5ScKLM3k5yKPuEnM", "qxj1wNsTAKk9K6");
        slovar.put("E", "2DT");
        slovar.put("uwtD6kD2u3Orw6sWVLX", "1XVzaM");
        slovar.put("17B94EDNR517r", "jJqPciDXePI");
        slovar.put("RKDAN0aDR8XLAQN5hHL", "Ahuc19l1ojod");
        slovar.put("HBg7HU8AN8M", "DjmPX");
        slovar.put("o7YDEIdiEDb9Zi7BmB9", "9");
        slovar.put("ccyUnttqwAuZsbn8HSD", "UqU");
        slovar.put("HnyAdpgjpH2", "1oOESg");
        slovar.put("fcDZUWA4IdcMh", "BpsaBWKe1vIRQat0AL");
        slovar.put("N7k", "c9xZhqG1j7yU");
        slovar.put("0GUpoPCUes", "baxccuCf");
        slovar.put("pihh4wfPxljxG0tQnz", "9oQpq3EsRf");
        slovar.put("Cab2UqVDm", "wuwH53LZyAg45S6wxC1v");
        slovar.put("y2MPnLhIgxi4F", "blFOvxqtTKhmlwIi");
        slovar.put("iDleRp2sACCcdlkAlY", "JYVXa");

        Set<String> mnozica = Cetrta.vecjiPrim(slovar, primerjalnik);

        List<String> seznam = new ArrayList<>(mnozica);
        seznam.sort(null);
        System.out.println(seznam);
    }
}
