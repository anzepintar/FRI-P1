
public class Test08 {

    public static void main(String[] args) {

        Tretja.Igrisce igrisce01 = new Tretja.Igrisce(new Tretja.Igralo[]{
            new Tretja.Gugalnica(691, 652),
            new Tretja.Tobogan(-652, 755),
            new Tretja.Tobogan(134, 693),
            new Tretja.Tobogan(307, 722),
            new Tretja.Gugalnica(409, 147),
            new Tretja.Plezalo(264, -690),
            new Tretja.Vzmetnik(-568, -946),
            new Tretja.Vzmetnik(-835, -610),
        });
        System.out.println(igrisce01.najTip());

        Tretja.Igrisce igrisce02 = new Tretja.Igrisce(new Tretja.Igralo[]{
            new Tretja.Vzmetnik(-729, 140),
            new Tretja.Gugalnica(561, -206),
            new Tretja.Tobogan(472, -778),
            new Tretja.Tobogan(900, -94),
            new Tretja.Tobogan(877, 837),
            new Tretja.Tobogan(-480, -795),
            new Tretja.Vzmetnik(-721, 615),
            new Tretja.Gugalnica(738, 23),
        });
        System.out.println(igrisce02.najTip());

        Tretja.Igrisce igrisce03 = new Tretja.Igrisce(new Tretja.Igralo[]{
            new Tretja.Plezalo(679, -744),
            new Tretja.Vzmetnik(702, 428),
            new Tretja.Gugalnica(-281, -262),
            new Tretja.Gugalnica(491, 377),
            new Tretja.Vzmetnik(161, -53),
            new Tretja.Vzmetnik(-229, -69),
            new Tretja.Plezalo(-264, 898),
        });
        System.out.println(igrisce03.najTip());

        Tretja.Igrisce igrisce04 = new Tretja.Igrisce(new Tretja.Igralo[]{
            new Tretja.Gugalnica(597, -18),
            new Tretja.Gugalnica(-801, -792),
            new Tretja.Tobogan(-220, -722),
        });
        System.out.println(igrisce04.najTip());

        Tretja.Igrisce igrisce05 = new Tretja.Igrisce(new Tretja.Igralo[]{
            new Tretja.Tobogan(-822, -816),
            new Tretja.Vzmetnik(379, 388),
            new Tretja.Vzmetnik(730, -959),
            new Tretja.Plezalo(502, 430),
        });
        System.out.println(igrisce05.najTip());

        Tretja.Igrisce igrisce06 = new Tretja.Igrisce(new Tretja.Igralo[]{
            new Tretja.Tobogan(-633, -326),
            new Tretja.Vzmetnik(-66, 455),
            new Tretja.Gugalnica(439, -712),
            new Tretja.Vzmetnik(-733, 260),
            new Tretja.Tobogan(544, 146),
            new Tretja.Vzmetnik(702, -979),
        });
        System.out.println(igrisce06.najTip());

        Tretja.Igrisce igrisce07 = new Tretja.Igrisce(new Tretja.Igralo[]{
            new Tretja.Tobogan(826, -827),
            new Tretja.Plezalo(270, 307),
            new Tretja.Tobogan(-673, -97),
            new Tretja.Tobogan(-703, -257),
            new Tretja.Gugalnica(242, 109),
            new Tretja.Tobogan(488, -564),
            new Tretja.Plezalo(370, 626),
            new Tretja.Gugalnica(295, -837),
        });
        System.out.println(igrisce07.najTip());

        Tretja.Igrisce igrisce08 = new Tretja.Igrisce(new Tretja.Igralo[]{
            new Tretja.Vzmetnik(44, -126),
            new Tretja.Gugalnica(-482, -946),
            new Tretja.Tobogan(-908, -331),
            new Tretja.Gugalnica(852, -489),
            new Tretja.Vzmetnik(-190, 590),
            new Tretja.Vzmetnik(650, -988),
            new Tretja.Tobogan(-942, -185),
            new Tretja.Vzmetnik(623, -393),
            new Tretja.Gugalnica(780, 541),
            new Tretja.Tobogan(927, 274),
        });
        System.out.println(igrisce08.najTip());

        Tretja.Igrisce igrisce09 = new Tretja.Igrisce(new Tretja.Igralo[]{
            new Tretja.Vzmetnik(674, -439),
            new Tretja.Plezalo(799, -901),
            new Tretja.Gugalnica(316, -483),
            new Tretja.Vzmetnik(164, -575),
            new Tretja.Gugalnica(-902, -252),
            new Tretja.Vzmetnik(-557, 915),
            new Tretja.Vzmetnik(131, -669),
            new Tretja.Vzmetnik(267, 329),
            new Tretja.Plezalo(375, 60),
            new Tretja.Tobogan(583, 840),
            new Tretja.Gugalnica(-860, 922),
            new Tretja.Vzmetnik(-622, 246),
        });
        System.out.println(igrisce09.najTip());

        Tretja.Igrisce igrisce10 = new Tretja.Igrisce(new Tretja.Igralo[]{
            new Tretja.Vzmetnik(-450, 501),
            new Tretja.Tobogan(-542, 348),
            new Tretja.Gugalnica(42, 331),
            new Tretja.Vzmetnik(948, 179),
            new Tretja.Vzmetnik(791, -873),
            new Tretja.Tobogan(-400, 396),
            new Tretja.Gugalnica(701, 892),
        });
        System.out.println(igrisce10.najTip());

    }
}
