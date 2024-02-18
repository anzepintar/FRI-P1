
public class Test01 {

    public static void main(String[] args) {
        Tretja.Igralo[] igrala = {
            new Tretja.Tobogan(0, 0),
            new Tretja.Gugalnica(200, 0),
            new Tretja.Plezalo(0, 150),
            new Tretja.Plezalo(-150, 0),
            new Tretja.Vzmetnik(100, -200),
        };
        
        for (int i = 0; i < igrala.length; i++) {
            for (int j = 0; j < igrala.length; j++) {
                System.out.printf(" %6d", igrala[i].razdalja2(igrala[j]));
            }
            System.out.println();
        }
    }
}
