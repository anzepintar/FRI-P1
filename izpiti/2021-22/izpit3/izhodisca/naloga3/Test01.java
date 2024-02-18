
import java.util.*;

public class Test01 {

    public static void main(String[] args) {
        Tretja.Oddajnik krvavec = new Tretja.Oddajnik();
        Tretja.Oddajnik nanos = new Tretja.Oddajnik();
        krvavec.oddaj('a');
        Tretja.Sprejemnik ana = new Tretja.Sprejemnik(krvavec);
        krvavec.oddaj('b');
        Tretja.Sprejemnik bojan = new Tretja.Sprejemnik(krvavec);
        Tretja.Sprejemnik cvetka = new Tretja.Sprejemnik(nanos);
        nanos.oddaj('c');
        krvavec.oddaj('d');
        System.out.println(ana.odZadnjic());
        System.out.println(cvetka.odZadnjic());
        krvavec.oddaj('e');
        System.out.println(ana.odZadnjic());
        System.out.println(bojan.odZadnjic());
        System.out.println(bojan.odZadnjic());
        System.out.println(ana.koliko());
        System.out.println(bojan.koliko());
    }
}
