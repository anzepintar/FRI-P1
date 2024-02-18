
import java.util.*;

public class Test17 {

    public static void main(String[] args) {
        Comparator<Character> primerjalnik = (a, b) -> a - b;

        Map<Character, Character> slovar = new HashMap<>();
        slovar.put('a', 'H');
        slovar.put('c', 'G');
        slovar.put('z', '1');
        slovar.put('W', 'M');
        slovar.put('F', 'A');
        slovar.put('v', 'D');
        slovar.put('E', '0');
        slovar.put('V', 'n');
        slovar.put('A', '9');
        slovar.put('f', 'K');
        slovar.put('w', '5');
        slovar.put('B', 'v');
        slovar.put('s', 'a');
        slovar.put('Q', 'd');
        slovar.put('T', 'F');
        slovar.put('u', '4');
        slovar.put('g', 'm');
        slovar.put('r', 'O');
        slovar.put('M', 'o');
        slovar.put('P', 'J');
        slovar.put('J', '8');
        slovar.put('D', 'j');
        slovar.put('H', 't');
        slovar.put('2', 'Q');
        slovar.put('i', 'X');
        slovar.put('d', 'y');
        slovar.put('e', 'R');
        slovar.put('5', 'E');
        slovar.put('t', 'U');
        slovar.put('x', 's');
        slovar.put('m', 'S');
        slovar.put('Z', 'x');
        slovar.put('I', 'Y');
        slovar.put('n', 'k');
        slovar.put('1', 'u');
        slovar.put('3', 'L');
        slovar.put('G', '7');
        slovar.put('b', 'I');
        slovar.put('q', 'P');
        slovar.put('N', '3');
        slovar.put('C', 'Z');
        slovar.put('0', 'B');
        slovar.put('o', 'V');
        slovar.put('U', 'g');
        slovar.put('Y', 'h');
        slovar.put('O', 'T');
        slovar.put('8', 'N');
        slovar.put('7', 'C');
        slovar.put('K', 'z');
        slovar.put('6', 'q');

        Set<Character> mnozica = Cetrta.vecjiPrim(slovar, primerjalnik);

        List<Character> seznam = new ArrayList<>(mnozica);
        seznam.sort(null);
        System.out.println(seznam);
    }
}
