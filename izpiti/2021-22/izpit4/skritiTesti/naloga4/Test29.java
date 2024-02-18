
import java.util.*;

public class Test29 {

    public static void main(String[] args) {
        Comparator<String> primerjalnik = (a, b) -> a.length() - b.length();

        Map<String, String> slovar = new HashMap<>();
        slovar.put("985pvS", "0pObM0y2dcGl");
        slovar.put("N5u5d3zZsF", "u");
        slovar.put("3", "Hdcjy8vhS41UPg6KSXn");
        slovar.put("39JwZLircj", "AWawxruCOd");
        slovar.put("ujkg", "MOEP3");
        slovar.put("DdvjFVXLGgIndMEkG8X", "LQj1F");
        slovar.put("xTfeKgRILw4Y2g", "k");
        slovar.put("34KGN", "b8Yt4yQ");
        slovar.put("m5AvKw0xu", "jhLl18r9s");
        slovar.put("HuuZCSZc8rBLg4DyGk58", "znkq92fd7kkfcp");
        slovar.put("LxNAtjfE1m3NjeQhE", "rauOFaT8IhWJZ");
        slovar.put("shOGG0CPNSHogue", "7DHW");
        slovar.put("eFj0loM3Q", "n5TsG");
        slovar.put("rua", "dRcB7W");
        slovar.put("vxOkWqGuEgJ1HMZt", "qJNdM");
        slovar.put("CZHOx", "yZ");
        slovar.put("KLDJM340Q", "I7rQNH2ycr");
        slovar.put("duefK4zv1PEsWclQ8QR", "e");
        slovar.put("e80MB", "zQ5qcpa5YEbv");
        slovar.put("6zy54", "YwuoagTB");
        slovar.put("64mirKWuAnPi", "g0");
        slovar.put("8", "iUPqvWVMgG2St");
        slovar.put("o62F1B6", "Qdo7JVxt");
        slovar.put("YneuAopWVvo2TdA3B0aZ", "cU6HLPEaeSM9ornP");
        slovar.put("Se4NVZ", "Rwud");
        slovar.put("QYeb79Zb5X6zgn", "Xzlo");
        slovar.put("MxPAl2REi", "EIRTBmV9gbLKlp");
        slovar.put("aRg71Qr97", "4O");
        slovar.put("2", "S4W0ueK");
        slovar.put("fFXLIXcm14yJge8Ua", "9");
        slovar.put("9iDPc", "wWT");
        slovar.put("X", "Zjezj2wGSJ5C0BmKc");
        slovar.put("yF", "ObOQ4AU");
        slovar.put("MplLKuR1oYiTdTd", "UZWsQD4yM8s5yuKFzF");
        slovar.put("tZyJMNK1n", "d8Vp46bNkiWfgb");
        slovar.put("HBOLZe", "l68TZ");
        slovar.put("hUXdRM7Muys", "yyxl");
        slovar.put("n", "eZtu5ES2qpY42");
        slovar.put("kd5", "e5WYHSUrR7Xtnf");
        slovar.put("4WCaGogvuMTvg", "r8yCIJuB1tRCMblB6N9");
        slovar.put("l9o", "9XkEtWGrsPgAm3Rj9k");
        slovar.put("0pEUv5y", "EDm");
        slovar.put("OyMO5hB828AP7bRj", "dO7svqc072EP");
        slovar.put("Efoc3O", "d4Zh6MfHsmHIGrT");
        slovar.put("AD", "r2fhS5kNdGh");
        slovar.put("vIKf74JejaarQkp", "f3yocoOdms");
        slovar.put("jdrkFPqw4PV2zQdumKY", "5tm60Jk");
        slovar.put("FBemK9ybjvCR3ngjuk1", "3CBUjzukShLl3pwL6d");
        slovar.put("GJywg2cUa9j1AK7ow", "ogsbEcTixJPLkTE");
        slovar.put("MDFSab3", "LYSA7A1ioFNP");

        Set<String> mnozica = Cetrta.vecjiPrim(slovar, primerjalnik);

        List<String> seznam = new ArrayList<>(mnozica);
        seznam.sort(null);
        System.out.println(seznam);
    }
}
