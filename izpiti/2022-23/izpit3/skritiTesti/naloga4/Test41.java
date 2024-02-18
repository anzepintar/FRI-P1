
import java.util.*;

public class Test41 {

    public static void main(String[] args) {
        List<String> seznam = new ArrayList<>(List.of("g", "JAC_", "7KYKh", "vdm", "8Jxg", "k", "9", "X6l", "Z", "VR", "JDR4", "rr", "h", "P22", "EKo", "OvOF", "VlwX", "o", "h", "TGfYf", "EVPw", "K", "H", "C5", "5PUzv", "SbT", "CI", "hIF", "z", "wKXR", "lZ", "w6", "wRBq1", "Ne", "wH", "p2YP_", "aMi3y", "4M3", "0", "kuiR", "d6rio", "vmYDK", "GMkj", "2"));
        Set<String> mnozica = new TreeSet<>(List.of("Az", "N8", "U4drP", "DgHz", "9g2p", "s3", "zn", "t", "3Cd", "Pb", "3K", "h", "DGY2", "2", "N", "3", "5p", "qW0TN", "h", "0ilX", "Vx", "D8_h3", "27"));

        Cetrta.Miks<String> miks = new Cetrta.Miks<>(seznam, mnozica);
        List<String> skupaj = new ArrayList<>();
        for (String element: miks) {
            skupaj.add(element);
        }
        System.out.println(skupaj);
    }
}
