
import java.util.*;

public class Test02 {

    public static void main(String[] args) {

        Map<String, Set<String>> sinonimi = new HashMap<>();
        sinonimi.put("jqlzz", Set.of("jqlzz", "ayyaw", "aqxn", "lmy", "faa", "gdwia", "t"));
        sinonimi.put("ayyaw", Set.of("jqlzz", "ayyaw", "aqxn", "lmy", "faa", "gdwia", "t"));
        sinonimi.put("aqxn", Set.of("jqlzz", "ayyaw", "aqxn", "lmy", "faa", "gdwia", "t"));
        sinonimi.put("lmy", Set.of("jqlzz", "ayyaw", "aqxn", "lmy", "faa", "gdwia", "t"));
        sinonimi.put("faa", Set.of("jqlzz", "ayyaw", "aqxn", "lmy", "faa", "gdwia", "t"));
        sinonimi.put("gdwia", Set.of("jqlzz", "ayyaw", "aqxn", "lmy", "faa", "gdwia", "t"));
        sinonimi.put("t", Set.of("jqlzz", "ayyaw", "aqxn", "lmy", "faa", "gdwia", "t"));
        sinonimi.put("gzae", Set.of("gzae", "clccp"));
        sinonimi.put("clccp", Set.of("gzae", "clccp"));
        sinonimi.put("jjg", Set.of("jjg", "zz", "biuh", "rms", "i"));
        sinonimi.put("zz", Set.of("jjg", "zz", "biuh", "rms", "i"));
        sinonimi.put("biuh", Set.of("jjg", "zz", "biuh", "rms", "i"));
        sinonimi.put("rms", Set.of("jjg", "zz", "biuh", "rms", "i"));
        sinonimi.put("i", Set.of("jjg", "zz", "biuh", "rms", "i"));
        sinonimi.put("yxkib", Set.of("yxkib", "jqeh", "qy", "zmv", "dsp", "yw"));
        sinonimi.put("jqeh", Set.of("yxkib", "jqeh", "qy", "zmv", "dsp", "yw"));
        sinonimi.put("qy", Set.of("yxkib", "jqeh", "qy", "zmv", "dsp", "yw"));
        sinonimi.put("zmv", Set.of("yxkib", "jqeh", "qy", "zmv", "dsp", "yw"));
        sinonimi.put("dsp", Set.of("yxkib", "jqeh", "qy", "zmv", "dsp", "yw"));
        sinonimi.put("yw", Set.of("yxkib", "jqeh", "qy", "zmv", "dsp", "yw"));
        sinonimi.put("dyvkz", Set.of("dyvkz", "bo", "xhte"));
        sinonimi.put("bo", Set.of("dyvkz", "bo", "xhte"));
        sinonimi.put("xhte", Set.of("dyvkz", "bo", "xhte"));
        sinonimi.put("dxic", Set.of("dxic"));
        sinonimi.put("fhva", Set.of("fhva", "q"));
        sinonimi.put("q", Set.of("fhva", "q"));
        sinonimi.put("rwolu", Set.of("rwolu", "uokdv"));
        sinonimi.put("uokdv", Set.of("rwolu", "uokdv"));
        sinonimi.put("ak", Set.of("ak", "idkc", "ahkzt", "mhgp", "ef", "pz"));
        sinonimi.put("idkc", Set.of("ak", "idkc", "ahkzt", "mhgp", "ef", "pz"));
        sinonimi.put("ahkzt", Set.of("ak", "idkc", "ahkzt", "mhgp", "ef", "pz"));
        sinonimi.put("mhgp", Set.of("ak", "idkc", "ahkzt", "mhgp", "ef", "pz"));
        sinonimi.put("ef", Set.of("ak", "idkc", "ahkzt", "mhgp", "ef", "pz"));
        sinonimi.put("pz", Set.of("ak", "idkc", "ahkzt", "mhgp", "ef", "pz"));
        sinonimi.put("qz", Set.of("qz", "vkvx", "bbf", "fa", "gwhg", "gmu"));
        sinonimi.put("vkvx", Set.of("qz", "vkvx", "bbf", "fa", "gwhg", "gmu"));
        sinonimi.put("bbf", Set.of("qz", "vkvx", "bbf", "fa", "gwhg", "gmu"));
        sinonimi.put("fa", Set.of("qz", "vkvx", "bbf", "fa", "gwhg", "gmu"));
        sinonimi.put("gwhg", Set.of("qz", "vkvx", "bbf", "fa", "gwhg", "gmu"));
        sinonimi.put("gmu", Set.of("qz", "vkvx", "bbf", "fa", "gwhg", "gmu"));
        sinonimi.put("rgbxy", Set.of("rgbxy"));
        sinonimi.put("hwyz", Set.of("hwyz"));
        sinonimi.put("axbyd", Set.of("axbyd"));
        sinonimi.put("dbq", Set.of("dbq", "hmur"));
        sinonimi.put("hmur", Set.of("dbq", "hmur"));
        sinonimi.put("uwch", Set.of("uwch", "uuiw", "b"));
        sinonimi.put("uuiw", Set.of("uwch", "uuiw", "b"));
        sinonimi.put("b", Set.of("uwch", "uuiw", "b"));
        sinonimi.put("loi", Set.of("loi", "yd"));
        sinonimi.put("yd", Set.of("loi", "yd"));
        sinonimi.put("auavl", Set.of("auavl"));
        sinonimi.put("wi", Set.of("wi", "hwrh"));
        sinonimi.put("hwrh", Set.of("wi", "hwrh"));
        sinonimi.put("xiet", Set.of("xiet"));

        List<String> besede = new ArrayList<>(Cetrta.najMnozica(sinonimi));
        besede.sort(null);
        System.out.println(besede);
    }
}
