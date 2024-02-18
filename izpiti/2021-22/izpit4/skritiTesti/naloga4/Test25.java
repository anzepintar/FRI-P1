
import java.util.*;

public class Test25 {

    public static void main(String[] args) {
        Comparator<Character> primerjalnik = (a, b) -> a - b;

        Map<Character, Character> slovar = new HashMap<>();
        slovar.put('5', 's');
        slovar.put('V', '9');
        slovar.put('f', 'W');
        slovar.put('4', 'M');
        slovar.put('n', 't');
        slovar.put('j', 'Z');
        slovar.put('W', 'c');
        slovar.put('I', 'x');
        slovar.put('R', 'L');
        slovar.put('z', 'd');
        slovar.put('F', 'X');
        slovar.put('N', 'C');
        slovar.put('s', '5');
        slovar.put('l', 'P');
        slovar.put('i', 'e');
        slovar.put('A', 'K');
        slovar.put('1', 'z');
        slovar.put('u', 'p');
        slovar.put('E', 'm');
        slovar.put('d', 'Q');
        slovar.put('g', 'N');
        slovar.put('C', 'D');
        slovar.put('6', 'q');
        slovar.put('0', 'f');
        slovar.put('Z', 'l');
        slovar.put('8', 'U');
        slovar.put('H', 'Y');
        slovar.put('m', 'b');
        slovar.put('K', 'B');
        slovar.put('b', 'E');
        slovar.put('e', 'I');
        slovar.put('3', '3');
        slovar.put('O', 'G');
        slovar.put('P', 'y');
        slovar.put('2', 'u');
        slovar.put('h', 'a');
        slovar.put('9', 'S');
        slovar.put('v', 'o');
        slovar.put('q', 'n');
        slovar.put('Y', 'V');
        slovar.put('y', '1');
        slovar.put('c', 'r');
        slovar.put('p', 'j');
        slovar.put('S', 'F');
        slovar.put('k', 'A');
        slovar.put('U', 'T');
        slovar.put('X', 'i');
        slovar.put('B', '0');
        slovar.put('G', 'w');
        slovar.put('t', 'H');

        Set<Character> mnozica = Cetrta.vecjiPrim(slovar, primerjalnik);

        List<Character> seznam = new ArrayList<>(mnozica);
        seznam.sort(null);
        System.out.println(seznam);
    }
}
