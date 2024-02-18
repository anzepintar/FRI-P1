
public class Test06 {

    public static void main(String[] args) {

        Tretja.Igralo igralo1 = new Tretja.Plezalo(-841, 844);
        Tretja.Igralo igralo2 = new Tretja.Plezalo(746, 205);
        Tretja.Igralo igralo3 = new Tretja.Gugalnica(712, 66);
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
