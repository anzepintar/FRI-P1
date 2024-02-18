
public class Test05 {

    public static void main(String[] args) {

        Tretja.Igralo igralo1 = new Tretja.Tobogan(-353, -474);
        Tretja.Igralo igralo2 = new Tretja.Gugalnica(-818, 882);
        Tretja.Igralo igralo3 = new Tretja.Vzmetnik(133, -21);
        System.out.println(igralo1.razdalja2(igralo1));
        System.out.println(igralo1.razdalja2(igralo2));
        System.out.println(igralo1.razdalja2(igralo3));
        System.out.println(igralo2.razdalja2(igralo1));
        System.out.println(igralo2.razdalja2(igralo2));
        System.out.println(igralo2.razdalja2(igralo3));
        System.out.println(igralo3.razdalja2(igralo1));
        System.out.println(igralo3.razdalja2(igralo2));
        System.out.println(igralo3.razdalja2(igralo3));
    }
}
