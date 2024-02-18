
public class Test13 {

    public static void main(String[] args) {

        Tretja.Igralo igralo1 = new Tretja.Gugalnica(211, 43);
        Tretja.Igralo igralo2 = new Tretja.Vzmetnik(-611, 769);
        Tretja.Igralo igralo3 = new Tretja.Gugalnica(860, 74);
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
