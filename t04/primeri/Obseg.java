public class Obseg {
    public static void main(String[] args) {
        int obseg = obseg(3, 4);
        if (obseg > obseg(10, 10)) {
            System.out.println("Pravokotnik je velik");
        } else {
            System.out.println("Pravokotnik je majhen");
        }
    }

    public static int obseg(int a, int b) {
        return 2 * (a + b);
    }
}
