
public class Test03 {

    public static void main(String[] args) {

        Tretja.Igralo igralo1 = new Tretja.Gugalnica(-696, -577);
        Tretja.Igralo igralo2 = new Tretja.Gugalnica(613, -642);
        Tretja.Igralo igralo3 = new Tretja.Gugalnica(-372, 736);
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
