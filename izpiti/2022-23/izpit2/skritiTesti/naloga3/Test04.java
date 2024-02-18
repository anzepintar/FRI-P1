
public class Test04 {

    public static void main(String[] args) {

        Tretja.Igralo igralo1 = new Tretja.Tobogan(-58, 714);
        Tretja.Igralo igralo2 = new Tretja.Gugalnica(549, 967);
        Tretja.Igralo igralo3 = new Tretja.Vzmetnik(-779, -43);
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
