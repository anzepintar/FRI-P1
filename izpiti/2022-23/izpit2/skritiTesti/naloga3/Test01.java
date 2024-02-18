
public class Test01 {

    public static void main(String[] args) {

        Tretja.Igralo igralo1 = new Tretja.Gugalnica(-809, 48);
        Tretja.Igralo igralo2 = new Tretja.Tobogan(-538, 218);
        Tretja.Igralo igralo3 = new Tretja.Vzmetnik(342, 525);
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
