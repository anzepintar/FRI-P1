
import java.util.*;

public class Test17 {

    public static void main(String[] args) {

        Map<String, Set<String>> sinonimi = new HashMap<>();
        sinonimi.put("xd", Set.of("xd"));
        sinonimi.put("lqmc", Set.of("lqmc", "cqez", "nhfa", "fijx"));
        sinonimi.put("cqez", Set.of("lqmc", "cqez", "nhfa", "fijx"));
        sinonimi.put("nhfa", Set.of("lqmc", "cqez", "nhfa", "fijx"));
        sinonimi.put("fijx", Set.of("lqmc", "cqez", "nhfa", "fijx"));
        sinonimi.put("qbbjq", Set.of("qbbjq", "pur", "sgt", "nxqs", "occrz"));
        sinonimi.put("pur", Set.of("qbbjq", "pur", "sgt", "nxqs", "occrz"));
        sinonimi.put("sgt", Set.of("qbbjq", "pur", "sgt", "nxqs", "occrz"));
        sinonimi.put("nxqs", Set.of("qbbjq", "pur", "sgt", "nxqs", "occrz"));
        sinonimi.put("occrz", Set.of("qbbjq", "pur", "sgt", "nxqs", "occrz"));
        sinonimi.put("sufwa", Set.of("sufwa", "dzsp", "z", "vrw", "s", "vqsl"));
        sinonimi.put("dzsp", Set.of("sufwa", "dzsp", "z", "vrw", "s", "vqsl"));
        sinonimi.put("z", Set.of("sufwa", "dzsp", "z", "vrw", "s", "vqsl"));
        sinonimi.put("vrw", Set.of("sufwa", "dzsp", "z", "vrw", "s", "vqsl"));
        sinonimi.put("s", Set.of("sufwa", "dzsp", "z", "vrw", "s", "vqsl"));
        sinonimi.put("vqsl", Set.of("sufwa", "dzsp", "z", "vrw", "s", "vqsl"));
        sinonimi.put("ucoz", Set.of("ucoz", "div", "rgvsf", "gtrq"));
        sinonimi.put("div", Set.of("ucoz", "div", "rgvsf", "gtrq"));
        sinonimi.put("rgvsf", Set.of("ucoz", "div", "rgvsf", "gtrq"));
        sinonimi.put("gtrq", Set.of("ucoz", "div", "rgvsf", "gtrq"));
        sinonimi.put("dzzpf", Set.of("dzzpf", "t", "qn"));
        sinonimi.put("t", Set.of("dzzpf", "t", "qn"));
        sinonimi.put("qn", Set.of("dzzpf", "t", "qn"));
        sinonimi.put("zgvpi", Set.of("zgvpi", "rbkw"));
        sinonimi.put("rbkw", Set.of("zgvpi", "rbkw"));
        sinonimi.put("nis", Set.of("nis"));
        sinonimi.put("fn", Set.of("fn", "oz", "woepb", "carol", "tzh"));
        sinonimi.put("oz", Set.of("fn", "oz", "woepb", "carol", "tzh"));
        sinonimi.put("woepb", Set.of("fn", "oz", "woepb", "carol", "tzh"));
        sinonimi.put("carol", Set.of("fn", "oz", "woepb", "carol", "tzh"));
        sinonimi.put("tzh", Set.of("fn", "oz", "woepb", "carol", "tzh"));
        sinonimi.put("olwr", Set.of("olwr", "evfgr"));
        sinonimi.put("evfgr", Set.of("olwr", "evfgr"));

        List<String> besede = new ArrayList<>(Cetrta.najMnozica(sinonimi));
        besede.sort(null);
        System.out.println(besede);
    }
}
