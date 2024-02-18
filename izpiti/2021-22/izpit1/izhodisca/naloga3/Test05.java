
public class Test05 {

    public static void main(String[] args) {

        Tretja.Geolov geolov = new Tretja.Geolov(new Tretja.Zaklad[]{
            new Tretja.Zaklad("A",
                new Tretja.Tocka(1.0, -3.0), 
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Eva",    25),
                    new Tretja.Najdba("Boris",  40),
                    new Tretja.Najdba("Cvetka", 50),
                    new Tretja.Najdba("Denis",  55),
                    new Tretja.Najdba("Ana",    70),
                }
            ),

            new Tretja.Zaklad("B",
                new Tretja.Tocka(-2.0, 4.0), 
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Gregor", 30),
                    new Tretja.Najdba("Cvetka", 60),
                }
            ),

            new Tretja.Zaklad("C",
                new Tretja.Tocka(0.0, 2.0), 
                new Tretja.Najdba[0]
            ),

            new Tretja.Zaklad("D",
                new Tretja.Tocka(-3.0, -6.0), 
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Boris", 15),
                    new Tretja.Najdba("Ana",   45),
                    new Tretja.Najdba("Eva",   80),
                }
            )
        });

        System.out.println(geolov.nazadnjeOdkrit());
    }
}
