
public class Test07 {

    public static void main(String[] args) {

        Tretja.Igralo igralo1 = new Tretja.Tobogan(866, 809);
        Tretja.Igralo igralo2 = new Tretja.Plezalo(718, -794);
        Tretja.Igralo igralo3 = new Tretja.Gugalnica(-923, -732);
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
