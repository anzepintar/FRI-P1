
public class Test10 {

    public static void main(String[] args) {

        Tretja.Igralo igralo1 = new Tretja.Gugalnica(906, -974);
        Tretja.Igralo igralo2 = new Tretja.Vzmetnik(787, -765);
        Tretja.Igralo igralo3 = new Tretja.Gugalnica(-481, -574);
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
