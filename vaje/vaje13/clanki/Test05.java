
import java.util.*;

public class Test05 {

    public static void main(String[] args) {
        Avtor[] avtorji = {
            new Avtor("Janez",   "Novak"),
            new Avtor("Brigita", "Pirc"),
            new Avtor("Karel",   "Medved"),
            new Avtor("Janez",   "Novak"),
            new Avtor("Mojca",   "Novak"),
            new Avtor("Eva",     "Medved"),
            new Avtor("Janez",   "Pirc"),
            new Avtor("Eva",     "Novak"),
            new Avtor("Ivan",    "Zajc"),
            new Avtor("Olga",    "Zajc"),
        };

        List<Clanek> clanki = List.of(
            new Clanek(
                List.of(avtorji[1], avtorji[3], avtorji[4]),
                "Vpliv vremena na nogomet",
                2015
            ),
            new Clanek(
                List.of(avtorji[0], avtorji[3]),
                "Vpliv nogometa na vreme",
                2017
            ),
            new Clanek(
                List.of(avtorji[7]),
                "Vpliv nogometa na cene zelenjave",
                2018
            ),
            new Clanek(
                List.of(avtorji[3], avtorji[5], avtorji[7], avtorji[9]),
                "Vpliv vremena na cene zelenjave",
                2015
            ),
            new Clanek(
                List.of(avtorji[4], avtorji[5], avtorji[9]),
                "Vpliv cene zelenjave na vreme",
                2016
            ),
            new Clanek(
                List.of(avtorji[0], avtorji[7]),
                "Vpliv vremena na rast delnic",
                2015
            ),
            new Clanek(
                List.of(avtorji[0], avtorji[7]),
                "Vpliv nogometa na rast delnic",
                2019
            ),
            new Clanek(
                List.of(avtorji[0], avtorji[7]),
                "Vpliv rasti delnic na vreme",
                2017
            ),
            new Clanek(
                List.of(avtorji[0], avtorji[7]),
                "Vpliv cene zelenjave na rast delnic",
                2018
            ),
            new Clanek(
                List.of(avtorji[1], avtorji[5], avtorji[9]),
                "Vpliv vremena na rast delnic",
                2016
            )
        );

        List<Avtor> aktivniAvtorji = new ArrayList<>(Glavni.vsiAvtorji(clanki));
        aktivniAvtorji.sort((a, b) -> a.toString().compareTo(b.toString()));
        System.out.println(aktivniAvtorji);
    }
}
