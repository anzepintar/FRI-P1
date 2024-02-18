
import java.util.*;

public class Test11 {

    public static void main(String[] args) {

        Map<String, Set<String>> sinonimi = new HashMap<>();
        sinonimi.put("oulxy", Set.of("oulxy", "wrl", "gp", "qxqhd"));
        sinonimi.put("wrl", Set.of("oulxy", "wrl", "gp", "qxqhd"));
        sinonimi.put("gp", Set.of("oulxy", "wrl", "gp", "qxqhd"));
        sinonimi.put("qxqhd", Set.of("oulxy", "wrl", "gp", "qxqhd"));
        sinonimi.put("khxw", Set.of("khxw", "gnc"));
        sinonimi.put("gnc", Set.of("khxw", "gnc"));
        sinonimi.put("wr", Set.of("wr", "qqc", "egg", "zvci"));
        sinonimi.put("qqc", Set.of("wr", "qqc", "egg", "zvci"));
        sinonimi.put("egg", Set.of("wr", "qqc", "egg", "zvci"));
        sinonimi.put("zvci", Set.of("wr", "qqc", "egg", "zvci"));
        sinonimi.put("z", Set.of("z", "qcdr", "jjpna", "pwp"));
        sinonimi.put("qcdr", Set.of("z", "qcdr", "jjpna", "pwp"));
        sinonimi.put("jjpna", Set.of("z", "qcdr", "jjpna", "pwp"));
        sinonimi.put("pwp", Set.of("z", "qcdr", "jjpna", "pwp"));
        sinonimi.put("sbyxv", Set.of("sbyxv", "dqmx"));
        sinonimi.put("dqmx", Set.of("sbyxv", "dqmx"));
        sinonimi.put("j", Set.of("j", "em"));
        sinonimi.put("em", Set.of("j", "em"));
        sinonimi.put("ei", Set.of("ei", "vyijy", "pdc", "doc", "ew"));
        sinonimi.put("vyijy", Set.of("ei", "vyijy", "pdc", "doc", "ew"));
        sinonimi.put("pdc", Set.of("ei", "vyijy", "pdc", "doc", "ew"));
        sinonimi.put("doc", Set.of("ei", "vyijy", "pdc", "doc", "ew"));
        sinonimi.put("ew", Set.of("ei", "vyijy", "pdc", "doc", "ew"));
        sinonimi.put("lamag", Set.of("lamag", "bi", "vlv", "wbb"));
        sinonimi.put("bi", Set.of("lamag", "bi", "vlv", "wbb"));
        sinonimi.put("vlv", Set.of("lamag", "bi", "vlv", "wbb"));
        sinonimi.put("wbb", Set.of("lamag", "bi", "vlv", "wbb"));
        sinonimi.put("jntx", Set.of("jntx", "buai", "zsnmt", "wh"));
        sinonimi.put("buai", Set.of("jntx", "buai", "zsnmt", "wh"));
        sinonimi.put("zsnmt", Set.of("jntx", "buai", "zsnmt", "wh"));
        sinonimi.put("wh", Set.of("jntx", "buai", "zsnmt", "wh"));
        sinonimi.put("sydj", Set.of("sydj", "dv", "ldz", "gmsne", "twyut"));
        sinonimi.put("dv", Set.of("sydj", "dv", "ldz", "gmsne", "twyut"));
        sinonimi.put("ldz", Set.of("sydj", "dv", "ldz", "gmsne", "twyut"));
        sinonimi.put("gmsne", Set.of("sydj", "dv", "ldz", "gmsne", "twyut"));
        sinonimi.put("twyut", Set.of("sydj", "dv", "ldz", "gmsne", "twyut"));
        sinonimi.put("mhaj", Set.of("mhaj"));
        sinonimi.put("mjbdi", Set.of("mjbdi", "tczxp", "kmna", "fqxq"));
        sinonimi.put("tczxp", Set.of("mjbdi", "tczxp", "kmna", "fqxq"));
        sinonimi.put("kmna", Set.of("mjbdi", "tczxp", "kmna", "fqxq"));
        sinonimi.put("fqxq", Set.of("mjbdi", "tczxp", "kmna", "fqxq"));
        sinonimi.put("qua", Set.of("qua", "jfgyz", "winr", "dzk", "sx"));
        sinonimi.put("jfgyz", Set.of("qua", "jfgyz", "winr", "dzk", "sx"));
        sinonimi.put("winr", Set.of("qua", "jfgyz", "winr", "dzk", "sx"));
        sinonimi.put("dzk", Set.of("qua", "jfgyz", "winr", "dzk", "sx"));
        sinonimi.put("sx", Set.of("qua", "jfgyz", "winr", "dzk", "sx"));
        sinonimi.put("yze", Set.of("yze", "mrois", "pls", "pik", "wrbhd", "hlf"));
        sinonimi.put("mrois", Set.of("yze", "mrois", "pls", "pik", "wrbhd", "hlf"));
        sinonimi.put("pls", Set.of("yze", "mrois", "pls", "pik", "wrbhd", "hlf"));
        sinonimi.put("pik", Set.of("yze", "mrois", "pls", "pik", "wrbhd", "hlf"));
        sinonimi.put("wrbhd", Set.of("yze", "mrois", "pls", "pik", "wrbhd", "hlf"));
        sinonimi.put("hlf", Set.of("yze", "mrois", "pls", "pik", "wrbhd", "hlf"));

        List<String> besede = new ArrayList<>(Cetrta.najMnozica(sinonimi));
        besede.sort(null);
        System.out.println(besede);
    }
}
