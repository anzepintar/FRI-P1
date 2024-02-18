
public class Test08 {

    public static void main(String[] args) {

        Tretja.Igralo igralo1 = new Tretja.Tobogan(-531, 532);
        Tretja.Igralo igralo2 = new Tretja.Plezalo(-201, -963);
        Tretja.Igralo igralo3 = new Tretja.Gugalnica(133, 576);
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
