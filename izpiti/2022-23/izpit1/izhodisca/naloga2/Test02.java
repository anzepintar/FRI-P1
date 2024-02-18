
import java.util.*;

public class Test02 {

    public static void main(String[] args) {
        char[][] besede1 = {
            {'a'},
            {'b'},
            {'a'},
            {'b'},
        };

        char[][] polozaji1 = {
            {'3', '5', 'v'},
            {'3', '6', 'v'},
            {'3', '5', 'n'},
            {'3', '6', 'n'},
        };

        System.out.println(Druga.krizankaOK(besede1, polozaji1));

        char[][] besede2 = {
            {'a'},
            {'b'},
            {'a'},
            {'c'},
        };

        char[][] polozaji2 = {
            {'3', '5', 'v'},
            {'3', '6', 'v'},
            {'3', '5', 'n'},
            {'3', '6', 'n'},
        };

        System.out.println(Druga.krizankaOK(besede2, polozaji2));
    }
}
