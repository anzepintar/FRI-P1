
import java.util.*;

public class Test33 {

    public static void main(String[] args) {
        Comparator<Character> primerjalnik = (a, b) -> a - b;

        Map<Character, Character> slovar = new HashMap<>();
        slovar.put('a', 'm');
        slovar.put('1', 'H');
        slovar.put('h', 'k');
        slovar.put('m', 'R');
        slovar.put('A', 'g');
        slovar.put('Y', 's');
        slovar.put('Z', 'G');
        slovar.put('k', 'r');
        slovar.put('L', '2');
        slovar.put('r', 'n');
        slovar.put('6', 'u');
        slovar.put('E', 'd');
        slovar.put('5', '5');
        slovar.put('I', 'q');
        slovar.put('G', 'T');
        slovar.put('3', 'b');
        slovar.put('u', 'C');
        slovar.put('N', 'j');
        slovar.put('e', '8');
        slovar.put('U', '6');
        slovar.put('S', 'h');
        slovar.put('l', 'I');
        slovar.put('4', 't');
        slovar.put('p', 'i');
        slovar.put('8', 'w');
        slovar.put('C', 'x');
        slovar.put('Q', 'M');
        slovar.put('i', 'e');
        slovar.put('V', 'o');
        slovar.put('H', 'S');
        slovar.put('f', 'a');
        slovar.put('J', '3');
        slovar.put('0', 'K');
        slovar.put('t', 'Z');
        slovar.put('y', 'J');
        slovar.put('w', 'E');
        slovar.put('O', 'L');
        slovar.put('B', 'p');
        slovar.put('M', 'z');
        slovar.put('s', 'W');
        slovar.put('7', '7');
        slovar.put('D', '1');
        slovar.put('n', 'Q');
        slovar.put('j', 'Y');
        slovar.put('g', '0');
        slovar.put('K', 'y');
        slovar.put('z', 'F');
        slovar.put('F', '9');
        slovar.put('W', 'D');
        slovar.put('b', 'V');

        Set<Character> mnozica = Cetrta.vecjiPrim(slovar, primerjalnik);

        List<Character> seznam = new ArrayList<>(mnozica);
        seznam.sort(null);
        System.out.println(seznam);
    }
}
