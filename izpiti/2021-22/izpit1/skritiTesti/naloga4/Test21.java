
import java.util.*;

public class Test21 {

    public static void main(String[] args) {
        List<Integer> seznam = List.of(
            41, 123, 826, 167, 449, 852, 311, 466, 820, 148, 921, 383, 604, 67, 813, 965, 861, 203, 437, 820, 382, 748, 93, 661, 53, 33, 355, 846, 213, 678, 707, 522, 114, 394, 938, 527, 14, 143, 801, 718, 764, 948, 819, 856, 902, 781, 834, 725, 601, 176, 148, 488, 111, 189, 311, 148, 593, 132
        );
        System.out.println(Cetrta.odsek(seznam.iterator(), 27, 57));
    }
}
