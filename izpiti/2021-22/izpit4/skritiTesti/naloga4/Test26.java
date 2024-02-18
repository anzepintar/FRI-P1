
import java.util.*;

public class Test26 {

    public static void main(String[] args) {
        Comparator<Character> primerjalnik = (a, b) -> b - a;

        Map<Character, Character> slovar = new HashMap<>();
        slovar.put('Z', 'z');
        slovar.put('x', 'x');
        slovar.put('n', 'D');
        slovar.put('H', 'N');
        slovar.put('j', 'u');
        slovar.put('M', 'L');
        slovar.put('d', 'a');
        slovar.put('R', 'I');
        slovar.put('o', 'k');
        slovar.put('O', 'M');
        slovar.put('L', '0');
        slovar.put('p', '8');
        slovar.put('0', 'c');
        slovar.put('P', 'd');
        slovar.put('Q', 't');
        slovar.put('w', 'g');
        slovar.put('E', 'f');
        slovar.put('G', 'Z');
        slovar.put('m', '7');
        slovar.put('K', 'e');
        slovar.put('9', 'h');
        slovar.put('J', 'V');
        slovar.put('8', 'E');
        slovar.put('f', 'B');
        slovar.put('u', 'p');
        slovar.put('V', '3');
        slovar.put('U', 'w');
        slovar.put('5', 'q');
        slovar.put('l', 'U');
        slovar.put('i', 's');
        slovar.put('B', 'X');
        slovar.put('e', 'W');
        slovar.put('g', 'F');
        slovar.put('S', 'r');
        slovar.put('A', 'Y');
        slovar.put('F', 'O');
        slovar.put('s', 'K');
        slovar.put('D', 'S');
        slovar.put('c', '9');
        slovar.put('Y', '5');
        slovar.put('t', 'm');
        slovar.put('h', '6');
        slovar.put('2', 'T');
        slovar.put('q', 'v');
        slovar.put('z', 'A');
        slovar.put('X', 'l');
        slovar.put('N', 'y');
        slovar.put('y', '4');
        slovar.put('r', 'Q');
        slovar.put('W', '1');

        Set<Character> mnozica = Cetrta.vecjiPrim(slovar, primerjalnik);

        List<Character> seznam = new ArrayList<>(mnozica);
        seznam.sort(null);
        System.out.println(seznam);
    }
}
