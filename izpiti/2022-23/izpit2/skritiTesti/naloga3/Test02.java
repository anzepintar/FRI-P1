
public class Test02 {

    public static void main(String[] args) {

        Tretja.Igralo igralo1 = new Tretja.Plezalo(390, -129);
        Tretja.Igralo igralo2 = new Tretja.Gugalnica(128, 367);
        Tretja.Igralo igralo3 = new Tretja.Gugalnica(236, -969);
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
