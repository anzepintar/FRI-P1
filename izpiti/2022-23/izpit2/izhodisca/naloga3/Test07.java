
public class Test07 {

    public static void main(String[] args) {
        Tretja.Igrisce igrisce1 = new Tretja.Igrisce(new Tretja.Igralo[]{
            new Tretja.Tobogan(0, 0),
            new Tretja.Gugalnica(200, 0),
            new Tretja.Plezalo(0, 150),
            new Tretja.Plezalo(-150, 0),
            new Tretja.Vzmetnik(100, -200),
            new Tretja.Plezalo(-250, 100),
            new Tretja.Gugalnica(-200, -200),
        });
        System.out.println(igrisce1.najTip());

        Tretja.Igrisce igrisce2 = new Tretja.Igrisce(new Tretja.Igralo[]{
            new Tretja.Gugalnica(0, 0),
            new Tretja.Tobogan(0, 0),
            new Tretja.Vzmetnik(0, 0),
            new Tretja.Plezalo(0, 0),
            new Tretja.Vzmetnik(0, 0),
            new Tretja.Vzmetnik(0, 0),
            new Tretja.Plezalo(0, 0),
            new Tretja.Tobogan(0, 0),
            new Tretja.Vzmetnik(0, 0),
            new Tretja.Gugalnica(0, 0),
            new Tretja.Plezalo(0, 0),
            new Tretja.Tobogan(0, 0),
        });
        System.out.println(igrisce2.najTip());
    }
}
