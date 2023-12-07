
public class Test04 {

    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci(-5, 4);
        for (int i = 1;  i <= 15;  i++) {
            System.out.println(fib.naslednji());
        }
    }
}
