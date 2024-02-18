
public class Test12 {

    public static void main(String[] args) {

        Tretja.Igralo igralo1 = new Tretja.Plezalo(-163, -360);
        Tretja.Igralo igralo2 = new Tretja.Plezalo(979, -157);
        Tretja.Igralo igralo3 = new Tretja.Gugalnica(-596, 42);
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
