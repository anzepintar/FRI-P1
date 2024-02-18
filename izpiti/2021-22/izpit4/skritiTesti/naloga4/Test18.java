
import java.util.*;

public class Test18 {

    public static void main(String[] args) {
        Comparator<Character> primerjalnik = (a, b) -> b - a;

        Map<Character, Character> slovar = new HashMap<>();
        slovar.put('j', 'H');
        slovar.put('K', 'Q');
        slovar.put('3', 'z');
        slovar.put('r', 'J');
        slovar.put('8', 'B');
        slovar.put('x', '4');
        slovar.put('b', '3');
        slovar.put('t', 'A');
        slovar.put('A', 'q');
        slovar.put('o', 'd');
        slovar.put('W', '0');
        slovar.put('C', 'x');
        slovar.put('B', 'p');
        slovar.put('m', 'I');
        slovar.put('h', 'L');
        slovar.put('T', 'u');
        slovar.put('Q', 'P');
        slovar.put('v', 'K');
        slovar.put('k', 'g');
        slovar.put('4', 'F');
        slovar.put('L', 'i');
        slovar.put('S', 'E');
        slovar.put('M', 'w');
        slovar.put('e', 'o');
        slovar.put('R', '9');
        slovar.put('w', 'a');
        slovar.put('6', 'U');
        slovar.put('g', 'G');
        slovar.put('J', '6');
        slovar.put('E', 'j');
        slovar.put('l', '1');
        slovar.put('p', 'b');
        slovar.put('D', 'W');
        slovar.put('P', 'v');
        slovar.put('0', '5');
        slovar.put('U', 'e');
        slovar.put('i', 'y');
        slovar.put('9', '8');
        slovar.put('O', 'c');
        slovar.put('u', 't');
        slovar.put('y', 'R');
        slovar.put('F', '7');
        slovar.put('Y', 'S');
        slovar.put('d', 'N');
        slovar.put('n', 'M');
        slovar.put('2', 'V');
        slovar.put('c', 'h');
        slovar.put('H', 'l');
        slovar.put('G', 'r');
        slovar.put('a', 'T');

        Set<Character> mnozica = Cetrta.vecjiPrim(slovar, primerjalnik);

        List<Character> seznam = new ArrayList<>(mnozica);
        seznam.sort(null);
        System.out.println(seznam);
    }
}
