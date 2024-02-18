
public class Test09 {

    public static void main(String[] args) {

        Tretja.Igralo igralo1 = new Tretja.Vzmetnik(928, -886);
        Tretja.Igralo igralo2 = new Tretja.Plezalo(386, 708);
        Tretja.Igralo igralo3 = new Tretja.Tobogan(-765, -98);
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
