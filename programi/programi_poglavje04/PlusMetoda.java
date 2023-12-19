
/*
 * Izpis "plusa" s krakom dolžine 4 (s pomočjo metode za izris navpičnega
 * kraka)
 */

public class PlusMetoda {

    public static void main(String[] args) {
        // zgornji krak
        navpicniKrak();

        // sredina
        for (int i = 1;  i <= 9;  i++) {
            System.out.print("+");
        }
        System.out.println();

        // spodnji krak
        navpicniKrak();
    }

    public static void navpicniKrak() {
        for (int i = 1;  i <= 4;  i++) {
            for (int j = 1;  j <= 4;  j++) {
                System.out.print(" ");
            }
            System.out.println("+");
        }
    }
}
